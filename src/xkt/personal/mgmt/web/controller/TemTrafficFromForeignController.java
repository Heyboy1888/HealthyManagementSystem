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

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import xkt.personal.mgmt.service.ITrafficForeignService;
import xkt.personal.mgmt.web.vo.TrafficForeignVo;

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
 * @ClassName: TemTrafficFromForeignController
 * @Description: 国外旅游回锡人员管理
 * @author: zyf
 * @date: 2020年4月15日 上午9:35:22
 *
 */
@Controller
@RequestMapping("/temTrafficFromForeignController")
public class TemTrafficFromForeignController extends
		QueryController<TrafficForeignVo> {

	public static final String PATH_INIT = "/personal/mgmt/trafficForeign/trafficForeignMain";
	public static final String PATH_UPLOAD_INIT = "/personal/mgmt/trafficForeign/trafficForeignImport";

	@ServiceAutowired
	private I18n il8n;

	@ServiceAutowired
	private ITrafficForeignService trafficForeignService;

	/**
	 * 
	 * @Title: init
	 * @Description:
	 * @Author: zyf
	 * @Create Date: 2020年4月15日 上午9:38:28
	 * @History: 2020年4月15日 上午9:38:28 ls-700725 Created.
	 *
	 * @param request
	 * @return
	 *
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request) {
		TrafficForeignVo vo = new TrafficForeignVo();
		List<CodeBO> codeColourNameList = il8n.getAllStandardCodes(
				"XKM_CODECOLOUR", request);
		vo.setCodeColourName("0");
		DateTime dateTime = new DateTime();
		vo.setCreateTime(dateTime.toString("yyyy-MM-dd"));
		request.setAttribute("codeColourNameList", codeColourNameList);
		request.setAttribute("trafficForeignForm", vo);
		return PATH_INIT;
	}

	/**
	 * 
	 * @Title: query
	 * @Description: 根据码颜色和时间查询国外旅游回锡人员
	 * @Author: zyf
	 * @Create Date: 2020年4月15日 下午2:33:41
	 * @History: 2020年4月15日 下午2:33:41 ls-700725 Created.
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/query")
	@ItemResponseBody
	public QueryResultObject query(
			@QueryRequestParam("params") RequestCondition params)
			throws Exception {
		String pageNum = params.getPageNum();
		if(pageNum.indexOf(".") != -1){
			pageNum = pageNum.substring(0,pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		TrafficForeignVo vo = this.rCondition2QCondition(params);
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		List<TrafficForeignVo> list = new ArrayList<TrafficForeignVo>();
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("pageBegin", vo.getPageBegin()); // 开始页码
		inMap.put("pageEnd", vo.getPageEnd()); // 结束页码
		inMap.put("codeColourName", vo.getCodeColourName());
		inMap.put("date", vo.getCreateTime());
		resultList = trafficForeignService.queryByTime(inMap);
		int count = trafficForeignService.countByTime(vo.getCreateTime(),
				vo.getCodeColourName());
		for (Map<String, Object> map : resultList) {
			TrafficForeignVo vo1 = new TrafficForeignVo();
			BeanUtils.populate(vo1, map);
			list.add(vo1);
		}
		return RestUtils.wrappQueryResult(list, count);
	}

	/**
	 * 
	 * @Title: deleteByDateRed
	 * @Description: 根据日期删除红码
	 * @Author: zyf
	 * @Create Date: 2020年4月15日 下午2:40:13
	 * @History: 2020年4月15日 下午2:40:13 ls-700725 Created.
	 *
	 * @param date
	 * @return
	 *
	 */
	@RequestMapping("/delRedCode")
	@ItemResponseBody
	public WrappedResult deleteByDateRed(String date) {
		WrappedResult wrappedResult = new WrappedResult();
		int count = 0;
		count = trafficForeignService.deleteByTimeAndType(date, 3);
		if (count > 0) {
			wrappedResult.setSuccessful(true);
			wrappedResult.setResultHint("红码删除成功");
		} else {
			wrappedResult.setResultHint("删除失败");
		}
		return wrappedResult;
	}

	/**
	 * 
	 * @Title: deleteByDateYellow
	 * @Description: 根据日期删除黄码
	 * @Author: zyf
	 * @Create Date: 2020年4月15日 下午3:00:09
	 * @History: 2020年4月15日 下午3:00:09 ls-700725 Created.
	 *
	 * @param date
	 * @return
	 *
	 */
	@RequestMapping("/delYellowCode")
	@ItemResponseBody
	public WrappedResult deleteByDateYellow(String date) {
		System.out.println(date.substring(5));
		WrappedResult wrappedResult = new WrappedResult();
		int count = 0;
		count = trafficForeignService.deleteByTimeAndType(date, 2);
		if (count > 0) {
			wrappedResult.setSuccessful(true);
			wrappedResult.setResultHint("黄码删除成功");
		} else {
			wrappedResult.setResultHint("删除失败");
		}
		return wrappedResult;
	}
	/**
	 * 
	 * @Title: uploadInit
	 * @Description: 根据类型跳转导入红码或者黄码页面
	 * @Author: zyf               
	 * @Create Date: 2020年4月17日 下午2:18:27
	 * @History: 2020年4月17日 下午2:18:27 ls-700725 Created.
	 *
	 * @param request
	 * @param type
	 * @return
	 *
	 */
	@RequestMapping("/codeUpload")
	public String uploadInit(HttpServletRequest request,String type){
		TrafficForeignVo vo = new TrafficForeignVo();
		vo.setCodeColour(type);
		request.setAttribute("templetAddForm", vo);
		return PATH_UPLOAD_INIT;
	}
	
	@RequestMapping("/redCodeUpload")
	@ItemResponseBody
	public WrappedResult redCodeUpload(HttpServletRequest request,
			HttpServletResponse response,String codeColour) {
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
		Iterator<String> itr = multiRequest.getFileNames();
		MultipartFile excelfile = multiRequest.getFile((String) itr.next());
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
				return this.trafficForeignService
						.importExcel(in, size, originalFilename,
								originalFileType,Integer.parseInt(codeColour));
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
	 * @Title: getTemplateFilePath
	 * @Description: 国外拉红模板下载
	 * @Author: zyf               
	 * @Create Date: 2020年4月15日 下午5:30:31
	 * @History: 2020年4月15日 下午5:30:31 ls-700725 Created.
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 *
	 */
	@RequestMapping("/downloadRedCode")
	public void getTemplateFilePathRed(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		SimpleDateFormat sdf=new SimpleDateFormat("MMdd");
        Date date=new Date();
        String str=sdf.format(date);
		InputStream input = this.getClass().getResourceAsStream(
				"/config/templates/foreign.xlsx");
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="+str+"-"+ URLEncoder.encode("国外拉红.xlsx", "UTF-8"));
		OutputStream fileOutputStream = response.getOutputStream();
		IOUtils.copy(input, fileOutputStream);
	}
	/**
	 * 
	 * @Title: getTemplateFilePathYellow
	 * @Description: 国外拉黄模板下载
	 * @Author: zyf               
	 * @Create Date: 2020年4月15日 下午5:37:23
	 * @History: 2020年4月15日 下午5:37:23 ls-700725 Created.
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 *
	 */
	@RequestMapping("/downloadYellowCode")
	public void getTemplateFilePathYellow(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		SimpleDateFormat sdf=new SimpleDateFormat("MMdd");
        Date date=new Date();
        String str=sdf.format(date);
		InputStream input = this.getClass().getResourceAsStream(
				"/config/templates/foreign.xlsx");
		response.setContentType("application/excel;charset=utf-8");
		response.setHeader("content-disposition", "attachment;filename="+str+"-"+ URLEncoder.encode("国外拉黄.xlsx", "UTF-8"));
		OutputStream fileOutputStream = response.getOutputStream();
		IOUtils.copy(input, fileOutputStream);
	}

	@Override
	protected TrafficForeignVo initCondition() {

		return new TrafficForeignVo();
	}
}
