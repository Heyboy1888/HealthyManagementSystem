package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TCHealthSiteInfo;



public interface ISiteInfoService {
	int delete(String id);
	
	int update(TCHealthSiteInfo info);
	
	int insert(TCHealthSiteInfo info);
	
	List<Map<String,Object>> select(Map<String,Object> map);
	
	int selectCount(Map<String,Object> map);
	
}
