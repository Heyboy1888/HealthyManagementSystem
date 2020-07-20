package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCodeModifyRecord;
import xkt.personal.mgmt.bo.TCHealthCodeModifyRecordExample;

public interface TCHealthCodeModifyRecordDao {
    int countByExample(TCHealthCodeModifyRecordExample example);

    int deleteByExample(TCHealthCodeModifyRecordExample example);

    int insert(TCHealthCodeModifyRecord record);

    int insertSelective(TCHealthCodeModifyRecord record);

    List<TCHealthCodeModifyRecord> selectByExample(TCHealthCodeModifyRecordExample example);

    int updateByExampleSelective(@Param("record") TCHealthCodeModifyRecord record, @Param("example") TCHealthCodeModifyRecordExample example);

    int updateByExample(@Param("record") TCHealthCodeModifyRecord record, @Param("example") TCHealthCodeModifyRecordExample example);
    
    List<Map<String, Object>> queryModifyRecord(Map<String,Object> map);
}