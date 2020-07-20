package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthUserCommunityRelate;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateExt;

public interface TCHealthUserCommunityRelateDao {
    int countByExample(TCHealthUserCommunityRelateCriteria example);

    int deleteByExample(TCHealthUserCommunityRelateCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthUserCommunityRelate record);

    int insertSelective(TCHealthUserCommunityRelate record);

    List<TCHealthUserCommunityRelate> selectByExample(TCHealthUserCommunityRelateCriteria example);

    TCHealthUserCommunityRelate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthUserCommunityRelate record, @Param("example") TCHealthUserCommunityRelateCriteria example);

    int updateByExample(@Param("record") TCHealthUserCommunityRelate record, @Param("example") TCHealthUserCommunityRelateCriteria example);

    int updateByPrimaryKeySelective(TCHealthUserCommunityRelate record);

    int updateByPrimaryKey(TCHealthUserCommunityRelate record);
    
    
    List<TCHealthUserCommunityRelateExt> selectByPage(Map<String, String> inMap);

	int countByExampleAndPage(Map<String, String> inMap);
}