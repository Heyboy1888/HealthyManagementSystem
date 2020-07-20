package xkt.personal.mgmt.web.vo;

import eeos.sp.core.base.vo.EBaseVo;

public class YrReasonVo extends EBaseVo{
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getArriveWxDate() {
		return arriveWxDate;
	}

	public void setArriveWxDate(String arriveWxDate) {
		this.arriveWxDate = arriveWxDate;
	}

	public String getIsFromHb() {
		return isFromHb;
	}

	public void setIsFromHb(String isFromHb) {
		this.isFromHb = isFromHb;
	}

	public String getDepartureAddr() {
		return departureAddr;
	}

	public void setDepartureAddr(String departureAddr) {
		this.departureAddr = departureAddr;
	}

	public String getIsTwoWeekVirus() {
		return isTwoWeekVirus;
	}

	public void setIsTwoWeekVirus(String isTwoWeekVirus) {
		this.isTwoWeekVirus = isTwoWeekVirus;
	}

	public String getHouseholdName() {
		return householdName;
	}

	public void setHouseholdName(String householdName) {
		this.householdName = householdName;
	}

	public String getCurrentDistrict() {
		return currentDistrict;
	}

	public void setCurrentDistrict(String currentDistrict) {
		this.currentDistrict = currentDistrict;
	}

	public String getCurrentStreet() {
		return currentStreet;
	}

	public void setCurrentStreet(String currentStreet) {
		this.currentStreet = currentStreet;
	}

	public String getCurrentCommunity() {
		return currentCommunity;
	}

	public void setCurrentCommunity(String currentCommunity) {
		this.currentCommunity = currentCommunity;
	}

	public String getHousingName() {
		return housingName;
	}

	public void setHousingName(String housingName) {
		this.housingName = housingName;
	}

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

	public String getIsStay() {
		return isStay;
	}

	public void setIsStay(String isStay) {
		this.isStay = isStay;
	}

	public String getIsHealthy() {
		return isHealthy;
	}

	public void setIsHealthy(String isHealthy) {
		this.isHealthy = isHealthy;
	}

	public String getTwoWeekTravel() {
		return twoWeekTravel;
	}

	public void setTwoWeekTravel(String twoWeekTravel) {
		this.twoWeekTravel = twoWeekTravel;
	}

	public String getRoundTripName() {
		return roundTripName;
	}

	public void setRoundTripName(String roundTripName) {
		this.roundTripName = roundTripName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getIsIsolaVirusPsn() {
		return isIsolaVirusPsn;
	}

	public void setIsIsolaVirusPsn(String isIsolaVirusPsn) {
		this.isIsolaVirusPsn = isIsolaVirusPsn;
	}

	public String getIsCureVirusPsn() {
		return isCureVirusPsn;
	}

	public void setIsCureVirusPsn(String isCureVirusPsn) {
		this.isCureVirusPsn = isCureVirusPsn;
	}

	public String getIsObserVirusPsn() {
		return isObserVirusPsn;
	}

	public void setIsObserVirusPsn(String isObserVirusPsn) {
		this.isObserVirusPsn = isObserVirusPsn;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

    
}
