package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

public interface ITXkmYrReasonService {
	
    List<Map<String, Object>> queryYrReason(Map<String, Object> map);
    
    int countYrReason(Map<String, Object> map);
    
    void countAll();

    
}
