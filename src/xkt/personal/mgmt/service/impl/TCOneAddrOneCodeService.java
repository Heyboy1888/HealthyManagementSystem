package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TCHealthCodeCreateRecord;
import xkt.personal.mgmt.bo.TCHealthCodeCreateRecordExample;
import xkt.personal.mgmt.dao.xkm.TCHealthCodeCreateRecordDao;
import xkt.personal.mgmt.dao.xkm.TCHealthCompanyApplyDao;
import xkt.personal.mgmt.service.ITCOneAddrOneCodeService;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceType;


/**
 * 
 * @author Hanson
 *
 */
@Service(target = { ServiceType.APPLICATION }, value = "oneAddrOneCodeService")
public class TCOneAddrOneCodeService implements ITCOneAddrOneCodeService {
	
	@Autowired
	private TCHealthCompanyApplyDao healthCompanyApplyDao;
	
	@Autowired
	private TCHealthCodeCreateRecordDao healthCodeCreateRecordDao;
	
	/**
	 * 
	 */
	@Override
	public List<Map<String, Object>> queryOneAddrOneCodeInfoByPageMap(
			Map<String, Object> inMap) {
		return healthCompanyApplyDao.queryOneAddrOneCodeInfoByPageMap(inMap);
	}

	/**
	 * 
	 */
	@Override
	public int countOneAddrOneCodeInfoByPageMap(Map<String, Object> inMap) {
		return healthCompanyApplyDao.countOneAddrOneCodeInfoByPageMap(inMap);
	}
	
	/**
	 * 
	 */
	@Override
	public List<Map<String, Object>> queryCompanyScanStatisticsPageMap(
			Map<String, Object> inMap) {
		return healthCompanyApplyDao.queryCompanyScanStatisticsPageMap(inMap);
	}

	/**
	 * 
	 */
	@Override
	public int countCompanyScanStatisticsByPageMap(Map<String, Object> inMap) {
		return healthCompanyApplyDao.countqueryCompanyScanStatisticsByPageMap(inMap);
	}

	
	@Override
	public Map<String, Object> getOneAddrOneCodeInfoById(Map<String, Object> inMap) {
		return healthCompanyApplyDao.getOneAddrOneCodeInfoById(inMap);
	}

	@Override
	public int updateByExampleSelective(TCHealthCodeCreateRecord record,
			TCHealthCodeCreateRecordExample example) {
		return this.healthCodeCreateRecordDao.updateByExampleSelective(record, example);
	}

	@Override
	public List<Map<String, Object>> queryCompanySubScanStatisticsPageMap(
			Map<String, Object> inMap) {
		// TODO Auto-generated method stub
		return healthCompanyApplyDao.queryCompanySubScanStatisticsPageMap(inMap);
	}

	@Override
	public int countCompanySubScanStatisticsByPageMap(Map<String, Object> inMap) {
		// TODO Auto-generated method stub
		return healthCompanyApplyDao.countCompanySubScanStatisticsPageMap(inMap);
	}

}
