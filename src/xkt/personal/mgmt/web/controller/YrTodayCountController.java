package xkt.personal.mgmt.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthUserStatisticsService;
import xkt.personal.mgmt.utils.DateUtil;
import xkt.personal.mgmt.web.vo.YrTodayCountVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

@Controller
@RequestMapping("/yrTodayCountController")
public class YrTodayCountController extends QueryController<YrTodayCountVo> {

	@ServiceAutowired
	private ITCHealthUserStatisticsService service;

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	public static final String PATH_INIT = "/personal/mgmt/yrTodayCount/yrTodayCountMain";

	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		YrTodayCountVo vo = new YrTodayCountVo();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);// 昨天
		Date yd = cal.getTime();
		vo.setDate(DateUtil.date2Str(yd));

		List<Map<String, String>> districtCodeList = getCodeList(null, "2");
		// 区域
		request.setAttribute("districtNameList", districtCodeList);
		request.setAttribute("yrTodayCountForm", vo);
		return PATH_INIT;
	}

	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws IllegalAccessException, InvocationTargetException {
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		YrTodayCountVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin())); // 开始页码
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd())); // 结束页码
		inMap.put("date", vo.getDate());
		List<Map<String, Object>> resList = service.queryYrTodayCount(inMap);
		List<YrTodayCountVo> listVo = new ArrayList<YrTodayCountVo>();
		if (resList != null && resList.size() > 1) {
			for (Map<String, Object> map : resList) {
				YrTodayCountVo resVo = new YrTodayCountVo();
				BeanUtils.populate(resVo, map);
				listVo.add(resVo);
			}
		}
		int count = listVo.size();
		return RestUtils.wrappQueryResult(listVo, count);
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

	@Override
	protected YrTodayCountVo initCondition() {

		return new YrTodayCountVo();
	}
}
