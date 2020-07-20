package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthSiteInfo;
import xkt.personal.mgmt.bo.TCHealthSiteInfoExample;

public interface TCHealthSiteInfoDao {
    int countByExample(TCHealthSiteInfoExample example);

    int deleteByExample(TCHealthSiteInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthSiteInfo record);

    int insertSelective(TCHealthSiteInfo record);

    List<TCHealthSiteInfo> selectByExample(TCHealthSiteInfoExample example);

    TCHealthSiteInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthSiteInfo record, @Param("example") TCHealthSiteInfoExample example);

    int updateByExample(@Param("record") TCHealthSiteInfo record, @Param("example") TCHealthSiteInfoExample example);

    int updateByPrimaryKeySelective(TCHealthSiteInfo record);

    int updateByPrimaryKey(TCHealthSiteInfo record);
    
    List<Map<String, Object>> select(Map<String, Object> map);
    
    int  selectCount(Map<String, Object> map);
}