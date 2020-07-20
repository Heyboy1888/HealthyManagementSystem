package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TCPcLogInfo;

public interface ITCPcLogService {
	 List<Map<String,Object>> selectByPage(Map<String,Object> inMap);
	 
	 int selectCountByPage(Map<String,Object> inMap);
	 
	 int insertSelective(TCPcLogInfo record);
}
