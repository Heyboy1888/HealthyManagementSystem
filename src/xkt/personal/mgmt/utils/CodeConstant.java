package xkt.personal.mgmt.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CodeConstant {
	public static final String PROVINCE_CODE="320000";//江苏
	public static final String CITY_CODE="320200";//无锡
	
	// 人员类型
	public static final List<Map<String,String>> PERSONAL_TYPE_MAP_LIST = new LinkedList<Map<String,String>>();
	// 证件类型
	public static final List<Map<String,String>> CERT_TYPE_MAP_LIST = new LinkedList<Map<String,String>>();
	
	public static final List<Map<String,String>> CERT_TYPE_VALUE_MAP_LIST = new LinkedList<Map<String,String>>();
	// 社区分类
	public static final List<Map<String,String>> CMMTY_TYPE_MAP_LIST = new LinkedList<Map<String,String>>();
	
	// 是否
	public static final List<Map<String,String>> IS_NOT_MAP_LIST = new LinkedList<Map<String,String>>();	
	
	public static final List<Map<String,String>> IS_NOT_VALUE_MAP_LIST = new LinkedList<Map<String,String>>();	
	
	// 区域类型
	public static final List<Map<String,String>> DISTRICT_TYPE_MAP_LIST = new LinkedList<Map<String,String>>();	
	
	
	
	static{
		// 1、人员类型
		Map<String,String> PERSONAL_TYPE_MAP_A =  new HashMap<String, String>();
		PERSONAL_TYPE_MAP_A.put("name", "审核员");
		PERSONAL_TYPE_MAP_A.put("value", "审核员");
		
		Map<String,String> PERSONAL_TYPE_MAP_B =  new HashMap<String, String>();
		PERSONAL_TYPE_MAP_B.put("name", "区管理员");
		PERSONAL_TYPE_MAP_B.put("value", "区管理员");
		
		Map<String,String> PERSONAL_TYPE_MAP_C =  new HashMap<String, String>();
		PERSONAL_TYPE_MAP_C.put("name", "街道管理员");
		PERSONAL_TYPE_MAP_C.put("value", "街道管理员");
		
		Map<String,String> PERSONAL_TYPE_MAP_D =  new HashMap<String, String>();
		PERSONAL_TYPE_MAP_D.put("name", "其他");
		PERSONAL_TYPE_MAP_D.put("value", "其他");		
		PERSONAL_TYPE_MAP_LIST.add(PERSONAL_TYPE_MAP_A);
		PERSONAL_TYPE_MAP_LIST.add(PERSONAL_TYPE_MAP_B);
		PERSONAL_TYPE_MAP_LIST.add(PERSONAL_TYPE_MAP_C);
		PERSONAL_TYPE_MAP_LIST.add(PERSONAL_TYPE_MAP_D);
		
		// 2、证件类型
		Map<String, String> CERT_TYPE_MAP_A = new HashMap<String, String>();
		CERT_TYPE_MAP_A.put("name", "身份证");
		CERT_TYPE_MAP_A.put("value", "身份证");
		CERT_TYPE_MAP_LIST.add(CERT_TYPE_MAP_A);
		
		// 3、社区分类
		Map<String, String> CMMTY_TYPE_MAP_A = new HashMap<String, String>();
		CMMTY_TYPE_MAP_A.put("name", "小区");
		CMMTY_TYPE_MAP_A.put("value", "小区");
		Map<String, String> CMMTY_TYPE_MAP_B = new HashMap<String, String>();
		CMMTY_TYPE_MAP_B.put("name", "单位");
		CMMTY_TYPE_MAP_B.put("value", "单位");
		Map<String, String> CMMTY_TYPE_MAP_C = new HashMap<String, String>();
		CMMTY_TYPE_MAP_C.put("name", "公共场所");
		CMMTY_TYPE_MAP_C.put("value", "公共场所");
		
		CMMTY_TYPE_MAP_LIST.add(CMMTY_TYPE_MAP_A);
		CMMTY_TYPE_MAP_LIST.add(CMMTY_TYPE_MAP_B);
		CMMTY_TYPE_MAP_LIST.add(CMMTY_TYPE_MAP_C);
		
		
		// 4、是否
		Map<String, String> IS_NOT_MAP_A = new HashMap<String, String>();
		IS_NOT_MAP_A.put("name", "是");
		IS_NOT_MAP_A.put("value", "是");
		
		Map<String, String> IS_NOT_MAP_B = new HashMap<String, String>();
		IS_NOT_MAP_B.put("name", "否");
		IS_NOT_MAP_B.put("value", "否");
		
		IS_NOT_MAP_LIST.add(IS_NOT_MAP_A);
		IS_NOT_MAP_LIST.add(IS_NOT_MAP_B);
		
		// 5、区域类型
		
		Map<String, String> DISTRICT_TYPE_MAP_A = new HashMap<String, String>();
		DISTRICT_TYPE_MAP_A.put("name", "市");
		DISTRICT_TYPE_MAP_A.put("value", "1");

		Map<String, String> DISTRICT_TYPE_MAP_B = new HashMap<String, String>();
		DISTRICT_TYPE_MAP_B.put("name", "区/县级市");
		DISTRICT_TYPE_MAP_B.put("value", "2");

		Map<String, String> DISTRICT_TYPE_MAP_C = new HashMap<String, String>();
		DISTRICT_TYPE_MAP_C.put("name", "街道/镇");
		DISTRICT_TYPE_MAP_C.put("value", "3");

		Map<String, String> DISTRICT_TYPE_MAP_D = new HashMap<String, String>();
		DISTRICT_TYPE_MAP_D.put("name", "社区/村");
		DISTRICT_TYPE_MAP_D.put("value", "4");
		
		DISTRICT_TYPE_MAP_LIST.add(DISTRICT_TYPE_MAP_A);
		DISTRICT_TYPE_MAP_LIST.add(DISTRICT_TYPE_MAP_B);
		DISTRICT_TYPE_MAP_LIST.add(DISTRICT_TYPE_MAP_C);
		DISTRICT_TYPE_MAP_LIST.add(DISTRICT_TYPE_MAP_D);
		
		// 5、是否值
		Map<String, String> IS_NOT_VALUE_MAP_A = new HashMap<String, String>();
		IS_NOT_VALUE_MAP_A.put("name", "是");
		IS_NOT_VALUE_MAP_A.put("value", "1");
		
		Map<String, String> IS_NOT_VALUE_MAP_B = new HashMap<String, String>();
		IS_NOT_VALUE_MAP_B.put("name", "否");
		IS_NOT_VALUE_MAP_B.put("value", "0");
		
		IS_NOT_VALUE_MAP_LIST.add(IS_NOT_VALUE_MAP_A);
		IS_NOT_VALUE_MAP_LIST.add(IS_NOT_VALUE_MAP_B);
		
		// 6、证件值
		Map<String, String> CERT_TYPE_VALUE_MAP_A = new HashMap<String, String>();
		CERT_TYPE_VALUE_MAP_A.put("name", "身份证");
		CERT_TYPE_VALUE_MAP_A.put("value", "01");
		CERT_TYPE_VALUE_MAP_LIST.add(CERT_TYPE_VALUE_MAP_A);
		
	}
	
	
	
}
