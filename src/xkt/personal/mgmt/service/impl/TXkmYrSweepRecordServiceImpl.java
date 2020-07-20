package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.dao.statistic.TXkmYrSweepRecordDao;
import xkt.personal.mgmt.service.ITXkmYrSweepRecordService;

import com.ls.pf.base.api.framework.Service;

@Service
public class TXkmYrSweepRecordServiceImpl implements ITXkmYrSweepRecordService{
	
	@Autowired
	private TXkmYrSweepRecordDao dao;

	@Override
	public List<Map<String, Object>> queryYrSweepRecord(Map<String, Object> arg0) {
		
		return dao.queryYrSweepRecord(arg0);
	}

	@Override
	public int countYrSweepRecord(Map<String, Object> arg0) {
		
		return dao.countYrSweepRecord(arg0);
	}
	
}
