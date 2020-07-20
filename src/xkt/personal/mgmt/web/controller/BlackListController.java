package xkt.personal.mgmt.web.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.bo.TCHealthThirdInput;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthThirdInputService;
import xkt.personal.mgmt.web.vo.ThirdInputVo;

import com.ls.pf.base.api.auth.IStaffService;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.security.Authentication;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

import eeos.sp.core.base.i18n.I18n;

@Controller
@RequestMapping("/blackListController")
public class BlackListController extends QueryController<ThirdInputVo> {

	public static final String PATH_INIT = "/personal/mgmt/blacklist/blacklistmain";

	// 注入标准代码service
	@ServiceAutowired
	private I18n codeService;

	@ServiceAutowired
	private Authentication authentication;

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	@ServiceAutowired
	private ITCHealthThirdInputService tcHealthThirdInputService;

	@ServiceAutowired
	private IStaffService staffService;

	/**
	 * 
	 * @Description: 界面初始化
	 * @Title: init
	 * @Author: zyf
	 * @Create Date: 2020年3月4日 下午5:52:19
	 * @History: 2020年3月4日 下午5:52:19 zyf Created.
	 *
	 * @return
	 *
	 */
	@RequestMapping("/init")
	public String init(Model m, HttpServletRequest request, HttpSession session) {
		// 判定用户级别
		ThirdInputVo eidtVo = new ThirdInputVo();
		/*AccountBo accountBo = this.authentication.getCurrentAccount(session);
		String staffId = accountBo.getStaffId();
		StaffBo staffBo = this.staffService.getStaffById(staffId);
		String orgNoString = staffBo.getOrgNo();
		TCHealthCommunityInfo healthCommunityInfo = getHealthCommunityInfoByCode(orgNoString);
		
		if (healthCommunityInfo.getGrade() != null) {
			String gradeString = healthCommunityInfo.getGrade();
			
			String pid = healthCommunityInfo.getpId();
			if (gradeString.equals("4")) {
				TCHealthCommunityInfo healthCommunityInfo3 = getHealthCommunityInfoByCode(pid);
				eidtVo.setDistrictCode(healthCommunityInfo3.getpId());
				eidtVo.setStreetCode(healthCommunityInfo3.getCommunityCode());
				eidtVo.setCommunityCode(healthCommunityInfo.getCommunityCode());
				m.addAttribute("grade", gradeString);
			} else if (gradeString.equals("3")) {
				eidtVo.setDistrictCode(healthCommunityInfo.getpId());
				eidtVo.setStreetCode(healthCommunityInfo.getCommunityCode());
			} else if (gradeString.equals("2")) {
				eidtVo.setDistrictCode(healthCommunityInfo.getCommunityCode());
			}
		}*/

		//List<Map<String, String>> certTypeMapList = new ArrayList<Map<String, String>>();
		/*
		 * Map<String, String> certTypeMap = new HashMap<String, String>();
		 * certTypeMap.put("name", "身份证"); certTypeMap.put("value", "01");
		 * certTypeMapList.add(certTypeMap);
		 */
		/*
		 * // 证件类型 request.setAttribute("certTypeList", certTypeMapList);
		 */

		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));

		request.setAttribute("checkerMgmtForm", eidtVo);
		return PATH_INIT;
	}

	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params) {
		ThirdInputVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		// String communityID = null;
		String districtCode = vo.getDistrictCode();
		String streetCode = vo.getStreetCode();
		String communityCode = vo.getCommunityCode();
		String communityCodeNew = vo.getCommunityCodeNew();
		String currentCommunity = null;
		if (districtCode != null) { // 判断区域街道社区社区编码是否为空,不为空则覆盖
			currentCommunity = getcommunityByCode(districtCode)
					.getCommunityName();
		}
		if (streetCode != null) {
			currentCommunity = getcommunityByCode(streetCode)
					.getCommunityName();
		}
		if (communityCode != null) {
			currentCommunity = getcommunityByCode(communityCode)
					.getCommunityName();
		}
		if (communityCodeNew != null) {
			currentCommunity = getcommunityByCode(communityCodeNew)
					.getCommunityName();
		}
		/*
		 * if (StringUtils.isNotEmpty(communityCode)) { communityID =
		 * getcommunityByCode(communityCode).getId(); } if
		 * (StringUtils.isNotEmpty(communityCodeNew)) { communityID =
		 * getcommunityByCode(communityCodeNew).getId(); }
		 */
		inMap.put("currentCommunity", currentCommunity);
		inMap.put("certCode", vo.getCertCode());
		inMap.put("mobile", vo.getMobile());
		inMap.put("realName", vo.getRealName());
		inMap.put("startTime", vo.getStartTime());
		inMap.put("endTime", vo.getEndTime());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		List<TCHealthThirdInput> inputList = this.tcHealthThirdInputService
				.selectByPage(inMap);
		int count = this.tcHealthThirdInputService.countByExampleAndPage(inMap);
		return RestUtils.wrappQueryResult(inputList, count);
	}

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

	private TCHealthCommunityInfo getcommunityByCode(String code) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		criteria.andCommunityCodeEqualTo(code);
		List<TCHealthCommunityInfo> healthCommunityInfoList = this.tcHealthCommunityInfoService
				.selectByExample(example);
		if (CollectionUtils.isEmpty(healthCommunityInfoList)) {
			return new TCHealthCommunityInfo();
		}
		TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
				.get(0);
		return healthCommunityInfo;
	}

	@SuppressWarnings("unused")
	private TCHealthCommunityInfo getHealthCommunityInfoByCommunityCode(
			String code, String grade) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		if (StringUtils.isNotEmpty(grade)) {
			criteria.andGradeEqualTo(grade);
		}
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		criteria.andCommunityCodeEqualTo(code);
		List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
				.selectByExample(example);
		if (CollectionUtils.isEmpty(healthCommunityInfoList)) {
			return null;
		}
		TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
				.get(0);
		return healthCommunityInfo;
	}

	@Override
	protected ThirdInputVo initCondition() {
		// TODO Auto-generated method stub
		return new ThirdInputVo();
	}

}
