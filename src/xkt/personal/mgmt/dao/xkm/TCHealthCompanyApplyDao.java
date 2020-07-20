package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xkt.personal.mgmt.bo.TCHealthCompanyApply;
import xkt.personal.mgmt.bo.TCHealthCompanyApplyExample;

public interface TCHealthCompanyApplyDao {
    int countByExample(TCHealthCompanyApplyExample example);

    int deleteByExample(TCHealthCompanyApplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCHealthCompanyApply record);

    int insertSelective(TCHealthCompanyApply record);

    List<TCHealthCompanyApply> selectByExample(TCHealthCompanyApplyExample example);
    
    TCHealthCompanyApply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCHealthCompanyApply record, @Param("example") TCHealthCompanyApplyExample example);

    int updateByExample(@Param("record") TCHealthCompanyApply record, @Param("example") TCHealthCompanyApplyExample example);

    int updateByPrimaryKeySelective(TCHealthCompanyApply record);

    int updateByPrimaryKey(TCHealthCompanyApply record);
    
	List<Map<String,Object>> queryOneAddrOneCodeInfoByPageMap(Map<String,Object> inMap);
	
	int countOneAddrOneCodeInfoByPageMap(Map<String,Object> inMap);
	
	List<Map<String,Object>> queryCompanyScanStatisticsPageMap(Map<String,Object> inMap);
	
	int countqueryCompanyScanStatisticsByPageMap(Map<String,Object> inMap);
	
	List<Map<String,Object>> queryCompanySubScanStatisticsPageMap(Map<String,Object> inMap);
	
	int countCompanySubScanStatisticsPageMap(Map<String,Object> inMap);
	
	Map<String, Object> getOneAddrOneCodeInfoById(Map<String, Object> inMap);
	
}

