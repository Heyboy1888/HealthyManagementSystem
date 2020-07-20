package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthMonitorUser;
import xkt.personal.mgmt.bo.TCHealthMonitorUserExample;

public interface TCHealthMonitorUserDao {
	int countByExample(TCHealthMonitorUserExample example);

	int deleteByExample(TCHealthMonitorUserExample example);

	int deleteByPrimaryKey(String id);

	int insert(TCHealthMonitorUser record);

	int insertSelective(TCHealthMonitorUser record);

	List<TCHealthMonitorUser> selectByExample(TCHealthMonitorUserExample example);

	TCHealthMonitorUser selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") TCHealthMonitorUser record,
			@Param("example") TCHealthMonitorUserExample example);

	int updateByExample(@Param("record") TCHealthMonitorUser record,
			@Param("example") TCHealthMonitorUserExample example);

	int updateByPrimaryKeySelective(TCHealthMonitorUser record);

	int updateByPrimaryKey(TCHealthMonitorUser record);

	List<Map<String, Object>> queryMonitorUser(Map<String, Object> map);
	
	int countMonitorUser(Map<String, Object> map);
	
}