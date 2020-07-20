package xkt.personal.mgmt.web.controller;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.service.ITCHealthCompanySweepRecordService;
import xkt.personal.mgmt.service.ITCOneAddrOneCodeService;
import xkt.personal.mgmt.web.vo.CompanySweepRecordVo;
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
 * @Description: 企业单位扫码情况统计（一址一码）
 * @author: sjr
 * @date: 2020年4月14日 
 *
 */
@Controller
@RequestMapping("/companyScanStatisticsController")
public class CompanyScanStatisticsController extends QueryController<OneAddrOneCodeVo>{
	
	private static final String INIT_PAGE = "/personal/mgmt/companyScanStatistics/companyScanStatisticsMain";
	
	private static final String Sub_INIT_PAGE = "/personal/mgmt/companyScanStatistics/companySubScanStatisticsMain";
	
	private static final String Personal_INIT_PAGE = "/personal/mgmt/companyScanStatistics/personalScanInfo";
	
	@ServiceAutowired
	private ITCOneAddrOneCodeService oneAddrOneCodeService;
	
	@ServiceAutowired
	private ITCHealthCompanySweepRecordService healthCompanySweepRecord;
	
	
	
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
		DateTime now = new DateTime();
		vo.setCreateTime(now.minusDays(1).toString("yyyy-MM-dd HH:mm:ss"));
		vo.setUpdateTime(now.toString("yyyy-MM-dd HH:mm:ss"));
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
		inMap.put("companyName", vo.getCompanyName());
		inMap.put("startTime", vo.getCreateTime());
		inMap.put("endTime", vo.getUpdateTime());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		
		List<Map<String,Object>> retMapList = oneAddrOneCodeService.queryCompanyScanStatisticsPageMap(inMap);
		int count = oneAddrOneCodeService.countCompanyScanStatisticsByPageMap(inMap);
		List<OneAddrOneCodeVo> retVoList = new ArrayList<OneAddrOneCodeVo>();
		for(Map<String,Object> retMap : retMapList){
			OneAddrOneCodeVo retVo =  new OneAddrOneCodeVo();
			BeanUtils.populate(retVo, retMap);
			retVoList.add(retVo);
		}
		return RestUtils.wrappQueryResult(retVoList, count);
	}
	
	
	@RequestMapping("/personalScanInfo")
	@ItemResponseBody
	public String personalScanInfo(HttpServletRequest request,
			@RequestParam(value = "scanDate") String scanDate,
			@RequestParam(value = "companyId") String companyId,
			@RequestParam(value = "companySubId") String companySubId
			) throws Exception {	
		
		OneAddrOneCodeVo oneAddrOneCodeVo=new OneAddrOneCodeVo();
		oneAddrOneCodeVo.setScanDate(scanDate);
		oneAddrOneCodeVo.setCompanyId(companyId);
		if(!StringUtils.isEmpty(companySubId)&&!"null".equals(companySubId)){
			oneAddrOneCodeVo.setCompanySubId(companySubId);
		}
		request.setAttribute("sweepDetailInformationForm", oneAddrOneCodeVo);
		return Personal_INIT_PAGE;
	
	}
	
	@RequestMapping("/queryPersonalInfo")
	@ItemResponseBody
	public QueryResultObject queryPersonalInfo(HttpServletRequest request,
			@QueryRequestParam("params") RequestCondition params) throws Exception {	
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		OneAddrOneCodeVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();  
		inMap.put("companySubId", vo.getCompanySubId());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin())); // 开始页码
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd())); // 结束页码
		inMap.put("companyId", vo.getCompanyId()); 
		inMap.put("scanDate", vo.getScanDate()); 
		
		List<Map<String,Object>> list = healthCompanySweepRecord.selectPersonalScanByCompanyIdScanDate(inMap);
		int count = healthCompanySweepRecord.countPersonalScanByCompanyIdScanDate(inMap);
		List<CompanySweepRecordVo> retVoList = new ArrayList<CompanySweepRecordVo>();
		for(Map<String,Object> map:list){
			CompanySweepRecordVo retVo = new CompanySweepRecordVo();
			BeanUtils.populate(retVo, map);
			retVoList.add(retVo);
		}
		
		return RestUtils.wrappQueryResult(retVoList, count);
	
	}
	
	@RequestMapping("/companySubScanInfo")
	@ItemResponseBody
	public String companySubScanInfo(HttpServletRequest request,
			@RequestParam(value = "scanDate") String scanDate,
			@RequestParam(value = "companyId") String companyId,
			@RequestParam(value = "industryCat") String industryCat
//			@RequestParam(value = "companyName") String companyName,
//			@RequestParam(value = "regAddress") String regAddress,
//			@RequestParam(value = "externalName") String externalName,
//			@RequestParam(value = "address") String address
			) throws Exception {	
		OneAddrOneCodeVo oneAddrOneCodeVo=new OneAddrOneCodeVo();
		oneAddrOneCodeVo.setScanDate(scanDate);
		oneAddrOneCodeVo.setCompanyId(companyId);
		
		oneAddrOneCodeVo.setCompanyName(StringUtils.isEmpty(request.getParameter("companyName"))?"":URLDecoder.decode(request.getParameter("companyName"), "utf-8"));
		oneAddrOneCodeVo.setRegAddress(StringUtils.isEmpty(request.getParameter("regAddress"))?"":URLDecoder.decode(request.getParameter("regAddress"), "utf-8"));
		oneAddrOneCodeVo.setExternalName(StringUtils.isEmpty(request.getParameter("externalName"))?"":URLDecoder.decode(request.getParameter("externalName"), "utf-8"));
		oneAddrOneCodeVo.setIndustryCat(industryCat);
		oneAddrOneCodeVo.setAddress(StringUtils.isEmpty(request.getParameter("address"))?"":URLDecoder.decode(request.getParameter("address"), "utf-8"));
		request.setAttribute("oneAddrOneCodeMainForm", oneAddrOneCodeVo);
		return Sub_INIT_PAGE;
	
	}
	
	@RequestMapping("/querycompanySubInfo")
	@ItemResponseBody
	public QueryResultObject querycompanySubInfo(HttpServletRequest request,
			@QueryRequestParam("params") RequestCondition params) throws Exception {	
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		OneAddrOneCodeVo vo = this.rCondition2QCondition(params);
		
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("companyId", vo.getCompanyId());
		inMap.put("scanDate", vo.getScanDate());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		
		List<Map<String,Object>> retMapList = oneAddrOneCodeService.queryCompanySubScanStatisticsPageMap(inMap);
		int count = oneAddrOneCodeService.countCompanySubScanStatisticsByPageMap(inMap);
		List<OneAddrOneCodeVo> retVoList = new ArrayList<OneAddrOneCodeVo>();
		for(Map<String,Object> retMap : retMapList){
			OneAddrOneCodeVo retVo =  new OneAddrOneCodeVo();
			BeanUtils.populate(retVo, retMap);
			retVoList.add(retVo);
		}
		//  子码没被扫过可能没有数据，将有数据的填充(总感觉很不对劲)
		
			for(int i=0;i<retVoList.size();i++){
				OneAddrOneCodeVo real=retVoList.get(i);
				real.setCompanyId(vo.getCompanyId());
				real.setRegAddress(vo.getRegAddress());
				real.setExternalName(vo.getExternalName());
				real.setIndustryCat(vo.getIndustryCat());
				real.setScanDate(vo.getScanDate());
				real.setAddress(vo.getAddress());
				real.setCompanyName(vo.getCompanyName());
			}
		
			
		return RestUtils.wrappQueryResult(retVoList,count);
	
	}
	
	
	@Override
	protected OneAddrOneCodeVo initCondition() {
		return new OneAddrOneCodeVo();
	}
}
