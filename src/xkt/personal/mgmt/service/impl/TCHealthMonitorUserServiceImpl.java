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

import xkt.personal.mgmt.bo.TCHealthMonitorUser;
import xkt.personal.mgmt.bo.TCHealthMonitorUserExample;
import xkt.personal.mgmt.dao.xkm.TCHealthMonitorUserDao;
import xkt.personal.mgmt.service.ITCHealthMonitorUserService;
import xkt.personal.mgmt.utils.IdWorker;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.common.rest.object.WrappedResult;

import eeos.sp.core.base.util.EEOSBusinessException;

@Service
public class TCHealthMonitorUserServiceImpl implements
		ITCHealthMonitorUserService {

	@Autowired
	TCHealthMonitorUserDao dao;

	@Autowired
	private IdWorker IdWorker;

	static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("新吴区", "320214");
		map.put("惠山区", "320206");
		map.put("锡山区", "320205");
		map.put("江阴市", "320281");
		map.put("宜兴市", "320282");
		map.put("梁溪区", "320213");
		map.put("滨湖区", "320211");
		map.put("经开区", "320291");
		map.put("公安专区", "320299");
	}

	@Override
	public int deleteByPrimaryKey(String arg0) {

		return dao.deleteByPrimaryKey(arg0);
	}

	@Override
	public List<Map<String, Object>> queryMonitorUser(Map<String, Object> arg0) {

		return dao.queryMonitorUser(arg0);
	}

	@Override
	public int updateByPrimaryKey(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countMonitorUser(Map<String, Object> arg0) {

		return dao.countMonitorUser(arg0);
	}

	@Override
	public TCHealthMonitorUser selectDetail(String arg0) {
		return dao.selectByPrimaryKey(arg0);
	}

	@Override
	public int updateByPrimaryKeySelective(TCHealthMonitorUser arg0) {

		return dao.updateByPrimaryKeySelective(arg0);
	}

	@Override
	public int insert(TCHealthMonitorUser arg0) {

		return dao.insert(arg0);
	}

	@Override
	public WrappedResult importExcel(InputStream in, long size,
			String originalFilename, String originalFileType) {
		// TODO Auto-generated method stub
		WrappedResult result = new WrappedResult();
		try {
			XSSFWorkbook wb = new XSSFWorkbook(in);
			result = importData(wb);
		} catch (EEOSBusinessException e) {
			e.printStackTrace();
			result.setResultHint(e.getCode());

			// TODO: handle exception
		} catch (Exception e) {
			e.printStackTrace();
			result.setResultHint("数据导入失败");
		}
		return result;
	}

	private WrappedResult importData(XSSFWorkbook wb) throws Exception {

		// Map<String,String> map = new HashMap<String, String>();
		//
		//
		// map.put("新吴区", "320214");
		// map.put("惠山区", "320206");
		// map.put("锡山区", "320205");
		// map.put("江阴市", "320281");
		// map.put("宜兴市", "320282");
		// map.put("梁溪区", "320213");
		// map.put("滨湖区", "320211");
		// map.put("经开区", "320291");
		// map.put("公安专区", "320299");

		XSSFSheet sheet = wb.getSheetAt(0);// 读第1个工作表
		int lastRowNum = sheet.getLastRowNum();
		Integer repeaCounter = 0;
		Integer successCount = 0;
		WrappedResult result = new WrappedResult();

		String strName = sheet.getRow(0).getCell(1).toString();
		if (strName.indexOf("身份证MD5值") < 0) {
			result.setSuccessful(false);
			result.setResultHint("只能读取指定人员导入表(请勿修改文件第一行的表头名)");
			return result;
		}

		if (lastRowNum < 1) {
			result.setSuccessful(false);
			result.setResultHint("导入表格数据为空");
			return result;
		}
		for (int i = 1; i < lastRowNum + 1; i++) {
			TCHealthMonitorUser bo = new TCHealthMonitorUser();
			// 获得行对象
			XSSFRow row = sheet.getRow(i);
			// 身份证MD5值
			XSSFCell cell2 = row.getCell(1);
			// 类型
			XSSFCell cell3 = row.getCell(2);
			// 辖区
			XSSFCell cell4 = row.getCell(3);
			// 是否失效
			XSSFCell cell6 = row.getCell(4);

			if (cell2 != null) {
				cell2.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell3 != null) {
				cell3.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell4 != null) {
				cell4.setCellType(Cell.CELL_TYPE_STRING);
			}
			if (cell6 != null) {
				cell6.setCellType(Cell.CELL_TYPE_STRING);
			}

			String certCodeSecret = getStringCellValue(cell2);
			if (StringUtils.isEmpty(certCodeSecret)
					|| certCodeSecret.trim().equals("")) {
				String msg = "当前行：" + (i + 1) + ",Md5加密身份证不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg, null,
						this.getClass());
				throw e;
			} else {
				bo.setCertCodeSecret(certCodeSecret);
			}

			String userType = getStringCellValue(cell3);
			if (StringUtils.isEmpty(userType)) {
				String msg = "当前行：" + (i + 1) + ",人员类型不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg, null,
						this.getClass());
				throw e;
			} else {
				bo.setUserType(userType);
			}

			String districtName = getStringCellValue(cell4);
			if (StringUtils.isEmpty(districtName)) {
				String msg = "当前行：" + (i + 1) + ",辖区名称不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg, null,
						this.getClass());
				throw e;
			} else {
				String districtCode = map.get(districtName);
				if (!StringUtils.isEmpty(districtCode)) {
					bo.setDistrictName(districtName);
					bo.setDistrictCode(districtCode);
				} else {
					String msg = "当前行：" + (i + 1) + ",该辖区不存在，请确认后重新输入";
					EEOSBusinessException e = new EEOSBusinessException(msg,
							null, this.getClass());
					throw e;
				}
			}

			String flag = getStringCellValue(cell6);
			if (StringUtils.isEmpty(flag)) {
				String msg = "当前行：" + (i + 1) + ",是否失效不能为空,且不能为空行";
				EEOSBusinessException e = new EEOSBusinessException(msg, null,
						this.getClass());
				throw e;
			} else {
				bo.setFlag(flag);
			}

			bo.setUpdateTime(new Date());

			TCHealthMonitorUserExample example = new TCHealthMonitorUserExample();
			TCHealthMonitorUserExample.Criteria criteria = example
					.createCriteria();
			criteria.andCertCodeSecretEqualTo(certCodeSecret);
			List<TCHealthMonitorUser> list = dao.selectByExample(example);
			if (!CollectionUtils.isEmpty(list)) {
				bo.setId(list.get(0).getId());
				dao.updateByPrimaryKeySelective(bo);
				repeaCounter++;
				result.setSuccessful(true);
			} else {
				bo.setCreateTime(new Date());
				bo.setId(IdWorker.nextStrId());
				dao.insert(bo);
				successCount++;
				result.setSuccessful(true);
			}

		}

		Map<String, Integer> statistic = new HashMap<String, Integer>();
		statistic.put("allCount", lastRowNum);
		statistic.put("updateCount", repeaCounter);
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
