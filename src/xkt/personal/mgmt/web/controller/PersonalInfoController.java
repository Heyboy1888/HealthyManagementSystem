package xkt.personal.mgmt.web.controller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xkt.personal.mgmt.bo.TCHealthCodeApply;
import xkt.personal.mgmt.service.IPersonalInfoChangeRecordService;
import xkt.personal.mgmt.service.ITCHealthCodeApplyService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthCompanySweepRecordService;
import xkt.personal.mgmt.web.vo.PersonalInfoChangeRecordVo;
import xkt.personal.mgmt.web.vo.TCHealthCodeApplyVo;

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
import eeos.sp.core.base.util.BoTransforUtil;

/**
 * 
 * @ClassName: PersonalInfoController
 * @Description: 个人信息查询
 * @author:
 * @date: 2020年4月1日 下午8:53:06
 *
 */
@Controller
@RequestMapping("/personalInfoController")
public class PersonalInfoController extends
		QueryController<TCHealthCodeApplyVo> {

	public static final String PATH_INIT = "/personal/mgmt/personalInfo/personalInfoMain";
	public static final String PATH_Detail = "/personal/mgmt/personalInfo/personalInfoDetail";
	public static final String PATH_EDIT = "/personal/mgmt/personalInfo/personalInfoEdit";

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	BoTransforUtil util = new BoTransforUtil();
	@ServiceAutowired
	private I18n il8n;

	@ServiceAutowired
	private ITCHealthCodeApplyService itcHealthCodeApplyService;

	@ServiceAutowired
	private ITCHealthCompanySweepRecordService itcHealthCompanySweepRecordService;

	@ServiceAutowired
	private IPersonalInfoChangeRecordService iPersonalInfoChangeRecordService;

	@RequestMapping("/init")
	public String init(HttpServletRequest request) {

		TCHealthCodeApplyVo tcHealthCodeApplyVo = new TCHealthCodeApplyVo();
		// 证件类型
		List<CodeBO> certTypeList = il8n.getAllStandardCodes("XKM_CertType",
				request);
		request.setAttribute("certTypeList", certTypeList);
		// 健康状态
		List<CodeBO> isHealthyList = il8n.getAllStandardCodes(
				"XKM_HealthyCode", request);
		request.setAttribute("isHealthyList", isHealthyList);
		request.setAttribute("PersonalInfoMainForm", tcHealthCodeApplyVo);
		return PATH_INIT;
	}

	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		TCHealthCodeApplyVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		inMap.put("userName", vo.getUserName()); // 姓名
		inMap.put("phone", vo.getPhone()); // 手机号
		inMap.put("isHealthy", vo.getIsHealthy()); // 个人健康状态
		inMap.put("certType", vo.getCertType()); // 证件号
		inMap.put("certCode", vo.getCertCode());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin())); // 开始页码
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd())); // 结束页码
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

	@RequestMapping("/detail")
	public String addOrEditPage(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id)
			throws Exception {
		TCHealthCodeApply apply = null;
		TCHealthCodeApplyVo vo = new TCHealthCodeApplyVo();
		// 证件类型
		List<CodeBO> certTypeList = il8n.getAllStandardCodes("XKM_CertType",
				request);
		List<CodeBO> codeBo = il8n.getAllStandardCodes("XKM_IsOrNot", request);
		List<CodeBO> LiveList = il8n.getAllStandardCodes("XKM_LiveType",
				request);

		if (StringUtils.isNotEmpty(id)) {
			apply = this.itcHealthCodeApplyService.selecDetail(Integer
					.valueOf(id));
		}
		if (apply != null) {
			vo = (TCHealthCodeApplyVo) boTovo(apply, vo);

		}
		DateTime  dateTime = new DateTime();
		vo.setEndTime(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
		DateTime yesterDate = dateTime.minusDays(2);
		String yseaterday = yesterDate.toString("yyyy-MM-dd");
		vo.setStartTime(yseaterday+ "00:00:00");
		request.setAttribute("certTypeList", certTypeList);
		request.setAttribute("codeBo", codeBo);
		request.setAttribute("LiveList", LiveList);
		request.setAttribute("personalInfoDetailForm", vo);
		return PATH_Detail;
	}

	/**
	 * 
	 * @Title: queryTypeChange
	 * @Description:查询锡康码状态变更日志
	 * @Author: zyf
	 * @Create Date: 2020年4月28日 上午11:57:04
	 * @History: 2020年4月28日 上午11:57:04 ls-700725 Created.
	 *
	 * @param params
	 * @return
	 * @throws ParseException 
	 *
	 */
	@RequestMapping("/queryTypeChange")
	@ItemResponseBody
	public QueryResultObject queryTypeChange(
			@QueryRequestParam("params") RequestCondition params) throws ParseException {
		TCHealthCodeApplyVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("certCode", vo.getCertCode());
		inMap.put("certCodeSecret", vo.getCertCodeSecret());
		inMap.put("startTime", vo.getStartTime());
		inMap.put("endTime", vo.getEndTime());
		inMap.put("isHealthy", vo.getIsHealthy());
		List<PersonalInfoChangeRecordVo> resultList = new ArrayList<PersonalInfoChangeRecordVo>();
		resultList = iPersonalInfoChangeRecordService
				.queryPersonalInfoChangeRecord(inMap);
		StringBuilder strb=new StringBuilder();
		boolean flag=false;
		if("1".equals(vo.getIsTwoWeekVirus())){
			strb.append("14日内接触过“新冠肺炎”确诊或疑似病例");
			flag=true;
		}
		if("1".equals(vo.getIsHot())){
			if(flag){
				strb.append(";");
			}
			strb.append("发烧");
			flag=true;
		}
		if("1".equals(vo.getIsStay())){
			if(flag){
				strb.append(";");
			}
			strb.append("14日内与湖北停留或与归来人员接触");
			flag=true;
		}
		if("1".equals(vo.getTwoWeekTravel())){
			if(flag){
				strb.append(";");
			}
			strb.append("14日之内有旅行史");
			flag=true;
		}
		if("1".equals(vo.getIsIsolaVirusPsn())){
			if(flag){
				strb.append(";");
			}
			strb.append("定点医院隔离治疗的确认病人疑似病人");
			flag=true;
		}
		if("1".equals(vo.getIsCureVirusPsn())){
			if(flag){
				strb.append(";");
			}
			strb.append("实施居家观察未满14天的感染者");
			flag=true;
		}
		if("1".equals(vo.getIsObserVirusPsn())){
			if(flag){
				strb.append(";");
			}
			strb.append("定点医疗机构隔离医学观察的无症状感染者");
			flag=true;
		}
		String applyReson=strb.toString();
		if(!StringUtils.isEmpty(applyReson)){
			PersonalInfoChangeRecordVo applyVo=new PersonalInfoChangeRecordVo();
			applyVo.setIsHealthy(vo.getIsHealthy());
			applyVo.setReason(applyReson);
			SimpleDateFormat sdf = new SimpleDateFormat(
					"yyyy-MM-dd hh:mm:ss");
			Date date = sdf.parse(vo.getUpdateTime());
			applyVo.setUpdateTime(date);
			Date startDate=sdf.parse(vo.getStartTime());
			Date endDate=sdf.parse(vo.getEndTime());
			if(date.compareTo(startDate)>=0&&date.compareTo(endDate)<=0){
				resultList.add(applyVo);
			}
		}
		// 对resultList按时间排序
					Collections.sort(resultList,
							new Comparator<PersonalInfoChangeRecordVo>() {
								@Override
								public int compare(PersonalInfoChangeRecordVo o1,
										PersonalInfoChangeRecordVo o2) {
									int flag = o2.getUpdateTime().compareTo(
											o1.getUpdateTime());
									return flag;
								}
							});
		return RestUtils.wrappQueryResult(resultList, resultList.size());
	}
	
	@RequestMapping("/edit")
	public String editPage(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id)
			throws Exception {
		TCHealthCodeApply apply = null;
		TCHealthCodeApplyVo vo = new TCHealthCodeApplyVo();
		// 证件类型
		List<CodeBO> certTypeList = il8n.getAllStandardCodes("XKM_CertType",
				request);
		List<CodeBO> codeBo = il8n.getAllStandardCodes("XKM_IsOrNot", request);
		List<CodeBO> LiveList = il8n.getAllStandardCodes("XKM_LiveType",
				request);

		if (StringUtils.isNotEmpty(id)) {
			apply = this.itcHealthCodeApplyService.selecDetail(Integer
					.valueOf(id));
		}
		if (apply != null) {
			vo = (TCHealthCodeApplyVo) boTovo(apply, vo);

		}
		DateTime  dateTime = new DateTime();
		vo.setEndTime(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
		DateTime yesterDate = dateTime.minusDays(2);
		String yseaterday = yesterDate.toString("yyyy-MM-dd");
		vo.setStartTime(yseaterday+ "00:00:00");
		request.setAttribute("certTypeList", certTypeList);
		request.setAttribute("codeBo", codeBo);
		request.setAttribute("LiveList", LiveList);
		request.setAttribute("PersonalInfoEditForm", vo);
		return PATH_EDIT;
	}
	
	/**
	 * 
	 * @Title: cancelUpdateFlag
	 * @Description: 取消账号的实名状态(update_flag置为0)
	 * @Author: zyf               
	 * @Create Date: 2020年4月29日 上午11:27:13
	 * @History: 2020年4月29日 上午11:27:13 ls-700725 Created.
	 *
	 * @param certCode
	 * @return
	 *
	 */
	@RequestMapping("/cancel")
	@ItemResponseBody
	public WrappedResult cancelUpdateFlag(String certCode){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("certCode", certCode);
		map.put("updateFlag", "0");
		map.put("personAuthFlag", "0");
		int index=itcHealthCodeApplyService.updateByCertCode(map);
		return new WrappedResult(true, index, null);
	}
	
	@RequestMapping("/updateNameAndPhone")
	@ItemResponseBody
	public WrappedResult updateNameAndPhone(@RequestBody TCHealthCodeApplyVo vo){
		int i=0;
		String proName="修改";
		Map<String,Object> inMap=new HashMap<String, Object>();
		inMap.put("userName", vo.getUserName());
		inMap.put("phone", vo.getPhone());
		inMap.put("certCode", vo.getCertCode());
		inMap.put("certCodeSecret", vo.getCertCodeSecret());
		i=itcHealthCodeApplyService.updateNameAndPhone(inMap);
		
		return new WrappedResult(i==1?true:false,null, i==1?proName+"成功!":proName+"失败");
	}
	
	@Override
	protected TCHealthCodeApplyVo initCondition() {
		return new TCHealthCodeApplyVo();
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
		Class<?> boc = bo.getClass();
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
