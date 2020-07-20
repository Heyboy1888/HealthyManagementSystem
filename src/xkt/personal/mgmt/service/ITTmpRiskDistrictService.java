package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

public interface ITTmpRiskDistrictService {
	List<Map<String,Object>> query(Map<String,Object> map);
	
	Map<String,Object>   detail(Map<String,Object> map);
	
	int countQuery(Map<String,Object> map);
	
	int update(Map<String,Object> map);
	
	int insert(Map<String,Object> map);
	
	int del(String districtCode);
}
