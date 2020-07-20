package xkt.personal.mgmt.service.impl;

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

import xkt.personal.mgmt.bo.TCHealthSiteInfo;
import xkt.personal.mgmt.bo.TCHealthSiteInfoExample;
import xkt.personal.mgmt.bo.TCHealthSiteUserRela;
import xkt.personal.mgmt.bo.TCHealthSiteUserRelaExample;
import xkt.personal.mgmt.dao.xkm.TCHealthSiteInfoDao;
import xkt.personal.mgmt.dao.xkm.TCHealthSiteUserRelaDao;
import xkt.personal.mgmt.service.ITCHealthSiteUserRelaService;
import xkt.personal.mgmt.utils.IdWorker;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;
import com.ls.pf.base.common.rest.object.WrappedResult;

import eeos.sp.core.base.util.EEOSBusinessException;

@Service(target = { ServiceType.APPLICATION }, value = "tcHealthSiteUserRelaService")
public class TCHealthSiteUserRelaService implements
		ITCHealthSiteUserRelaService {

	@Autowired
	private TCHealthSiteUserRelaDao healthSiteUserRelaDao;
	
	@Autowired
	private TCHealthSiteInfoDao healthSiteInfoDao;
	
	@Autowired
	private IdWorker IdWorker;

	/**
	 * 根据条件查询总数
	 */
	@Override
	public int countByExamplePage(Map<String, String> inMap) {
		return healthSiteUserRelaDao.countByExamplePage(inMap);
	}

	/**
	 * 根据条件分页查询
	 */
	@Override
	public List<TCHealthSiteUserRela> selectByPage(Map<String, String> inMap) {
		return healthSiteUserRelaDao.selectByPage(inMap);
	}

	/**
	 * 根据ID删除
	 */
	@Override
	public int deleteByPrimaryKey(String id) {
		return healthSiteUserRelaDao.deleteByPrimaryKey(id);
	}

	/**
	 * 根据ID查询
	 */
	@Override
	public TCHealthSiteUserRela selectByPrimaryKey(String id) {
		return healthSiteUserRelaDao.selectByPrimaryKey(id);
	}

	/**
	 * 新增
	 */
	@Override
	public int addSelective(TCHealthSiteUserRela record) {
		return healthSiteUserRelaDao.insertSelective(record);
	}

	/**
	 * 统计
	 */
	@Override
	public int countByExample(TCHealthSiteUserRelaExample example) {
		return healthSiteUserRelaDao.countByExample(example);
	}

	/**
	 * 更新
	 */
	@Override
	public int updateByPrimaryKeySelective(TCHealthSiteUserRela record) {
		return healthSiteUserRelaDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public WrappedResult importExcel(InputStream in, long size,
			String originalFilename, String originalFileType) {
		// TODO Auto-generated method stub
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
	
private WrappedResult importData(XSSFWorkbook wb) throws Exception{
		
		XSSFSheet sheet = wb.getSheetAt(0);// 读第1个工作表
		int lastRowNum = sheet.getLastRowNum();
		Integer repeaCounter=0;
		Integer successCount=0;
		WrappedResult result = new WrappedResult();
		
		String strName = sheet.getRow(0).getCell(1).toString();
		if(strName.indexOf("站点名称")<0){
			result.setSuccessful(false);
			result.setResultHint("只能读取站点管理员导入表(请勿修改文件第一行的表头名)");
			return result;
		}
		
		if (lastRowNum < 1) {
			result.setSuccessful(false);
			result.setResultHint("导入表格数据为空");
			return result;
		}
		for (int i = 1; i < lastRowNum + 1; i++) {
			TCHealthSiteUserRela bo=new TCHealthSiteUserRela();
			// 获得行对象
			XSSFRow row = sheet.getRow(i);
			// 站点名称
			XSSFCell cell2 = row.getCell(1);
			// 人员类型
			XSSFCell cell3 = row.getCell(2);
			// 用户姓名
			XSSFCell cell4 = row.getCell(3);
			// 手机号
			XSSFCell cell5 = row.getCell(4);
			// 是否失效
			XSSFCell cell6 = row.getCell(5);


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

			String siteName = getStringCellValue(cell2);
			if (StringUtils.isEmpty(siteName) || siteName.trim().equals("")) {
				String msg = "当前行："+(i+1)+",站点名称不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
				, null, this.getClass());
				throw e;
			}else {
				
				TCHealthSiteInfoExample example =new TCHealthSiteInfoExample();
				TCHealthSiteInfoExample.Criteria criteria=example.createCriteria();
				criteria.andSiteNameEqualTo(siteName);
				List<TCHealthSiteInfo> list =healthSiteInfoDao.selectByExample(example);
				if(!CollectionUtils.isEmpty(list)){
					bo.setSiteName(siteName);
					bo.setSiteCode(list.get(0).getSiteCode());
				}else {
					String msg = "当前行："+(i+1)+",该站点不存在请确认后重新导入";
					EEOSBusinessException e = new EEOSBusinessException(msg
					, null, this.getClass());
					throw e;
				}
			}

			String userType = getStringCellValue(cell3);
			if (StringUtils.isEmpty(userType)) {
				String msg = "当前行："+(i+1)+",人员类型不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				bo.setUserType(userType);
			}
			
			String userName = getStringCellValue(cell4);
			if (StringUtils.isEmpty(userType)) {
				String msg = "当前行："+(i+1)+",用户姓名不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				bo.setUserName(userName);
			}
			
			String mobile = getStringCellValue(cell5);
			if (StringUtils.isEmpty(mobile)) {
				String msg = "当前行："+(i+1)+",手机号不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			}else if(mobile.length()!= 11){
				String msg = "当前行："+(i+1)+",手机号["+mobile+"]不为11位,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			}else {
				bo.setPhone(mobile);
			}
			
			
			String flag = getStringCellValue(cell6);
			if (StringUtils.isEmpty(flag)) {
				String msg = "当前行："+(i+1)+",是否失效不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg
						, null, this.getClass());
				throw e;
			} else {
				bo.setFlag(flag);
			}

			

			bo.setUpdateTime(new Date());
			
			//TODO 核验员是否已存在
			TCHealthSiteUserRelaExample example = new TCHealthSiteUserRelaExample();
			TCHealthSiteUserRelaExample.Criteria criteria = example.createCriteria();
			criteria.andPhoneEqualTo(bo.getPhone());
			List<TCHealthSiteUserRela> list = healthSiteUserRelaDao.selectByExample(example);
			if(!CollectionUtils.isEmpty(list)){
				bo.setId(list.get(0).getId());
				healthSiteUserRelaDao.updateByPrimaryKeySelective(bo);
				repeaCounter++;
				result.setSuccessful(true);
			}else{
				bo.setCreateTime(new Date());
				bo.setId(IdWorker.nextStrId());
				healthSiteUserRelaDao.insertSelective(bo);
				successCount++;
				result.setSuccessful(true);
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
