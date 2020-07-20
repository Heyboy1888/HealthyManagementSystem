package xkt.personal.mgmt.web.vo;

import eeos.sp.core.base.vo.EBaseVo;

public class YrSweepRecordVo extends EBaseVo{
	/**
     * 日期
     */
    private String reportDate;

    /**
     * 被扫描人身份证号
     */
    private String certCode;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 到达无锡日期
     */
    private String arriveWxDate;

    /**
     * 出发地
     */
    private String departureAddr;

    /**
     * 户籍地
     */
    private String householdName;

    /**
     * 现所在的区
     */
    private String currentDistrict;

    /**
     * 现所在的街道
     */
    private String currentStreet;

    /**
     * 现所在的社区
     */
    private String currentCommunity;

    /**
     * 现居住地址
     */
    private String liveAddress;

    /**
     * 途径地点
     */
    private String paasAddrName;

    /**
     * 锡康码状态
     */
    private String isHealthy;

    /**
     * 社区审核标签
     */
    private String communityFlag;

    /**
     * 验证员手机号
     */
    private String checkPerson;

    /**
     * 验证员所属社区代码
     */
    private String communityCode;

    /**
     * 验证员所属社区
     */
    private String communityName;

    /**
     * 验证员所属区（市）
     */
    private String commDistrict;

    /**
     * 注册时间
     */
    private String createTime;

    /**
     * 扫码时间
     */
    private String sweepTime;

    /**
     * 01-红黄码扫码记录，02-红黄码外出扫码记录
     */
    private String dataType;
    
    private String startTime;
    
    private String endTime;

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getDepartureAddr() {
		return departureAddr;
	}

	public void setDepartureAddr(String departureAddr) {
		this.departureAddr = departureAddr;
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

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	public String getPaasAddrName() {
		return paasAddrName;
	}

	public void setPaasAddrName(String paasAddrName) {
		this.paasAddrName = paasAddrName;
	}

	public String getIsHealthy() {
		return isHealthy;
	}

	public void setIsHealthy(String isHealthy) {
		this.isHealthy = isHealthy;
	}

	public String getCommunityFlag() {
		return communityFlag;
	}

	public void setCommunityFlag(String communityFlag) {
		this.communityFlag = communityFlag;
	}

	public String getCheckPerson() {
		return checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson;
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommDistrict() {
		return commDistrict;
	}

	public void setCommDistrict(String commDistrict) {
		this.commDistrict = commDistrict;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSweepTime() {
		return sweepTime;
	}

	public void setSweepTime(String sweepTime) {
		this.sweepTime = sweepTime;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
    
    
	
}
