package xkt.personal.mgmt.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.ls.pf.base.common.rest.object.WrappedResult;

import xkt.personal.mgmt.bo.TCHealthCodeAdmin;
import xkt.personal.mgmt.bo.TCHealthCodeAdminCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeAdminExt;

/**
 * @Description: 审核员管理业务接口
 * @ClassName: ITCHealthCodeAdminService
 * @author: Hanson
 * @date: 2020年2月26日 上午12:26:41
 *
 */
public interface ITCHealthCodeAdminService {

	/**
	 * 
	 * @Description: 根据条件统计总数
	 * @Title: countByCriteria
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:27:10
	 * @History: 2020年2月26日 上午12:27:10 Hanson Created.
	 *
	 * @param example
	 * @return
	 *
	 */
	int countByCriteria(TCHealthCodeAdminCriteria example);

	/**
	 * 
	 * @Description: 根据条件删除
	 * @Title: deleteByCriteria
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:27:25
	 * @History: 2020年2月26日 上午12:27:25 Hanson Created.
	 *
	 * @param example
	 * @return
	 *
	 */
	int deleteByCriteria(TCHealthCodeAdminCriteria example);

	/**
	 * 
	 * @Description: 根据主键删除
	 * @Title: deleteByPrimaryKey
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:27:40
	 * @History: 2020年2月26日 上午12:27:40 Hanson Created.
	 *
	 * @param id
	 * @return
	 *
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * 
	 * @Description: 插入
	 * @Title: deleteByPrimaryKey
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:27:40
	 * @History: 2020年2月26日 上午12:27:40 Hanson Created.
	 *
	 * @param id
	 * @return
	 *
	 */
	int insert(TCHealthCodeAdmin record);

	/**
	 * 
	 * @Description: 插入
	 * @Title: insertSelective
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:28:14
	 * @History: 2020年2月26日 上午12:28:14 Hanson Created.
	 *
	 * @param record
	 * @return
	 *
	 */
	int insertSelective(TCHealthCodeAdmin record);

	/**
	 * @Description: 分页查询
	 * @Title: selectByExampleAndPage
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:28:23
	 * @History: 2020年2月26日 上午12:28:23 Hanson Created.
	 *
	 * @param inMap
	 * @return
	 *
	 */
	List<TCHealthCodeAdmin> selectByExampleAndPage(Map<String, String> inMap);

	/**
	 * 
	 * @Description: 查询总数
	 * @Title: countByExampleAndPage
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午2:42:38
	 * @History: 2020年2月26日 上午2:42:38 Hanson Created.
	 *
	 * @param inMap
	 * @return
	 *
	 */
	int countByExampleAndPage(Map<String, String> inMap);

	/**
	 * 
	 * @Description: 根据主键查询
	 * @Title: selectByPrimaryKey
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:28:37
	 * @History: 2020年2月26日 上午12:28:37 Hanson Created.
	 *
	 * @param id
	 * @return
	 *
	 */
	TCHealthCodeAdmin selectByPrimaryKey(String id);

	/**
	 * 
	 * @Description: 根据主键、字段值进行更新
	 * @Title: updateByPrimaryKeySelective
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:28:48
	 * @History: 2020年2月26日 上午12:28:48 Hanson Created.
	 *
	 * @param record
	 * @return
	 *
	 */
	int updateByPrimaryKeySelective(TCHealthCodeAdmin record);

	/**
	 * 
	 * @Description: 根据主键进行更新
	 * @Title: updateByPrimaryKey
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午12:29:22
	 * @History: 2020年2月26日 上午12:29:22 Hanson Created.
	 *
	 * @param record
	 * @return
	 *
	 */
	int updateByPrimaryKey(TCHealthCodeAdmin record);

	/**
	 * 
	 * @Description: 导入文件并上传EXCEL
	 * @Title: importExcel
	 * @Author: Hanson                
	 * @Create Date: 2020年2月26日 下午3:01:07
	 * @History: 2020年2月26日 下午3:01:07 Hanson Created.
	 *
	 * @param in
	 * @return
	 *
	 */
	WrappedResult importExcel(InputStream in,long size,String fileName,String originalFileType);
	
	/**
	 * 
	 * @param inMap
	 * @return
	 */
	List<TCHealthCodeAdminExt> selectByPage(Map<String, String> inMap);
}
