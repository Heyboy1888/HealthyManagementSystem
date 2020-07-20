package xkt.personal.mgmt.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.service.ITCCommuityVerifierRelaService;
import xkt.personal.mgmt.service.ITCCommunityService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.utils.CodeConstant;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.web.vo.CommunityMgintVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.common.rest.utils.RestUtils;

/**
 * 小区管理
 * 
 * @author ls700724
 *
 */
@Controller
@RequestMapping("/communityMgmtController")
public class CommuityMgmtController extends QueryController<CommunityMgintVo> {

	private static final String INIT_PAGE = "/personal/mgmt/community/communityMain";

	private static final String EDIT_PAGE = "/personal/mgmt/community/communityEdit";

	// 注入标准代码service
	//@ServiceAutowired
	//private ITGRegionCatalogService tgRegionCatalogService;
	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;
	
	
	@ServiceAutowired
	private ITCCommunityService tcCommunityService;
	
	@ServiceAutowired
	ITCCommuityVerifierRelaService tcCommunityVerifierService;

	@Autowired
	private IdWorker idWorker;

	/**
	 * 小区管理界面初始化
	 * @param request
	 * @return
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {

		CommunityMgintVo vo = new CommunityMgintVo();

		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		
		// 小区分类
		request.setAttribute("commTypeList", CodeConstant.CMMTY_TYPE_MAP_LIST);

		// TODO 查询条件控制
		String countyCode = request.getParameter("countyCode");
		vo.setCountyCode(countyCode);
		
		// TODO 查询条件控制
		String streetCode = request.getParameter("streetCode");
		vo.setStreetCode(streetCode);
		
		// TODO 查询条件控制
		String cmmtyType = request.getParameter("cmmtyType");
		vo.setCmmtyType(cmmtyType);
		
//		// TODO 查询条件控制
		String villageCode = request.getParameter("villageCode");
		vo.setVillageCode(villageCode);
	
		
		// 是否支持多选
		String multiSelect = request.getParameter("multiSelect");
		request.setAttribute("multiSelect", multiSelect);
		// 维护按钮隐藏
		String viewModel = request.getParameter("viewModel");
		request.setAttribute("viewModel", viewModel);

		request.setAttribute("commuityMgmtForm", vo);
		return INIT_PAGE;
	}

	/**
	 * 跳转到编辑页面
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/edit")
	public String addOrEditPage(
			HttpServletRequest request,
			@RequestParam(value = "commuityId", required = false) String commuityId) {

		CommunityMgintVo editvo = new CommunityMgintVo();

		List<Map<String, String>> provinceCodeList = new ArrayList<Map<String, String>>();
		Map<String, String> provinceCodeMap = new HashMap<String, String>();
		provinceCodeMap.put("name", "江苏");
		provinceCodeMap.put("value", CodeConstant.PROVINCE_CODE);
		provinceCodeList.add(provinceCodeMap);
		// 省
		request.setAttribute("provinceCodeList", provinceCodeList);

		List<Map<String, String>> cityCodeList = new ArrayList<Map<String, String>>();
		Map<String, String> cityCodeMap = new HashMap<String, String>();
		cityCodeMap.put("name", "无锡");
		cityCodeMap.put("value", CodeConstant.CITY_CODE);
		cityCodeList.add(cityCodeMap);
		// 市
		request.setAttribute("cityCodeList", cityCodeList);

		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		
		// 小区分类
		request.setAttribute("commTypeList", CodeConstant.CMMTY_TYPE_MAP_LIST);

		if (StringUtils.isNotEmpty(commuityId)) {// 编辑
			TCCommuity community = this.tcCommunityService
					.selectByPrimaryKey(commuityId);

			editvo.setCommuityAddr(community.getCommuityAddr());
			editvo.setCmmtyType(community.getCmmtyType());
			// editvo.setcommuityNo(community.getCmmtyType());
			editvo.setCommuityNo(community.getCommuityNo());

			editvo.setCommuityName(community.getCommuityName());

			editvo.setProvinceCode(community.getProvinceCode());

			editvo.setCityCode(community.getCityCode());

			editvo.setDistrictCode(community.getCountyCode());

			editvo.setStreetCode(community.getStreetCode());
			editvo.setCommunityCode(community.getVillageCode());

			editvo.setRoadCode(community.getRoadCode());

			editvo.setVillageCode(community.getVillageCode());
			editvo.setCountyCode(community.getCountyCode());
			editvo.setCommuityId(community.getCommuityId());
		}
		request.setAttribute("communityMgmtVoEditForm", editvo);

		return EDIT_PAGE;
	}

	/**
	 * 查询小区
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

		// this.tcCommunityService.selectByPage(params)
		CommunityMgintVo vo = this.rCondition2QCondition(params);

		Map<String, String> inMap = new HashMap<String, String>();
		String countyCode = vo.getCountyCode();
		String streetCode = vo.getStreetCode();
		String communityCode = vo.getCommunityCode();

		String villageCode = vo.getVillageCode();
		String communityCodeNew = vo.getCommunityCodeNew();
		if (StringUtils.isNotEmpty(communityCodeNew)) {
			villageCode = communityCodeNew;
		}

		inMap.put("countyCode", countyCode);
		inMap.put("streetCode", streetCode);
		inMap.put("communityCode", communityCode);
		inMap.put("villageCode", villageCode);

		inMap.put("cmmtyType", vo.getCmmtyType());
		inMap.put("commuityName", vo.getCommuityName());
		inMap.put("commuityNo", vo.getCommuityNo());

		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		List<TCCommuity> retMapList = tcCommunityService.selectByPage(inMap);

		int count = this.tcCommunityService.countByExampleAndPage(inMap);
		return RestUtils.wrappQueryResult(retMapList, count);
	}

	/**
	 * 新增小区
	 * 
	 * @param vo
	 * @return
	 */
	@RequestMapping("/saveOrUpdate")
	@ItemResponseBody
	public WrappedResult saveOrUpdate(@RequestBody CommunityMgintVo vo) {
		String id = vo.getCommuityId();
		TCCommuity tcCommuity = new TCCommuity();
		// BeanUtils.copyProperties(tcCommuity, vo);
		System.out.println(id);
		tcCommuity.setCommuityId(vo.getCommunityCode());
		tcCommuity.setCmmtyType(vo.getCmmtyType());
		tcCommuity.setCommuityNo(vo.getCommuityNo());
		tcCommuity.setCommuityName(vo.getCommuityName());
		tcCommuity.setProvinceCode(vo.getProvinceCode());
		tcCommuity.setCityCode(vo.getCityCode());
		tcCommuity.setCountyCode(vo.getCountyCode());
		tcCommuity.setStreetCode(vo.getStreetCode());
		tcCommuity.setVillageCode(vo.getVillageCode());
		tcCommuity.setRoadCode(vo.getRoadCode());
		tcCommuity.setCommuityAddr(vo.getCommuityAddr());

		if ("-1".equals(id)) {// 新增
			long idwk = idWorker.nextId();
			String str = idwk + "";
			tcCommuity.setCommuityId(str);
			int index = this.tcCommunityService.insert(tcCommuity);
			return new WrappedResult(true, index, "新增小区成功!");
		} else {// 编辑
			tcCommuity.setCommuityId(id);
			int index2 = this.tcCommunityService.updateByPrimaryKey(tcCommuity);
			return new WrappedResult(true,index2, "小区信息更新成功!");

		}
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

	/**
	 * 
	 * @param feeType
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/changeCode", method = RequestMethod.POST)
	@ItemResponseBody
	public QueryResultObject changeCode(@RequestParam String pId,
			@RequestParam String level, HttpServletRequest request) {
		
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		example.setOrderByClause("community_code");
		TCHealthCommunityInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andPIdEqualTo(pId);
		criteria.andGradeEqualTo(level);
		List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
				.selectByExample(example);
		List<Map<String, String>> codeList = new LinkedList<Map<String, String>>();
		for (TCHealthCommunityInfo healthCommunityInfo : healthCommunityInfoList) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("text", healthCommunityInfo.getCommunityName());
			map.put("value", healthCommunityInfo.getCommunityCode());
			codeList.add(map);
		}
		return RestUtils.wrappQueryResult(codeList);
	}

	/**
	 * 删除小区
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/del/{id}")
	@ItemResponseBody
	public WrappedResult delete(@PathVariable("id") String id) throws Exception {
		int index = this.tcCommunityService.deleteByPrimaryKey(id);
		System.out.println("index=" + index + "id=" + id);
		return new WrappedResult(true, index, null);
	}

	@Override
	protected CommunityMgintVo initCondition() {
		return new CommunityMgintVo();
	}

	
	
	
}
