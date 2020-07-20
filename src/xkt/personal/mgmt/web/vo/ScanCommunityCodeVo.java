package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

/** 
 * @author  : wangweilong 
 * @version :2020年3月13日 下午5:46:17 
 * 
 */
public class ScanCommunityCodeVo extends EBaseVo {

	
	private String commuityId;
	
	/**
	 * 省
	 */
	private String provinceCode;
	private String provinceName;
	/**
	 * 市
	 */
	private String cityCode;
	private String cityName;
	
	/**
	 * 区域
	 */
	private String districtCode;
	/**
	 * 街道
	 */
	private String streetCode;
	

	private String streetName;

	/**
	 * 社区
	 */
	private String communityCode;
	// 创建开始时间
	private String createTimeFrom;
	// 创建截止时间
	private String createTimeTo;
	/**
	 * 小区分类
	 */
	private String cmmtyType;
	/**
	 * 小区名称
	 */
	private String commuityName;
	/**
	 * 小区编号
	 */
	private String commuityNo;
	/**
	 * 小区地址
	 */
	private String commuityAddr;

	/**
	 * 验证员姓名
	 */
	private String realName;

	
    /**
     * 验证员手机号码
     */
	private String mobile;
	
	/**
	 * 区县
	 */
	private String countyCode;
	
	private String countyName;
	/**
	 * 居委会（村）
	 */
	private String villageCode;
	private String villageName;
	
	private String checkedName;
	
	/**
	 * 扫码总数
	 */
	private String totalNum;
	/**
	 * 未通过数
	 */
	private String unpassNum;
	
	/**
	 * 通过数
	 */
	private String passNum;
	/**
	 * 
	 */
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_HealthyCode", key = "isHealth")
	private String isHealthName;
	/**
	 * 是否健康
	 */

	private String isHealth;
	
	/**
	 * 身份证号
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
	
	
	private String createTime;
	
	private String updateTime;
	
	private String startTime;
	
	private String endTime;
	

	private String details;
	
	
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCommuityAddr() {
		return commuityAddr;
	}

	public void setCommuityAddr(String commuityAddr) {
		this.commuityAddr = commuityAddr;
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

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getIsHealthName() {
		return isHealthName;
	}

	public void setIsHealthName(String isHealthName) {
		this.isHealthName = isHealthName;
	}

	public String getCheckedName() {
		return checkedName;
	}

	public void setCheckedName(String checkedName) {
		this.checkedName = checkedName;
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

	public String getIsHealth() {
		return isHealth;
	}

	public void setIsHealth(String isHealth) {
		 this.isHealth = isHealth == null ? null : isHealth.trim();
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getCommuityId() {
		return commuityId;
	}

	public void setCommuityId(String commuityId) {
		this.commuityId = commuityId;
	}

	public String getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	public String getUnpassNum() {
		return unpassNum;
	}

	public void setUnpassNum(String unpassNum) {
		this.unpassNum = unpassNum;
	}

	public String getPassNum() {
		return passNum;
	}

	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getVillageCode() {
		return villageCode;
	}

	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
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

	public String getCreateTimeFrom() {
		return createTimeFrom;
	}

	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
	}

	public String getCreateTimeTo() {
		return createTimeTo;
	}

	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
	}

	public String getCmmtyType() {
		return cmmtyType;
	}

	public void setCmmtyType(String cmmtyType) {
		this.cmmtyType = cmmtyType;
	}

	public String getCommuityName() {
		return commuityName;
	}

	public void setCommuityName(String commuityName) {
		this.commuityName = commuityName;
	}

	public String getCommuityNo() {
		return commuityNo;
	}

	public void setCommuityNo(String commuityNo) {
		this.commuityNo = commuityNo;
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
	
	
	private String housingName;


	public String getHousingName() {
		return housingName;
	}

	public void setHousingName(String housingName) {
		this.housingName = housingName;
	}
	
	
	
	
}
