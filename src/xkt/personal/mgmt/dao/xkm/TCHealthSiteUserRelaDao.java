package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthSiteUserRela;
import xkt.personal.mgmt.bo.TCHealthSiteUserRelaExample;

public interface TCHealthSiteUserRelaDao {
    int countByExample(TCHealthSiteUserRelaExample example);

    int deleteByExample(TCHealthSiteUserRelaExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthSiteUserRela record);

    int insertSelective(TCHealthSiteUserRela record);

    List<TCHealthSiteUserRela> selectByExample(TCHealthSiteUserRelaExample example);

    TCHealthSiteUserRela selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthSiteUserRela record, @Param("example") TCHealthSiteUserRelaExample example);

    int updateByExample(@Param("record") TCHealthSiteUserRela record, @Param("example") TCHealthSiteUserRelaExample example);

    int updateByPrimaryKeySelective(TCHealthSiteUserRela record);

    int updateByPrimaryKey(TCHealthSiteUserRela record);
    

	int countByExamplePage(Map<String, String> inMap);

	List<TCHealthSiteUserRela> selectByPage(Map<String, String> inMap);
}