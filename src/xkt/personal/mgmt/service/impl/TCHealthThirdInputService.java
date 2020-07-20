package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;

import xkt.personal.mgmt.bo.TCHealthThirdInput;
import xkt.personal.mgmt.dao.thirdinput.TCHealthThirdInputDao;
import xkt.personal.mgmt.service.ITCHealthThirdInputService;

@Service(target = { ServiceType.APPLICATION }, value = "tcHealthThirdInputService")
public class TCHealthThirdInputService implements ITCHealthThirdInputService {
	
	@Autowired
	TCHealthThirdInputDao tcHealthThirdInputDao;
	
	public List<TCHealthThirdInput> selectByPage(Map<String, String> var1) {
		return tcHealthThirdInputDao.selectByPageinput(var1);
	}

	public int countByExampleAndPage(Map<String, String> var1) {
		return tcHealthThirdInputDao.countByExampleAndPageinput(var1);
	}

}
