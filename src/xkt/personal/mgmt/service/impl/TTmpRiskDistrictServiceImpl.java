package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xkt.personal.mgmt.dao.statistic.TmpRiskDistrictDao;
import xkt.personal.mgmt.service.ITTmpRiskDistrictService;

@Service
public class TTmpRiskDistrictServiceImpl implements ITTmpRiskDistrictService{
	
	@Autowired
	TmpRiskDistrictDao tmpRiskDistricatDao;
	
	@Override
	public List<Map<String, Object>> query(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tmpRiskDistricatDao.queryRiskDistrict(map);
	}

	@Override
	public int countQuery(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tmpRiskDistricatDao.countqueryRiskDistrict(map);
	}

	@Override
	public Map<String, Object> detail(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tmpRiskDistricatDao.RiskDistrictDetail(map);
	}

	@Override
	public int update(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tmpRiskDistricatDao.updateRiskDistrict(map);
	}

	@Override
	public int insert(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tmpRiskDistricatDao.addRiskDistrict(map);
	}

	@Override
	public int del(String districtCode) {
		// TODO Auto-generated method stub
		return tmpRiskDistricatDao.deleteRiskDistrict(districtCode);
	}


}
