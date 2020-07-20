package xkt.personal.mgmt.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.bo.TCHealthMonitorUser;
import xkt.personal.mgmt.service.ITCHealthCodeApplyService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthMonitorUserService;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.utils.Md5Utils;
import xkt.personal.mgmt.web.vo.MonitorUserVo;

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
import eeos.sp.core.base.util.EEOSBusinessException;

/**
 * 
 * @ClassName: MonitorUserController
 * @Description: 指定人员管理t_c_health_monitor_user
 * @author: zyf
 * @date: 2020年5月12日 下午4:08:18
 *
 */
@Controller
@RequestMapping("/monitorUserController")
public class MonitorUserController extends QueryController<MonitorUserVo> {

	public static final String PATH_INIT = "/personal/mgmt/monitor/monitorMain";

	public static final String PATH_EDIT = "/personal/mgmt/monitor/monitorEdit";
	
	public static final String PATH_ADD = "/personal/mgmt/monitor/monitorAdd";
	
	public static final String INIT_IMPORT="/personal/mgmt/monitor/monitorAddFile";

	@ServiceAutowired
	private ITCHealthMonitorUserService monitorUserService;

	@ServiceAutowired
	private I18n il8n;

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;
	
	@ServiceAutowired
	private ITCHealthCodeApplyService tcHealthCodeApplyService;
	
	@Autowired
	private IdWorker idWorker;

	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		List<Map<String, String>> districtCodeList = getCodeList(null, "2");
		// 区域
		request.setAttribute("districtCodeList", districtCodeList);
		MonitorUserVo vo = new MonitorUserVo();

		List<CodeBO> flagList = il8n
				.getAllStandardCodes("XKM_IsOrNot", request);
		request.setAttribute("flagList", flagList);
		request.setAttribute("monitorMgmtForm", vo);
		return PATH_INIT;
	}

	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params) {
		String pageNum = params.getPageNum();
		if (pageNum.indexOf(".") != -1) {
			pageNum = pageNum.substring(0, pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		MonitorUserVo vo = this.rCondition2QCondition(params);
		Map<String, Object> inMap = new HashMap<String, Object>();
		if (vo.getCertCode() != null) {
			inMap.put("certCodeSecret", Md5Utils.signature(vo.getCertCode()));
		}
		inMap.put("userType", vo.getUserType());
		inMap.put("flag", vo.getFlag());
		inMap.put("districtCode", vo.getDistrictCode());
		inMap.put("pageBegin", vo.getPageBegin()); // 开始页码
		inMap.put("pageEnd", vo.getPageEnd()); // 结束页码
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		mapList = monitorUserService.queryMonitorUser(inMap);

		List<MonitorUserVo> resList = new ArrayList<MonitorUserVo>();
		for (Map<String, Object> map : mapList) {
			MonitorUserVo resvo = new MonitorUserVo();
			resvo.setCertCodeSecret(String.valueOf(map.get("certCodeSecret")));
			resvo.setId(String.valueOf(map.get("id")));
			resvo.setUserType(String.valueOf(map.get("userType")));
			resvo.setDistrictCode(String.valueOf(map.get("districtCode")));
			resvo.setDistrictName(String.valueOf(map.get("districtName")));
			resvo.setFlag(String.valueOf(map.get("flag")));
			resvo.setCreateTime(String.valueOf(map.get("createTime")));
			resvo.setUpdateTime(String.valueOf(map.get("updateTime")));
			resList.add(resvo);
		}
		int i = 0;
		i = monitorUserService.countMonitorUser(inMap);
		return RestUtils.wrappQueryResult(resList, i);
	}

	@RequestMapping("/del")
	@ItemResponseBody
	public WrappedResult del(
			@RequestParam(value = "id", required = false) String id) {
		int i = 0;
		try {

			i = this.monitorUserService.deleteByPrimaryKey(id);

		} catch (Exception e) {
			e.printStackTrace();
			return new WrappedResult(false, null, "删除失败!");
		}

		return new WrappedResult(i == 1 ? true : false, null, i == 1 ? "删除成功!"
				: "删除失败");
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam(value = "id", required = false) String id,@RequestParam(value = "type", required = false) String type,
			HttpServletRequest request) throws IllegalAccessException, InvocationTargetException {
		if(type.equals("1")){
			TCHealthMonitorUser bo=null;
			MonitorUserVo vo=new MonitorUserVo();
			List<Map<String, String>> districtCodeList = getCodeList(null, "2");
			List<CodeBO> userTypeList = il8n.getAllStandardCodes(
					"XKM_MONITOR_TYPE", request);
			List<CodeBO> flagList = il8n
					.getAllStandardCodes("XKM_IsOrNot", request);
			if (StringUtils.isNotEmpty(id)) {
				 bo = this.monitorUserService.selectDetail(id);
			}
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("certCodeSecret", bo.getCertCodeSecret());
			List<Map<String, Object>> list=tcHealthCodeApplyService.selectCertCodeBySecret(map);
			
			
			if(bo!=null){
				BeanUtils.copyProperties(vo, bo);
			}
			if(list!=null&&list.size()>0){
				Map<String, Object> resMap=list.get(0);
				vo.setCertCode(resMap.get("certCode").toString());
			}
			request.setAttribute("districtCodeList", districtCodeList);
			request.setAttribute("userTypeList", userTypeList);
			request.setAttribute("flagList", flagList);
			request.setAttribute("monitorMgmtForm",vo);
			return PATH_EDIT;
		}
		MonitorUserVo vo1=new MonitorUserVo();
		List<Map<String, String>> districtCodeList = getCodeList(null, "2");
		// 区域
		request.setAttribute("districtCodeList", districtCodeList);
		List<CodeBO> userTypeList = il8n.getAllStandardCodes(
				"XKM_MONITOR_TYPE", request);
		List<CodeBO> flagList = il8n
				.getAllStandardCodes("XKM_IsOrNot", request);
		request.setAttribute("districtCodeList", districtCodeList);
		request.setAttribute("userTypeList", userTypeList);
		request.setAttribute("flagList", flagList);
		request.setAttribute("monitorMgmtForm",vo1);
		return PATH_ADD;
	}
	
	@RequestMapping("/update")
	@ItemResponseBody
	public WrappedResult update(@RequestBody MonitorUserVo vo){
		int i=0;
		String proName="修改";
		TCHealthMonitorUser user=new TCHealthMonitorUser();
		user.setCertCodeSecret(Md5Utils.signature(vo.getCertCode()));
		user.setUserType(vo.getUserType());
		user.setDistrictCode(vo.getDistrictCode());
		user.setDistrictName(getCodeName(vo.getDistrictCode()));
		user.setId(vo.getId());
		user.setUpdateTime(new Date());
		user.setFlag(vo.getFlag());
		i=monitorUserService.updateByPrimaryKeySelective(user);
		return new WrappedResult(i==1?true:false,null, i==1?proName+"成功!":proName+"失败");
	}
	
	@RequestMapping("/add")
	@ItemResponseBody
	public WrappedResult add(@RequestBody MonitorUserVo vo){
		if(getIfExist(Md5Utils.signature(vo.getCertCode()))){
			return new WrappedResult(false,null,"该身份证号已存在");
		}
		int i=0;
		String proName="新增";
		TCHealthMonitorUser user=new TCHealthMonitorUser();
		user.setCertCodeSecret(Md5Utils.signature(vo.getCertCode()));
		user.setUserType(vo.getUserType());
		user.setDistrictCode(vo.getDistrictCode());
		user.setDistrictName(getCodeName(vo.getDistrictCode()));
		user.setId(idWorker.nextStrId());
		user.setUpdateTime(new Date());
		user.setCreateTime(new Date());
		user.setFlag(vo.getFlag());
		i=monitorUserService.insert(user);
		return new WrappedResult(i==1?true:false,null, i==1?proName+"成功!":proName+"失败");
	}
	
	@RequestMapping("/download")
	public void getTemplateMonitorFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		InputStream input = this.getClass().getResourceAsStream(
				"/config/templates/userMonitor.xlsx");
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode("指定人员.xlsx", "UTF-8"));
		OutputStream fileOutputStream = response.getOutputStream();
		IOUtils.copy(input, fileOutputStream);
	}
	
	/**
	 * 文件导入
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fileImport")
	@ItemResponseBody
	public WrappedResult fileImport(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
		Iterator<String> itr = multiRequest.getFileNames();
		MultipartFile excelfile = multiRequest.getFile((String) itr.next());
		// 处理待上传文件
		if (null != excelfile && excelfile.getOriginalFilename() != null
				&& excelfile.getOriginalFilename().length() > 0) {
			String originalFilename = excelfile.getOriginalFilename();// 获取待上传文件名
			System.out.println("待上传的文件名称：" + originalFilename);
			Integer pointIndex = originalFilename.lastIndexOf(".");
			String originalFileType = originalFilename.substring(pointIndex);
			System.out.println("待上传的文件类型：" + originalFileType);
			long size = excelfile.getSize();
			System.out.println("待上传的文件大小：" + size);
			WrappedResult result = new WrappedResult();
			try {
				InputStream in = excelfile.getInputStream();
				return this.monitorUserService.importExcel(in, size,
						originalFilename, originalFileType);
			} catch (Exception e) {
				e.printStackTrace();
				String msg = EEOSBusinessException.getKeyMessage("数据导入失败",
						this.getClass());
				String clazz = EEOSBusinessException.getClazz(e,
						this.getClass());
				if (clazz != null) {
					msg = EEOSBusinessException.getMessage(e, this.getClass());
				}
				result.setSuccessful(false);
				result.setResultHint(msg);
				return result;
			}
		}
		return new WrappedResult(true, null, "数据导入成功");
	}

	@RequestMapping("/initImport")
	public String initImport(HttpServletRequest request) {
		MonitorUserVo vo = new MonitorUserVo();
		request.setAttribute("templetAddForm", vo);
		return INIT_IMPORT;
	}
	/**
	 * 
	 * @Title: getCodeList
	 * @Description: TODO 获取区(县)code
	 * @Author: zyf
	 * @Create Date: 2020年5月12日 下午4:09:00
	 * @History: 2020年5月12日 下午4:09:00 ls-700725 Created.
	 *
	 * @param pId
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
	 * @Title: getCodeName
	 * @Description: TODO 获取区(县)code
	 * @Author: zyf
	 * @Create Date: 2020年5月12日 下午4:09:00
	 * @History: 2020年5月12日 下午4:09:00 ls-700725 Created.
	 *
	 * @param pId
	 * @param level
	 * @return
	 *
	 */
	private String getCodeName(String communityCode) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		example.setOrderByClause("community_code");
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		criteria.andCommunityCodeEqualTo(communityCode);
		List<TCHealthCommunityInfo> healthCommunityInfoList = tcHealthCommunityInfoService
				.selectByExample(example);
		System.out.println(healthCommunityInfoList.size());
		if(healthCommunityInfoList.size()>0){
			return healthCommunityInfoList.get(0).getCommunityName();
		}
		return "";
	}
	
	
	private boolean getIfExist(String certCodeSecret){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("certCodeSecret", certCodeSecret);
		int i=1;
		i=monitorUserService.countMonitorUser(map);
		if (i==0) {
			return false;
		}
		return true;
	}

	@Override
	protected MonitorUserVo initCondition() {

		return new MonitorUserVo();
	}
}
