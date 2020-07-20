package xkt.personal.mgmt.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import xkt.personal.mgmt.bo.TCHealthSiteUserRela;
import xkt.personal.mgmt.bo.TCHealthSiteUserRelaExample;
import xkt.personal.mgmt.service.ITCHealthSiteUserRelaService;
import xkt.personal.mgmt.utils.IdWorker;
import xkt.personal.mgmt.web.vo.SiteUserRelaVo;

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
 * 站点管理员
 * 
 * @author Hanson
 *
 */
@Controller
@RequestMapping("/siteUserRelaController")
public class SiteUserRelaController extends QueryController<SiteUserRelaVo> {

	private static final String INIT_PAGE = "/personal/mgmt/siteUserRela/siteUserRelaMain";

	private static final String EDIT_PAGE = "/personal/mgmt/siteUserRela/siteUserRelaEdit";

	private static final String INIT_IMPORT = "/personal/mgmt/siteUserRela/addFile";

	// 注入标准代码service
	@ServiceAutowired
	private I18n codeService;

	@ServiceAutowired
	private ITCHealthSiteUserRelaService tcHealthSiteUserRelaService;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 界面初始化
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		SiteUserRelaVo vo = new SiteUserRelaVo();
		request.setAttribute("SiteUserRelaForm", vo);
		List<CodeBO> statusBoList = codeService.getAllStandardCodes(
				"XKM_ApplyStatus", request);
		request.setAttribute("statusList", statusBoList);
		List<CodeBO> userTypeList = codeService.getAllStandardCodes(
				"XKM_siteUserType", request);
		request.setAttribute("userTypeList", userTypeList);

		return INIT_PAGE;
	}

	/**
	 * 查询方法
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		String pageNum = params.getPageNum();
		if (pageNum.indexOf(".") != -1) {
			pageNum = pageNum.substring(0, pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		SiteUserRelaVo vo = this.rCondition2QCondition(params);
		Map<String, String> inMap = new HashMap<String, String>();
		inMap.put("siteName", vo.getSiteName());
		inMap.put("siteCode", vo.getSiteCode());
		inMap.put("userType", vo.getUserType());
		inMap.put("userName", vo.getUserName());
		inMap.put("phone", vo.getPhone());
		inMap.put("flag", vo.getFlag());
		inMap.put("startTime", vo.getCreateTimeFrom());
		inMap.put("endTime", vo.getCreateTimeTo());
		inMap.put("pageBegin", String.valueOf(vo.getPageBegin()));
		inMap.put("pageEnd", String.valueOf(vo.getPageEnd()));
		List<TCHealthSiteUserRela> retBoList = this.tcHealthSiteUserRelaService
				.selectByPage(inMap);
		int count = this.tcHealthSiteUserRelaService.countByExamplePage(inMap);

		List<SiteUserRelaVo> retVoList = new ArrayList<SiteUserRelaVo>();

		for (TCHealthSiteUserRela retBo : retBoList) {
			SiteUserRelaVo retVo = new SiteUserRelaVo();
			retVo.setId(retBo.getId());
			retVo.setFlag(retBo.getFlag());
			retVo.setPhone(retBo.getPhone());
			retVo.setSiteCode(retBo.getSiteCode());
			retVo.setSiteName(retBo.getSiteName());
			retVo.setUserName(retBo.getUserName());
			retVo.setUserType(retBo.getUserType());
			retVo.setCreateTime(date2Str(retBo.getCreateTime()));
			retVo.setUpdateTime(date2Str(retBo.getUpdateTime()));
			retVoList.add(retVo);
		}

		return RestUtils.wrappQueryResult(retVoList, count);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/del/{id}")
	@ItemResponseBody
	public WrappedResult delete(@PathVariable("id") String id) throws Exception {
		int index = this.tcHealthSiteUserRelaService.deleteByPrimaryKey(id);
		return new WrappedResult(true, index, null);
	}

	/**
	 * 新增或编辑界面
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/edit")
	public String addOrEditPage(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id) {
		SiteUserRelaVo eidtVo = new SiteUserRelaVo();
		if (StringUtils.isNotEmpty(id)) {// 编辑
			eidtVo.setId(id);
			TCHealthSiteUserRela healthSiteUserRela = tcHealthSiteUserRelaService
					.selectByPrimaryKey(id);
			eidtVo.setId(healthSiteUserRela.getId());
			eidtVo.setFlag(healthSiteUserRela.getFlag());
			eidtVo.setPhone(healthSiteUserRela.getPhone());
			eidtVo.setSiteCode(healthSiteUserRela.getSiteCode());
			eidtVo.setSiteName(healthSiteUserRela.getSiteName());
			eidtVo.setUserName(healthSiteUserRela.getUserName());
			eidtVo.setUserType(healthSiteUserRela.getUserType());
		}
		List<CodeBO> statusBoList = codeService.getAllStandardCodes(
				"XKM_ApplyStatus", request);
		request.setAttribute("statusList", statusBoList);
		List<CodeBO> userTypeList = codeService.getAllStandardCodes(
				"XKM_siteUserType", request);
		request.setAttribute("userTypeList", userTypeList);
		request.setAttribute("SiteUserRelaEditForm", eidtVo);
		return EDIT_PAGE;
	}

	/**
	 * 新增或编辑提交方法
	 * 
	 * @param vo
	 * @return
	 */
	@RequestMapping("/saveOrUpdate")
	@ItemResponseBody
	public WrappedResult saveOrUpdate(@RequestBody SiteUserRelaVo vo) {
		String id = vo.getId();
		if ("-1".equals(id)) {// 新增
			TCHealthSiteUserRela record = new TCHealthSiteUserRela();
			try {
				TCHealthSiteUserRelaExample example = new TCHealthSiteUserRelaExample();
				TCHealthSiteUserRelaExample.Criteria criteria = example
						.createCriteria();
				String phone = vo.getPhone();
				criteria.andPhoneEqualTo(phone);
				// 手机号已存在
				int index = this.tcHealthSiteUserRelaService
						.countByExample(example);
				if (index > 0) {
					return new WrappedResult(true, index, "手机号:" + phone
							+ "已被使用");
				}
				id = idWorker.nextStrId();
				record.setId(id);
				record.setPhone(phone);
				record.setFlag(vo.getFlag());
				record.setSiteCode(vo.getSiteCode());
				record.setSiteName(vo.getSiteName());
				record.setUserName(vo.getUserName());
				record.setUserType(vo.getUserType());
				record.setCreateTime(new Date());
				record.setUpdateTime(new Date());
				index = tcHealthSiteUserRelaService.addSelective(record);
				if (index == 1) {
					return new WrappedResult(true, record.getId(),
							"站点管理员信息新增成功!");
				} else {
					return new WrappedResult(false, index, "站点管理员信息新增失败!");
				}

			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false, -1, "站点管理员信息新增失败!");
			}
		} else {
			try {
				TCHealthSiteUserRelaExample example = new TCHealthSiteUserRelaExample();
				TCHealthSiteUserRelaExample.Criteria criteria = example
						.createCriteria();
				String phone = vo.getPhone();
				criteria.andPhoneEqualTo(phone);
				criteria.andIdNotEqualTo(id);
				int index = this.tcHealthSiteUserRelaService
						.countByExample(example);
				if (index > 0) {
					return new WrappedResult(true, index, "手机号:" + phone
							+ "已被使用");
				}
				TCHealthSiteUserRela healthSiteUserRela = tcHealthSiteUserRelaService
						.selectByPrimaryKey(id);
				healthSiteUserRela.setPhone(phone);
				healthSiteUserRela.setFlag(vo.getFlag());
				healthSiteUserRela.setSiteCode(vo.getSiteCode());
				healthSiteUserRela.setSiteName(vo.getSiteName());
				healthSiteUserRela.setUserName(vo.getUserName());
				healthSiteUserRela.setUserType(vo.getUserType());
				healthSiteUserRela.setUpdateTime(new Date());
				index = tcHealthSiteUserRelaService
						.updateByPrimaryKeySelective(healthSiteUserRela);
				if (index == 1) {
					return new WrappedResult(true, index, "站点管理员信息更新成功!");
				} else {
					return new WrappedResult(false, index, "站点管理员信息更新失败!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				return new WrappedResult(false, -1, "站点管理员信息更新失败!");
			}

		}
	}

	/**
	 * 初始化导入界面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/initImport")
	public String initImport(HttpServletRequest request) {
		SiteUserRelaVo vo = new SiteUserRelaVo();
		request.setAttribute("templetAddForm", vo);
		return INIT_IMPORT;
	}

	/**
	 * 模版下载
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/download")
	public void getTemplateFilePath(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		InputStream input = this.getClass().getResourceAsStream(
				"/config/templates/SiteUserRela.xlsx");
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="
				+ URLEncoder.encode("站点管理员表.xlsx", "UTF-8"));
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
				return this.tcHealthSiteUserRelaService.importExcel(in, size,
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

	@Override
	protected SiteUserRelaVo initCondition() {
		return new SiteUserRelaVo();
	}

	private String date2Str(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (null == date) {
			date = new Date();
		}
		return sdf.format(date);
	}
}
