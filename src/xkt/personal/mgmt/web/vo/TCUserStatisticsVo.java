package xkt.personal.mgmt.web.vo;

import java.io.Serializable;

import eeos.sp.core.base.vo.EBaseVo;

public class TCUserStatisticsVo extends EBaseVo  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 报表时间
     */
	
    private String reportDate;

    /**
     * 区县
     */
    private String currentDistrict;

    /**
     * 累计申报数
     */
    private String applyTotal;

    /**
     * 申报数今日新增数
     */
    private String applyAdd;

    /**
     * 累计非户籍人员数
     */
    private String applyOutToday;

    /**
     * 昨日待审核数
     */
    private String nocheckYday;

    /**
     * 模型推送
     */
    private String modelPush;

    /**
     * 研判分析
     */
    private String techAnalysis;

    /**
     * 高风险地区人员
     */
    private String highRiskUser;

    /**
     * 中风险地区人员
     */
    private String midRiskUser;

    /**
     * 国外旅游回锡人员(当天)
     */
    private String trafficeForeign;

    /**
     * 核为绿码人数(当天)
     */
    private String checkGreen;

    /**
     * 核为红码人数(当天)
     */
    private String checkRed;

    /**
     * 核为黄码人数(当天)
     */
    private String checkYellow;

    /**
     * 现有待审核数(累计)
     */
    private String nocheckTotal;

    /**
     * 待审核核为绿码数
     */
    private String nochek2Green;

    /**
     * 现有红码数
     */
    private String red;

    /**
     * 现有黄码数
     */
    private String yellow;

    /**
     * 绿码核为红码数今日数
     */
    private String green2RedToday;
    
    /**
     * 审核员
     */
    private String auditor;

    /**
     * 验证员
     */
    private String verifier;

    /**
     * 验证次数
     */
    private String sweepCnt;

    /**
     * 验证新增次数
     */
    private String sweepCntAdd;

    /**
     * 红码外出数
     */
    private String redOut;

    /**
     * 黄码外出数
     */
    private String yellowOut;
    /**
     * 企业扫码总数
     */
    private String entSweepCnt;
    /**
     * 企业扫码新增数
     */
    private String entSweepAdd;

	public String getReportDate() {
		return reportDate== null ? " " : reportDate.trim();
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate== null ? " " : reportDate.trim();
	}

	public String getCurrentDistrict() {
		return currentDistrict== null ? " " : currentDistrict.trim();
	}

	public void setCurrentDistrict(String currentDistrict) {
		this.currentDistrict = currentDistrict== null ? " " : currentDistrict.trim();
	}

	public String getApplyTotal() {
		return applyTotal== null ? " " : applyTotal.trim();
	}

	public void setApplyTotal(String applyTotal) {
		this.applyTotal = applyTotal== null ? " " : applyTotal.trim();
	}

	public String getApplyAdd() {
		return applyAdd== null ? " " : applyAdd.trim();
	}

	public void setApplyAdd(String applyAdd) {
		this.applyAdd = applyAdd== null ? " " : applyAdd.trim();
	}

	public String getApplyOutToday() {
		return applyOutToday== null ? " " : applyOutToday.trim();
	}

	public void setApplyOutToday(String applyOutToday) {
		this.applyOutToday = applyOutToday== null ? " " : applyOutToday.trim();
	}

	public String getNocheckYday() {
		return nocheckYday== null ? " " : nocheckYday.trim();
	}

	public void setNocheckYday(String nocheckYday) {
		this.nocheckYday = nocheckYday== null ? " " : nocheckYday.trim();
	}

	public String getModelPush() {
		return modelPush== null ? " " : modelPush.trim();
	}

	public void setModelPush(String modelPush) {
		this.modelPush = modelPush== null ? " " : modelPush.trim();
	}

	public String getTechAnalysis() {
		return techAnalysis== null ? " " : techAnalysis.trim();
	}

	public void setTechAnalysis(String techAnalysis) {
		this.techAnalysis = techAnalysis== null ? " " : techAnalysis.trim();
	}

	public String getHighRiskUser() {
		return highRiskUser== null ? " " : highRiskUser.trim();
	}

	public void setHighRiskUser(String highRiskUser) {
		this.highRiskUser = highRiskUser== null ? " " : highRiskUser.trim();
	}

	public String getMidRiskUser() {
		return midRiskUser== null ? " " : midRiskUser.trim();
	}

	public void setMidRiskUser(String midRiskUser) {
		this.midRiskUser = midRiskUser== null ? " " : midRiskUser.trim();
	}

	public String getTrafficeForeign() {
		return trafficeForeign== null ? " " : trafficeForeign.trim();
	}

	public void setTrafficeForeign(String trafficeForeign) {
		this.trafficeForeign = trafficeForeign== null ? " " : trafficeForeign.trim();
	}

	public String getCheckGreen() {
		return checkGreen== null ? " " : checkGreen.trim();
	}

	public void setCheckGreen(String checkGreen) {
		this.checkGreen = checkGreen== null ? " " : checkGreen.trim();
	}

	public String getCheckRed() {
		return checkRed== null ? " " : checkRed.trim();
	}

	public void setCheckRed(String checkRed) {
		this.checkRed = checkRed== null ? " " : checkRed.trim();
	}

	public String getCheckYellow() {
		return checkYellow== null ? " " : checkYellow.trim();
	}

	public void setCheckYellow(String checkYellow) {
		this.checkYellow = checkYellow== null ? " " : checkYellow.trim();
	}

	public String getNocheckTotal() {
		return nocheckTotal== null ? " " : nocheckTotal.trim();
	}

	public void setNocheckTotal(String nocheckTotal) {
		this.nocheckTotal = nocheckTotal== null ? " " : nocheckTotal.trim();
	}

	public String getNochek2Green() {
		return nochek2Green== null ? " " : nochek2Green.trim();
	}

	public void setNochek2Green(String nochek2Green) {
		this.nochek2Green = nochek2Green== null ? " " : nochek2Green.trim();
	}

	public String getRed() {
		return red== null ? " " : red.trim();
	}

	public void setRed(String red) {
		this.red = red== null ? " " : red.trim();
	}

	public String getYellow() {
		return yellow== null ? " " : yellow.trim();
	}

	public void setYellow(String yellow) {
		this.yellow = yellow== null ? " " : yellow.trim();
	}

	public String getGreen2RedToday() {
		return green2RedToday== null ? " " : green2RedToday.trim();
	}

	public void setGreen2RedToday(String green2RedToday) {
		this.green2RedToday = green2RedToday== null ? " " : green2RedToday.trim();
	}

	public String getAuditor() {
		return auditor== null ? " " : auditor.trim();
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor== null ? " " : auditor.trim();
	}

	public String getVerifier() {
		return verifier== null ? " " : verifier.trim();
	}

	public void setVerifier(String verifier) {
		this.verifier = verifier== null ? " " : verifier.trim();
	}

	public String getSweepCnt() {
		return sweepCnt== null ? " " : sweepCnt.trim();
	}

	public void setSweepCnt(String sweepCnt) {
		this.sweepCnt = sweepCnt== null ? " " : sweepCnt.trim();
	}

	public String getSweepCntAdd() {
		return sweepCntAdd== null ? " " : sweepCntAdd.trim();
	}

	public void setSweepCntAdd(String sweepCntAdd) {
		this.sweepCntAdd = sweepCntAdd== null ? " " : sweepCntAdd.trim();
	}

	public String getRedOut() {
		return redOut== null ? " " : redOut.trim();
	}

	public void setRedOut(String redOut) {
		this.redOut = redOut== null ? " " : redOut.trim();
	}

	public String getYellowOut() {
		return yellowOut== null ? " " : yellowOut.trim();
	}

	public void setYellowOut(String yellowOut) {
		this.yellowOut = yellowOut== null ? " " : yellowOut.trim();
	}

	public String getEntSweepCnt() {
		return entSweepCnt== null ? " " : entSweepCnt.trim();
	}

	public void setEntSweepCnt(String entSweepCnt) {
		this.entSweepCnt = entSweepCnt== null ? " " : entSweepCnt.trim();
	}

	public String getEntSweepAdd() {
		return entSweepAdd== null ? " " : entSweepAdd.trim();
	}

	public void setEntSweepAdd(String entSweepAdd) {
		this.entSweepAdd = entSweepAdd== null ? " " : entSweepAdd.trim();
	}
    
    
	
}