package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCCommuityCriteria;

public interface TCCommuityDao {
    int countByExample(TCCommuityCriteria example);

    int deleteByExample(TCCommuityCriteria example);

    int deleteByPrimaryKey(String commuityId);

    int insert(TCCommuity record);

    int insertSelective(TCCommuity record);

    List<TCCommuity> selectByExample(TCCommuityCriteria example);

    TCCommuity selectByPrimaryKey(String commuityId);

    int updateByExampleSelective(@Param("record") TCCommuity record, @Param("example") TCCommuityCriteria example);

    int updateByExample(@Param("record") TCCommuity record, @Param("example") TCCommuityCriteria example);

    int updateByPrimaryKeySelective(TCCommuity record);

    int updateByPrimaryKey(TCCommuity record);
    
    List<TCCommuity> selectByPage(Map<String, String> inMap);

	int countByExampleAndPage(Map<String, String> inMap);
	
	//查询核验员管理的小区
	List<TCCommuity> selectByVerify(Map<String, String> inMap);
	int countByVerify(Map<String, String> inMap);
	//查询审核员管理的小区
	List<TCCommuity> selectByChecker(Map<String, String> inMap);
	int countByChecker(Map<String, String> inMap);
}