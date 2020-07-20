package xkt.personal.mgmt.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xkt.personal.mgmt.service.ITXkmYrSweepRecordService;
import xkt.personal.mgmt.web.vo.YrSweepRecordVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

@Controller
@RequestMapping("/yrSweepRecordController")
public class YrSweepRecordController extends QueryController<YrSweepRecordVo> {

	public static final String PATH_INIT = "/personal/mgmt/yrSweepRecord/yrSweepRecordInit";
	
	@ServiceAutowired
	private ITXkmYrSweepRecordService yrSweepRecordService;

	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		YrSweepRecordVo vo = new YrSweepRecordVo();
		request.setAttribute("yrSweepRecordInformationForm", vo);
		return PATH_INIT;
	}

	@RequestMapping("/query/{dataType}")
	@ItemResponseBody
	public QueryResultObject query(@PathVariable("dataType") String dataType,
			@QueryRequestParam("params") RequestCondition params) throws IllegalAccessException, InvocationTargetException {
		String pageNum = params.getPageNum();
		if (pageNum.indexOf(".") != -1) {
			pageNum = pageNum.substring(0, pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		YrSweepRecordVo vo=this.rCondition2QCondition(params);
		Map<String, Object> inMap=new HashMap<String, Object>();
		inMap.put("startTime", vo.getStartTime());
		inMap.put("endTime", vo.getEndTime());
		inMap.put("userName", vo.getUserName());
		inMap.put("phone", vo.getPhone());
		inMap.put("certCode",vo.getCertCode());
		inMap.put("checkPerson", vo.getCheckPerson());
		inMap.put("dataType", dataType);
		inMap.put("pageBegin", vo.getPageBegin());
		inMap.put("pageEnd", vo.getPageEnd());
		List<YrSweepRecordVo> listVo = new ArrayList<YrSweepRecordVo>();
		List<Map<String, Object>> resList=yrSweepRecordService.queryYrSweepRecord(inMap);
		for (Map<String, Object> map : resList) {
			YrSweepRecordVo resVo=new YrSweepRecordVo();
			BeanUtils.populate(resVo, map);
			listVo.add(resVo);
		}
		int count = yrSweepRecordService.countYrSweepRecord(inMap);
		return RestUtils.wrappQueryResult(listVo, count);
	}
	
	@Override
	protected YrSweepRecordVo initCondition() {

		return new YrSweepRecordVo();
	}

}
