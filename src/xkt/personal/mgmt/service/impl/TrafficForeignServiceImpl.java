package xkt.personal.mgmt.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
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
import org.springframework.stereotype.Service;

import xkt.personal.mgmt.bo.TmpTrafficeFromForeign;
import xkt.personal.mgmt.dao.statistic.TmpTrafficeFromForeignDao;
import xkt.personal.mgmt.service.ITrafficForeignService;

import com.ls.pf.base.common.rest.object.WrappedResult;

import eeos.sp.core.base.util.EEOSBusinessException;

@Service
public class TrafficForeignServiceImpl implements ITrafficForeignService {
	@Autowired
	private TmpTrafficeFromForeignDao trafficFromForeignDao;

	@Override
	public List<Map<String, Object>> queryByTime(Map<String, Object> map) {
		String codeColourName = map.get("codeColourName").toString();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		if ("0".equals(codeColourName)) { // 全部
			list = trafficFromForeignDao.queryByTime(map);
		} else if ("2".equals(codeColourName)) { // 黄码
			list = trafficFromForeignDao.queryByTimeYellow(map);
		} else if ("3".equals(codeColourName)) { // 红码
			list = trafficFromForeignDao.queryByTimeRed(map);
		}

		return list;
	}

	@Override
	public int countByTime(String date, String codeColourName) {
		int count = 0;
		if ("0".equals(codeColourName)) { // 全部
			count = trafficFromForeignDao.countByTime(date);
		} else if ("2".equals(codeColourName)) { // 黄码
			count = trafficFromForeignDao.countByTimeYellow(date);
		} else if ("3".equals(codeColourName)) { // 红码
			count = trafficFromForeignDao.countByTimeRed(date);
		}
		return count;
	}

	// 根据类型和时间删除 2为黄码,3为红码
	@Override
	public int deleteByTimeAndType(String date, int type) {
		int count = 0;
		if (type == 2) {
			count = trafficFromForeignDao.deleteByTimeYellow(date);
		} else if (type == 3) {
			count = trafficFromForeignDao.deleteByTimeRed(date);
		}
		return count;
	}

	@Override
	public WrappedResult importExcel(InputStream in, long size,
			String fileName, String originalFileType, int type) {
		WrappedResult result = new WrappedResult();
		String[] strs=fileName.split("-");
		StringBuilder date=new StringBuilder(strs[0]);
		date.insert(2,"-");
        date.insert(0,"2020-");
        fileName=strs[1];
		try {
			XSSFWorkbook wb = new XSSFWorkbook(in);
			if(type==3){
				if (fileName.equals("国外拉红.xlsx")) {
					result = importData(wb,type,date.toString());
				} else {
					result.setSuccessful(false);
					result.setResultHint("只能读取国外拉红表格(请保证文件中的数据为国外拉红人员名单且文件名为 日期-国外拉红)");
					return result;
				}
			}else if(type==2){
				if (fileName.equals("国外拉黄.xlsx")) {
					result = importData(wb,type,date.toString());
				} else {
					result.setSuccessful(false);
					result.setResultHint("只能读取国外拉黄表格(请保证文件中的数据为国外拉黄人员名单且文件名为 日期-国外拉黄)");
					return result;
				}
			}
		} catch (EEOSBusinessException e) {
			result.setResultHint(e.getCode());
		} catch (Exception e) {
			e.printStackTrace();
			result.setResultHint("数据导入失败");
		}
		return result;
	}

	private WrappedResult importData(XSSFWorkbook wb,int type,String date) {
		XSSFSheet sheet = wb.getSheetAt(0);// 读第1个工作表
		WrappedResult result = new WrappedResult();
		int lastRowNum = sheet.getLastRowNum();
		int count=0;
		//Integer repeaCounter = 0;
		//Integer successCount = 0;
		System.out.println("一共有:" + lastRowNum + "行（含标题）");
		if (lastRowNum < 1) {
			result.setSuccessful(false);
			result.setResultHint("表格为空");
			return result;
		}
		// 此处是为了验证 是否将验证人的模板导入
		String strName = sheet.getRow(0).getCell(0).toString();
		if (!strName.equals("user_name")) {
			result.setSuccessful(false);
			result.setResultHint("只能读取模板表格(请保证表头与模板一致)");
			return result;
		}
		for (int i = 1; i <= lastRowNum; i++) {
			TmpTrafficeFromForeign bo = new TmpTrafficeFromForeign();
			XSSFRow row = sheet.getRow(i);
			// user_name
			XSSFCell cell0 = row.getCell(0);
			// cert_code
			XSSFCell cell1 = row.getCell(1);
			// phone
			XSSFCell cell2 = row.getCell(2);
			// household_code
			XSSFCell cell3 = row.getCell(3);
			// household_name
			XSSFCell cell4 = row.getCell(4);
			// district_code
			XSSFCell cell5 = row.getCell(5);
			// current_district
			XSSFCell cell6 = row.getCell(6);
			// current_street
			XSSFCell cell7 = row.getCell(7);
			// current_community
			XSSFCell cell8 = row.getCell(8);
			// live_address
			XSSFCell cell9 = row.getCell(9);
			if (cell0 != null) {
				cell0.setCellType(Cell.CELL_TYPE_STRING);
				String cellValueString = getStringCellValue(cell0);
				if ("".equals(cellValueString.trim())
						|| StringUtils.isEmpty(cellValueString)) {
					String msg = "当前行：" + (i + 1) + ",人员姓名不能为空,且不能为空行";
					EEOSBusinessException e = new EEOSBusinessException(msg,
							null, this.getClass());
					throw e;
				} else {
					bo.setUserName(cellValueString);
				}
				bo.setCertCode(getStringCellValue(cell1));
				bo.setPhone(getStringCellValue(cell2));
				bo.setHouseholdCode(getStringCellValue(cell3));
				bo.setHouseholdName(getStringCellValue(cell4));
				bo.setDistrictCode(getStringCellValue(cell5));
				bo.setCurrentDistrict(getStringCellValue(cell6));
				bo.setCurrentStreet(getStringCellValue(cell7));
				bo.setCurrentCommunity(getStringCellValue(cell8));
				bo.setLiveAddress(getStringCellValue(cell9));
				bo.setFileDate(date);
				bo.setCreateTime(new Date());
				if(type==3){
					trafficFromForeignDao.insert(bo);
					count++;
				}else if(type==2){
					trafficFromForeignDao.insertYellow(bo);
					count++;
				}
			}
		}
		result.setSuccessful(true);
		Map<String, Integer> statistic = new HashMap<String, Integer>();
		statistic.put("allCount", lastRowNum);
		statistic.put("scuuessCount", count);
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
