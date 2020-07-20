package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TCHealthCodeApply;


public interface ITCHealthCodeApplyService {
	
	List<TCHealthCodeApply> selectByPage(Map<String, String> var1);
	
	int countTCHealthCodeApply(Map<String, String> var2);

	public List<TCHealthCodeApply> selectByCertCode(Map<String,Object> map);
	
	public int countByCertCode(Map<String,Object> map);

	
	TCHealthCodeApply selecDetail(Integer id);

	List<Map<String,Object>> selectSweepRecordExport(Map<String,Object> map);
	
	int updateByCertCode(Map<String,Object> map);
	
	int updateNameAndPhone(Map<String,Object> map);
	
	List<Map<String, Object>> selectCertCodeBySecret(Map<String, Object> map);
}
