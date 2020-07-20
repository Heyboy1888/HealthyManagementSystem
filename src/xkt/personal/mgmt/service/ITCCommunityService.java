package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TCCommuity;

public interface ITCCommunityService {
	Boolean importCommunityComm(TCCommuity bo,Object imortBo) throws Exception;

    int deleteByPrimaryKey(String commuityId);

    int insert(TCCommuity record);

    int updateByPrimaryKey(TCCommuity record);
    
	int countByExampleAndPage(Map<String, String> inMap);

	List<TCCommuity> selectByPage(Map<String, String> inMap);
	
	TCCommuity selectByPrimaryKey(String commuityId);
	
	//查询核验员管理的小区
	List<TCCommuity> selectByVerify(Map<String, String> inMap);
	int countByVerify(Map<String, String> inMap);
	//查询审核员管理的小区
	List<TCCommuity> selectByChecker(Map<String, String> inMap);
	int countByChecker(Map<String, String> inMap);
}
