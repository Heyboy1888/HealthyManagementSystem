package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TmpXkmChinaDistrict;
import xkt.personal.mgmt.bo.TmpXkmChinaDistrictExample;
import xkt.personal.mgmt.dao.statistic.TmpRiskDistrictDao;
import xkt.personal.mgmt.dao.statistic.TmpXkmChinaDistrictDao;
import xkt.personal.mgmt.service.IDistrictTreeService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;

@Service(target = { ServiceType.APPLICATION }, value = "districtTreeService")
public class DistrictTreeServiceImpl implements IDistrictTreeService{
	@Autowired
	private TmpRiskDistrictDao dao;
	
	@Autowired
	private TmpXkmChinaDistrictDao xkmChinaDistrictDao;

	@Override
	public List<Map<String, Object>> getParant(Map<String,Object> map) {
		return dao.queryByDistrictType(map);
	}

	@Override
	public List<TmpXkmChinaDistrict> selectByExample(
			TmpXkmChinaDistrictExample example) {
		return xkmChinaDistrictDao.selectByExample(example);
	}

}
