package xkt.personal.mgmt.web.vo;

import eeos.sp.core.base.vo.EBaseVo;

public class CheckerMgmtVo extends EBaseVo {

	// 唯一标识
	private String id;

	// 区域编码
	private String districtCode;
	private String district;
	// 街道编码
	private String streetCode;
	private String street;
	// 社区编码
	private String communityCode;
	private String community;
	// 社区编码New
	private String communityCodeNew;

	// 证件类型
	private String certType;
	private String certTypeName;
	// 证件号码
	private String cardCode;
	private String cardCodeBright;
	// 姓名
	private String realName;
	// 手机号码
	private String mobile;
	// 创建开始时间
	private String createTimeFrom;
	// 创建截止时间
	private String createTimeTo;
	// 创建时间
	private String createTime;
	// 结束时间
	private String updateTime;
	// 文件路径
	private String fileOriginPath;
	// 人员类型
	private String personnelType;
	// 社区分类
	private String cmmtyType;
	// 小区名称
	private String commuityName;
	//===================================================新增==========================================================//
	private String person;
	
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	
	//===================================================新增==========================================================//

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

	public String getPersonnelType() {
		return personnelType;
	}

	public void setPersonnelType(String personnelType) {
		this.personnelType = personnelType;
	}

	public String getCommunityCodeNew() {
		return communityCodeNew;
	}

	public void setCommunityCodeNew(String communityCodeNew) {
		this.communityCodeNew = communityCodeNew;
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

	public String getFileOriginPath() {
		return fileOriginPath;
	}

	public void setFileOriginPath(String fileOriginPath) {
		this.fileOriginPath = fileOriginPath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
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

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
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

	public String getCertTypeName() {
		return certTypeName;
	}

	public void setCertTypeName(String certTypeName) {
		this.certTypeName = certTypeName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCardCodeBright() {
		return cardCodeBright;
	}

	public void setCardCodeBright(String cardCodeBright) {
		this.cardCodeBright = cardCodeBright;
	}
}
