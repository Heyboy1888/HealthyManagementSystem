package xkt.personal.mgmt.service.impl;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCCommuityVerifierRelaCriteria;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelate;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateExt;
import xkt.personal.mgmt.dao.xkm.TCCommuityVerifierRelaDao;
import xkt.personal.mgmt.dao.xkm.TCHealthUserCommunityRelateDao;
import xkt.personal.mgmt.service.ITCCommunityService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthUserCommunityRelateService;
import xkt.personal.mgmt.utils.IdWorker;

import com.ls.pf.base.api.fileManager.ISftpService;
import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.framework.ServiceType;
import com.ls.pf.base.api.sysparam.ISysParamService;
import com.ls.pf.base.common.rest.object.WrappedResult;

import eeos.sp.core.base.util.EEOSBusinessException;

@Service(target = { ServiceType.APPLICATION }, value = "tcHealthUserCommunityRelateService")
public class TCHealthUserCommunityRelateService implements
		ITCHealthUserCommunityRelateService {

	@Autowired
	private TCHealthUserCommunityRelateDao tcHealthUserCommunityRelateDao;
	
	@Autowired
	private TCCommuityVerifierRelaDao verifierRelaDao;
	
	@ServiceAutowired
	private ISysParamService sysParamService;

	@ServiceAutowired
	private ISftpService sftpService;
	
	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;
	
	@Autowired
	private ITCCommunityService communityService;
	
	@Autowired
	private IdWorker idWorker;
	
	public int countByExample(TCHealthUserCommunityRelateCriteria criteria) {
		return tcHealthUserCommunityRelateDao.countByExample(criteria);
	}

	public int deleteByExample(TCHealthUserCommunityRelateCriteria criteria) {
		return tcHealthUserCommunityRelateDao.deleteByExample(criteria);
	}

	public int insert(TCHealthUserCommunityRelate bo) {
		return tcHealthUserCommunityRelateDao.insert(bo);
	}

	public int insertSelective(TCHealthUserCommunityRelate bo) {
		return tcHealthUserCommunityRelateDao.insertSelective(bo);
	}

	public List<TCHealthUserCommunityRelate> selectByExample(
			TCHealthUserCommunityRelateCriteria criteria) {
		return tcHealthUserCommunityRelateDao.selectByExample(criteria);
	}

	public int updateByExample(TCHealthUserCommunityRelate bo,
			TCHealthUserCommunityRelateCriteria criteria) {
		return tcHealthUserCommunityRelateDao.updateByExample(bo, criteria);
	}

	public int updateByExampleSelective(TCHealthUserCommunityRelate bo,
			TCHealthUserCommunityRelateCriteria criteria) {
		return tcHealthUserCommunityRelateDao.updateByExampleSelective(bo,
				criteria);
	}

	public int countByExampleAndPage(Map<String, String> arg0) {
		return tcHealthUserCommunityRelateDao.countByExampleAndPage(arg0);
	}

	public List<TCHealthUserCommunityRelateExt> selectByPage(Map<String, String> arg0) {
		return tcHealthUserCommunityRelateDao.selectByPage(arg0);
	}

	public WrappedResult importExcel(InputStream in, long size, 
			String fileName,String originalFileType) throws Exception{
		WrappedResult result=new WrappedResult();
		try {		
			XSSFWorkbook wb = new XSSFWorkbook(in);
			result=importData(wb);
		} catch (EEOSBusinessException e) {
			e.printStackTrace();
			result.setResultHint(e.getCode());
			
			// TODO: handle exception
		}catch (Exception e) {
			e.printStackTrace();
			result.setResultHint("数据导入失败");
		} 
		return result;
	}
	/**
	 * 
	 * @Description: 导入数据
	 * @Title: importData
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 下午3:32:40
	 * @History: 2020年2月26日 下午3:32:40 Hanson Created.
	 *
	 * @param wb
	 * @return
	 *
	 */
	private WrappedResult importData(XSSFWorkbook wb) throws Exception{
		
		XSSFSheet sheet = wb.getSheetAt(0);// 读第1个工作表
		int lastRowNum = sheet.getLastRowNum();
		Integer repeaCounter=0;
		Integer successCount=0;
		WrappedResult result = new WrappedResult();
		
		String strName = sheet.getRow(0).getCell(1).toString();
		if(strName.indexOf("验证人")<0){
			result.setSuccessful(false);
			result.setResultHint("只能读取检验员导入表(请勿修改文件第一行的表头名)");
			return result;
		}
		
		if (lastRowNum < 1) {
//			EEOSBusinessException e = new EEOSBusinessException("导入表格数据为空"
//						, null, this.getClass());
//			
//			throw e;
			result.setSuccessful(false);
			result.setResultHint("导入表格数据为空");
			return result;
		}
		//List<TCHealthUserCommunityRelate> arrayList = new ArrayList<TCHealthUserCommunityRelate>();
		for (int i = 1; i < lastRowNum + 1; i++) {
			TCHealthUserCommunityRelate bo = new TCHealthUserCommunityRelate();
			// 获得行对象
			XSSFRow row = sheet.getRow(i);
			// 所属社区编码
			XSSFCell cell1 = row.getCell(0);
			// 核查人员姓名
			XSSFCell cell2 = row.getCell(1);
			// 核查人员手机号
			XSSFCell cell3 = row.getCell(2);
			// 所属街道
			XSSFCell cell4 = row.getCell(3);
			// 所属社区
			XSSFCell cell5 = row.getCell(4);
			// 所属小区/单位/场所等名称
			XSSFCell cell6 = row.getCell(5);
			// 小区分类
			XSSFCell cell7 = row.getCell(6);
			// 是否生成二维码
			XSSFCell cell8 = row.getCell(7);
			// 设置单元格格式
			if (cell1 != null) {
				cell1.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell2 != null) {
				cell2.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell3 != null) {
				cell3.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell4 != null) {
				cell4.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell5 != null) {
				cell5.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell6 != null) {
				cell6.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell7 != null) {
				cell7.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell8 != null) {
				cell8.setCellType(Cell.CELL_TYPE_STRING);
			}
			// 数据校验
			String communityCode = getStringCellValue(cell1);
			System.out.println("社区编码:"+communityCode);
			if (StringUtils.isEmpty(communityCode) || communityCode.trim().equals("")) {
//				EEOSBusinessException e = new EEOSBusinessException("社区编码不能为空"
//						, null, this.getClass());
//				throw e;
				String msg = "当前行："+(i+1)+",社区编码不能为空,且不能为空行";

				EEOSBusinessException e = new EEOSBusinessException(msg
				, null, this.getClass());
				throw e;
				
				
			} else {
				TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
				TCHealthCommunityInfoCriteria.Criteria criteria = example
						.createCriteria();
				criteria.andCommunityCodeEqualTo(communityCode);
				List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
						.selectByExample(example);
				if(CollectionUtils.isEmpty(healthCommunityInfoList)){
					String msg = "当前行："+(i+1)+",社区编码:["+communityCode+"],对应的社区不存在,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}
				TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
						.get(0);
				boolean flag=healthCommunityInfo.getCommunityName().equals(cell5.toString());
				if(!flag){
					String msg = "当前行："+(i+1)+",社区编码:["+communityCode+"]与社区名称["+cell5+"]不一致";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}
				bo.setCommunityId(healthCommunityInfo.getId());
			}

			String realName = getStringCellValue(cell2);
			System.out.println("验证员姓名:"+realName);
			if (StringUtils.isEmpty(realName)) {
				String msg = "当前行："+(i+1)+",验证员姓名不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				bo.setRealName(realName);
			}
			
			String mobile = getStringCellValue(cell3);
			System.out.println("验证员手机号:"+mobile);
			if (StringUtils.isEmpty(mobile)) {
				String msg = "当前行："+(i+1)+",验证员手机号不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			}else if(mobile.length()!= 11){
				String msg = "当前行："+(i+1)+",验证员手机号["+mobile+"]不为11位,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			}else {
				bo.setMobile(mobile);
			}

			/*String street = cell4.getRichStringCellValue().getString().trim();
			if (StringUtils.isEmpty(street)) {
				result.setSuccessful(false);
				result.setResultHint("所属街道不能为空");
				return result;
			} else {
				//bo.set
			}
			String community = cell5.getRichStringCellValue().getString()
					.trim();
			if (StringUtils.isEmpty(community)) {
				result.setSuccessful(false);
				result.setResultHint("所属社区不能为空");
				return result;
			} else {
				// bo.set
			}*/
			String extAttr1 = getStringCellValue(cell8);
			bo.setExtAttr1(extAttr1);
			bo.setCreateTime(new Date());
			bo.setUpdateTime(new Date());
			
			//TODO 核验员是否已存在
			TCHealthUserCommunityRelateCriteria  criteria
				=new TCHealthUserCommunityRelateCriteria();
			TCHealthUserCommunityRelateCriteria.Criteria example = criteria.createCriteria(); 
			example.andMobileEqualTo(bo.getMobile());
			List<TCHealthUserCommunityRelate> users =  tcHealthUserCommunityRelateDao.selectByExample(criteria);
			if(users==null||users.size()==0){//系统不存在该校验员
				successCount++;
				String strId = idWorker.nextId()+"";
				bo.setId(strId);
				//arrayList.add(bo);
				this.tcHealthUserCommunityRelateDao.insertSelective(bo);
			}else{
				repeaCounter++;
				System.out.println("核验员:"+bo.getMobile()+"已存在，信息覆盖");
				bo.setId(users.get(0).getId());
				bo.setUpdateTime(new Date());
				tcHealthUserCommunityRelateDao.updateByPrimaryKey(bo);
			}
			
			//小区处理
			try{
				String commuityName = getStringCellValue(cell6);
				System.out.println("所属小区/单位/场所等名称:"+commuityName);
				if (StringUtils.isNotEmpty(commuityName)) {
					/*EEOSBusinessException e = new EEOSBusinessException("所属小区/单位/场所等不能为空"
							, null, this.getClass());
					throw e;*/
					String cmmtyType = getStringCellValue(cell7);
					TCCommuity commuityBo = new TCCommuity();
					commuityBo.setCmmtyType(cmmtyType);
					commuityBo.setCommuityName(commuityName);
					commuityBo.setVillageCode(communityCode);
					communityService.importCommunityComm(commuityBo, bo);
					result.setSuccessful(true);
					//result.setResultHint("社区编码不能为空");
					result.setResultValue(repeaCounter);
				}
			}catch(Exception e){
				e.printStackTrace();
				throw e;
			}
		}
		// 插入后端数据库
		/*for (TCHealthUserCommunityRelate bo : arrayList) {
			this.tcHealthUserCommunityRelateDao.insertSelective(bo);
		}*/
		Map<String, Integer> statistic=new HashMap<String, Integer>();
		statistic.put("allCount", lastRowNum);
		statistic.put("updateCount",repeaCounter);
		statistic.put("scuuessCount", successCount);
		result.setResultValue(statistic);
		return result;
	}
	
	@SuppressWarnings("unused")
	private boolean uploadExcel(InputStream in, long size, String fileName)
			throws Exception {
		// 上传文件路径
		String filePath = sysParamService.getSysParamsValues(
				"HEALTH_ADMIN_IMAGE_FILE_PATH", null);
		// 主机地址
		String ip = sysParamService.getSysParamsValues(
				"HEALTH_ADMIN_SFTP_SERVER_IP", null);
		// 端口
		Integer port = Integer.valueOf(sysParamService.getSysParamsValues(
				"HEALTH_ADMIN__SFTP_SERVER_PORT", null));
		// 用户名
		String username = sysParamService.getSysParamsValues(
				"HEALTH_ADMIN__SFTP_USERNAME", null);
		// 密码
		String password = sysParamService.getSysParamsValues(
				"HEALTH_ADMIN__SFTP_PASSWORD", null);
		// 根路径
		String rootPath = File.separator;
		return this.sftpService.uploadFile(ip, port, username, password,
				rootPath, "UTF-8", in, filePath, fileName, size);
	}

	public int deleteByPrimaryKey(String arg0) {
		TCCommuityVerifierRelaCriteria example = new TCCommuityVerifierRelaCriteria();
		TCCommuityVerifierRelaCriteria.Criteria crt = example.createCriteria();
		crt.andVerifierIdEqualTo(arg0);
		verifierRelaDao.deleteByExample(example);
		return this.tcHealthUserCommunityRelateDao.deleteByPrimaryKey(arg0);
	}

	public TCHealthUserCommunityRelate selectByPrimaryKey(String arg0) {
		return this.tcHealthUserCommunityRelateDao.selectByPrimaryKey(arg0);
	}

	public int updateByPrimaryKeySelective(TCHealthUserCommunityRelate arg0) {
		return this.tcHealthUserCommunityRelateDao.updateByPrimaryKeySelective(arg0);
	}
	
	private String getStringCellValue(XSSFCell cell) {
		if (cell == null) {
			return "";
		}
		String strCell = "";
		switch (cell.getCellType()) {
		case XSSFCell.CELL_TYPE_STRING:
			strCell = cell.getStringCellValue();
			break;
		case XSSFCell.CELL_TYPE_NUMERIC:
			cell.setCellType(XSSFCell.CELL_TYPE_STRING);
			strCell = cell.getStringCellValue();
			// strCell = ""+cell.getNumericCellValue();
			break;
		case XSSFCell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		case XSSFCell.CELL_TYPE_BLANK:
			strCell = "";
			break;
		case XSSFCell.CELL_TYPE_FORMULA:
			try {
				strCell = String.valueOf(cell.getNumericCellValue());
			} catch (IllegalStateException e) {
				strCell = String.valueOf(cell.getRichStringCellValue());
			}
			break;
		default:
			strCell = "";
			break;
		}
		if (strCell.equals("") || strCell == null) {
			return "";
		}
		return strCell;
	}
}
