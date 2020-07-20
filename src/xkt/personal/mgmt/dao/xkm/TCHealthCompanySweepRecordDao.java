package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCompanySweepRecord;
import xkt.personal.mgmt.bo.TCHealthCompanySweepRecordCriteria;

public interface TCHealthCompanySweepRecordDao {
    int countByExample(TCHealthCompanySweepRecordCriteria example);

    int deleteByExample(TCHealthCompanySweepRecordCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCompanySweepRecord record);

    int insertSelective(TCHealthCompanySweepRecord record);

    List<TCHealthCompanySweepRecord> selectByExample(TCHealthCompanySweepRecordCriteria example);

    TCHealthCompanySweepRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCompanySweepRecord record, @Param("example") TCHealthCompanySweepRecordCriteria example);

    int updateByExample(@Param("record") TCHealthCompanySweepRecord record, @Param("example") TCHealthCompanySweepRecordCriteria example);

    int updateByPrimaryKeySelective(TCHealthCompanySweepRecord record);

    int updateByPrimaryKey(TCHealthCompanySweepRecord record);
    
    List<Map<String,Object>> selectRecordByCertCode(Map<String,Object> map);
    
    int countRecordByCertCode(Map<String,Object> map);
    
    List<Map<String,Object>> selectPersonalScanByCompanyIdScanDate(Map<String,Object> inMap);
	 
	 int countPersonalScanByCompanyIdScanDate(Map<String,Object> inMap);
    
    
}