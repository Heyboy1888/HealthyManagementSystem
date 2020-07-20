package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TGRegionCatalog;
import xkt.personal.mgmt.bo.TGRegionCatalogCriteria;
import xkt.personal.mgmt.dao.account.LoginAccountInfoDao;
import xkt.personal.mgmt.service.ILoginAccountInfoService;
import xkt.personal.mgmt.web.vo.LoginAccountInfoVo;

import com.ls.pf.base.api.auth.IAccountService;
import com.ls.pf.base.api.auth.IStaffService;
import com.ls.pf.base.api.auth.bo.AccountBo;
import com.ls.pf.base.api.auth.bo.StaffBo;
import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.framework.ServiceType;
import com.ls.pf.base.api.sysparam.ISysParamService;

@Service(target = { ServiceType.APPLICATION }, value = "loginAccountInfoService")
public class LoginAccountInfoService implements ILoginAccountInfoService {
	@ServiceAutowired
	private IAccountService accountService;

	@Autowired
	private LoginAccountInfoDao loginAccountInfoDao;

	@ServiceAutowired
	private ISysParamService sysParamService;

	@ServiceAutowired
	private IStaffService staffService;
	//@ServiceAutowired
	//private ITGRegionCatalogService tgRegionCatalogService;

	public List<LoginAccountInfoVo> selectByPage(Map<String, String> inMap) {
		return loginAccountInfoDao.selectByPage(inMap);
	}

	public int queryCount(Map<String, String> inMap) {
		return loginAccountInfoDao.queryCount(inMap);
	}

	public LoginAccountInfoVo selectByPrimaryKey(String id) {
		return loginAccountInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public TGRegionCatalog getAccountRegionCatalog(AccountBo abo) {
		StaffBo sBo = staffService.getStaffByAccoutName(abo.getName());
		TGRegionCatalogCriteria example = new TGRegionCatalogCriteria();
		TGRegionCatalogCriteria.Criteria criteria = example.createCriteria();
		criteria.andAccountCodeEqualTo(sBo.getOrgNo());
		//return tgRegionCatalogService.selectByExample(example).get(0);
		return null;
	}
}
