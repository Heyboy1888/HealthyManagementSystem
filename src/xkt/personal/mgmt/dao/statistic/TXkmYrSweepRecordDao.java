package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


import xkt.personal.mgmt.bo.TXkmYrSweepRecord;
import xkt.personal.mgmt.bo.TXkmYrSweepRecordExample;

public interface TXkmYrSweepRecordDao {
    int countByExample(TXkmYrSweepRecordExample example);

    int deleteByExample(TXkmYrSweepRecordExample example);

    int insert(TXkmYrSweepRecord record);

    int insertSelective(TXkmYrSweepRecord record);

    List<TXkmYrSweepRecord> selectByExample(TXkmYrSweepRecordExample example);

    int updateByExampleSelective(@Param("record") TXkmYrSweepRecord record, @Param("example") TXkmYrSweepRecordExample example);

    int updateByExample(@Param("record") TXkmYrSweepRecord record, @Param("example") TXkmYrSweepRecordExample example);
    
    List<Map<String, Object>> queryYrSweepRecord(Map<String, Object> map);
    
    int countYrSweepRecord(Map<String, Object> map);
}