package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCPcLogInfo;
import xkt.personal.mgmt.bo.TCPcLogInfoExample;

public interface TCPcLogInfoDao {
    int countByExample(TCPcLogInfoExample example);

    int deleteByExample(TCPcLogInfoExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(TCPcLogInfo record);

    int insertSelectiveLog(TCPcLogInfo record);

    List<TCPcLogInfo> selectByExample(TCPcLogInfoExample example);

    TCPcLogInfo selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") TCPcLogInfo record, @Param("example") TCPcLogInfoExample example);

    int updateByExample(@Param("record") TCPcLogInfo record, @Param("example") TCPcLogInfoExample example);

    int updateByPrimaryKeySelective(TCPcLogInfo record);

    int updateByPrimaryKey(TCPcLogInfo record);
    
    List<Map<String,Object>> selectByPage(Map<String,Object> map);
    
    int selectCountByPage(Map<String,Object> inMap);
    
}