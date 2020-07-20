package xkt.personal.mgmt.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.bo.TCHealthCodeCreateRecord;
import xkt.personal.mgmt.bo.TCHealthCodeCreateRecordExample;
import xkt.personal.mgmt.service.ITCOneAddrOneCodeService;
import xkt.personal.mgmt.web.vo.OneAddrOneCodeVo;

import com.ls.pf.base.api.code.CodeBO;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.common.rest.utils.RestUtils;

import eeos.sp.core.base.i18n.I18n;


/**
 * 
 * @Description: 一址一码管理
 * @ClassName: VerifierMgmtController
 * @author: 杨银
 * @date: 2020年3月13日  11:20:31
 * 
 */
@Controller
@RequestMapping("/OneCodeController")
public class OneAddrOneCodeController extends QueryController<OneAddrOneCodeVo>{
	
	private static final String INIT_PAGE = "/personal/mgmt/onecode/oneCodeMain";
	
	private static final String EDIT_PAGE = "/personal/mgmt/onecode/oneCodeEdit";
	
	@ServiceAutowired
	private ITCOneAddrOneCodeService oneAddrOneCodeService;
	
	
	
	@ServiceAutowired
	private I18n il8n;
	
	/**
	 * 界面初始化方法
	 * @param request
	 * @return
	 */
	@RequestMapping("/init")
	public String initCondition(HttpServletRequest request) {
		OneAddrOneCodeVo vo = new OneAddrOneCodeVo();
		// 单位码状态
		List<CodeBO> statusBoList =il8n.getAllStandardCodes("XKM_ApplyStatus", request);
		request.setAttribute("statusList", statusBoList);
		// 行业分类
		List<CodeBO> industryCatBoList =il8n.getAllStandardCodes("XKM_IndustryCat", request);
		request.setAttribute("industryCatList", industryCatBoList);
		
		request.setAttribute("oneAddrOneCodeMainForm", vo);
		return INIT_PAGE;
	}
	
	
	/**
	 * 查询方法
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params) throws Exception{
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		OneAddrOneCodeVo vo = this.rCondition2QCondition(params);
		
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("status", vo.getCompanyStatus());
		inMap.put("industryCat", vo.getIndustryCat());
		inMap.put("externalName", vo.getExternalName());
		inMap.put("companyName", vo.getCompanyName());
		inMap.put("startTime", vo.getCreateTime());
		inMap.put("endTime", vo.getUpdateTime());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		
		List<Map<String,Object>> retMapList = oneAddrOneCodeService.queryOneAddrOneCodeInfoByPageMap(inMap);
		int count = oneAddrOneCodeService.countOneAddrOneCodeInfoByPageMap(inMap);
		List<OneAddrOneCodeVo> retVoList = new ArrayList<OneAddrOneCodeVo>();
		for(Map<String,Object> retMap : retMapList){
			OneAddrOneCodeVo retVo =  new OneAddrOneCodeVo();
			BeanUtils.populate(retVo, retMap);
			retVoList.add(retVo);
		}
		return RestUtils.wrappQueryResult(retVoList, count);
	}
	
	
	/**
	 * 编辑界面跳转
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/edit")
	public String edit(HttpServletRequest request,
			@RequestParam(value = "id") String id,
			@RequestParam(value = "companyId") String companyId) throws Exception {	
		OneAddrOneCodeVo oneAddrOneCodeVo=new OneAddrOneCodeVo();
		
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("id", id);
		inMap.put("companyId", companyId);
		
		Map<String, Object> retMap  = this.oneAddrOneCodeService.getOneAddrOneCodeInfoById(inMap);
		BeanUtils.populate(oneAddrOneCodeVo, retMap);
		// 单位码状态
		List<CodeBO> statusBoList =il8n.getAllStandardCodes("XKM_ApplyStatus", request);
		request.setAttribute("statusList", statusBoList);
		request.setAttribute("oneAddrOneCodeEditForm", oneAddrOneCodeVo);
		return EDIT_PAGE;
	
	}
	
	
	/**
	 * 编辑界面保存方法
	 * @param vo
	 * @return
	 */
	@RequestMapping("/saveOrUpdate")
	@ItemResponseBody
	public WrappedResult saveOrUpdate(@RequestBody OneAddrOneCodeVo vo) {
			String status = vo.getCompanyStatus();
			Long recordId = vo.getRecordId();
			
			TCHealthCodeCreateRecord record = new TCHealthCodeCreateRecord();
			record.setStatus(status);
			TCHealthCodeCreateRecordExample example = new TCHealthCodeCreateRecordExample();
			TCHealthCodeCreateRecordExample.Criteria criteria = example.createCriteria();
			criteria.andIdEqualTo(recordId);
			try {
				int i = this.oneAddrOneCodeService.updateByExampleSelective(record, example);
				if(i ==0){
					return new WrappedResult(false,
							null, "状态修改失败!");
				}else{
					return new WrappedResult(true,
							null, "状态修改成功!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false,
						null, "状态修改失败!");
			}
	}

	@Override
	protected OneAddrOneCodeVo initCondition() {
		return new OneAddrOneCodeVo();
	}

}
