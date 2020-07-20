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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import xkt.personal.mgmt.bo.TCCommuity;
import xkt.personal.mgmt.bo.TCCommuityVerifierRela;
import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelate;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateCriteria;
import xkt.personal.mgmt.bo.TCHealthUserCommunityRelateExt;
import xkt.personal.mgmt.service.ITCCommuityVerifierRelaService;
import xkt.personal.mgmt.service.ITCCommunityService;
import xkt.personal.mgmt.service.ITCHealthCodeSweepRecordService;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthUserCommunityRelateService;
import xkt.personal.mgmt.utils.CodeConstant;
import xkt.personal.mgmt.utils.DateUtil;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.web.vo.CheckerMgmtVo;
import xkt.personal.mgmt.web.vo.VerifierMgmtVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.common.rest.utils.RestUtils;

import eeos.sp.core.base.util.EEOSBusinessException;

/**
 * 
 * @Description: 核验员管理
 * @ClassName: VerifierMgmtController
 * @author: Hanson
 * @date: 2020年2月25日 下午5:20:31
 *
 */
@Controller
@RequestMapping("/verifierMgmtController")
public class VerifierMgmtController extends QueryController<VerifierMgmtVo> {

	private static final String INIT_PAGE = "/personal/mgmt/verifier/verifierMain";

	private static final String EDIT_PAGE = "/personal/mgmt/verifier/verifierEdit";

	private static final String INIT_IMPORT = "/personal/mgmt/verifier/addFile";

	@ServiceAutowired
	private ITCHealthUserCommunityRelateService tcHealthUserCommunityRelateService;
	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;
	@ServiceAutowired
	private ITCCommunityService tcCommunityService;
	@ServiceAutowired
	private ITCHealthCodeSweepRecordService healthCodeSweepRecordService;

	@ServiceAutowired
	ITCCommuityVerifierRelaService tcCommunityVerifierService;

	@Autowired
	private IdWorker idWorker;

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
		VerifierMgmtVo vo = new VerifierMgmtVo();
		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		// 小区分类
		request.setAttribute("commtyTypeList", CodeConstant.CMMTY_TYPE_MAP_LIST);
		request.setAttribute("isNotCodeList", CodeConstant.IS_NOT_MAP_LIST);
		
		request.setAttribute("verifierMgmtForm", vo);
		return INIT_PAGE;
	}

	/**
	 * 
	 * @Description: 根据条件查询核验员信息
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
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		VerifierMgmtVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();

		String communityID = null;
		String districtCode = vo.getDistrictCode();
		String streetCode = vo.getStreetCode();
		String communityCode = vo.getCommunityCode();
		if (StringUtils.isNotEmpty(communityCode)) {
			communityID = getcommunityIdByCode(communityCode);
		}
		String communityCodeNew = vo.getCommunityCodeNew();
		if (StringUtils.isNotEmpty(communityCodeNew)) {
			communityID = getcommunityIdByCode(communityCodeNew);
		}

		inMap.put("districtCode", districtCode);
		inMap.put("streetCode", streetCode);
		inMap.put("communityCode", communityCode);
		inMap.put("communityID", communityID);
		inMap.put("mobile", vo.getMobile());
		inMap.put("cmmtyType", vo.getCmmtyType());
		inMap.put("extAttr1", vo.getExtAttr1());
		inMap.put("relaName", vo.getRelaName());
		inMap.put("startTime", vo.getCreateTimeFrom());
		inMap.put("endTime", vo.getCreateTimeTo());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));

		List<TCHealthUserCommunityRelateExt> retBoList = this.tcHealthUserCommunityRelateService
				.selectByPage(inMap);
		
		int count = this.tcHealthUserCommunityRelateService
				.countByExampleAndPage(inMap);
		
		List<VerifierMgmtVo> listVO = new ArrayList<VerifierMgmtVo>();
		for (TCHealthUserCommunityRelateExt retBo : retBoList) {
			VerifierMgmtVo retVo = new VerifierMgmtVo();
			retVo.setId(retBo.getId());
			retVo.setRelaName(retBo.getRealName());
			retVo.setMobile(retBo.getMobile());
			retVo.setCmmtyType(retBo.getCmmtyType());
			retVo.setCommuityName(retBo.getCommuityName());
			retVo.setExtAttr1(retBo.getExtAttr1());
			retVo.setExtAttr2(retBo.getExtAttr2());
			retVo.setExtAttr3(retBo.getExtAttr3());
			Date createTime = retBo.getCreateTime();
			Date updateTime = retBo.getUpdateTime();
			if (null != createTime) {
				retVo.setCreateTime(DateUtil.date2Str(createTime));
			}
			if (null != updateTime) {
				retVo.setUpdateTime(DateUtil.date2Str(updateTime));
			}
			String communityId = retBo.getCommunityId();
			if (StringUtils.isNotEmpty(communityId)) {
				TCHealthCommunityInfo healthCommunityInfo = this.tcHealthCommunityInfoService
						.selectByPrimaryKey(communityId);
				if (healthCommunityInfo != null) {
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
									retVo.setDistrictCode(retDistrictInfo.getCommunityCode());
									retVo.setDistrict(retDistrictInfo.getCommunityName());
								}
							} else {// 社区
								retVo.setCommunityCode(code);
								retVo.setCommunity(name);
								// 处理街道
								TCHealthCommunityInfo streetInfo = getHealthCommunityInfoByCode(cumunInfoPID);
								if (null != streetInfo) {
									retVo.setStreetCode(streetInfo.getCommunityCode());
									retVo.setStreet(streetInfo.getCommunityName());
									String retDistrictCode = streetInfo.getpId();
									// 区域信息
									TCHealthCommunityInfo retDistrictInfo = getHealthCommunityInfoByCode(retDistrictCode);
									if (null != retDistrictInfo) {
										retVo.setDistrictCode(retDistrictInfo.getCommunityCode());
										retVo.setDistrict(retDistrictInfo.getCommunityName());
									}
								}
							}
						}
					}
				}
			}
			listVO.add(retVo);
		}
		return RestUtils.wrappQueryResult(listVO, count);
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/del/{id}/{phone}")
	@ItemResponseBody
	public WrappedResult delete(@PathVariable("id") String id,
								@PathVariable("phone") String phone
			) throws Exception {
		WrappedResult wrappedResult = new WrappedResult();
		int flag =0;
		try{
			flag = healthCodeSweepRecordService.deleteCheckerIfNotExists(id, phone);
		}catch(Exception e){
			flag=-2;
		}
		if (flag == 1) {
			wrappedResult.setSuccessful(true);
			wrappedResult.setResultHint("验证员删除成功");
		} else {
			wrappedResult.setSuccessful(false);
			if (flag == 0) {
				wrappedResult.setResultHint("验证员存在扫码信息无法删除");
			} else {
				
				wrappedResult.setResultHint("验证员删除失败");
			}
		}
		return wrappedResult;
	}

	/**
	 * 编辑页面跳转
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/edit")
	public String addOrEditPage(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id) {
		VerifierMgmtVo eidtVo = new VerifierMgmtVo();
		if (StringUtils.isNotEmpty(id)) {// 编辑
			TCHealthUserCommunityRelate healthUserCommunityRelate = this.tcHealthUserCommunityRelateService
					.selectByPrimaryKey(id);
			String communityId = healthUserCommunityRelate.getCommunityId();
			if(StringUtils.isNotEmpty(communityId)){
				TCHealthCommunityInfo communityInfo = this.tcHealthCommunityInfoService
						.selectByPrimaryKey(communityId);
				if(null !=communityInfo){
					String communityCode = communityInfo.getCommunityCode();// 社区编码
					eidtVo.setCommunityCode(communityCode);
					String streetCode = communityInfo.getpId();// 街道编码
					eidtVo.setStreetCode(streetCode);
					TCHealthCommunityInfo streetInfo =  this.getHealthCommunityInfoByCode(streetCode);
					if(null != streetInfo){
						eidtVo.setDistrictCode(streetInfo.getpId());
					}
				}
			}
			eidtVo.setId(id);
			eidtVo.setMobile(healthUserCommunityRelate.getMobile());
			eidtVo.setRelaName(healthUserCommunityRelate.getRealName());
			eidtVo.setExtAttr1(healthUserCommunityRelate.getExtAttr1());
			eidtVo.setExtAttr2(healthUserCommunityRelate.getExtAttr2());
			eidtVo.setExtAttr3(healthUserCommunityRelate.getExtAttr3());
		}

		// 区域
		request.setAttribute("districtCodeList", getCodeList(null, "2"));
		// 街道
		request.setAttribute("streetCodeList", getCodeList(null, "3"));
		// 社区
		request.setAttribute("communityCodeList", getCodeList(null, "4"));
		request.setAttribute("verifierMgmtVoEditForm", eidtVo);
		request.setAttribute("isNotCodeList", CodeConstant.IS_NOT_MAP_LIST);
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
	public WrappedResult saveOrUpdate(@RequestBody VerifierMgmtVo vo) {
		String id = vo.getId();
		if ("-1".equals(id)) {// 新增
			TCHealthUserCommunityRelate healthUserCommunityRelate = new TCHealthUserCommunityRelate();
			healthUserCommunityRelate.setExtAttr1(vo.getExtAttr1());
			healthUserCommunityRelate.setExtAttr2(vo.getExtAttr2());
			healthUserCommunityRelate.setExtAttr3(vo.getExtAttr3());
			healthUserCommunityRelate.setCreateTime(new Date());
			healthUserCommunityRelate.setUpdateTime(new Date());
			String communityCode = vo.getCommunityCode();
			String communityId = this.getcommunityIdByCode(communityCode);
			healthUserCommunityRelate.setCommunityId(communityId);
			healthUserCommunityRelate.setMobile(vo.getMobile());
			healthUserCommunityRelate.setRealName(vo.getRelaName());

			try {
				TCHealthUserCommunityRelateCriteria example = new TCHealthUserCommunityRelateCriteria();
				TCHealthUserCommunityRelateCriteria.Criteria criteria = example
						.createCriteria();
				criteria.andCommunityIdEqualTo(communityId);
				criteria.andMobileEqualTo(vo.getMobile());
				int index = this.tcHealthUserCommunityRelateService
						.countByExample(example);
				if (index > 0) {
					return new WrappedResult(true, index, "核验员重复添加!");
				}
				long idwk = idWorker.nextId();
				String str = idwk + "";
				healthUserCommunityRelate.setId(str);
				index = this.tcHealthUserCommunityRelateService
						.insertSelective(healthUserCommunityRelate);
				return new WrappedResult(true,
						healthUserCommunityRelate.getId(), "核验员信息新增成功!");
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false, -1, "核验员信息新增失败!");
			}

		} else {// 编辑
			TCHealthUserCommunityRelate healthUserCommunityRelate = this.tcHealthUserCommunityRelateService
					.selectByPrimaryKey(id);
			healthUserCommunityRelate.setExtAttr1(vo.getExtAttr1());
			healthUserCommunityRelate.setExtAttr2(vo.getExtAttr2());
			healthUserCommunityRelate.setExtAttr3(vo.getExtAttr3());
			healthUserCommunityRelate.setUpdateTime(new Date());
			String communityCode = vo.getCommunityCode();
			String communityId = this.getcommunityIdByCode(communityCode);
			healthUserCommunityRelate.setCommunityId(communityId);
			healthUserCommunityRelate.setMobile(vo.getMobile());
			healthUserCommunityRelate.setRealName(vo.getRelaName());
			try {
				this.tcHealthUserCommunityRelateService
						.updateByPrimaryKeySelective(healthUserCommunityRelate);
				return new WrappedResult(true,
						healthUserCommunityRelate.getId(), "核验员信息更新成功!");
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false, -1, "核验员信息更新失败!");
			}
		}
	}

	/**
	 * 
	 * @Description: 初始化导入界面
	 * @Title: addOrEditPage
	 * @Author: Hanson
	 * @Create Date: 2020年2月26日 下午11:45:59
	 * @History: 2020年2月26日 下午11:45:59 Hanson Created.
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
				"/config/templates/Verifier.xlsx");
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="
				+ URLEncoder.encode("社区验证员表.xlsx", "UTF-8"));
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
			HttpServletResponse response) throws Exception {
		WrappedResult result = new WrappedResult();
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
			InputStream in = excelfile.getInputStream();
			try {
				return this.tcHealthUserCommunityRelateService.importExcel(in, size,
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

	private String getcommunityIdByCode(String code) {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		criteria.andCommunityCodeEqualTo(code);
		List<TCHealthCommunityInfo> healthCommunityInfoList = this.tcHealthCommunityInfoService
				.selectByExample(example);

		if (CollectionUtils.isEmpty(healthCommunityInfoList)) {
			return "";
		}
		TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
				.get(0);
		return healthCommunityInfo.getId();
	}

	@Override
	protected VerifierMgmtVo initCondition() {
		return new VerifierMgmtVo();
	}

	@RequestMapping(value = "/VerifycomQuery")
	@ItemResponseBody
	public QueryResultObject comQuery(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		VerifierMgmtVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		inMap.put("id", vo.getId());
		inMap.put("pageBegin", (String.valueOf(vo.getPageBegin()).equals("0")?"1":String.valueOf(vo.getPageBegin())));
		inMap.put("pageEnd",(String.valueOf(vo.getPageEnd()).equals("0")?"20":String.valueOf(vo.getPageEnd())));
		List<TCCommuity> list = tcCommunityService.selectByVerify(inMap);
		Integer count = tcCommunityService.countByVerify(inMap);

		return RestUtils.wrappQueryResult(list, count);
	}

	@RequestMapping("/saveVercomRelate")
	@ItemResponseBody
	@SuppressWarnings("all")
	public WrappedResult saveVercomRelate(@RequestBody Map params) {
		String id = params.get("id").toString();
		List<String> paramList = (ArrayList<String>) params.get("commuityIds");
		List<TCCommuityVerifierRela> list = new ArrayList<TCCommuityVerifierRela>();
		for (String tcc : paramList) {
			TCCommuityVerifierRela tc = new TCCommuityVerifierRela();
			tc.setVerifierId(id);
			tc.setCommuityId(tcc);
			tc.setRelaId(idWorker.nextId() + "");
			list.add(tc);
		}
		Integer index = tcCommunityVerifierService.insertByBatch(list);
		return new WrappedResult(true, index, "新增小区成功!");
	}

	@RequestMapping("/delVercomRelate")
	@ItemResponseBody
	@SuppressWarnings("all")
	public WrappedResult delVercomRelate(@RequestBody Map params) {
		String id = params.get("id").toString();
		List<String> paramList = (ArrayList<String>) params.get("commuityIds");
		List<TCCommuityVerifierRela> list = new ArrayList<TCCommuityVerifierRela>();
		for (String tcc : paramList) {
			TCCommuityVerifierRela tc = new TCCommuityVerifierRela();
			tc.setVerifierId(id);
			tc.setCommuityId(tcc);
			list.add(tc);
		}
		Integer index = tcCommunityVerifierService.deleteByBatch(list);
		return new WrappedResult(true, index, "删除小区成功!");
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

}
