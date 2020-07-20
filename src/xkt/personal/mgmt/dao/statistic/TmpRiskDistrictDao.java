package xkt.personal.mgmt.dao.statistic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TmpRiskDistrictDao {
	List<Map<String,Object>> queryRiskDistrict(Map<String,Object> map);
	
	Map<String,Object> RiskDistrictDetail(Map<String,Object> map);
	
	int countqueryRiskDistrict(Map<String,Object> map);
	
	int addRiskDistrict(Map<String,Object> map);
	
	int updateRiskDistrict(Map<String,Object> map);
	
	int deleteRiskDistrict(@Param("districtCode")String districtCode);
	
	List<Map<String,Object>> queryByDistrictType(Map<String,Object> map);
}
