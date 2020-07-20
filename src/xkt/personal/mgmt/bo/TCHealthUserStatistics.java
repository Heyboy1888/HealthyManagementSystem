package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthUserStatistics implements Serializable {
    private Integer id;

    /**
     * 行政区域
     */
    private String area;

    /**
     * 注册人数-现有数
     */
    private String registerNow;

    /**
     * 注册人数-新增数
     */
    private String registerToday;

    /**
     * 注册人数-累计非户籍人员数
     */
    private String registerNonNative;

    /**
     * 红码待审核-昨日待审核数
     */
    private String redCodeYesterday;

    /**
     * 红码待审核-模型推送
     */
    private String redCodeModeadds;

    /**
     * 红码待审核-研判分析
     */
    private String redCodeTecadds;

    /**
     * 红码待审核-高风险地区人员
     */
    private String redCodeHight;

    /**
     * 红码待审核-中风险地区人员
     */
    private String redCodeMiddle;

    /**
     * 红码待审核-国外旅游回锡人员
     */
    private String redCodeForeign;

    /**
     * 红码待审核-核为绿码人数
     */
    private String redCodeCheckedGreen;

    /**
     * 红码待审核-核为红码人数
     */
    private String redCodeCheckedRed;

    /**
     * 红码待审核-核为黄码人数
     */
    private String redCodeCheckedYellow;

    /**
     * 红码待审核-现有待审核数
     */
    private String redCodeUncheck;

    /**
     * 待审核核为绿码人数
     */
    private String redCodeUncheckGreen;

    /**
     * 现有红码人数
     */
    private String redCodeRedNow;

    /**
     * 现有黄码人数
     */
    private String redCodeYellowNow;

    /**
     * 今日绿码核为红码人数
     */
    private String greenToRed;

    /**
     * 已授权-审核员人数
     */
    private String acceptAuditor;

    /**
     * 已授权-验证员人数
     */
    private String acceptVerifier;

    /**
     * 验证人次-累计次数
     */
    private String verifiAll;

    /**
     * 验证人次-新增次数
     */
    private String verifiAdd;

    /**
     * 验证人次-红码外出人数
     */
    private String verifiRedOut;

    /**
     * 验证人次-黄码外出人数
     */
    private String verifiYellowOut;

    /**
     * 数据统计时间(页面需要展示:2020-03-28 00:00:00)
     */
    private Date statisticsDate;

    /**
     * 红码已审核总人数(页面需要,表格没有)
     */
    private String redCodeChecked;

    /**
     * 预留属性1
     */
    private String preAttr1;

    /**
     * 预留属性2
     */
    private String preAttr2;

    /**
     * 预留属性3
     */
    private String preAttr3;

    /**
     * 预留属性4
     */
    private String preAttr4;

    /**
     * 预留属性5
     */
    private String preAttr5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area== null ? " " : area.trim();
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRegisterNow() {
        return registerNow== null ? " " : registerNow.trim();
    }

    public void setRegisterNow(String registerNow) {
        this.registerNow = registerNow == null ? null : registerNow.trim();
    }

    public String getRegisterToday() {
        return registerToday== null ? " " : registerToday.trim();
    }

    public void setRegisterToday(String registerToday) {
        this.registerToday = registerToday == null ? null : registerToday.trim();
    }

    public String getRegisterNonNative() {
        return registerNonNative== null ? " " : registerNonNative.trim();
    }

    public void setRegisterNonNative(String registerNonNative) {
        this.registerNonNative = registerNonNative == null ? null : registerNonNative.trim();
    }

    public String getRedCodeYesterday() {
        return redCodeYesterday== null ? " " : redCodeYesterday.trim();
    }

    public void setRedCodeYesterday(String redCodeYesterday) {
        this.redCodeYesterday = redCodeYesterday == null ? null : redCodeYesterday.trim();
    }

    public String getRedCodeModeadds() {
        return redCodeModeadds== null ? " " : redCodeModeadds.trim();
    }

    public void setRedCodeModeadds(String redCodeModeadds) {
        this.redCodeModeadds = redCodeModeadds == null ? null : redCodeModeadds.trim();
    }

    public String getRedCodeTecadds() {
        return redCodeTecadds== null ? " " : redCodeTecadds.trim();
    }

    public void setRedCodeTecadds(String redCodeTecadds) {
        this.redCodeTecadds = redCodeTecadds == null ? null : redCodeTecadds.trim();
    }

    public String getRedCodeHight() {
        return redCodeHight== null ? " " : redCodeHight.trim();
    }

    public void setRedCodeHight(String redCodeHight) {
        this.redCodeHight = redCodeHight == null ? null : redCodeHight.trim();
    }

    public String getRedCodeMiddle() {
        return redCodeMiddle== null ? " " : redCodeHight.trim();
    }

    public void setRedCodeMiddle(String redCodeMiddle) {
        this.redCodeMiddle = redCodeMiddle == null ? null : redCodeMiddle.trim();
    }

    public String getRedCodeForeign() {
        return redCodeForeign== null ? " " : redCodeForeign.trim();
    }

    public void setRedCodeForeign(String redCodeForeign) {
        this.redCodeForeign = redCodeForeign == null ? null : redCodeForeign.trim();
    }

    public String getRedCodeCheckedGreen() {
        return redCodeCheckedGreen== null ? " " : redCodeCheckedGreen.trim();
    }

    public void setRedCodeCheckedGreen(String redCodeCheckedGreen) {
        this.redCodeCheckedGreen = redCodeCheckedGreen == null ? null : redCodeCheckedGreen.trim();
    }

    public String getRedCodeCheckedRed() {
        return redCodeCheckedRed== null ? " " : redCodeCheckedRed.trim();
    }

    public void setRedCodeCheckedRed(String redCodeCheckedRed) {
        this.redCodeCheckedRed = redCodeCheckedRed == null ? null : redCodeCheckedRed.trim();
    }

    public String getRedCodeCheckedYellow() {
        return redCodeCheckedYellow== null ? " " : redCodeCheckedYellow.trim();
    }

    public void setRedCodeCheckedYellow(String redCodeCheckedYellow) {
        this.redCodeCheckedYellow = redCodeCheckedYellow == null ? null : redCodeCheckedYellow.trim();
    }

    public String getRedCodeUncheck() {
        return redCodeUncheck== null ? " " : redCodeUncheck.trim();
    }

    public void setRedCodeUncheck(String redCodeUncheck) {
        this.redCodeUncheck = redCodeUncheck == null ? null : redCodeUncheck.trim();
    }

    public String getRedCodeUncheckGreen() {
        return redCodeUncheckGreen== null ? " " : redCodeUncheckGreen.trim();
    }

    public void setRedCodeUncheckGreen(String redCodeUncheckGreen) {
        this.redCodeUncheckGreen = redCodeUncheckGreen == null ? null : redCodeUncheckGreen.trim();
    }

    public String getRedCodeRedNow() {
        return redCodeRedNow== null ? " " : redCodeRedNow.trim();
    }

    public void setRedCodeRedNow(String redCodeRedNow) {
        this.redCodeRedNow = redCodeRedNow == null ? null : redCodeRedNow.trim();
    }

    public String getRedCodeYellowNow() {
        return redCodeYellowNow== null ? " " : redCodeYellowNow.trim();
    }

    public void setRedCodeYellowNow(String redCodeYellowNow) {
        this.redCodeYellowNow = redCodeYellowNow == null ? null : redCodeYellowNow.trim();
    }

    public String getGreenToRed() {
        return greenToRed== null ? " " : greenToRed.trim();
    }

    public void setGreenToRed(String greenToRed) {
        this.greenToRed = greenToRed == null ? null : greenToRed.trim();
    }

    public String getAcceptAuditor() {
        return acceptAuditor== null ? " " : acceptAuditor.trim();
    }

    public void setAcceptAuditor(String acceptAuditor) {
        this.acceptAuditor = acceptAuditor == null ? null : acceptAuditor.trim();
    }

    public String getAcceptVerifier() {
        return acceptVerifier== null ? " " : acceptVerifier.trim();
    }

    public void setAcceptVerifier(String acceptVerifier) {
        this.acceptVerifier = acceptVerifier == null ? null : acceptVerifier.trim();
    }

    public String getVerifiAll() {
        return verifiAll== null ? " " : verifiAll.trim();
    }

    public void setVerifiAll(String verifiAll) {
        this.verifiAll = verifiAll == null ? null : verifiAll.trim();
    }

    public String getVerifiAdd() {
        return verifiAdd== null ? " " : verifiAdd.trim();
    }

    public void setVerifiAdd(String verifiAdd) {
        this.verifiAdd = verifiAdd == null ? null : verifiAdd.trim();
    }

    public String getVerifiRedOut() {
        return verifiRedOut== null ? " " : verifiRedOut.trim();
    }

    public void setVerifiRedOut(String verifiRedOut) {
        this.verifiRedOut = verifiRedOut == null ? null : verifiRedOut.trim();
    }

    public String getVerifiYellowOut() {
        return verifiYellowOut== null ? " " : verifiYellowOut.trim();
    }

    public void setVerifiYellowOut(String verifiYellowOut) {
        this.verifiYellowOut = verifiYellowOut == null ? null : verifiYellowOut.trim();
    }

    public Date getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(Date statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    public String getRedCodeChecked() {
        return redCodeChecked== null ? " " : redCodeChecked.trim();
    }

    public void setRedCodeChecked(String redCodeChecked) {
        this.redCodeChecked = redCodeChecked == null ? null : redCodeChecked.trim();
    }

    public String getPreAttr1() {
        return preAttr1== null ? " " : preAttr1.trim();
    }

    public void setPreAttr1(String preAttr1) {
        this.preAttr1 = preAttr1 == null ? null : preAttr1.trim();
    }

    public String getPreAttr2() {
        return preAttr2== null ? " " : preAttr2.trim();
    }

    public void setPreAttr2(String preAttr2) {
        this.preAttr2 = preAttr2 == null ? null : preAttr2.trim();
    }

    public String getPreAttr3() {
        return preAttr3== null ? " " : preAttr3.trim();
    }

    public void setPreAttr3(String preAttr3) {
        this.preAttr3 = preAttr3 == null ? null : preAttr3.trim();
    }

    public String getPreAttr4() {
        return preAttr4== null ? " " : preAttr4.trim();
    }

    public void setPreAttr4(String preAttr4) {
        this.preAttr4 = preAttr4 == null ? null : preAttr4.trim();
    }

    public String getPreAttr5() {
        return preAttr5== null ? " " : preAttr5.trim();
    }

    public void setPreAttr5(String preAttr5) {
        this.preAttr5 = preAttr5 == null ? null : preAttr5.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", area=").append(area);
        sb.append(", registerNow=").append(registerNow);
        sb.append(", registerToday=").append(registerToday);
        sb.append(", registerNonNative=").append(registerNonNative);
        sb.append(", redCodeYesterday=").append(redCodeYesterday);
        sb.append(", redCodeModeadds=").append(redCodeModeadds);
        sb.append(", redCodeTecadds=").append(redCodeTecadds);
        sb.append(", redCodeHight=").append(redCodeHight);
        sb.append(", redCodeMiddle=").append(redCodeMiddle);
        sb.append(", redCodeForeign=").append(redCodeForeign);
        sb.append(", redCodeCheckedGreen=").append(redCodeCheckedGreen);
        sb.append(", redCodeCheckedRed=").append(redCodeCheckedRed);
        sb.append(", redCodeCheckedYellow=").append(redCodeCheckedYellow);
        sb.append(", redCodeUncheck=").append(redCodeUncheck);
        sb.append(", redCodeUncheckGreen=").append(redCodeUncheckGreen);
        sb.append(", redCodeRedNow=").append(redCodeRedNow);
        sb.append(", redCodeYellowNow=").append(redCodeYellowNow);
        sb.append(", greenToRed=").append(greenToRed);
        sb.append(", acceptAuditor=").append(acceptAuditor);
        sb.append(", acceptVerifier=").append(acceptVerifier);
        sb.append(", verifiAll=").append(verifiAll);
        sb.append(", verifiAdd=").append(verifiAdd);
        sb.append(", verifiRedOut=").append(verifiRedOut);
        sb.append(", verifiYellowOut=").append(verifiYellowOut);
        sb.append(", statisticsDate=").append(statisticsDate);
        sb.append(", redCodeChecked=").append(redCodeChecked);
        sb.append(", preAttr1=").append(preAttr1);
        sb.append(", preAttr2=").append(preAttr2);
        sb.append(", preAttr3=").append(preAttr3);
        sb.append(", preAttr4=").append(preAttr4);
        sb.append(", preAttr5=").append(preAttr5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}