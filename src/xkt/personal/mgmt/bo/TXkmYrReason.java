package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TXkmYrReason implements Serializable {
    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证号码
     */
    private String certCode;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 到锡时间
     */
    private String arriveWxDate;

    /**
     * 是否来自湖北（前期数据）
     */
    private String isFromHb;

    /**
     * 出发地
     */
    private String departureAddr;

    /**
     * 是否14日内接触过“新冠肺炎”确诊或疑似病例
     */
    private String isTwoWeekVirus;

    /**
     * 户籍地
     */
    private String householdName;

    /**
     *  行政区划
     */
    private String currentDistrict;

    /**
     * 街道
     */
    private String currentStreet;

    /**
     *  社区
     */
    private String currentCommunity;

    /**
     * 小区/新村/路名
     */
    private String housingName;

    /**
     * 详细地址
     */
    private String liveAddress;

    /**
     * 是否发烧
     */
    private String isHot;

    /**
     * 是否14日内是否湖北停留或与归来人员接触
     */
    private String isStay;

    /**
     * 锡康码状态
     */
    private String isHealthy;

    /**
     * 14日之内是否有旅行史
     */
    private String twoWeekTravel;

    /**
     * 往返地
     */
    private String roundTripName;

    /**
     * 申码时间
     */
    private String createTime;

    /**
     * 是否定点医院隔离治疗的确认病人疑似病人
     */
    private String isIsolaVirusPsn;

    /**
     * 是否实施居家观察未满14天的感染者
     */
    private String isCureVirusPsn;

    /**
     * 是否定点医疗机构隔离医学观察的无症状感染者
     */
    private String isObserVirusPsn;

    /**
     * 红黄码原因
     */
    private String reason;

    /**
     * 备注1
     */
    private String remark1;

    /**
     * 备注2
     */
    private String remark2;

    /**
     * 01-研判或其他原因拉红黄，02-用户填写原因拉红黄
     */
    private String dataType;

    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getArriveWxDate() {
        return arriveWxDate;
    }

    public void setArriveWxDate(String arriveWxDate) {
        this.arriveWxDate = arriveWxDate == null ? null : arriveWxDate.trim();
    }

    public String getIsFromHb() {
        return isFromHb;
    }

    public void setIsFromHb(String isFromHb) {
        this.isFromHb = isFromHb == null ? null : isFromHb.trim();
    }

    public String getDepartureAddr() {
        return departureAddr;
    }

    public void setDepartureAddr(String departureAddr) {
        this.departureAddr = departureAddr == null ? null : departureAddr.trim();
    }

    public String getIsTwoWeekVirus() {
        return isTwoWeekVirus;
    }

    public void setIsTwoWeekVirus(String isTwoWeekVirus) {
        this.isTwoWeekVirus = isTwoWeekVirus == null ? null : isTwoWeekVirus.trim();
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName == null ? null : householdName.trim();
    }

    public String getCurrentDistrict() {
        return currentDistrict;
    }

    public void setCurrentDistrict(String currentDistrict) {
        this.currentDistrict = currentDistrict == null ? null : currentDistrict.trim();
    }

    public String getCurrentStreet() {
        return currentStreet;
    }

    public void setCurrentStreet(String currentStreet) {
        this.currentStreet = currentStreet == null ? null : currentStreet.trim();
    }

    public String getCurrentCommunity() {
        return currentCommunity;
    }

    public void setCurrentCommunity(String currentCommunity) {
        this.currentCommunity = currentCommunity == null ? null : currentCommunity.trim();
    }

    public String getHousingName() {
        return housingName;
    }

    public void setHousingName(String housingName) {
        this.housingName = housingName == null ? null : housingName.trim();
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress == null ? null : liveAddress.trim();
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot == null ? null : isHot.trim();
    }

    public String getIsStay() {
        return isStay;
    }

    public void setIsStay(String isStay) {
        this.isStay = isStay == null ? null : isStay.trim();
    }

    public String getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(String isHealthy) {
        this.isHealthy = isHealthy == null ? null : isHealthy.trim();
    }

    public String getTwoWeekTravel() {
        return twoWeekTravel;
    }

    public void setTwoWeekTravel(String twoWeekTravel) {
        this.twoWeekTravel = twoWeekTravel == null ? null : twoWeekTravel.trim();
    }

    public String getRoundTripName() {
        return roundTripName;
    }

    public void setRoundTripName(String roundTripName) {
        this.roundTripName = roundTripName == null ? null : roundTripName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getIsIsolaVirusPsn() {
        return isIsolaVirusPsn;
    }

    public void setIsIsolaVirusPsn(String isIsolaVirusPsn) {
        this.isIsolaVirusPsn = isIsolaVirusPsn == null ? null : isIsolaVirusPsn.trim();
    }

    public String getIsCureVirusPsn() {
        return isCureVirusPsn;
    }

    public void setIsCureVirusPsn(String isCureVirusPsn) {
        this.isCureVirusPsn = isCureVirusPsn == null ? null : isCureVirusPsn.trim();
    }

    public String getIsObserVirusPsn() {
        return isObserVirusPsn;
    }

    public void setIsObserVirusPsn(String isObserVirusPsn) {
        this.isObserVirusPsn = isObserVirusPsn == null ? null : isObserVirusPsn.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", certCode=").append(certCode);
        sb.append(", phone=").append(phone);
        sb.append(", arriveWxDate=").append(arriveWxDate);
        sb.append(", isFromHb=").append(isFromHb);
        sb.append(", departureAddr=").append(departureAddr);
        sb.append(", isTwoWeekVirus=").append(isTwoWeekVirus);
        sb.append(", householdName=").append(householdName);
        sb.append(", currentDistrict=").append(currentDistrict);
        sb.append(", currentStreet=").append(currentStreet);
        sb.append(", currentCommunity=").append(currentCommunity);
        sb.append(", housingName=").append(housingName);
        sb.append(", liveAddress=").append(liveAddress);
        sb.append(", isHot=").append(isHot);
        sb.append(", isStay=").append(isStay);
        sb.append(", isHealthy=").append(isHealthy);
        sb.append(", twoWeekTravel=").append(twoWeekTravel);
        sb.append(", roundTripName=").append(roundTripName);
        sb.append(", createTime=").append(createTime);
        sb.append(", isIsolaVirusPsn=").append(isIsolaVirusPsn);
        sb.append(", isCureVirusPsn=").append(isCureVirusPsn);
        sb.append(", isObserVirusPsn=").append(isObserVirusPsn);
        sb.append(", reason=").append(reason);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", dataType=").append(dataType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}