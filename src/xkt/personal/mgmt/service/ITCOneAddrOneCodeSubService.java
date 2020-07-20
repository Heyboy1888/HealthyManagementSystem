package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author yangy
 *
 */
public interface ITCOneAddrOneCodeSubService {
	
	List<Map<String,Object>> getSubInfoByCompanyId(String companyId);
	
	Map<String,Object> getSubInfoById(String id);

}
