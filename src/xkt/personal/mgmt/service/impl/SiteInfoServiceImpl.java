package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ls.pf.base.api.framework.Service;

import xkt.personal.mgmt.bo.TCHealthSiteInfo;
import xkt.personal.mgmt.dao.xkm.TCHealthSiteInfoDao;
import xkt.personal.mgmt.service.ISiteInfoService;

@Service
public class SiteInfoServiceImpl implements ISiteInfoService{
	@Autowired
	TCHealthSiteInfoDao healthSiteInfoDao;
	
	
	@Override
	public int delete(String id) {
		
		return healthSiteInfoDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(TCHealthSiteInfo info) {
		return healthSiteInfoDao.updateByPrimaryKeySelective(info);
	}

	@Override
	public int insert(TCHealthSiteInfo info) {
		
		return healthSiteInfoDao.insertSelective(info);
	}

	@Override
	public List<Map<String,Object>> select(Map<String,Object> map) {
		return healthSiteInfoDao.select(map);
	}

	@Override
	public int selectCount(Map<String,Object> map) {
		return healthSiteInfoDao.selectCount(map);
	}
	

}
