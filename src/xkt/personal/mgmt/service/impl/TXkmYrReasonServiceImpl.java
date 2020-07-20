package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.dao.statistic.TXkmYrReasonDao;
import xkt.personal.mgmt.service.ITXkmYrReasonService;

import com.ls.pf.base.api.framework.Service;

@Service
public class TXkmYrReasonServiceImpl implements ITXkmYrReasonService{

	@Autowired
	private TXkmYrReasonDao dao;
	
	
	@Override
	public List<Map<String, Object>> queryYrReason(Map<String, Object> arg0) {
		
		
		return dao.queryYrReason(arg0);
	}
	
	
	
	@Override
	public int countYrReason(Map<String, Object> arg0) {
		
		return dao.countYrReason(arg0);
	}


	@Override
	public void countAll() {
		dao.callProcedure();
	}

	

}
