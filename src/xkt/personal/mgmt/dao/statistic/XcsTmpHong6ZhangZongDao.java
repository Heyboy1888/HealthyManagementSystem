package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.XcsTmpHong6ZhangZong;
import xkt.personal.mgmt.bo.XcsTmpHong6ZhangZongExample;

public interface XcsTmpHong6ZhangZongDao {
    int countByExample(XcsTmpHong6ZhangZongExample example);

    int deleteByExample(XcsTmpHong6ZhangZongExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XcsTmpHong6ZhangZong record);

    int insertSelective(XcsTmpHong6ZhangZong record);

    List<XcsTmpHong6ZhangZong> selectByExample(XcsTmpHong6ZhangZongExample example);

    XcsTmpHong6ZhangZong selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XcsTmpHong6ZhangZong record, @Param("example") XcsTmpHong6ZhangZongExample example);

    int updateByExample(@Param("record") XcsTmpHong6ZhangZong record, @Param("example") XcsTmpHong6ZhangZongExample example);

    int updateByPrimaryKeySelective(XcsTmpHong6ZhangZong record);

    int updateByPrimaryKey(XcsTmpHong6ZhangZong record);
    
    List<Map<String, Object>> queryChangeRecordByCertCode(Map<String, Object> map);
}