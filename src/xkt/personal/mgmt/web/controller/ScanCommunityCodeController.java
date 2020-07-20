package xkt.personal.mgmt.web.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthCompanySweepRecordService;
import xkt.personal.mgmt.service.ITCScanCommunityCodeService;
import xkt.personal.mgmt.web.vo.ScanCommunityCodeVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

/**
 * 查询小区扫码情况
 * 
 * @author : wangweilong
 * @version :2020年3月13日 下午5:27:49
 * 
 */
@Controller
@RequestMapping("/scanCommunityCodeController")
public class ScanCommunityCodeController extends
		QueryController<ScanCommunityCodeVo> {

	private static final String INIT_PAGE = "/personal/mgmt/scancode/scancodeMain";

	private static final String SHOW_NUM_PAGE = "/personal/mgmt/scancode/showNum";

	private static final String SHOW_CHECKER_SCAN_DETAILS = "/personal/mgmt/commonFace/checkerScanDetails";

	@ServiceAutowired
	private ITCScanCommunityCodeService iTCScanCommunityCodeService;

	@ServiceAutowired
	private ITCHealthCompanySweepRecordService itcHealthCompanySweepRecord;

	// 注入标准代码service
	// @ServiceAutowired
	// private ITGRegionCatalogService tgRegionCatalogService;
	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	/**
	 * 小区管理界面初始化
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {

		ScanCommunityCodeVo vo = new ScanCommunityCodeVo();

		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		//request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		//request.setAttribute("communityCodeList", getCodeList(null, "4"));

		// 小区分类
		//request.setAttribute("commTypeList", CodeConstant.CMMTY_TYPE_MAP_LIST);

		request.setAttribute("scanCommunityCodeForm", vo);
		return INIT_PAGE;
	}

	/**
	 * 查询小区扫码情况
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		ScanCommunityCodeVo vo = this.rCondition2QCondition(params);

		Map<String, String> map = new HashMap<String, String>();
		map.put("countyCode", vo.getCountyCode());
		map.put("streetCode", vo.getStreetCode());
		map.put("villageCode", vo.getVillageCode());
		map.put("createTimeFrom", vo.getCreateTimeFrom());
		map.put("createTimeTo", vo.getCreateTimeTo());
		map.put("cmmtyType", vo.getCmmtyType());
		map.put("commuityNo", vo.getCommuityNo());
		map.put("commuityName", vo.getCommuityName());
		map.put("realName", vo.getRealName());
		map.put("mobile", vo.getMobile());

		// 分页
		map.put("pageBegin", String.valueOf(vo.getPageBegin()));
		map.put("pageEnd", String.valueOf(vo.getPageEnd()));

		System.out.println("区域编码为："+vo.getCountyCode());
		List<ScanCommunityCodeVo> retMapList = this.iTCScanCommunityCodeService
				.selectByPage(map);
		
		for(ScanCommunityCodeVo scanVo: retMapList){
			scanVo.setDetails("详细信息");
		}
		
		int count = this.iTCScanCommunityCodeService.countByMap(map);
		System.out.println("集合长度为"+ retMapList.size());
		System.out.println("查询总数为" + count);
		return RestUtils.wrappQueryResult(retMapList, count);
	}

	/**
	 * 跳转到编辑页面
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/initShowNums")
	public String initShowNums(
			HttpServletRequest request,
			@RequestParam(value = "mobile", required = false) String mobile,
			@RequestParam(value = "totalNum", required = false) String totalNum,
			@RequestParam(value = "isHealth", required = false) String isHealth) {
		ScanCommunityCodeVo vo = new ScanCommunityCodeVo();
		vo.setMobile(mobile);
		vo.setTotalNum(totalNum);
		vo.setIsHealth(isHealth);
		request.setAttribute("showNumForm", vo);
		return SHOW_NUM_PAGE;
	}

	/**
	 * 跳转查询验证员扫码详细信息
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/initShowCheckerDetails")
	public String initShowCheckerDetails(HttpServletRequest request,
			@RequestParam(value = "mobile", required = false) String mobile) {
		ScanCommunityCodeVo vo = new ScanCommunityCodeVo();
		vo.setMobile(mobile);

		request.setAttribute("checkerScanDetailsForm", vo);
		

		return SHOW_CHECKER_SCAN_DETAILS;
	}

	/**
	 * 子界面查询方法
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/showCheckerScanDetails")
	@ItemResponseBody
	public QueryResultObject showCheckerScanDetails(HttpServletRequest request,
			@QueryRequestParam("params") RequestCondition params) {
		ScanCommunityCodeVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();
		//System.out.println("验证员手机号:" + vo.getMobile());
		// 分页
		inMap.put("pageBegin", vo.getPageBegin());
		inMap.put("pageEnd", vo.getPageEnd());
		inMap.put("mobile", vo.getMobile());

		List<ScanCommunityCodeVo> list = this.iTCScanCommunityCodeService
				.selectCommunityByChecker(inMap);
		
		int count = this.iTCScanCommunityCodeService.countCommunityByChecker(inMap);
		// int count = Integer.parseInt(vo.getTotalNum());
		
		return RestUtils.wrappQueryResult(list,count);
	}

	/**
	 * 子界面查询方法
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/show")
	@ItemResponseBody
	public QueryResultObject showNums(
			@QueryRequestParam("params") RequestCondition params) {
		ScanCommunityCodeVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();
		// 分页
		inMap.put("pageBegin", vo.getPageBegin());
		inMap.put("pageEnd", vo.getPageEnd());
		inMap.put("mobile", vo.getMobile());
		String isHealth = vo.getIsHealth();
		if ("2".equals(isHealth)) {// 代表查询全部
			isHealth = null;
		}
		inMap.put("isHealth", isHealth);
		List<ScanCommunityCodeVo> retVos = this.iTCScanCommunityCodeService
				.selectBychecker(inMap);
		
		for(ScanCommunityCodeVo scanVo: retVos){
			scanVo.setDetails("详细信息");
		}
		int count = Integer.parseInt(vo.getTotalNum());
		return RestUtils.wrappQueryResult(retVos, count);
	}

	/**
	 * 
	 * @Description: 获取区域码列表
	 * @Title: getCodeList
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 上午2:48:11
	 * @History: 2020年2月26日 上午2:48:11 Hanson Created.
	 *
	 * @param level
	 * @return
	 *
	 */
	private List<Map<String, String>> getCodeList(String pId, String level) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		example.setOrderByClause("community_code");
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		criteria.andGradeEqualTo(level);
		if (StringUtils.isNotEmpty(pId)) {
			criteria.andPIdEqualTo(pId);
		}
		List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
				.selectByExample(example);
		List<Map<String, String>> districtCodeList = new LinkedList<Map<String, String>>();
		for (TCHealthCommunityInfo healthCommunityInfo : healthCommunityInfoList) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", healthCommunityInfo.getCommunityName());
			map.put("value", healthCommunityInfo.getCommunityCode());
			districtCodeList.add(map);
		}
		return districtCodeList;
	}

	

	@Override
	protected ScanCommunityCodeVo initCondition() {
		// TODO Auto-generated method stub
		return new ScanCommunityCodeVo();
	}

}
