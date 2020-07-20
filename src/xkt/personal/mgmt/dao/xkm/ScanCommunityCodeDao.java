package xkt.personal.mgmt.dao.xkm;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.web.vo.ScanCommunityCodeVo;

/** 
 * 查询小区扫码情况Dao
 * @author  : wangweilong 
 * @version :2020年3月13日 下午9:04:39 
 * 
 */
public interface ScanCommunityCodeDao {

	
    List<ScanCommunityCodeVo> selectByPage(Map<String, String> map);
    
	int countByMap(Map<String, String> map);
	
	List<ScanCommunityCodeVo> selectByChecker(Map<String, Object> inMap);
	
	List<ScanCommunityCodeVo> selectByCertCode(Map<String,Object> inMap);
	
	int countByCertCode(Map<String,Object> inMap);
	
	List<ScanCommunityCodeVo> selectCommunityByChecker(Map<String,Object> inMap);
	
	int countCommunityByChecker(Map<String,Object> inMap);
	
	
}
