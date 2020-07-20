package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TmpXkmChinaDistrict;
import xkt.personal.mgmt.bo.TmpXkmChinaDistrictExample;

public interface IDistrictTreeService {
	List<Map<String,Object>> getParant(Map<String,Object> map);
	
	List<TmpXkmChinaDistrict> selectByExample(TmpXkmChinaDistrictExample example);
}
