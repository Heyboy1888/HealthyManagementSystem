package xkt.personal.mgmt.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.service.ITTmpRiskDistrictService;
import xkt.personal.mgmt.web.vo.RiskDistrictVo;

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
 * @ClassName: RiskDistrictController
 * @Description: 中高风险区域信息
 * @author: sjr
 * @date: 2020年4月22日
 *
 */
@Controller
@RequestMapping("/RiskDistrictController")
public class RiskDistrictController extends QueryController<RiskDistrictVo> {

	public static final String PATH_INIT = "/personal/mgmt/riskAreaManagement/riskAreaManagementMain";
	public static final String PATH_EDIT_INIT = "/personal/mgmt/riskAreaManagement/riskAreaManagementEdit";

	@ServiceAutowired
	private I18n il8n;

	@ServiceAutowired
	ITTmpRiskDistrictService riskDistrictService;

	/**
	 * 
	 * @Title: init
	 * @Description:
	 * @Author: sjr
	 * @Create Date: 2020年4月15日 上午9:38:28
	 * @History: 2020年4月22日
	 *
	 * @param request
	 * @return
	 *
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		RiskDistrictVo vo = new RiskDistrictVo();
		List<CodeBO> RiskLevelList = il8n.getAllStandardCodes("XKM_RiskLevel",
				request);
		List<CodeBO> RiskVaildList = il8n.getAllStandardCodes("XKM_RiskVaild",
				request);
		request.setAttribute("XKM_RiskLevel", RiskLevelList);
		request.setAttribute("RiskVaildList", RiskVaildList);
		request.setAttribute("RiskAreaManagementMainForm", vo);
		return PATH_INIT;
	}

	/**
	 * 
	 * @Title: query
	 * @Description: 查询中高风险区域信息
	 * @Author: sjr
	 * @Create Date: 2020年4月15日 下午2:33:41
	 * @History: 2020年4月22日
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		String pageNum = params.getPageNum();
		if (pageNum.indexOf(".") != -1) {
			pageNum = pageNum.substring(0, pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		RiskDistrictVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();
		if(!StringUtils.isEmpty(vo.getDistrictType())){
			String type=vo.getDistrictType();
			if("11".equals(type)){
				inMap.put("districtCode", vo.getDistrictCode().substring(0,2));
			}else if("12".equals(type)){
				inMap.put("districtCode", vo.getDistrictCode().substring(0,4));
			}else if("13".equals(type)){
				inMap.put("districtCode", vo.getDistrictCode());
			}
		}
		inMap.put("isVaild", vo.getIsVaild()); // 风险标志
		inMap.put("riskLevel", vo.getRiskLevel()); // 风险状态
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin())); // 开始页码
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd())); // 结束页码
		List<Map<String, Object>> reslist = riskDistrictService.query(inMap);
		int count = riskDistrictService.countQuery(inMap);
		List<RiskDistrictVo> list = new ArrayList<RiskDistrictVo>();
		for (Map<String, Object> retMap : reslist) {
			RiskDistrictVo retVo = new RiskDistrictVo();
			BeanUtils.populate(retVo, retMap);
			list.add(retVo);
		}
		return RestUtils.wrappQueryResult(list, count);
	}

	/**
	 * 编辑界面跳转
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/edit")
	public String edit(
			HttpServletRequest request,
			@RequestParam(value = "districtCode", required = false) String districtCode)
			throws Exception {
		RiskDistrictVo vo = new RiskDistrictVo();
		List<CodeBO> RiskLevelList = il8n.getAllStandardCodes("XKM_RiskLevel",
				request);
		List<CodeBO> RiskVaildList = il8n.getAllStandardCodes("XKM_RiskVaild",
				request);
		request.setAttribute("XKM_RiskLevel", RiskLevelList);
		request.setAttribute("RiskVaildList", RiskVaildList);
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("districtCode", districtCode); // 区域名称
		if (!StringUtils.isEmpty(districtCode)) {
			Map<String, Object> map = riskDistrictService.detail(inMap);

			BeanUtils.populate(vo, map);
		}
		request.setAttribute("RiskAreaManagementEditForm", vo);
		return PATH_EDIT_INIT;
	}
	
	
	
	
	/**
	 * 编辑界面保存方法
	 * @param vo
	 * @return
	 */
	@RequestMapping("/saveOrUpdate")
	@ItemResponseBody
	public WrappedResult saveOrUpdate(@RequestBody RiskDistrictVo vo) {
			int i =0;
			String proName="修改";
			try {
				Map<String, Object> inMap = new HashMap<String, Object>();
				inMap.put("districtCode", vo.getDistrictCode()); // 区域名称
				inMap.put("riskLevel", vo.getRiskLevel()); // 区域名称
				inMap.put("isVaild", vo.getIsVaild()); // 区域名称

				i = this.riskDistrictService.update(inMap);
				if(i ==0){
					i = riskDistrictService.insert(inMap);
					proName="新增";
				}
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false,
						null, proName+"失败!");
			}
			
			return new WrappedResult(i==1?true:false,null, i==1?proName+"成功!":proName+"失败");
	}
	
	/**
	 * 编辑界面保存方法
	 * @param vo
	 * @return
	 */
	@RequestMapping("/del")
	@ItemResponseBody
	public WrappedResult del(
			@RequestParam(value = "districtCode", required = false) String districtCode) {
			int i =0;
			try {
				
				i = this.riskDistrictService.del(districtCode);
				
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false,
						null, "删除失败!");
			}
			
			return new WrappedResult(i==1?true:false,null, i==1?"删除成功!":"删除失败");
	}
	
	
	/**
	 * 编辑界面保存方法
	 * @param vo
	 * @return
	 */
	@RequestMapping("/fullName")
	@ItemResponseBody
	public WrappedResult fullName(
			@RequestParam(value = "districtCode", required = false) String districtCode) {
		Map<String, Object> inMap = new HashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtFullName", "");
		inMap.put("districtCode", districtCode); // 区域名称
		if (!StringUtils.isEmpty(districtCode)) {
			map = riskDistrictService.detail(inMap);

		}
			return new WrappedResult(true,null,map.get("districtFullName").toString());
	}
	
	
	

	@Override
	protected RiskDistrictVo initCondition() {

		return new RiskDistrictVo();
	}
}
