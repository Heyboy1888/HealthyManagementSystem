package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TXkmYrSweepRecord implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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

    public String getDepartureAddr() {
        return departureAddr;
    }

    public void setDepartureAddr(String departureAddr) {
        this.departureAddr = departureAddr == null ? null : departureAddr.trim();
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

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress == null ? null : liveAddress.trim();
    }

    public String getPaasAddrName() {
        return paasAddrName;
    }

    public void setPaasAddrName(String paasAddrName) {
        this.paasAddrName = paasAddrName == null ? null : paasAddrName.trim();
    }

    public String getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(String isHealthy) {
        this.isHealthy = isHealthy == null ? null : isHealthy.trim();
    }

    public String getCommunityFlag() {
        return communityFlag;
    }

    public void setCommunityFlag(String communityFlag) {
        this.communityFlag = communityFlag == null ? null : communityFlag.trim();
    }

    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson == null ? null : checkPerson.trim();
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode == null ? null : communityCode.trim();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public String getCommDistrict() {
        return commDistrict;
    }

    public void setCommDistrict(String commDistrict) {
        this.commDistrict = commDistrict == null ? null : commDistrict.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getSweepTime() {
        return sweepTime;
    }

    public void setSweepTime(String sweepTime) {
        this.sweepTime = sweepTime == null ? null : sweepTime.trim();
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
        sb.append(", reportDate=").append(reportDate);
        sb.append(", certCode=").append(certCode);
        sb.append(", userName=").append(userName);
        sb.append(", phone=").append(phone);
        sb.append(", arriveWxDate=").append(arriveWxDate);
        sb.append(", departureAddr=").append(departureAddr);
        sb.append(", householdName=").append(householdName);
        sb.append(", currentDistrict=").append(currentDistrict);
        sb.append(", currentStreet=").append(currentStreet);
        sb.append(", currentCommunity=").append(currentCommunity);
        sb.append(", liveAddress=").append(liveAddress);
        sb.append(", paasAddrName=").append(paasAddrName);
        sb.append(", isHealthy=").append(isHealthy);
        sb.append(", communityFlag=").append(communityFlag);
        sb.append(", checkPerson=").append(checkPerson);
        sb.append(", communityCode=").append(communityCode);
        sb.append(", communityName=").append(communityName);
        sb.append(", commDistrict=").append(commDistrict);
        sb.append(", createTime=").append(createTime);
        sb.append(", sweepTime=").append(sweepTime);
        sb.append(", dataType=").append(dataType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}