package xkt.personal.mgmt.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import xkt.personal.mgmt.bo.TCHealthCommunityInfo;
import xkt.personal.mgmt.bo.TCHealthCommunityInfoCriteria;
import xkt.personal.mgmt.dao.statistic.TCHealthUserStatisticsDao;
import xkt.personal.mgmt.service.ITCHealthCommunityInfoService;
import xkt.personal.mgmt.service.ITCHealthUserStatisticsService;
import xkt.personal.mgmt.utils.TableToXls;
import xkt.personal.mgmt.web.vo.TCUserStatisticsVo;

import com.ls.pf.base.api.framework.Service;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.framework.ServiceType;

@Service(target = { ServiceType.APPLICATION }, value = "tcHealthUserStatisticsService")
public class TCHealthUserStatisticsService implements
		ITCHealthUserStatisticsService {
	@Autowired
	TCHealthUserStatisticsDao dao;
	// @ServiceAutowired
	// private ITGRegionCatalogService tgRegionCatalogService;

	@ServiceAutowired
	private ITCHealthCommunityInfoService tcHealthCommunityInfoService;

	public String getStatisticHtml(String statisticsDate) throws Exception {
		StringBuffer html = new StringBuffer();
		html.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"> \n");
		html.append("<html> \n");
		html.append("<head><style type='text/css'> \n");
		html.append("td,th {font-style: normal;font-weight: normal;text-align: center;} \n");
		html.append("tr {height: 40px;} \n");
		html.append(".sumTr {font-weight: 700;} \n");
		html.append(".firstHead,.twoHead,.threeHead {height: 30px;} \n");
		html.append("firstHead th {font-size: 14px;font-weight: bold;} \n");
		// html.append("table tbody td {width: 6.3%} \n");
		html.append("table tbody tr {height: 42px;} \n");
		html.append("</style> </head> \n");
		html.append("<body> \n");
		html.append("<table border='1' cellspacing='0' cellpadding='10' width=100% border-color=#D8DFE6> \n");
		html.append("<thead>");
		html.append("<tr class='firstHead'>");
		html.append("<th colspan='26' style='font-size: 25px'>");
		html.append("锡康码每日统计表");
		html.append("</th>");
		html.append("</tr>");
		html.append("<tr class='secondHead'>");
		html.append("<th colspan='1' rowspan='3' width='4%' style='background-color:#9BC2E6'>地区</th>");
		html.append("<th colspan='3' rowspan='1' style='background-color:#DDEBF6' >注册人数</th>");
		html.append("<th colspan='10' rowspan='1'style='background-color:#FCE4D6' >待审核人数(含红和黄)</th>");
		html.append("<th colspan='1' rowspan='3' style='background-color:#BFBFBF' width='4%'>待审核为绿码人数</th>");
		html.append("<th colspan='1' rowspan='3' style='background-color:#BFBFBF' width='4%'>现有红码人数</th>");
		html.append("<th colspan='1' rowspan='3' style='background-color:#BFBFBF' width='4%'>现有黄码	人数</th>");
		html.append("<th colspan='1' rowspan='3' style='background-color:#BFBFBF' width='3%'>绿码核为红码人数</th>");
		html.append("<th colspan='2' rowspan='1' style='background-color:#E2EFDA' >已授权</th>");
		html.append("<th colspan='6' rowspan='1' style='background-color:#FFF2CC' >验证人次</th>");
		html.append("</tr>");
		html.append("<tr  class='thirdHead'>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#DDEBF6' width='4%'>现有数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#DDEBF6' width='4%'>新增数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#DDEBF6' width='4%'>累计非户籍人员数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>昨日待审核数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>模型推送</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>研判分析</th>");

		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>高风险地区人员</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>中风险地区人员</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='3%'>国外旅游回锡人员</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>核为绿码人数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>核为红码人数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>核为黄码人数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FCE4D6' width='4%'>现有待审核数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#E2EFDA' width='4%'>审核人员数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#E2EFDA' width='4%'>验证人员数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FFF2CC' width='4%'>累计次数(锡康码)</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FFF2CC' width='4%'>新增次数(锡康码)</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FFF2CC' width='4%'>累计次数(企业码)</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FFF2CC' width='4%'>新增次数(企业码)</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FFF2CC' width='3%'>红码外出人数</th>");
		html.append("<th colspan='1' rowspan='2' style='background-color:#FFF2CC' width='3%'>黄码外出人数</th>");
		
		html.append("</tr>");
		html.append("</thead>");
		html.append("<tbody>");
		html.append("<tr hidden='true'>");									//不知道为什么第一行不换行先给个空的第一行
		html.append("</tr>");
		List<Map<String, Object>> statisticInfo = dao
				.queryStatistic(statisticsDate);
		List<TCUserStatisticsVo> voList = new ArrayList<TCUserStatisticsVo>();
		
		
			for (Map<String, Object> map : statisticInfo) {
				TCUserStatisticsVo vo = new TCUserStatisticsVo();
				BeanUtils.populate(vo, map);
				voList.add(vo);
			}
		
		
		for (TCUserStatisticsVo tmp : voList) {
			if (tmp == null) {
				continue;
			}
			html.append("<tr> \n");
			// html.append("<td>"+getDistrictNameByVal(tmp.getDistrict())+"</td> \n");
			html.append("<td>" + tmp.getCurrentDistrict() + "</td> \n");
			html.append("<td>" + tmp.getApplyTotal() + "</td> \n");
			html.append("<td>" + tmp.getApplyAdd() + "</td> \n");
			html.append("<td>" + tmp.getApplyOutToday() + "</td> \n");
			/*
			 * BigDecimal regs = new
			 * BigDecimal(tmp.getRegisters()==null?"0":tmp.getRegisters());
			 * BigDecimal nonNts = new
			 * BigDecimal(tmp.getNonNatives()==null?"0":tmp.getNonNatives());
			 * if(regs.intValue()!=0&&nonNts.divide(nonNts,4,
			 * RoundingMode.HALF_UP).doubleValue()>0.4){
			 * html.append("<td><font color='#FF0000'>"
			 * +tmp.getNonNatives()+"</font></td> \n"); }else{
			 * html.append("<td>"+tmp.getNonNatives()+"</td> \n"); }
			 */
			html.append("<td>" + tmp.getNocheckYday() + "</td> \n");
			html.append("<td>" + tmp.getModelPush() + "</td> \n");
			/*
			 * html.append("<td>"+(tmp.getRedCodeModeadds()==null?"---":tmp.
			 * getRedCodeModeadds())+"</td> \n");
			 * html.append("<td>"+(tmp.getRedCodeTecadds
			 * ()==null?"---":tmp.getRedCodeTecadds())+"</td> \n");
			 */

			html.append("<td>" + tmp.getTechAnalysis() + "</td> \n");
			html.append("<td>" + tmp.getHighRiskUser() + "</td> \n");
			html.append("<td>" + tmp.getMidRiskUser() + "</td> \n");
			html.append("<td>" + tmp.getTrafficeForeign() + "</td> \n");
			html.append("<td>" + tmp.getCheckGreen() + "</td> \n");
			html.append("<td>" + tmp.getCheckRed() + "</td> \n");
			html.append("<td>" + tmp.getCheckYellow() + "</td> \n");
			html.append("<td>" + tmp.getNocheckTotal() + "</td> \n");
			html.append("<td>" + tmp.getNochek2Green() + "</td> \n");
			html.append("<td>" + tmp.getRed() + "</td> \n");
			html.append("<td>" + tmp.getYellow() + "</td> \n");
			html.append("<td>" + tmp.getGreen2RedToday() + "</td> \n");
			html.append("<td>" + tmp.getAuditor() + "</td> \n");
			html.append("<td>" + tmp.getVerifier() + "</td> \n");
			html.append("<td>" + tmp.getSweepCnt() + "</td> \n");
			html.append("<td>" + tmp.getSweepCntAdd() + "</td> \n");
			html.append("<td>" + tmp.getEntSweepCnt() + "</td> \n");
			html.append("<td>" + tmp.getEntSweepAdd() + "</td> \n");
			html.append("<td>" + tmp.getRedOut() + "</td> \n");
			html.append("<td>" + tmp.getYellowOut() + "</td> \n");
			html.append("</tr> \n");
		}
		/*
		 * Map<String,Object> sumMap = dao.queryStatisticSum(bo);
		 * if(sumMap!=null){ html.append("<tr bgcolor='#E1FFFF'>\n");
		 * html.append("<td>全市</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("registersSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("tdRegistersSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("nonNativesSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("redCodesSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("redCodeTdaddsSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +(sumMap.get("redCodeModeaddsSum"
		 * )==null?"---":sumMap.get("redCodeModeaddsSum"))+"</td> \n");
		 * html.append
		 * ("<td style='font-weight:bold;'>"+(sumMap.get("redCodeTecaddsSum"
		 * )==null?"---":sumMap.get("redCodeTecaddsSum"))+"</td> \n");
		 * html.append
		 * ("<td style='font-weight:bold;'>"+sumMap.get("redCodeHubeiSum"
		 * )+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"+sumMap.get
		 * ("redCodeP1c22TdaddsSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("redCodeCheckedSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("redCodeUncheckSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("redToGreenSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("greenToRedSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("verifierRegistersSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("checkerRegistersSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("tdVerifersSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("verifersSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("redOutsSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("inhomeDividesSum")+"</td> \n");
		 * html.append("<td style='font-weight:bold;'>"
		 * +sumMap.get("inhomeDividesApplysSum")+"</td> \n");
		 * html.append("</tr> \n"); }
		 */
		html.append("</tbody>");
		html.append("</table>");
		html.append("</html>");
		return html.toString();
	};

	public byte[] exportExl(String statisticsDate) throws Exception {
		return TableToXls.process(this.getStatisticHtml(statisticsDate));
	}

	public String getDistrictNameByVal(String value) throws Exception {
		TCHealthCommunityInfoCriteria example = new TCHealthCommunityInfoCriteria();
		TCHealthCommunityInfoCriteria.Criteria criteria = example
				.createCriteria();
		example.setOrderByClause("id");
		criteria.andGradeEqualTo("2");
		criteria.andCommunityCodeEqualTo(value);
		List<TCHealthCommunityInfo> healthCommunityInfoList = this.tcHealthCommunityInfoService
				.selectByExample(example);
		if (!CollectionUtils.isEmpty(healthCommunityInfoList)) {
			TCHealthCommunityInfo healthCommunityInfo = healthCommunityInfoList
					.get(0);
			return healthCommunityInfo.getCommunityName();
		}
		return value;
	}

	@Override
	public void countAll() {

		dao.callProcedure();
	}

	@Override
	public List<Map<String, Object>> queryYrTodayCount(Map<String, Object> arg0) {
		return dao.queryYrTodayCount(arg0);
	}
}