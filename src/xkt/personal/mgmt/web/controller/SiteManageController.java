package xkt.personal.mgmt.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.service.ISiteInfoService;
import xkt.personal.mgmt.web.vo.SiteInfoVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.common.rest.utils.RestUtils;

@Controller
@RequestMapping("/siteManageController")
public class SiteManageController extends QueryController<SiteInfoVo> {
	private static final String INIT_PAGE = "/personal/mgmt/siteManage/siteManageMain";

	@ServiceAutowired
	ISiteInfoService siteMangeService;

	@RequestMapping("/init")
	public String init(HttpServletRequest request,
			@RequestParam(required=false,value="isShow" ,defaultValue="1") String isShow ) {
		SiteInfoVo vo = new SiteInfoVo();
		if(StringUtils.isEmpty(isShow)){
			request.setAttribute("isShow", true);
		}else{
			request.setAttribute("isShow", false);
		}
		request.setAttribute("SiteManageMainForm", vo);
		
		return INIT_PAGE;
	}

	/**
	 * 
	 * @Title: query
	 * @Description:  TODO 查询站点信息
	 * @Author: sjr          
	 * @Create Date: 2020年5月13日 上午9:55:49
	 * @History: 2020年5月13日 上午9:55:49 shenj Created.
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {

		String pageNum = params.getPageNum();
		if (pageNum.indexOf(".") != -1) {
			pageNum = pageNum.substring(0, pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);

		SiteInfoVo vo = this.rCondition2QCondition(params);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageBegin", String.valueOf(vo.getPageBegin())); // 开始页码
		map.put("pageEnd", String.valueOf(vo.getPageEnd())); // 结束页码
		map.put("siteName", String.valueOf(vo.getSiteName())); // 结束页码
		map.put("siteCode", String.valueOf(vo.getSiteCode())); // 结束页码

		List<Map<String, Object>> list = siteMangeService.select(map);
		int count = siteMangeService.selectCount(map);
		List<SiteInfoVo> retVoList = new ArrayList<SiteInfoVo>();
		for (Map<String, Object> resmap : list) {
			SiteInfoVo retVo = new SiteInfoVo();
			BeanUtils.populate(retVo, resmap);
			retVoList.add(retVo);
		}
		return RestUtils.wrappQueryResult(retVoList, count);
	}

	@RequestMapping("/del/{id}")
	@ItemResponseBody
	public WrappedResult delete(@PathVariable("id") String id) throws Exception {
		WrappedResult wrappedResult = new WrappedResult();
		int flag = 0;
		try {
			flag = siteMangeService.delete(id);
		} catch (Exception e) {
			flag = -2;
		}
		if (flag == 1) {
			wrappedResult.setSuccessful(true);
			wrappedResult.setResultHint("站点删除成功");
		} else {
			wrappedResult.setSuccessful(false);
			wrappedResult.setResultHint("站点信息删除失败");

		}
		return wrappedResult;
	}
	
	
	public WrappedResult insertInfo(){
		
		
		return new WrappedResult();
	}
	
	

	@Override
	protected SiteInfoVo initCondition() {
		// TODO Auto-generated method stub
		return new SiteInfoVo();
	}

}
