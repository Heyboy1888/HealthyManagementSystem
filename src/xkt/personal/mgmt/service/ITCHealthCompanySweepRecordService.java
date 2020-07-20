package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.web.vo.CompanySweepRecordVo;

public interface ITCHealthCompanySweepRecordService {

	public List<CompanySweepRecordVo> selectRecordByCertCode(
			Map<String, Object> val);
	
	public int countRecordByCertCode(Map<String, Object> val);
	
	  List<Map<String,Object>> selectPersonalScanByCompanyIdScanDate(Map<String,Object> inMap);
		 
		 int countPersonalScanByCompanyIdScanDate(Map<String,Object> inMap);
	
	
}
