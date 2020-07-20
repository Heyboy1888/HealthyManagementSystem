package xkt.personal.mgmt.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

import org.apache.commons.lang.StringUtils;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCCommuityCheckerRela;
import xkt.personal.mgmt.bo.TCHealthCodeAdmin;
import xkt.personal.mgmt.bo.TCHealthCodeAdminCriteria;
import xkt.personal.mgmt.bo.TCHealthCodeAdminExt;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.service.ITCCommuityCheckerRelaService;
import xkt.personal.mgmt.service.ITCCommunityService;
import xkt.personal.mgmt.service.ITCHealthCodeAdminService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.utils.CardCodeUtil;
import xkt.personal.mgmt.utils.CodeConstant;
import xkt.personal.mgmt.utils.DateUtil;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.utils.Md5Utils;
import xkt.personal.mgmt.web.vo.CheckerMgmtVo;

import com.ls.pf.base.api.auth.IOrgService;
import com.ls.pf.base.api.auth.IStaffService;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.security.Authentication;
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
 * @Description: 审核员管理
 * @ClassName: CheckerMgmtController
 * @author: Hanson
 * @date: 2020年2月25日 下午5:19:43
 *
 */
@Controller
@RequestMapping("/checkerMgmtController")
public class CheckerMgmtController extends QueryController<CheckerMgmtVo> {
	
	private static final String INIT_PAGE = "/personal/mgmt/checker/checkerMain";

	private static final String EDIT_PAGE = "/personal/mgmt/checker/checkerEdit";

	private static final String INIT_IMPORT = "/personal/mgmt/checker/addFile";

	// 注入标准代码service
	@ServiceAutowired
	private I18n codeService;
	
	@ServiceAutowired
	private ITCHealthCodeAdminService tcHealthCodeAdminService;

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	@ServiceAutowired
	private ITCCommunityService tcCommunityService;

	@Autowired
	private IdWorker idWorker;

	@ServiceAutowired
	ITCCommuityCheckerRelaService tcCommunityCheckerService;
	
	@ServiceAutowired
	private Authentication authentication;
	@ServiceAutowired
	private IOrgService orgService;	
    @ServiceAutowired
	private IStaffService staffService;

	/**
	 * 
	 * @Description: 界面初始化
	 * @Title: init
	 * @Author: Hanson
	 * @Create Date: 2020年2月25日 下午5:52:19
	 * @History: 2020年2月25日 下午5:52:19 Hanson Created.
	 *
	 * @return
	 *
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		CheckerMgmtVo vo = new CheckerMgmtVo();
		/*AccountBo accountBo = this.authentication.getCurrentAccount(session);
		String staffId = accountBo.getStaffId();
		StaffBo staffBo = this.staffService.getStaffById(staffId);
		String orgNoString = staffBo.getOrgNo();
		TCHealthCommunityInfo  healthCommunityInfo= getHealthCommunityInfoByCode(orgNoString);
		String gradeString = healthCommunityInfo.getGrade();*/

		
		// 证件类型
		request.setAttribute("certTypeList", CodeConstant.CERT_TYPE_VALUE_MAP_LIST);
		// 人员类型
		request.setAttribute("personalTypeList",CodeConstant.PERSONAL_TYPE_MAP_LIST);
		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		// 社区分类
		request.setAttribute("commtyTypeList", CodeConstant.CMMTY_TYPE_MAP_LIST);
		
		request.setAttribute("checkerMgmtForm", vo);
		
		return INIT_PAGE;
	}
	
	/**
	 * 
	 * @Description: 根据条件查询审核员信息
	 * @Title: query
	 * @Author: Hanson
	 * @Create Date: 2020年2月25日 下午5:53:01
	 * @History: 2020年2月25日 下午5:53:01 Hanson Created.
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public QueryResultObject query(@QueryRequestParam("params") RequestCondition params) throws Exception {
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		CheckerMgmtVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		// String communityID = null;
		String personnelType = vo.getPersonnelType();// 人员类型
		String districtCode = vo.getDistrictCode();// 区域编码
		String streetCode = vo.getStreetCode();// 街道编码
		String communityCode = vo.getCommunityCode();// 社区编码
		String communityCodeNew = vo.getCommunityCodeNew();// 社区编码New
		if (StringUtils.isNotEmpty(communityCodeNew)) {
			communityCode = communityCodeNew;
		}
		String certType = vo.getCertType();// 证件类型                                    
		String cardCodeBright = vo.getCardCodeBright();// 明文证件号码
		String mobile = vo.getMobile(); // 手机号码
		String realName = vo.getRealName();// 姓名
		String startTime = vo.getCreateTimeFrom();// 开始时间
		String endTime = vo.getCreateTimeTo();// 截止时间
		String cmmtyType = vo.getCmmtyType();// 小区分类
		String pageBegin = String.valueOf(vo.getPageBegin());// 开始行
		String pageEnd = String.valueOf(vo.getPageEnd());// 结束行

		inMap.put("personnelType", personnelType);
		inMap.put("districtCode", districtCode);
		inMap.put("streetCode", streetCode);
		inMap.put("communityCode", communityCode);
		inMap.put("certType", certType);
		inMap.put("cardCodeBright", cardCodeBright);
		inMap.put("mobile", mobile);
		inMap.put("realName", realName);
		inMap.put("startTime", startTime);
		inMap.put("endTime", endTime);
		inMap.put("cmmtyType", cmmtyType);
		inMap.put("pageBegin", pageBegin);
		inMap.put("pageEnd", pageEnd);

		List<TCHealthCodeAdminExt> retMapList = this.tcHealthCodeAdminService
				.selectByPage(inMap);

		int count = this.tcHealthCodeAdminService.countByExampleAndPage(inMap);

		List<CheckerMgmtVo> listVO = new ArrayList<CheckerMgmtVo>();

		for (TCHealthCodeAdminExt bo : retMapList) {
			CheckerMgmtVo retVo = new CheckerMgmtVo();
			retVo.setCardCodeBright(bo.getCardCodeBright());
			retVo.setCertType(bo.getCertType());
			retVo.setCertTypeName("身份证");
			String communityId = bo.getCommunityId();
			if (StringUtils.isNotEmpty(communityId)) {
				TCHealthCommunityInfo healthCommunityInfo = this.tcHealthCommunityInfoService
						.selectByPrimaryKey(communityId);
				if (null != healthCommunityInfo) {
					String code = healthCommunityInfo.getCommunityCode();
					String grade = healthCommunityInfo.getGrade();
					String name = healthCommunityInfo.getCommunityName();
					if (!"1".equals(grade)) {
						TCHealthCommunityInfo cumunInfo = this
								.getHealthCommunityInfoByCommunityCode(code,
										grade);
						if (null != cumunInfo) {
							String cumunInfoPID = cumunInfo.getpId();
							String cumunInfoGrade = cumunInfo.getGrade();
							String cumunInfoCode = cumunInfo.getCommunityCode();
							String cumunInfoName = cumunInfo.getCommunityName();
							if ("2".equals(cumunInfoGrade)) {// 区域
								retVo.setDistrictCode(cumunInfoCode);
								retVo.setDistrict(cumunInfoName);
							} else if ("3".equals(cumunInfoGrade)) {// 街道
								retVo.setStreetCode(cumunInfoCode);
								retVo.setStreet(cumunInfoName);
								// 区域信息
								TCHealthCommunityInfo retDistrictInfo = getHealthCommunityInfoByCode(cumunInfoPID);
								if (null != retDistrictInfo) {
									retVo.setDistrictCode(retDistrictInfo
											.getCommunityCode());
									retVo.setDistrict(retDistrictInfo
											.getCommunityName());
								}
							} else {// 社区
								retVo.setCommunityCode(code);
								retVo.setCommunity(name);
								// 处理街道
								TCHealthCommunityInfo streetInfo = getHealthCommunityInfoByCode(cumunInfoPID);
								if (null != streetInfo) {
									retVo.setStreetCode(streetInfo
											.getCommunityCode());
									retVo.setStreet(streetInfo
											.getCommunityName());
									String retDistrictCode = streetInfo
											.getpId();
									// 区域信息
									TCHealthCommunityInfo retDistrictInfo = getHealthCommunityInfoByCode(retDistrictCode);
									if (null != retDistrictInfo) {
										retVo.setDistrictCode(retDistrictInfo
												.getCommunityCode());
										retVo.setDistrict(retDistrictInfo
												.getCommunityName());
									}
								}

							}
						}
					}
				}
			}
			retVo.setId(bo.getId());
			retVo.setRealName(bo.getRealName());
			retVo.setMobile(bo.getMobile());
			Date createTime = bo.getCreateTime();
			Date updateTime = bo.getUpdateTime();
			if (null != createTime) {
				retVo.setCreateTime(DateUtil.date2Str(createTime));
			}
			if (null != updateTime) {
				retVo.setUpdateTime(DateUtil.date2Str(updateTime));
			}
			retVo.setPersonnelType(bo.getPersonnelType());
			retVo.setCmmtyType(bo.getCmmtyType());
			retVo.setCommuityName(bo.getCommuityName());
			listVO.add(retVo);
		}
		return RestUtils.wrappQueryResult(listVO, count);
	}

	/**
	 * 
	 * @Description: 删除
	 * @Title: delete
	 * @Author: Hanson
	 * @Create Date: 2020年2月25日 下午5:57:23
	 * @History: 2020年2月25日 下午5:57:23 Hanson Created.
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/del/{id}")
	@ItemResponseBody
	public WrappedResult delete(@PathVariable("id") String id) throws Exception {
		int index = this.tcHealthCodeAdminService.deleteByPrimaryKey(id);
		return new WrappedResult(true, index, null);
	}

	/**
	 * 
	 * @Description: 编辑界面
	 * @Title: addOrEdit
	 * @Author: Hanson
	 * @Create Date: 2020年2月25日 下午5:59:40
	 * @History: 2020年2月25日 下午5:59:40 Hanson Created.
	 *
	 * @param request
	 * @param id
	 * @return
	 *
	 */
	@RequestMapping("/edit")
	public String addOrEditPage(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id) {

		CheckerMgmtVo eidtVo = new CheckerMgmtVo();
		if (StringUtils.isNotEmpty(id)) {// 编辑
			eidtVo.setId(id);
			TCHealthCodeAdmin healthCodeAdmin = tcHealthCodeAdminService
					.selectByPrimaryKey(id);
			String communityId = healthCodeAdmin.getCommunityId();
			if (StringUtils.isNotEmpty(communityId)) {
				TCHealthCommunityInfo communityInfo = this.tcHealthCommunityInfoService
						.selectByPrimaryKey(communityId);
				if (null != communityInfo) {
					String communityCode = communityInfo.getCommunityCode();// 社区编码
					eidtVo.setCommunityCode(communityCode);
					String streetCode = communityInfo.getpId();// 街道编码
					eidtVo.setStreetCode(streetCode);
					TCHealthCommunityInfo streetInfo = this.getHealthCommunityInfoByCode(streetCode);
					if (null != streetInfo) {
						eidtVo.setDistrictCode(streetInfo.getpId());// 区域信息
					}
				}
			}
			eidtVo.setPersonnelType(healthCodeAdmin.getPersonnelType());
			eidtVo.setCardCodeBright(healthCodeAdmin.getCardCodeBright());
			eidtVo.setCertType(healthCodeAdmin.getCertType());
			eidtVo.setMobile(healthCodeAdmin.getMobile());
			eidtVo.setRealName(healthCodeAdmin.getRealName());
		}
		// 人员类型
		request.setAttribute("personalTypeList",
				CodeConstant.PERSONAL_TYPE_MAP_LIST);
		// 证件类型
		request.setAttribute("certTypeList", CodeConstant.CERT_TYPE_VALUE_MAP_LIST);
		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		request.setAttribute("checkerMgmtVoEditForm", eidtVo);
		return EDIT_PAGE;
	}

	/**
	 * 
	 * @Description: 提交方法
	 * @Title: submit
	 * @Author: Hanson
	 * @Create Date: 2020年2月25日 下午6:03:01
	 * @History: 2020年2月25日 下午6:03:01 Hanson Created.
	 *
	 * @param request
	 * @param id
	 * @return
	 *
	 */
	@RequestMapping("/saveOrUpdate")
	@ItemResponseBody
	public WrappedResult saveOrUpdate(@RequestBody CheckerMgmtVo vo) {
		String id = vo.getId();
		if ("-1".equals(id)) {// 新增
			TCHealthCodeAdmin healthCodeAdmin = new TCHealthCodeAdmin();
			String cardCode = vo.getCardCodeBright();
			healthCodeAdmin.setCardCodeBright(cardCode);//明文
			healthCodeAdmin.setCardCode(Md5Utils.signature(cardCode));//密文
			healthCodeAdmin.setCardCodeHide(CardCodeUtil.desensitizedIdNumber(cardCode));// 脱敏
			healthCodeAdmin.setCertType(vo.getCertType());
			healthCodeAdmin.setCreateTime(new Date());
			healthCodeAdmin.setMobile(vo.getMobile());
			healthCodeAdmin.setRealName(vo.getRealName());
			healthCodeAdmin.setUpdateTime(new Date());
			healthCodeAdmin.setAdminType("1");
			//healthCodeAdmin.setIsSpecial("1");
			healthCodeAdmin.setPersonnelType(vo.getPersonnelType());
			String communityCode = null;
			if(vo.getPersonnelType().equals("区管理员")){
				communityCode =	vo.getDistrictCode();				
			}else if(vo.getPersonnelType().equals("街道管理员")){
				communityCode =	vo.getStreetCode();				
			}else{
				communityCode =	vo.getCommunityCode();
			}
			TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
			TCHealthCommunityInfoCriteria.Criteria criteria = example
					.createCriteria();
			criteria.andCommunityCodeEqualTo(communityCode);
			List<TCHealthCommunityInfo> healthCommunityInfoList = this.tcHealthCommunityInfoService
					.selectByExample(example);
			if(CollectionUtils.isEmpty(healthCommunityInfoList)){
				return new WrappedResult(false, 0, "社区编码错误!");
			}
			TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
					.get(0);
			if (null != healthCommunityInfo) {
				healthCodeAdmin.setCommunityId(healthCommunityInfo.getId());
			}
			try {
				TCHealthCodeAdminCriteria exampleAd = new TCHealthCodeAdminCriteria();
				TCHealthCodeAdminCriteria.Criteria criteriaAd = exampleAd
						.createCriteria();
				criteriaAd.andMobileEqualTo(vo.getMobile());
				criteriaAd.andCommunityIdEqualTo(healthCommunityInfo.getId());
				int index = this.tcHealthCodeAdminService
						.countByCriteria(exampleAd);
				if (index > 0) {
					return new WrappedResult(true, index, "审核员重复添加!");
				}
				long idwk = idWorker.nextId();
				String str = idwk + "";
				healthCodeAdmin.setId(str);
				index = this.tcHealthCodeAdminService
						.insertSelective(healthCodeAdmin);
				System.out.println("审核员信息新增成功");
				return new WrappedResult(true, healthCodeAdmin.getId(),
						"审核员信息新增成功!");
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false, -1, "审核员信息新增失败!");
			}
		} else {// 编辑
			TCHealthCodeAdmin healthCodeAdmin = this.tcHealthCodeAdminService
					.selectByPrimaryKey(id);
			String cardCode = vo.getCardCodeBright();
			healthCodeAdmin.setCardCodeBright(cardCode);//明文
			healthCodeAdmin.setCardCode(Md5Utils.signature(cardCode));//密文
			healthCodeAdmin.setCardCodeHide(CardCodeUtil.desensitizedIdNumber(cardCode));// 脱敏
			healthCodeAdmin.setCertType(vo.getCertType());
			healthCodeAdmin.setMobile(vo.getMobile());
			healthCodeAdmin.setRealName(vo.getRealName());
			healthCodeAdmin.setUpdateTime(new Date());
			healthCodeAdmin.setAdminType("1");
			String communityCode = vo.getCommunityCode();
			healthCodeAdmin.setPersonnelType(vo.getPersonnelType());
			if (StringUtils.isNotEmpty(communityCode)) {
				TCHealthCommunityInfo healthCommunityInfo = getHealthCommunityInfoByCode(communityCode);
				if (null != healthCommunityInfo) {
					healthCodeAdmin.setCommunityId(healthCommunityInfo.getId());
				}
			}
			try {
				this.tcHealthCodeAdminService
						.updateByPrimaryKeySelective(healthCodeAdmin);
				return new WrappedResult(true, healthCodeAdmin.getId(),
						"审核员信息更新成功!");
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false, -1, "审核员信息更新失败!");
			}
		}

	}

	/**
	 * 
	 * @Description: 初始化文件导入界面
	 * @Title: addOrEditPage
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 下午2:29:07
	 * @History: 2020年2月26日 下午2:29:07 Hanson Created.
	 *
	 * @param request
	 * @return
	 *
	 */
	@RequestMapping("/initImport")
	public String addOrEditPage(HttpServletRequest request) {
		CheckerMgmtVo vo = new CheckerMgmtVo();
		request.setAttribute("templetAddForm", vo);
		return INIT_IMPORT;
	}

	/**
	 * 
	 * @Description: 模版下载
	 * @Title: getTemplateFilePath
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 下午2:20:19
	 * @History: 2020年2月26日 下午2:20:19 Hanson Created.
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 *
	 */
	@RequestMapping("/download")
	public void getTemplateFilePath(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		InputStream input = this.getClass().getResourceAsStream(
				"/config/templates/Checker.xlsx");
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="
				+ URLEncoder.encode("社区审核员表.xlsx", "UTF-8"));
		OutputStream fileOutputStream = response.getOutputStream();
		IOUtils.copy(input, fileOutputStream);
	}

	/**
	 * 
	 * @Description: 文件导入
	 * @Title: fileImport
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 下午2:31:21
	 * @History: 2020年2月26日 下午2:31:21 Hanson Created.
	 *
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping(value = "/fileImport")
	@ItemResponseBody
	public WrappedResult fileImport(HttpServletRequest request,
			HttpServletResponse response)throws Exception {
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
			try{
				InputStream in = excelfile.getInputStream();
				return this.tcHealthCodeAdminService.importExcel(in, size,
						originalFilename, originalFileType);
			}catch (Exception e) {
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

	/**
	 * 级联下拉框
	 * 
	 * @param pId
	 * @param level
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/changeCode", method = RequestMethod.POST)
	@ItemResponseBody
	public QueryResultObject changeCode(@RequestParam String pId,
			@RequestParam String level, HttpServletRequest request) {

		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		example.setOrderByClause("community_code");
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
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
	 * 根据Code,级别获取社区信息
	 * 
	 * @param code
	 *            编码
	 * @param grade
	 *            级别
	 * @return
	 */
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

	/**
	 * 根据Code获取社区信息
	 * 
	 * @param code
	 * @return
	 */
	private TCHealthCommunityInfo getHealthCommunityInfoByCode(String code) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
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
	protected CheckerMgmtVo initCondition() {
		return new CheckerMgmtVo();
	}

	@RequestMapping(value = "/checkerComQuery")
	@ItemResponseBody
	public QueryResultObject comQuery(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		CheckerMgmtVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		inMap.put("id", vo.getId());
		inMap.put("pageBegin", (String.valueOf(vo.getPageBegin()).equals("0")?"1":String.valueOf(vo.getPageBegin())));
		inMap.put("pageEnd",(String.valueOf(vo.getPageEnd()).equals("0")?"20":String.valueOf(vo.getPageEnd())));
		List<TCCommuity> list = tcCommunityService.selectByChecker(inMap);
		Integer count = tcCommunityService.countByChecker(inMap);

		return RestUtils.wrappQueryResult(list, count);
	}

	@SuppressWarnings("all")
	@RequestMapping("/saveCheckerComRelate")
	@ItemResponseBody
	public WrappedResult saveVercomRelate(@RequestBody Map params) {
		String id = params.get("id").toString();
		List<String> paramList = (ArrayList<String>) params.get("commuityIds");
		List<TCCommuityCheckerRela> list = new ArrayList<TCCommuityCheckerRela>();
		for (String tcc : paramList) {
			TCCommuityCheckerRela tc = new TCCommuityCheckerRela();
			tc.setCheckerId(id);
			tc.setCommuityId(tcc);
			tc.setRelaId(idWorker.nextId() + "");
			list.add(tc);
		}
		Integer index = tcCommunityCheckerService.insertByBatch(list);
		return new WrappedResult(true, index, "新增小区成功!");
	}

	@SuppressWarnings("all")
	@RequestMapping("/delCheckercomRelate")
	@ItemResponseBody
	public WrappedResult delVercomRelate(@RequestBody Map params) {
		String id = params.get("id").toString();
		List<String> paramList = (ArrayList<String>) params.get("commuityIds");
		List<TCCommuityCheckerRela> list = new ArrayList<TCCommuityCheckerRela>();
		for (String tcc : paramList) {
			TCCommuityCheckerRela tc = new TCCommuityCheckerRela();
			tc.setCheckerId(id);
			tc.setCommuityId(tcc);
			list.add(tc);
		}
		Integer index = tcCommunityCheckerService.deleteByBatch(list);
		return new WrappedResult(true, index, "删除小区成功!");
	}

}
