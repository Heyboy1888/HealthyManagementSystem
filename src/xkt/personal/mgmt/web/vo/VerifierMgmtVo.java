package xkt.personal.mgmt.web.vo;

import eeos.sp.core.base.vo.EBaseVo;

public class VerifierMgmtVo extends EBaseVo {
	// 唯一标识
	private String id;

	private String relaName;
	// 区域编码
	private String districtCode;
	private String district;
	// 街道编码
	private String streetCode;
	private String street;
	// 社区编码
	private String communityCode;
	private String community;
	// 社区编码 new
	private String communityCodeNew;
	// 手机号码
	private String mobile;
	// 创建开始时间
	private String createTimeFrom;
	// 创建截止时间
	private String createTimeTo;
	// 文件上传
	private String fileOriginPath;

	private String createTime;

	private String updateTime;
	// 是否展示二维码
	private String extAttr1;
	private String extAttr2;
	private String extAttr3;
	// 小区分类
	private String cmmtyType;
	// 小区名称
	private String commuityName;
	
	public String getCommuityName() {
		return commuityName;
	}

	public void setCommuityName(String commuityName) {
		this.commuityName = commuityName;
	}

	public String getCmmtyType() {
		return cmmtyType;
	}

	public void setCmmtyType(String cmmtyType) {
		this.cmmtyType = cmmtyType;
	}

	public String getExtAttr1() {
		return extAttr1;
	}

	public void setExtAttr1(String extAttr1) {
		this.extAttr1 = extAttr1;
	}

	public String getExtAttr2() {
		return extAttr2;
	}

	public void setExtAttr2(String extAttr2) {
		this.extAttr2 = extAttr2;
	}

	public String getExtAttr3() {
		return extAttr3;
	}

	public void setExtAttr3(String extAttr3) {
		this.extAttr3 = extAttr3;
	}

	public String getRelaName() {
		return relaName;
	}

	public void setRelaName(String relaName) {
		this.relaName = relaName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCommunityCodeNew() {
		return communityCodeNew;
	}

	public void setCommunityCodeNew(String communityCodeNew) {
		this.communityCodeNew = communityCodeNew;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getFileOriginPath() {
		return fileOriginPath;
	}

	public void setFileOriginPath(String fileOriginPath) {
		this.fileOriginPath = fileOriginPath;
	}
}
