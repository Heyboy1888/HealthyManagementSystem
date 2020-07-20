package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

public interface ITXkmYrSweepRecordService {
	List<Map<String, Object>> queryYrSweepRecord(Map<String, Object> map);
	
	int countYrSweepRecord(Map<String, Object> map);
}
