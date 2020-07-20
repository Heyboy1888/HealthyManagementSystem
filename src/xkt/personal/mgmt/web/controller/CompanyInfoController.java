package xkt.personal.mgmt.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xkt.personal.mgmt.service.ITCHealthCompanySweepRecordService;
import xkt.personal.mgmt.web.vo.CompanySweepRecordVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

@Controller
@RequestMapping("/CompanyInfoController")
public class CompanyInfoController extends
		QueryController<CompanySweepRecordVo> {

	@ServiceAutowired
	private ITCHealthCompanySweepRecordService itcHealthCompanySweepRecordService;
	@RequestMapping("/queryCompany")
	@ItemResponseBody
	private QueryResultObject queryPerson(
			@QueryRequestParam("params") RequestCondition params) throws Exception {
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		CompanySweepRecordVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<>();
		inMap.put("certCode", vo.getCertCode());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		inMap.put("startTime", vo.getStartTime());
		inMap.put("endTime", vo.getEndTime());
		List<CompanySweepRecordVo> listVo=itcHealthCompanySweepRecordService.selectRecordByCertCode(inMap);
		int count=itcHealthCompanySweepRecordService.countRecordByCertCode(inMap);
		for (CompanySweepRecordVo companySweepRecordVo : listVo) {
			companySweepRecordVo.setPhone(vo.getPhone());
		}
		
		return RestUtils.wrappQueryResult(listVo,count);
	}
	
	

	@Override
	protected CompanySweepRecordVo initCondition() {
		return new CompanySweepRecordVo();
	}
}
