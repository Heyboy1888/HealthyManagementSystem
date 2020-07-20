package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TCHealthCodeApply;
import xkt.personal.mgmt.dao.xkm.TCHealthCodeApplyDao;
import xkt.personal.mgmt.service.ITCHealthCodeApplyService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;

@Service(target = { ServiceType.APPLICATION }, value ="tcHealthCodeApplyService")
public class TCHealthCodeApplyService implements ITCHealthCodeApplyService{

	@Autowired
	TCHealthCodeApplyDao tcHealthCodeApplyDao;
	
	
	@Override
	public List<TCHealthCodeApply> selectByPage(Map<String, String> var1) {
		
		return tcHealthCodeApplyDao.selectByPageTCHealthCodeApply(var1);
	}


	@Override
	public int countTCHealthCodeApply(Map<String, String> var2) {
		
		return tcHealthCodeApplyDao.countTCHealthCodeApply(var2);
	}
	
	
	@Override
	public List<TCHealthCodeApply> selectByCertCode(Map<String, Object> map) {
		
		return tcHealthCodeApplyDao.selectApplyByCertCode(map);
	}

	@Override
	public int countByCertCode(Map<String, Object> map) {
		
		return tcHealthCodeApplyDao.countApplyByCertCode(map);
	}


	@Override
	public TCHealthCodeApply selecDetail(Integer id) {
		
		return tcHealthCodeApplyDao.selectDetailById(id);
	}
	
	@Override
	public List<Map<String, Object>> selectSweepRecordExport(Map<String, Object> map) {
		
		return tcHealthCodeApplyDao.selectSweepRecordExport(map);
	}


	@Override
	public int updateByCertCode(Map<String, Object> map) {
		
		return tcHealthCodeApplyDao.updateByCertCode(map);
	}


	@Override
	public int updateNameAndPhone(Map<String, Object> map) {
		if(map.get("userName")!=null){
			tcHealthCodeApplyDao.updateUserTableByCertCode(map);
			tcHealthCodeApplyDao.updateRelaTableByCertCode(map);
		}
		
		int c=tcHealthCodeApplyDao.updateByCertCode(map);
		return c;
	}


	@Override
	public List<Map<String, Object>> selectCertCodeBySecret(
			Map<String, Object> arg0) {
		
		return tcHealthCodeApplyDao.selectCertCodeBySecret(arg0);
	}

}
