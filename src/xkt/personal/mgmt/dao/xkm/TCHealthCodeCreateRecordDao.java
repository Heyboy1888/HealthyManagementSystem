package xkt.personal.mgmt.dao.xkm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCodeCreateRecord;
import xkt.personal.mgmt.bo.TCHealthCodeCreateRecordExample;

public interface TCHealthCodeCreateRecordDao {
    int countByExample(TCHealthCodeCreateRecordExample example);

    int deleteByExample(TCHealthCodeCreateRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCHealthCodeCreateRecord record);

    int insertSelective(TCHealthCodeCreateRecord record);

    List<TCHealthCodeCreateRecord> selectByExample(TCHealthCodeCreateRecordExample example);

    TCHealthCodeCreateRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCHealthCodeCreateRecord record, @Param("example") TCHealthCodeCreateRecordExample example);

    int updateByExample(@Param("record") TCHealthCodeCreateRecord record, @Param("example") TCHealthCodeCreateRecordExample example);

    Integer updateByCompanyId(TCHealthCodeCreateRecord record);

    int updateByPrimaryKey(TCHealthCodeCreateRecord record);
    
    List<String> selectStatusList();
    
}