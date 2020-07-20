package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCodeAdmin;
import xkt.personal.mgmt.bo.TCHealthCodeAdminCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeAdminExt;

public interface TCHealthCodeAdminDao {
	int countByExample(TCHealthCodeAdminCriteria example);

	int deleteByExample(TCHealthCodeAdminCriteria example);

	int deleteByPrimaryKey(String id);

	int insert(TCHealthCodeAdmin record);

	int insertSelective(TCHealthCodeAdmin record);

	List<TCHealthCodeAdmin> selectByExample(TCHealthCodeAdminCriteria example);

	TCHealthCodeAdmin selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") TCHealthCodeAdmin record,
			@Param("example") TCHealthCodeAdminCriteria example);

	int updateByExample(@Param("record") TCHealthCodeAdmin record,
			@Param("example") TCHealthCodeAdminCriteria example);

	int updateByPrimaryKeySelective(TCHealthCodeAdmin record);

	int updateByPrimaryKey(TCHealthCodeAdmin record);

	List<TCHealthCodeAdmin> selectByExampleAndPage(Map<String, String> inMap);

	int countByExampleAndPage(Map<String, String> inMap);
	
	List<TCHealthCodeAdminExt> selectByPage(Map<String, String> inMap);
}