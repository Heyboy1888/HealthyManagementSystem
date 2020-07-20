package xkt.personal.mgmt.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;











import xkt.personal.mgmt.service.ITXkmYrReasonService;
import xkt.personal.mgmt.utils.CsvUtils;
import xkt.personal.mgmt.web.vo.TotalCheckInfoVo;
import xkt.personal.mgmt.web.vo.YrReasonVo;

import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.common.rest.annotation.ItemResponseBody;
import com.ls.pf.base.common.rest.annotation.QueryRequestParam;
import com.ls.pf.base.common.rest.object.QueryController;
import com.ls.pf.base.common.rest.object.QueryResultObject;
import com.ls.pf.base.common.rest.object.RequestCondition;
import com.ls.pf.base.common.rest.object.WrappedResult;
import com.ls.pf.base.common.rest.utils.RestUtils;


@Controller
@RequestMapping("/yrReasonController")
public class YrReasonController extends QueryController<YrReasonVo>{
	
	public static final String PATH_INIT ="/personal/mgmt/yrReason/yrReasonInit";
	
	@ServiceAutowired
	private ITXkmYrReasonService service;
	

	/**
	 * 初始化
	 * @param request
	 * @return
	 */
	@RequestMapping("/init")
	public String init(HttpServletRequest request){
		
		YrReasonVo vo =new YrReasonVo();
		
		request.setAttribute("yrReasonInformationForm",vo);
		
		return PATH_INIT;
	}
	
	/**
	 * 统计
	 * @return
	 */
	@RequestMapping("/count")
	@ItemResponseBody
	public WrappedResult count(){
		WrappedResult result=new WrappedResult();
		try {
			service.countAll();
		} catch (Exception e) {
			e.printStackTrace();
			result.setResultHint("统计失败");
			return result;
		}
		result.setSuccessful(true);
		result.setResultHint("统计成功");
		
		return result;
		
	}
	
	/**
	 * 查询
	 * @param dataType
	 * @param params
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@RequestMapping("/query/{dataType}") //鼠标点在第一个tab上就是01，第二个就是02
	@ItemResponseBody 
	public QueryResultObject query(@PathVariable("dataType") String dataType,
	 @QueryRequestParam("params") RequestCondition params,HttpServletResponse response) throws IllegalAccessException, InvocationTargetException{ //params为页面显示的数据，json格式
		

		String pageNum = params.getPageNum(); //当前页面
		if (pageNum.indexOf(".") != -1) {
			pageNum = pageNum.substring(0, pageNum.indexOf("."));
		}
		params.setPageNum(pageNum);
		//经过处理后的Vo
		YrReasonVo vo=this.rCondition2QCondition(params);
		Map<String, Object> inMap=new HashMap<String, Object>();
		inMap.put("userName", vo.getUserName());//获取前端页面上传的数据放入map中
		inMap.put("phone",vo.getPhone());
		inMap.put("certCode",vo.getCertCode());
		inMap.put("dataType", dataType);
		inMap.put("pageBegin", vo.getPageBegin());//当前页面起始行
		inMap.put("pageEnd", vo.getPageEnd());//当前页面结束行
		List<YrReasonVo> listVo = new ArrayList<YrReasonVo>();//准备空的Vo集合，装入所有Vo回显给页面
		List<Map<String, Object>> resList=service.queryYrReason(inMap);//查询出所有满足条件的数据
		//遍历每条数据
		for (Map<String, Object> map : resList) {
			if(("0").equals(map.get("isFromHb"))){
				map.put("isFromHb","否");
			}else{
				map.put("isFromHb","是");
			}
			YrReasonVo resVo=new YrReasonVo();//准备空的Vo
			BeanUtils.populate(resVo, map);//将map转换成vo并放入上面空的Vo中
			listVo.add(resVo);//添加入Vo集合中
		}
		int count =service.countYrReason(inMap);//计算出查询出符合条件数据的总条数;
		return RestUtils.wrappQueryResult(listVo, count);//将数据与总条数传给页面
		
	}
	/**s
	 * 文件导出
	 * @param userName
	 * @param phone
	 * @param certCode
	 * @param request
	 * @param response
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 * @throws IOException 
	 */
	@RequestMapping(value = "/fileExport", method = RequestMethod.GET)
	public void fileExport(@RequestParam(value="userName") String userName,@RequestParam(value="phone") String phone, @RequestParam(value="certCode") String certCode,@RequestParam("dataType")String dataType,
			HttpServletRequest request,HttpServletResponse response		
			) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException{
		
		
			
		
	
			Map<String, Object> inMap = new HashMap<String, Object>();
			inMap.put("dataType", dataType);
			if(StringUtils.isNotBlank(userName)&&(!"null".equals(userName))){
				inMap.put("userName",URLDecoder.decode(request.getParameter("userName").toString(), "UTF-8")); //().toString方法不能传null
			}
			
			
			if(StringUtils.isNotBlank(phone)&&(!"null".equals(phone))){
				inMap.put("phone",phone);
			}
			
			
			if(StringUtils.isNotBlank(certCode)&&(!"null".equals(certCode))){
				inMap.put("certCode",certCode);
			}
			
			int count =service.countYrReason(inMap);
			
			inMap.put("pageBegin", 1);
			inMap.put("pageEnd", count);
			


			List<Map<String, Object>> list=service.queryYrReason(inMap);
			
			
			List<Map> retVoList = new ArrayList<Map>();
			for(Map<String, Object> ele:list){
				String str=(String) ele.get("certCode");
				String s ="\t"+str;
				ele.put("certCode", s);
				if(("0").equals(ele.get("isFromHb"))){
					ele.put("isFromHb","否");
				}else{
					ele.put("isFromHb","是");
				}
				
				
				YrReasonVo resVo=new YrReasonVo();
				BeanUtils.populate(resVo, ele);
				Map map = BeanUtils.describe(resVo);
				retVoList.add(map);
			}
		
		

		
		String[] tatil={"姓名","手机号码","身份证号","锡康码健康状态","到锡时间","是否来自湖北","出发地","是否14日内接触过新冠肺炎确诊或疑似病例","户籍地","行政划区","街道","社区","小区/新村/路名",
				         "详细地址","是否发烧","是否14日内是否湖北停留或与归来人员接触","14日之内是否有旅行史","往返地","是否定点医院隔离治疗的确认病人疑似病人","是否实施居家观察未满14天的感染者",
				         "是否定点医疗机构隔离医学观察的无症状感染者","红黄码原因","申码时间"};
		
		String[] keys={"userName","phone","certCode","isHealthy","arriveWxDate","isFromHb","departureAddr","isTwoWeekVirus"
			,"householdName","currentDistrict",	"currentStreet","currentCommunity","housingName","liveAddress","isHot","isStay",
			"twoWeekTravel","roundTripName","isIsolaVirusPsn","isCureVirusPsn","isObserVirusPsn","reason","createTime"};
		response.setContentType("application/csv;charset=utf-8");
		response.setHeader("Content-disposition", "attachment; filename="
				+ URLEncoder.encode("红黄码原因表.csv", "UTF-8"));
		ServletOutputStream out = response.getOutputStream();
		CsvUtils.createCSV(retVoList, tatil, keys, out);
	}
	
	
	
	
	@Override
	public YrReasonVo initCondition() {
		// TODO Auto-generated method stub
		return new YrReasonVo();
	}
	

}
