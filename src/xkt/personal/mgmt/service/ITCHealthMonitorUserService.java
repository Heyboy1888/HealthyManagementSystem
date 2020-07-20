package xkt.personal.mgmt.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.ls.pf.base.common.rest.object.WrappedResult;

import xkt.personal.mgmt.bo.TCHealthMonitorUser;


public interface ITCHealthMonitorUserService {
	List<Map<String, Object>> queryMonitorUser(Map<String, Object> map);
	
	int countMonitorUser(Map<String, Object> map);
	
	int deleteByPrimaryKey(String id);
	
	int updateByPrimaryKey(Map<String, Object> map);
	
	TCHealthMonitorUser selectDetail(String id);
	
	int updateByPrimaryKeySelective(TCHealthMonitorUser user);
	
	int insert(TCHealthMonitorUser user);
	
	WrappedResult importExcel(InputStream in, long size,
			String originalFilename, String originalFileType);
}
