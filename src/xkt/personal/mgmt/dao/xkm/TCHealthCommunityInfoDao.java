package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;

public interface TCHealthCommunityInfoDao {
    int countByExample(TCHealthCommunityInfoCriteria example);

    int deleteByExample(TCHealthCommunityInfoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCommunityInfo record);

    int insertSelective(TCHealthCommunityInfo record);

    List<TCHealthCommunityInfo> selectByExample(TCHealthCommunityInfoCriteria example);

    TCHealthCommunityInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCommunityInfo record, @Param("example") TCHealthCommunityInfoCriteria example);

    int updateByExample(@Param("record") TCHealthCommunityInfo record, @Param("example") TCHealthCommunityInfoCriteria example);

    int updateByPrimaryKeySelective(TCHealthCommunityInfo record);

    int updateByPrimaryKey(TCHealthCommunityInfo record);
}