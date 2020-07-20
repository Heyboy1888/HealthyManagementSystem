package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.dao.xkm.TCHealthCompanySubDao;
import xkt.personal.mgmt.service.ITCOneAddrOneCodeSubService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;

@Service(target = { ServiceType.APPLICATION }, value = "oneAddrOneCodeSubService")
public class TCOneAddrOneCodeSubService implements ITCOneAddrOneCodeSubService{
	

	
	
	
	@Autowired
	private TCHealthCompanySubDao healthCompanySubDao;
	
	@Override
	public List<Map<String,Object>> getSubInfoByCompanyId(String companyId) {
		
		System.out.println("==============================");
		
		return healthCompanySubDao.getOneAddrOneCodeSubInfoByCompanyId(companyId);
	}
	
	
	@Override
	public Map<String,Object> getSubInfoById(String id){
		return healthCompanySubDao.getSubInfoById(id);
	}

}
