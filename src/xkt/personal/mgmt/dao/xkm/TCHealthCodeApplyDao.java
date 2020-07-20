package xkt.personal.mgmt.dao.xkm;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCodeApply;
import xkt.personal.mgmt.bo.TCHealthCodeApplyCriteria;

public interface TCHealthCodeApplyDao {
    int countByExample(TCHealthCodeApplyCriteria example);

    int deleteByExample(TCHealthCodeApplyCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCHealthCodeApply record);

    int insertSelective(TCHealthCodeApply record);

    List<TCHealthCodeApply> selectByExampleWithBLOBs(TCHealthCodeApplyCriteria example);

    List<TCHealthCodeApply> selectByExample(TCHealthCodeApplyCriteria example);

    TCHealthCodeApply selectDetailById(Integer id);

    int updateByExampleSelective(@Param("record") TCHealthCodeApply record, @Param("example") TCHealthCodeApplyCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TCHealthCodeApply record, @Param("example") TCHealthCodeApplyCriteria example);

    int updateByExample(@Param("record") TCHealthCodeApply record, @Param("example") TCHealthCodeApplyCriteria example);

    int updateByPrimaryKeySelective(TCHealthCodeApply record);

    int updateByPrimaryKeyWithBLOBs(TCHealthCodeApply record);

    int updateByPrimaryKey(TCHealthCodeApply record);
    
    List<TCHealthCodeApply> selectByPageTCHealthCodeApply(Map<String,String> var1);
    
    int countTCHealthCodeApply(Map<String,String> var2);
    
    int updateByCertCode(Map<String,Object> map);
    
    List<TCHealthCodeApply> selectApplyByCertCode(Map<String,Object> inMap);
	
	int countApplyByCertCode(Map<String,Object> inMap);
	
	List<Map<String,Object>> selectSweepRecordExport(Map<String,Object> map);
	
	int updateUserTableByCertCode(Map<String,Object> map);
	
	int updateRelaTableByCertCode(Map<String,Object> map);
	
	List<Map<String, Object>> selectCertCodeBySecret(Map<String, Object> map);
}