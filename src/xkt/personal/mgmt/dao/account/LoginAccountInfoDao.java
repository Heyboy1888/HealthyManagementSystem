package xkt.personal.mgmt.dao.account;

import java.util.List;
import java.util.Map;


import xkt.personal.mgmt.web.vo.LoginAccountInfoVo;

public interface LoginAccountInfoDao {
	List<LoginAccountInfoVo> selectByPage(Map<String, String> inMap);
	int queryCount(Map<String, String> inMap);
//	int deleteByPrimaryKey(String accountId);
	LoginAccountInfoVo selectByPrimaryKey(String accountId);
//	int updateByPrimaryKey(String accountId,LoginAccountInfoVo vo);
//	int insertAccount(LoginAccountInfoVo vo);
//	int insertStaff(LoginAccountInfoVo vo);
}
