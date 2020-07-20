package xkt.personal.mgmt.web.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.util.IOUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.bo.TCHealthCodeApply;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.common.AnnLog;
import xkt.personal.mgmt.service.ITCHealthCodeApplyService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthCompanySweepRecordService;
import xkt.personal.mgmt.utils.ExportForSweepRecord;
import xkt.personal.mgmt.web.vo.CompanySweepRecordVo;
import xkt.personal.mgmt.web.vo.TCHealthCodeApplyVo;

import com.ls.pf.base.api.code.CodeBO;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.utils.RestUtils;

import eeos.sp.core.base.i18n.I18n;
import eeos.sp.core.base.util.BoTransforUtil;

/**
 * 
 * @ClassName: PersonalInfoTrackController   
 * @Description:个人信息跟踪  
 * @author:
 * @date: 2020年4月1日 下午8:53:50   
 *
 */
@Controller
@RequestMapping("/PersonalInfoTrackController")
public class PersonalInfoTrackController extends
		QueryController<TCHealthCodeApplyVo> {

	public static final String PATH_INIT = "/personal/mgmt/personalInfoTrack/personalInfoTrackMain";

	
	public static final String PATH_SHOW = "/personal/mgmt/personalInfoTrack/personalInfoDetail";
	
	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	BoTransforUtil util = new BoTransforUtil();
	@ServiceAutowired
	private I18n il8n;

	@ServiceAutowired
	private ITCHealthCodeApplyService itcHealthCodeApplyService;

	@ServiceAutowired
	private ITCHealthCompanySweepRecordService itcHealthCompanySweepRecordService;

	
	/**
	 * 
	 * @Title: init
	 * @Description: 界面初始化
	 * @Author: sjr          
	 * @Create Date: 2020年4月1日 下午8:56:12
	 * @History: 2020年4月1日 下午8:56:12 shenj Created.
	 *
	 * @param request
	 * @return
	 *
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {

		TCHealthCodeApplyVo tcHealthCodeApplyVo = new TCHealthCodeApplyVo();
		List<Map<String, String>> districtCodeList=getCodeList(null, "2");
		Map<String, String> all = new HashMap<String, String>();
		all.put("name", "全部");
		all.put("value", "000000");
		districtCodeList.add(0,all);
		// 区域
		request.setAttribute("districtCodeList", districtCodeList);
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		
		List<CodeBO> isHealthyList = il8n.getAllStandardCodes(
				"XKM_HealthyCode", request);
		request.setAttribute("isHealthyList", isHealthyList);
		List<CodeBO> commTypeList = il8n.getAllStandardCodes(
				"XKM_CommuityType", request);
		request.setAttribute("commTypeList", commTypeList);
		request.setAttribute("checkerMgmtForm", tcHealthCodeApplyVo);
		return PATH_INIT;
	}

	
	/**
	 * 
	 * @Title: query
	 * @Description: 查询方法
	 * @Author: sjr          
	 * @Create Date: 2020年4月1日 下午8:56:25
	 * @History: 2020年4月1日 下午8:56:25 shenj Created.
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/query")
	@ItemResponseBody
	@AnnLog(funcName="个人信息跟踪",moudleType="01")
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params,HttpServletRequest request)
			throws Exception {
		
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		TCHealthCodeApplyVo vo = this.rCondition2QCondition(params);
		vo.setCertCodeSecret(StringUtils.isEmpty(request.getParameter("certCodeSecret"))?"":URLDecoder.decode(request.getParameter("certCodeSecret"), "utf-8"));
		Map<String, String> inMap = new HashMap<String, String>();

		inMap.put("startTime", vo.getStartTime()); // 开始时间
		inMap.put("endTime", vo.getEndTime()); // 结束时间
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin())); // 开始页码
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd())); // 结束页码
		inMap.put("isHealthy", vo.getIsHealthy()); // 个人健康状态
		inMap.put("housingName", vo.getHousingName()); // 小区名称
		if(vo.getDistrictCode()!=null && !"000000".equals(vo.getDistrictCode())){
			inMap.put("districtCode", vo.getDistrictCode()); // 区域编号
		}
		inMap.put("streetCode", vo.getStreetCode()); // 街道编号
		inMap.put("communityCode", vo.getCommunityCode()); // 社区编号
		inMap.put("cmmtyType", vo.getCmmtyType()); // 小区分类
		inMap.put("certCode", vo.getCertCode()); // 证件号
		inMap.put("phone", vo.getPhone()); // 手机号
		inMap.put("userName", vo.getUserName()); // 姓名
		inMap.put("commuityNo", vo.getCommuityNo()); // 小区编号

		List<TCHealthCodeApply> list = new ArrayList<TCHealthCodeApply>();
		list = this.itcHealthCodeApplyService.selectByPage(inMap);
		List<TCHealthCodeApplyVo> listVo = new ArrayList<TCHealthCodeApplyVo>();
		for (TCHealthCodeApply tcHealthCodeApply : list) {
			TCHealthCodeApplyVo applyvo = new TCHealthCodeApplyVo();
			applyvo = (TCHealthCodeApplyVo) boTovo(tcHealthCodeApply, applyvo);
			listVo.add(applyvo);
		}

		int count = this.itcHealthCodeApplyService
				.countTCHealthCodeApply(inMap);

		return RestUtils.wrappQueryResult(listVo, count);
	}


	
	/**
	 * 
	 * @Title: showPerson
	 * @Description: 个人信息追踪查询
	 * @Author: ls-700725                
	 * @Create Date: 2020年3月17日 下午8:30:28
	 * @History: 2020年3月17日 下午8:30:28 ls-700725 Created.
	 *
	 * @param params
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/queryPerson")
	@ItemResponseBody
	@AnnLog(funcName="个人信息追踪查询强详情",moudleType="01")
	public QueryResultObject showPerson(
			@QueryRequestParam("params") RequestCondition params) throws Exception {
		
		TCHealthCodeApplyVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String,Object>();
		// 分页
		inMap.put("pageBegin", vo.getPageBegin());
		inMap.put("pageEnd", vo.getPageEnd());
		inMap.put("certCode", vo.getCertCodeSecret());
		inMap.put("startTime", vo.getStartTime());
		inMap.put("endTime", vo.getEndTime());
		
		
		List<TCHealthCodeApply> retVos = this.itcHealthCodeApplyService
				.selectByCertCode(inMap);
		List<TCHealthCodeApplyVo> listVo = new ArrayList<TCHealthCodeApplyVo>();
		for (TCHealthCodeApply tcHealthCodeApply : retVos) {
			TCHealthCodeApplyVo applyvo = new TCHealthCodeApplyVo();
			applyvo = (TCHealthCodeApplyVo) boTovo(tcHealthCodeApply, applyvo);
			applyvo.setCommunityCodeNew("小区及验证员详情");
			applyvo.setCertCode(vo.getCertCode());
			
			listVo.add(applyvo);
		}
		
		int count =itcHealthCodeApplyService.countByCertCode(inMap);
		return RestUtils.wrappQueryResult(listVo,count);
	}
	
	/**
	 * 
	 * @Title: expotrSweepRecord
	 * @Description: 个人信息跟踪  个人被扫码记录详情导出
	 * @Author: zyf               
	 * @Create Date: 2020年4月2日 上午11:23:27
	 * @History: 2020年4月2日 上午11:23:27 ls-700725 Created.
	 *
	 * @param startTime
	 * @param endTime
	 * @param certCodeSecret
	 * @param certCode
	 * @param phone
	 * @param response
	 * @throws Exception
	 *
	 */
	@RequestMapping("/exportSweepRecord")
	public void expotrSweepRecord(@RequestParam("startTime") String startTime,
			@RequestParam("endTime") String endTime,
			@RequestParam(value = "certCodeSecret") String certCodeSecret,
			@RequestParam(value = "certCode") String certCode,
			@RequestParam(value = "phone") String phone,
			HttpServletResponse response) throws Exception {

		Map<String, Object> inMap = new HashMap<String, Object>();
		// 分页

		inMap.put("certCode", certCodeSecret);
		inMap.put("startTime", startTime);
		inMap.put("endTime", endTime);
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		listMap = itcHealthCodeApplyService.selectSweepRecordExport(inMap);
		List<TCHealthCodeApplyVo> listNow = new ArrayList<TCHealthCodeApplyVo>();
		for (Map<String, Object> map : listMap) {
			TCHealthCodeApplyVo vo1 = new TCHealthCodeApplyVo();
			BeanUtils.populate(vo1, map); // 将map转换成vo
			boolean flag = true;
			for (TCHealthCodeApplyVo vo2 : listNow) { // 遍历
				if (vo2.getId().equals(vo1.getId())) {
					flag = false;
					if(vo2.getHousingName()!=null||vo2.getHousingName()!=""||vo2.getHousingName()!="null"){
						StringBuilder housingName = new StringBuilder();
						housingName.append(vo2.getHousingName());
						housingName.append("、");
						housingName.append(vo1.getHousingName());
						vo2.setHousingName(housingName.toString());
					}
					break;
				}
			}
			if (flag) {
				vo1.setPhone(phone);
				vo1.setCertCode(certCode);
				vo1.setUuid((listNow.size()+1)+"");
				listNow.add(vo1);
			}
		}
		InputStream inputStream = ExportForSweepRecord.createExl(listNow);
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="
				+ URLEncoder.encode("个人扫码记录表.xlsx", "UTF-8"));
		OutputStream fileOutputStream = response.getOutputStream();
		IOUtils.copy(inputStream, fileOutputStream);

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
	protected TCHealthCodeApplyVo initCondition() {
		return new TCHealthCodeApplyVo();
	}
	/**
	 * 
	 * @Title: showUserDetail
	 * @Description: 个人信息跟踪明细
	 * @Author: sjr          
	 * @Create Date: 2020年4月1日 下午8:55:28
	 * @History: 2020年4月1日 下午8:55:28 shenj Created.
	 *
	 * @param phone
	 * @param certCode
	 * @param certCodeHide
	 * @param certCodeSecret
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException 
	 *
	 */
	@RequestMapping("/show")
	@AnnLog(funcName="个人信息跟踪(详情)",moudleType="01")
	public String showUserDetail(String phone, String certCode,String certCodeHide,String certCodeSecret,
			HttpServletRequest request) throws UnsupportedEncodingException {
		CompanySweepRecordVo vo = new CompanySweepRecordVo();
	
		vo.setPhone(phone);
		vo.setCertCode(certCode);
		vo.setCertCodeHide(certCodeHide);
		vo.setCertCodeSecret(StringUtils.isEmpty(request.getParameter("certCodeSecret"))?"":URLDecoder.decode(request.getParameter("certCodeSecret"), "utf-8"));
		DateTime  dateTime = new DateTime();
		vo.setEndTime(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
		DateTime yesterDate = dateTime.minusDays(2);
		String yseaterday = yesterDate.toString("yyyy-MM-dd");
		vo.setStartTime(yseaterday+ "00:00:00");
		request.setAttribute("ORG_TYPE_OUTPUT", true);
		request.setAttribute("sweepDetailInformationForm", vo);
		return PATH_SHOW;
	}
	
	
	/**
	 * 
	 * @Title: boTovo
	 * @Description: 将bo转为vo,vo中所有类型为string (这里用一句话描述这个方法的作用)
	 * @Author: ls-700725
	 * @Create Date: 2020年3月16日 上午10:20:58
	 * @History: 2020年3月16日 上午10:20:58 ls-700725 Created.
	 *
	 * @param bo
	 * @param vo
	 * @return
	 * @throws Exception
	 *
	 */
	private Object boTovo(Object bo, Object vo) throws Exception {
		Class<?>  boc = bo.getClass();
		Field[] fieldsbo = boc.getDeclaredFields();
		Class<?> voc = vo.getClass();
		for (Field field : fieldsbo) {
			field.setAccessible(true);
			if (field.get(bo) != null) {
				if (field.getType() == int.class) {

					if (field.get(bo) != null) {
						String fieldName = field.getName().substring(0, 1)
								.toUpperCase()
								+ field.getName().substring(1);
						Method voset = voc.getDeclaredMethod("set" + fieldName,
								String.class);
						if (voset != null) {
							voset.invoke(vo, field.get(bo).toString());
						}

					}
				}
				if (field.getType() == Date.class) {
					Date date = (Date) field.get(bo);
					SimpleDateFormat sdf = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					String fieldName = field.getName().substring(0, 1)
							.toUpperCase()
							+ field.getName().substring(1);
					Method voset = voc.getDeclaredMethod("set" + fieldName,
							String.class);
					if (voset != null) {
						voset.invoke(vo, sdf.format(date));
					}
				}
				if (field.getType() == String.class) {
					String fieldName = field.getName().substring(0, 1)
							.toUpperCase()
							+ field.getName().substring(1);
					Method voset = voc.getDeclaredMethod("set" + fieldName,
							String.class);
					if (voset != null) {
						voset.invoke(vo, field.get(bo));
					}
				}
			}

		}
		return vo;
	}
	
}
