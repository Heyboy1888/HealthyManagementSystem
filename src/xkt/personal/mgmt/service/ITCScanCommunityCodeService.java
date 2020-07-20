package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.web.vo.ScanCommunityCodeVo;

/** 
 * @author  : wangweilong 
 * @version :2020年3月13日 下午8:16:24 
 * 
 */
public interface ITCScanCommunityCodeService {

	List<ScanCommunityCodeVo> selectByPage(Map<String, String> map);
	
	int countByMap(Map<String, String> map);
	
	
	List<ScanCommunityCodeVo> selectBychecker(Map<String, Object> inMap);
	
	List<ScanCommunityCodeVo> selectCommunityByChecker(Map<String, Object> inMap);
	
	int countCommunityByChecker(Map<String, Object> map);
	
}
