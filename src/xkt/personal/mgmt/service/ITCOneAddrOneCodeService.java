package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TCHealthCodeCreateRecord;
import xkt.personal.mgmt.bo.TCHealthCodeCreateRecordExample;

/**
 * 一址一码信息业务处理
 * @author Hanson
 *
 */
public interface ITCOneAddrOneCodeService {

	
	/**
	 * 分页查询一址一码信息
	 * @param inMap
	 * @return
	 */
	List<Map<String,Object>> queryOneAddrOneCodeInfoByPageMap(Map<String,Object> inMap);
	
	
	/**
	 * 查询一址一码信息总数
	 * @param inMap
	 * @return
	 */
	int countOneAddrOneCodeInfoByPageMap(Map<String,Object> inMap);
	
	/**
	 * 分页查询公司扫码信息
	 * @param inMap
	 * @return
	 */
	List<Map<String,Object>> queryCompanyScanStatisticsPageMap(Map<String,Object> inMap);
	
	

	/**
	 * 分页查询子码扫码信息
	 * @param inMap
	 * @return
	 */
	List<Map<String,Object>> queryCompanySubScanStatisticsPageMap(Map<String,Object> inMap);
	
	/**
	 * 查询一址一码信息总数
	 * @param inMap
	 * @return
	 */
	int countCompanyScanStatisticsByPageMap(Map<String,Object> inMap);
	
	int countCompanySubScanStatisticsByPageMap(Map<String,Object> inMap);
	
	
	/**
	 * 根据id获取一址一码信息
	 * @param id
	 * @return
	 */
	Map<String,Object> getOneAddrOneCodeInfoById(Map<String, Object> inMap);
	
	
	/**
	 * 根据条件更新
	 * @param record
	 * @param example
	 * @return
	 */
    int updateByExampleSelective(TCHealthCodeCreateRecord record,TCHealthCodeCreateRecordExample example);

}
