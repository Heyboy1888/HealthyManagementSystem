package xkt.personal.mgmt.web.vo;

import eeos.sp.core.base.vo.EBaseVo;

public class ThirdInputVo extends EBaseVo{
	/**
     * 主键
     */
    private String id;

    /**
     * 身份证号
     */
    private String certCode;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 区域
     */
    private String currentDistrict;
    private String districtCode;

    /**
     * 街道
     */
    private String currentStreet;
    private String streetCode;

    /**
     * 社区
     */
    private String currentCommunity;
    private String communityCode;
    private String communityCodeNew;

    public String getCommunityCodeNew() {
		return communityCodeNew;
	}

	public void setCommunityCodeNew(String communityCodeNew) {
		this.communityCodeNew = communityCodeNew;
	}

	/**
     * 社区核对时间
     */
    private String communityCheckDate;

    /**
     * 居家状态
     */
    private String currentType;

    /**
     * 状态
     */
    private String flag;

    /**
     * 渠道
     */
    private String channel;

    private String createTime;

    private String updateTime;
    
    private String startTime;
    
    private String endTime;

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

	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getCommunityCheckDate() {
		return communityCheckDate;
	}

	public void setCommunityCheckDate(String communityCheckDate) {
		this.communityCheckDate = communityCheckDate;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getStreetCode() {
		return streetCode;
	}

	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode;
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCurrentType() {
		return currentType;
	}

	public void setCurrentType(String currentType) {
		this.currentType = currentType;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
    
    
    
    

}
