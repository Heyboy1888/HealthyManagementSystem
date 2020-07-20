package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecord;
import xkt.personal.mgmt.bo.TCHealthCodeSweepRecordExample;

public interface TCHealthCodeSweepRecordDao {
    int countByExample(TCHealthCodeSweepRecordExample example);

    int deleteByExample(TCHealthCodeSweepRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCodeSweepRecord record);

    int insertSelective(TCHealthCodeSweepRecord record);

    List<TCHealthCodeSweepRecord> selectByExample(TCHealthCodeSweepRecordExample example);

    TCHealthCodeSweepRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCodeSweepRecord record, @Param("example") TCHealthCodeSweepRecordExample example);

    int updateByExample(@Param("record") TCHealthCodeSweepRecord record, @Param("example") TCHealthCodeSweepRecordExample example);

    int updateByPrimaryKeySelective(TCHealthCodeSweepRecord record);

    int updateByPrimaryKey(TCHealthCodeSweepRecord record);
}