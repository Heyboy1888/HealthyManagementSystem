package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TCHealthThirdInput;

public interface ITCHealthThirdInputService {
	List<TCHealthThirdInput> selectByPage(Map<String, String> var1);
	
	int countByExampleAndPage(Map<String, String> inMap);
}
