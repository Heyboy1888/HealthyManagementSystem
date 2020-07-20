package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class CompanySweepRecordVo extends EBaseVo{
	/**
     * 主键
     */
    private String id;

    /**
     * openid
     */
    private String openId;

    /**
     * 身份证
     */
    private String certCode;
    
    /**
     * 脱敏证件号
     */
    private String certCodeHide;

    /**
     * 加密证件号
     */
    private String certCodeSecret;


    public String getCertCodeHide() {
		return certCodeHide;
	}

	public void setCertCodeHide(String certCodeHide) {
		this.certCodeHide = certCodeHide;
	}

	public String getCertCodeSecret() {
		return certCodeSecret;
	}

	public void setCertCodeSecret(String certCodeSecret) {
		this.certCodeSecret = certCodeSecret;
	}



	/**
     * 姓名
     */
    private String realName;
    
    private String phone;

    /**
     * 公司id
     */
    private String companyId;
    
    private String companyName;
    
    private String companySubId;
    
    private String companySubName;
    
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getCertCode() {
		return certCode;
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

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getIsHealth() {
		return isHealth;
	}

	public void setIsHealth(String isHealth) {
		this.isHealth = isHealth;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	

	public String getCompanySubId() {
		return companySubId;
	}

	public void setCompanySubId(String companySubId) {
		this.companySubId = companySubId;
	}

	public String getCompanySubName() {
		return companySubName;
	}

	public void setCompanySubName(String companySubName) {
		this.companySubName = companySubName;
	}



	private String companyAddress;

    /**
     * 健康状态
     */
    private String isHealth;
    
    
    @DicAttribute(dicName="syscode_code_dic",subType="XKM_IsOrNot",key="isHealth")
    private String isHealthName;

    public String getIsHealthName() {
		return isHealthName;
	}

	public void setIsHealthName(String isHealthName) {
		this.isHealthName = isHealthName;
	}



	/**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;
    
    private String startTime;
    
    private String endTime;
    
    private String housingName;


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

	public String getHousingName() {
		return housingName;
	}

	public void setHousingName(String housingName) {
		this.housingName = housingName;
	}
}
