package xkt.personal.mgmt.service;

import java.util.List;
import java.util.Map;

import xkt.personal.mgmt.bo.TGRegionCatalog;
import xkt.personal.mgmt.web.vo.LoginAccountInfoVo;

import com.ls.pf.base.api.auth.bo.AccountBo;
//import com.ls.pf.sp.auth.intramodel.common.Results;

public interface ILoginAccountInfoService {
	/**
	 * 
	 * @Title: getAccountRegionCatalog
	 * @Description: 查询账号关联的区域信息
	 * @Author: donganmin                
	 * @Create Date: 2020年3月5日 下午7:22:59
	 * @History: 2020年3月5日 下午7:22:59 donganmin Created.
	 *
	 * @param abo
	 * @return
	 *
	 */
	TGRegionCatalog getAccountRegionCatalog(AccountBo abo);
	/**
	 * 
	 * @Title: saveOrUpdateAccountBo
	 * @Description: 新增或修改账号
	 * @Author: donganmin                
	 * @Create Date: 2020年3月5日 下午4:31:46
	 * @History: 2020年3月5日 下午4:31:46 donganmin Created.
	 *
	 * @param list
	 * @param request
	 * @return
	 *
	 */
//	Results saveOrUpdateAccountBo(List<Map> list, HttpServletRequest request) throws Exception;
	/**
	 * 
	 * @Title: selectByPage
	 * @Description: 分页查询账号信息
	 * @Author: donganmin                
	 * @Create Date: 2020年2月28日 下午3:46:28
	 * @History: 2020年2月28日 下午3:46:28 donganmin Created.
	 *
	 * @param inMap
	 * @return
	 *
	 */
	List<LoginAccountInfoVo> selectByPage(Map<String, String> inMap);
	/**
	 * 
	 * @Title: queryCount
	 * @Description: 查询账号总数
	 * @Author: donganmin                
	 * @Create Date: 2020年2月28日 下午3:47:16
	 * @History: 2020年2月28日 下午3:47:16 donganmin Created.
	 *
	 * @param inMap
	 * @return
	 *
	 */
	int queryCount(Map<String, String> inMap);

	/**
	 * 
	 * @Title: selectByPrimaryKey
	 * @Description: 根据主键查询账号信息
	 * @Author: donganmin                
	 * @Create Date: 2020年2月28日 下午4:08:25
	 * @History: 2020年2月28日 下午4:08:25 donganmin Created.
	 *
	 * @param id
	 * @return
	 *
	 */
	LoginAccountInfoVo selectByPrimaryKey(String id);
}
