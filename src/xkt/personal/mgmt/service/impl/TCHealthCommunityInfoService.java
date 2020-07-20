package xkt.personal.mgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.dao.xkm.TCHealthCommunityInfoDao;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;

@Service(target = { ServiceType.APPLICATION }, value = "tcHealthCommunityInfoService")
public class TCHealthCommunityInfoService implements
		ITCHealthCommunityInfoService {

	@Autowired
	private TCHealthCommunityInfoDao tcHealthCommunityInfoDao;

	public int countByExample(TCHealthCommunityInfoCriteria criteria) {
		return tcHealthCommunityInfoDao.countByExample(criteria);
	}

	public int deleteByExample(TCHealthCommunityInfoCriteria criteria) {
		return tcHealthCommunityInfoDao.deleteByExample(criteria);
	}

	public int deleteByPrimaryKey(String id) {
		return tcHealthCommunityInfoDao.deleteByPrimaryKey(id);
	}

	public int insert(TCHealthCommunityInfo bo) {
		return tcHealthCommunityInfoDao.insert(bo);
	}

	public int insertSelective(TCHealthCommunityInfo bo) {
		return tcHealthCommunityInfoDao.insertSelective(bo);
	}

	public List<TCHealthCommunityInfo> selectByExample(
			TCHealthCommunityInfoCriteria criteria) {
		return tcHealthCommunityInfoDao.selectByExample(criteria);
	}

	public TCHealthCommunityInfo selectByPrimaryKey(String id) {
		return tcHealthCommunityInfoDao.selectByPrimaryKey(id);
	}

	public int updateByExample(TCHealthCommunityInfo bo,
			TCHealthCommunityInfoCriteria criteria) {
		return tcHealthCommunityInfoDao.updateByExample(bo, criteria);
	}

	public int updateByExampleSelective(TCHealthCommunityInfo bo,
			TCHealthCommunityInfoCriteria criteria) {
		return tcHealthCommunityInfoDao.updateByExampleSelective(bo, criteria);
	}

	public int updateByPrimaryKey(TCHealthCommunityInfo bo) {
		return tcHealthCommunityInfoDao.updateByPrimaryKey(bo);
	}

	public int updateByPrimaryKeySelective(TCHealthCommunityInfo bo) {
		return tcHealthCommunityInfoDao.updateByPrimaryKeySelective(bo);
	}

}
