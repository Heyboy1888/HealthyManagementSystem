package xkt.personal.mgmt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import xkt.personal.mgmt.bo.TCPcLogInfo;
import xkt.personal.mgmt.dao.xkm.TCPcLogInfoDao;
import xkt.personal.mgmt.service.ITCPcLogService;

import com.ls.pf.base.api.framework.Service;

@Service
public class TCPcLogService implements ITCPcLogService{
	@Autowired
	private TCPcLogInfoDao tCLogDao;

	@Override
	public List<Map<String, Object>> selectByPage(Map<String, Object> inMap) {
		
		return tCLogDao.selectByPage(inMap);
	}

	@Override
	public int selectCountByPage(Map<String, Object> inMap) {
		
		return tCLogDao.selectCountByPage(inMap);
	}

	@Override
	public int insertSelective(TCPcLogInfo record) {
		
		return tCLogDao.insertSelectiveLog(record);
	}

}
