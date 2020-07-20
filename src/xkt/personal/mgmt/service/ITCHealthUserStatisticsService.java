package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

public interface ITCHealthUserStatisticsService {
	public String getStatisticHtml(String statisticsDate) throws Exception;

	public byte[] exportExl(String statisticsDate) throws Exception;

	public void countAll();
	
	List<Map<String, Object>> queryYrTodayCount(Map<String, Object> map); 
}