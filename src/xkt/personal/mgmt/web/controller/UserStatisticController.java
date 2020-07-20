package xkt.personal.mgmt.web.controller;


import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import xkt.personal.mgmt.service.ITCHealthUserStatisticsService;
import xkt.personal.mgmt.utils.DateUtil;
import xkt.personal.mgmt.web.vo.TCUserStatisticsVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.object.WrappedResult;

@Controller
@RequestMapping(value = "/userStatisticController")
public class UserStatisticController{
	@ServiceAutowired
	private ITCHealthUserStatisticsService service;

	public static final String PATH_INIT = "/personal/mgmt/statistics/userStatistics";

	@RequestMapping("/init")
	public String init(Model model, HttpServletRequest request){
		TCUserStatisticsVo vo = new TCUserStatisticsVo();
		//默认昨天
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-1);//昨天
		Date yd=cal.getTime();
		vo.setReportDate(DateUtil.date2Str(yd));
		model.addAttribute("userStatisticForm", vo);
		return PATH_INIT;
	}
	/**
	 * 
	 * @Title: query
	 * @Description: 根据日期查询
	 * @Author: zyf               
	 * @Create Date: 2020年4月16日 上午11:22:54
	 * @History: 2020年4月16日 上午11:22:54 ls-700725 Created.
	 *
	 * @param params
	 * @param request
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping(value = "/query")
	@ItemResponseBody
	public WrappedResult query(@RequestBody Map<String, Object> params,
			HttpServletRequest request)
			throws Exception {
		String html = service.getStatisticHtml(params.get("reportDate").toString());
		return new WrappedResult(true, html, null);
	}
	
	/**
	 * 
	 * @Title: exportExl
	 * @Description: 导出为excel
	 * @Author: zyf               
	 * @Create Date: 2020年4月16日 上午11:23:08
	 * @History: 2020年4月16日 上午11:23:08 ls-700725 Created.
	 *
	 * @param request
	 * @param response
	 * @throws Exception
	 *
	 */
	@RequestMapping("/exportExl")
	public void exportExl(
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		OutputStream os  = null;
		String exportname = "锡康码人员情况统计表"+ "_" + System.currentTimeMillis();
		try {
			
			String statisticDate = request.getParameter("statisticDate");
			System.out.println(statisticDate);
			
			byte[] bytes = service.exportExl(statisticDate);
			exportname += ".xls";
			response.setContentType("application/vnd.ms-excel");
			response.setCharacterEncoding("utf-8");
			response.setHeader("Content-Disposition", "attachment; filename="
					+ java.net.URLEncoder.encode(exportname, "UTF-8") + "");
			os = response.getOutputStream();
			os.write(bytes);
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(os !=null){
				os.close();
			}
		}
	}
	
	/**
	 * 
	 * @Title: count
	 * @Description: 统计
	 * @Author: zyf               
	 * @Create Date: 2020年4月16日 下午2:25:39
	 * @History: 2020年4月16日 下午2:25:39 ls-700725 Created.
	 *
	 * @return
	 *
	 */
	@RequestMapping("/count")
	@ItemResponseBody
	public WrappedResult count(){
		WrappedResult result=new WrappedResult();
		try{
			service.countAll();
		}catch(Exception e){
			e.printStackTrace();
			result.setResultHint("统计失败");
			return result;
		}
		result.setSuccessful(true);
		result.setResultHint("统计成功");
		return result;
	}
}
