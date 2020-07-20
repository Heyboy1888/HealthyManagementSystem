package xkt.personal.mgmt.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.service.ITCOneAddrOneCodeSubService;
import xkt.personal.mgmt.web.vo.OneAddrOneCodeVo;

import com.ls.pf.base.api.code.CodeBO;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

import eeos.sp.core.base.i18n.I18n;

/**
 * @ClassName: OneAddrOneCodeSubController   
 * @Description: 一址一码子码管理  (子码)
 * @author: yangyin
 * @date: 2020年3月31日 上午10:08:02   
 *
 */
@Controller
@RequestMapping("/OneAddrOneCodeSubController")
public class OneAddrOneCodeSubController extends QueryController<OneAddrOneCodeVo>{
	
	private static final String INIT_PAGE = "/personal/mgmt/onecode/oneCodeSubMain";
	
	private static final String EDIT_PAGE = "/personal/mgmt/onecode/oneCodeSubEdit";
	
	@ServiceAutowired
	private ITCOneAddrOneCodeSubService oneAddrOneCodeSubService;
	
	@ServiceAutowired
	private I18n il8n;
	
	/**
	 * 界面初始化方法
	 * @param request
	 * @return
	 */
	@RequestMapping("/initSub")
	public String init(HttpServletRequest request,
			@RequestParam("companyId") String companyId) {
		OneAddrOneCodeVo vo = new OneAddrOneCodeVo();
		vo.setCompanyId(companyId);
		request.setAttribute("OneCodeSubForm", vo);
		return INIT_PAGE;
	}
	
	/**
	 * 查询方法
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public QueryResultObject query(@QueryRequestParam("params") RequestCondition params) throws Exception{
		OneAddrOneCodeVo vo = this.rCondition2QCondition(params);
		String 	companyId = vo.getCompanyId();
		List<Map<String,Object>> list = oneAddrOneCodeSubService.getSubInfoByCompanyId(companyId);
		List<OneAddrOneCodeVo> retVoList = new ArrayList<OneAddrOneCodeVo>();
		for(Map<String,Object> map:list){
			OneAddrOneCodeVo retVo = new OneAddrOneCodeVo();
			BeanUtils.populate(retVo, map);
			retVoList.add(retVo);
		}
		return RestUtils.wrappQueryResult(retVoList, retVoList.size());
	}
	
	
	/**
	 * 编辑界面跳转
	 * @param request
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/edit")
	public String Edit(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id) throws Exception {	
		OneAddrOneCodeVo retVo = new OneAddrOneCodeVo();
		if(StringUtils.isNotEmpty(id)){
			Map<String,Object> map = oneAddrOneCodeSubService.getSubInfoById(id);
			if(!CollectionUtils.isEmpty(map)){
				BeanUtils.populate(retVo, map);
			}
		}
		// 单位码状态
		List<CodeBO> statusBoList =il8n.getAllStandardCodes("XKM_ApplyStatus", request);
		List<CodeBO> typeBoList =il8n.getAllStandardCodes("XKM_CreateType", request);
		// 行业分类
		List<CodeBO> industryCatBoList =il8n.getAllStandardCodes("XKM_IndustryCat", request);
		request.setAttribute("industryCatList", industryCatBoList);
		request.setAttribute("statusList", statusBoList);
		request.setAttribute("typeBoList", typeBoList);
		request.setAttribute("oneAddrOneCodeSubEditForm", retVo);
		return EDIT_PAGE;
	}


	@Override
	protected OneAddrOneCodeVo initCondition() {
		return new OneAddrOneCodeVo();
	}
}
