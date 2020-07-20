package xkt.personal.mgmt.service.impl;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCCommuityCheckerRelaCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeAdmin;
import xkt.personal.mgmt.bo.TCHealthCodeAdminCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeAdminExt;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.dao.xkm.TCCommuityCheckerRelaDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCodeAdminDao;
import xkt.personal.mgmt.service.ITCCommunityService;
import xkt.personal.mgmt.service.ITCHealthCodeAdminService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.utils.CardCodeUtil;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.utils.Md5Utils;

import com.ls.pf.base.api.fileManager.ISftpService;
import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.framework.ServiceType;
import com.ls.pf.base.api.sysparam.ISysParamService;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.utils.tools.StringUtils;

import eeos.sp.core.base.util.EEOSBusinessException;

@Service(target = { ServiceType.APPLICATION }, value = "tcHealthCodeAdminService")
public class TCHealthCodeAdminService implements ITCHealthCodeAdminService {

	@Autowired
	private TCHealthCodeAdminDao tcHealthCodeAdminDao;
	@Autowired
	private TCCommuityCheckerRelaDao checkerRelaDao;

	@ServiceAutowired
	private ISysParamService sysParamService;

	@ServiceAutowired
	private ISftpService sftpService;
	
	@Autowired
	private IdWorker idWorker;

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;
	
	@Autowired
	private ITCCommunityService communityService;

	public int countByCriteria(TCHealthCodeAdminCriteria criteria) {
		return tcHealthCodeAdminDao.countByExample(criteria);
	}

	public int deleteByCriteria(TCHealthCodeAdminCriteria criteria) {
		return tcHealthCodeAdminDao.deleteByExample(criteria);
	}

	public int deleteByPrimaryKey(String id) {
		TCCommuityCheckerRelaCriteria example = new TCCommuityCheckerRelaCriteria();
		TCCommuityCheckerRelaCriteria.Criteria crt = example.createCriteria();
		crt.andCheckerIdEqualTo(id);
		checkerRelaDao.deleteByExample(example);
		return tcHealthCodeAdminDao.deleteByPrimaryKey(id);
	}

	public int insert(TCHealthCodeAdmin bo) {
		return tcHealthCodeAdminDao.insert(bo);
	}

	public int insertSelective(TCHealthCodeAdmin bo) {
		return tcHealthCodeAdminDao.insertSelective(bo);
	}

	public List<TCHealthCodeAdmin> selectByExampleAndPage(
			Map<String, String> inMap) {
		return tcHealthCodeAdminDao.selectByExampleAndPage(inMap);
	}

	public TCHealthCodeAdmin selectByPrimaryKey(String id) {
		return tcHealthCodeAdminDao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(TCHealthCodeAdmin bo) {
		return tcHealthCodeAdminDao.updateByPrimaryKey(bo);
	}

	public int updateByPrimaryKeySelective(TCHealthCodeAdmin bo) {
		return tcHealthCodeAdminDao.updateByPrimaryKeySelective(bo);
	}

	public int countByExampleAndPage(Map<String, String> inMap) {
		return tcHealthCodeAdminDao.countByExampleAndPage(inMap);
	}

	public WrappedResult importExcel(InputStream in, long size, 
			String fileName,String originalFileType) {
		WrappedResult result=new WrappedResult();
		try{
			XSSFWorkbook wb = new XSSFWorkbook(in);
			result=importData(wb);
		}catch(EEOSBusinessException e){
			result.setResultHint(e.getCode());
		}catch(Exception e){
			e.printStackTrace();
			result.setResultHint("数据导入失败");
		}
		return result;
	}

	/**
	 * 
	 * @Description: 导入数据  审核员登记表
	 * @Title: importData
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 下午3:32:40
	 * @History: 2020年2月26日 下午3:32:40 Hanson Created.
	 *
	 * @param wb
	 * @return
	 *
	 */
	private WrappedResult importData(XSSFWorkbook wb) throws Exception {
		XSSFSheet sheet = wb.getSheetAt(0);// 读第1个工作表
		WrappedResult result=new WrappedResult();
		int lastRowNum = sheet.getLastRowNum();
		Integer repeaCounter=0;
		Integer successCount=0;
		Map<String, Integer> statistic=new HashMap<String, Integer>();
		System.out.println("一共有:"+lastRowNum+"行（含标题）");
		
		if (lastRowNum < 1) {
			result.setSuccessful(false);
			result.setResultHint("表格为空");
			return result;
		}
		
		//此处是为了验证 是否将审核员的模板和核查员的模板导错
		String strName = sheet.getRow(0).getCell(1).toString();
		if(!strName.equals("审核人员姓名")){
			result.setSuccessful(false);
			result.setResultHint("只能读取审核人员导入表(请勿修改文件第一行的表头名)");
			return result;
		}
		
		for (int i = 1; i < lastRowNum + 1; i++) {
			System.out.println("当前第:"+(i+1)+"行");
			TCHealthCodeAdmin bo = new TCHealthCodeAdmin();
			// 获得行对象
			XSSFRow row = sheet.getRow(i);
			// 所属社区编码
			XSSFCell cell1 = row.getCell(0);
			// 审核人员姓名
			XSSFCell cell2 = row.getCell(1);
			// 审查员身份证号
			XSSFCell cell3 = row.getCell(2);
			// 审核人员手机号
			XSSFCell cell4 = row.getCell(3);
			// 所属区/市
			XSSFCell cell5 = row.getCell(4);
			// 所属街道
			XSSFCell cell6 = row.getCell(5);
			// 所属社区
			XSSFCell cell7 = row.getCell(6);
			// 所属小区/单位/场所等名称
			XSSFCell cell8 = row.getCell(7);
			// 分类
			XSSFCell cell9 = row.getCell(8);
			// 人员类型
			XSSFCell cell10 = row.getCell(9);
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
			if (cell9 != null) {
				cell9.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell10 != null) {
				cell10.setCellType(Cell.CELL_TYPE_STRING);
			}
			
			// ---------------数据校验开始-----------------
			String personType = null;
			if (null == cell10||null == cell10.getRichStringCellValue()||
					"".equals(cell10.getRichStringCellValue().toString().trim())){
				String msg = "当前行"+(i+1)+",人员类型不能为空，且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			}else{
				personType = cell10.getRichStringCellValue().getString();
				System.out.println("人员类型:"+personType);
				bo.setPersonnelType(personType);
			}
			
			String communityCode = null;
			if(personType.equals("审核员")){
				if (null == cell1||null == cell1.getRichStringCellValue()|| 
						"".equals(cell1.getRichStringCellValue().toString().trim())){
					String msg = "当前行："+(i+1)+",当人员类型为审核员时, 社区编码不能为空,且不能为空行";
					result.setResultHint(msg);
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}else{
					communityCode = cell1.getRichStringCellValue().getString()
							.trim();
					System.out.println("社区编码:"+communityCode);
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
					bo.setCommunityId(healthCommunityInfo.getId());
				}
			}else if(personType.equals("区管理员")){
				//根据区名称查询  区编码 设置区编码
				//所属区不能为空
				if(null == cell5 || null == cell5.getRichStringCellValue()||
						"".equals(cell5.getRichStringCellValue().toString().trim())){
					String msg = "当前行："+(i+1)+",当人员类型为区管理员时,所属区/市不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}else{
					String districtName = cell5.getRichStringCellValue().getString();
					//根据 区 名称查询 区编码
					TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
					TCHealthCommunityInfoCriteria.Criteria criteria = example
							.createCriteria();
					criteria.andCommunityNameEqualTo(districtName);
					List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
							.selectByExample(example);
					
					if(CollectionUtils.isEmpty(healthCommunityInfoList)){
						String msg = "当前行："+(i+1)+",根据区域名称:["+districtName+"]无法找到区/市信息,且不能为空行";
						EEOSBusinessException e = new EEOSBusinessException(msg
								, null, this.getClass());
						throw e;
					}
					TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
							.get(0);
					bo.setCommunityId(healthCommunityInfo.getId());
				}
			}else if(personType.equals("街道管理员")){
				//根据街道名称查询  区编码 设置区编码
				//所属街道不能为空
				if(null == cell6 || null == cell6.getRichStringCellValue()||
						"".equals(cell6.getRichStringCellValue().toString().trim())){
					String msg = "当前行："+(i+1)+",当人员类型为街道管理员时,所属街道名称不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}else{
					String streetName = cell6.getRichStringCellValue().getString();
					//根据 区 名称查询 区编码
					TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
					TCHealthCommunityInfoCriteria.Criteria criteria = example
							.createCriteria();
					criteria.andCommunityNameEqualTo(streetName);
					List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
							.selectByExample(example);
					if(CollectionUtils.isEmpty(healthCommunityInfoList)){
						String msg = "当前行："+(i+1)+",根据街道名称["+streetName+"],无法找到街道信息,且不能为空行";
						EEOSBusinessException e = new EEOSBusinessException(msg
								, null, this.getClass());
						throw e;
					}
					TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
							.get(0);
					bo.setCommunityId(healthCommunityInfo.getId());
				}
			}else if(!personType.equals("区管理员")&&
					!personType.equals("街道管理员")){
				if (null == cell1||null == cell1.getRichStringCellValue()|| 
						"".equals(cell1.getRichStringCellValue().toString().trim())){
					String msg = "当前行："+(i+1)+",当人员类型为审核员时,社区编码不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				} else {
					communityCode = cell1.getRichStringCellValue().getString()
							.trim();
					TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
					TCHealthCommunityInfoCriteria.Criteria criteria = example
							.createCriteria();
					criteria.andCommunityCodeEqualTo(communityCode);
					List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
							.selectByExample(example);
					if(CollectionUtils.isEmpty(healthCommunityInfoList)){
						String msg = "当前行："+(i+1)+",根据社区编码["+communityCode+"],无法找到社区信息,且不能为空行";
						EEOSBusinessException e = new EEOSBusinessException(msg
								, null, this.getClass());
						throw e;
					}
					TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
							.get(0);
					bo.setCommunityId(healthCommunityInfo.getId());
				}
			}
			
			String realName = null;
			if (null == cell2 || null == cell2.getRichStringCellValue()||
					"".equals(cell2.getRichStringCellValue().toString().trim())) {
				String msg = "当前行："+(i+1)+",审核员姓名不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
				
			} else {
				realName = cell2.getRichStringCellValue().getString().trim();
				System.out.println("审核人员姓名:"+realName);
				bo.setRealName(realName);
			}

			String cardCode = null;
			if (null == cell3 || null == cell3.getRichStringCellValue()||
					"".equals(cell3.getRichStringCellValue().toString().trim())) {
				String msg = "当前行："+(i+1)+",审核人员身份证号不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				cardCode = cell3.getRichStringCellValue().getString().trim();
				if(cardCode.length() != 18){
					String msg = "当前行："+(i+1)+",身份证号["+cardCode+"]长度必须为18位,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}
				System.out.println("审核人员身份证号:"+cardCode);
				bo.setCertType("01");// 证件类型：01代表身份证
				bo.setCardCodeBright(cardCode);//明文
				bo.setCardCode(Md5Utils.signature(cardCode));//密文
				bo.setCardCodeHide(CardCodeUtil.desensitizedIdNumber(cardCode));// 脱敏
			}

			String mobile = null;
			if (null == cell4 || null == cell4.getRichStringCellValue()
					||"".equals(cell4.getRichStringCellValue().toString().trim())) {
				String msg = "当前行："+(i+1)+",审核人员手机号不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				mobile = cell4.getRichStringCellValue().getString().trim();
				System.out.println("审核人员手机号:"+mobile);
				bo.setMobile(mobile);
			}

			//所属区/市
			String distract = null;
			if (null == cell5 || null == cell5.getRichStringCellValue()) {
				String msg = "当前行："+(i+1)+",所属区/市不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				distract = cell5.getRichStringCellValue().getString().trim();
				System.out.println("所属区/市为:"+distract);
			}
			
			//所属街道
			String street = null;
			if(!personType.equals("区管理员")){
				if(null == cell6||null == cell6.getRichStringCellValue()){
					String msg = "当前行："+(i+1)+",所属街道不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				} else {
					street = cell6.getRichStringCellValue().getString().trim();
					System.out.println("所属街道为:"+street);
				}
			}
			
			//所属社区
			String community = null;
			if(!personType.equals("区管理员")&&
					!personType.equals("街道管理员")){
				if(null == cell7||null == cell7.getRichStringCellValue()){
					String msg = "当前行："+(i+1)+",所属社区不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				} else {
					community = cell7.getRichStringCellValue().getString()
							.trim();
					System.out.println("所属社区为:"+community);
				}
			}
			
			
			//分类
			String kind = null;
			if(null == cell9||null == cell9.getRichStringCellValue()){
				if(!personType.equals("区管理员")&&
					!personType.equals("街道管理员")&&
					!personType.equals("审核员")){
					String msg = "当前行："+i+",人员分类不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg
							, null, this.getClass());
					throw e;
				}
			}else{
				kind = cell9.getRichStringCellValue().getString()
						.trim();
				System.out.println("分类为:"+kind);
			}
			
			bo.setCreateTime(new Date());
			bo.setUpdateTime(new Date());
			
			//核验员是否已存在
			TCHealthCodeAdminCriteria criteria= new TCHealthCodeAdminCriteria();
			TCHealthCodeAdminCriteria.Criteria example = criteria.createCriteria();
			String mobileString = bo.getMobile();
			example.andMobileEqualTo(bo.getMobile());
			// 根据手机号查询是否注册过
			List<TCHealthCodeAdmin> users =  tcHealthCodeAdminDao.selectByExample(criteria);
			// 根据身份证查询是否注册过
			TCHealthCodeAdminCriteria criteria2 = new TCHealthCodeAdminCriteria();
			TCHealthCodeAdminCriteria.Criteria example2 = criteria2.createCriteria();
			example2.andCardCodeBrightEqualTo(bo.getCardCodeBright());
			example2.andCardCodeEqualTo(bo.getCardCode());
			List<TCHealthCodeAdmin> users2 =  tcHealthCodeAdminDao.selectByExample(criteria2);
			// 根据手机号、身份证号码都不能查询到说明为新增
			if(CollectionUtils.isEmpty(users)&&CollectionUtils.isEmpty(users2)){//系统不存在该校验员
				successCount++;
				String strId = idWorker.nextId()+"";
				bo.setId(strId);
				bo.setAdminType("1");
				this.tcHealthCodeAdminDao.insertSelective(bo);
			}else{
				//如果已存在个数加1
				repeaCounter++;
				System.out.println("审核员:"+bo.getCardCodeBright()+"已存在，信息覆盖");
				String id = "";
				if(!CollectionUtils.isEmpty(users)){
					TCHealthCodeAdmin user = users.get(0);
					id = user.getId();
				}
				if(!CollectionUtils.isEmpty(users2)){
					TCHealthCodeAdmin user2 = users2.get(0);
					id = user2.getId();
				}
				
				if(StringUtils.nullOrBlank(id)){
						String msg = "当前行："+(i+1)+",系統存在脏数据，手机号码\\身份证"+mobileString+"\\"+bo.getCardCodeBright();
						EEOSBusinessException e = new EEOSBusinessException(msg
								, null, this.getClass());
						throw e;
				}else{
					bo.setId(id);
					bo.setAdminType("1");
					bo.setUpdateTime(new Date());
					tcHealthCodeAdminDao.updateByPrimaryKey(bo);
				}
			}
			
			//小区处理
			try{
				if(!personType.equals("区管理员")&&
						!personType.equals("街道管理员")){
					//所属小区/单位/场所等名称
					String placeName = null;
					if(null == cell8||null == cell8.getRichStringCellValue()){
						String msg = "当前行："+i+",所属小区/单位/场所等名称不能为空,且不能为空行";
						EEOSBusinessException e = new EEOSBusinessException(msg
								, null, this.getClass());
						throw e;
					} else {
						placeName = cell8.getRichStringCellValue().getString()
								.trim();
						System.out.println("所属小区/单位/场所等名称为:"+placeName);
					}				
					
					TCCommuity commuityBo = new TCCommuity();
					commuityBo.setCmmtyType(kind);
					commuityBo.setCommuityName(placeName);
					commuityBo.setVillageCode(communityCode);
					communityService.importCommunityComm(commuityBo, bo);
				}
			}catch(Exception e){
				e.printStackTrace();
				throw e;
			}
		}
		statistic.put("allCount", lastRowNum);
		statistic.put("updateCount",repeaCounter);
		statistic.put("scuuessCount", successCount);
		result.setResultValue(statistic);
		result.setSuccessful(true);
		return result;
	}

	@SuppressWarnings("unused")
	private boolean uploadExcel(InputStream in, long size, String fileName) {
		
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
		boolean flag = false;
		try {
			flag = this.sftpService.uploadFile(ip, port, username, password,
					rootPath, "UTF-8", in, filePath, fileName, size);
			System.out.println("文件上传结果："+flag);
		} catch (Exception e) {
			System.out.println("上传文件发生异常");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<TCHealthCodeAdminExt> selectByPage(Map<String, String> inMap) {
		return this.tcHealthCodeAdminDao.selectByPage(inMap);
	}

}
