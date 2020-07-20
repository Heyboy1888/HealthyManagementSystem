package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class OneAddrOneCodeVo extends EBaseVo {

	/**
	 * 申请id
	 */
	private String id;
	/**
	 * 单位id
	 */
	private String companyId;
	
	private String companySubId;
	/**
	 * 单位状态码
	 */
	private String companyStatus;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_ApplyStatus", key = "companyStatus")
	private String companyStatusName;

	/**
	 * 单位名称
	 */
	private String companyName;
	

	/**
	 * 社会信息代码
	 */
	private String infoCode;

	/**
	 * 注册地址
	 */
	private String regAddress;

	/**
	 * 是否分支机构（0、否 1、是）
	 */
	private String isBranch;

	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IsOrNot", key = "isBranch")
	private String isBranchName;
	/**
	 * 上级社会信息代码
	 */
	private String parentInfoCode;

	/**
	 * 分支机构层级
	 */
	private String branchLevel;

	/**
	 * 对外营业名称
	 */
	private String externalName;

	/**
	 * 行业分类
	 */
	private String industryCat;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IndustryCat", key = "industryCat")
	private String industryCatName;

	/**
	 * 实际经营地址id
	 */
	private String addressId;

	/**
	 * 实际经营地址
	 */
	private String address;
	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 更新时间
	 */
	private String updateTime;

	/**
	 * 申请时间止
	 */
	private String expiresTime;

	/**
	 * 实际经营管理人姓名
	 */
	private String actualName;

	/**
	 * 实际经营管理人身份证
	 */
	private String actualCertCode;
	/**
	 * 实际经营管理人手机号
	 */
	private String actualMobile;

	/**
	 * 身份证照片
	 */
	private String certPic;

	/**
	 * 店面照片
	 */
	private String storePic;

	/**
	 * 营业执照照片
	 */
	private String busPic;

	/**
	 * 创建记录id
	 */
	private Long recordId;

	/**
	 * 子码数subCount
	 * 
	 * @return
	 */
	private Integer subCount;

	private Integer countSu;
	
	private String createPerson;
	
	private String createType;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_CreateType", key = "createType")
	private String createTypeName;

	
	private String companySubName;
	
	private String scanDate;
	
	private String scanCount;
	
	
	
	public String getScanCount() {
		return scanCount;
	}

	public void setScanCount(String scanCount) {
		this.scanCount = scanCount;
	}

	

	public String getScanDate() {
		return scanDate;
	}

	public void setScanDate(String scanDate) {
		this.scanDate = scanDate;
	}

	public String getCompanySubName() {
		return companySubName;
	}

	public void setCompanySubName(String companySubName) {
		this.companySubName = companySubName;
	}

	public String getCreateTypeName() {
		return createTypeName;
	}

	public void setCreateTypeName(String createTypeName) {
		this.createTypeName = createTypeName;
	}

	public String getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public String getCreateType() {
		return createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public Integer getCountSu() {
		return countSu;
	}

	public void setCountSu(Integer countSu) {
		this.countSu = countSu;
	}

	public Integer getSubCount() {
		return subCount;
	}

	public void setSubCount(Integer subCount) {
		this.subCount = subCount;
	}

	public String getIsBranchName() {
		return isBranchName;
	}

	public void setIsBranchName(String isBranchName) {
		this.isBranchName = isBranchName;
	}

	public String getIndustryCatName() {
		return industryCatName;
	}

	public void setIndustryCatName(String industryCatName) {
		this.industryCatName = industryCatName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInfoCode() {
		return infoCode;
	}

	public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getIsBranch() {
		return isBranch;
	}

	public void setIsBranch(String isBranch) {
		this.isBranch = isBranch;
	}

	public String getParentInfoCode() {
		return parentInfoCode;
	}

	public void setParentInfoCode(String parentInfoCode) {
		this.parentInfoCode = parentInfoCode;
	}

	public String getBranchLevel() {
		return branchLevel;
	}

	public void setBranchLevel(String branchLevel) {
		this.branchLevel = branchLevel;
	}

	public String getExternalName() {
		return externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getIndustryCat() {
		return industryCat;
	}

	public void setIndustryCat(String industryCat) {
		this.industryCat = industryCat;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getExpiresTime() {
		return expiresTime;
	}

	public void setExpiresTime(String expiresTime) {
		this.expiresTime = expiresTime;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getActualCertCode() {
		return actualCertCode;
	}

	public void setActualCertCode(String actualCertCode) {
		this.actualCertCode = actualCertCode;
	}

	public String getActualMobile() {
		return actualMobile;
	}

	public void setActualMobile(String actualMobile) {
		this.actualMobile = actualMobile;
	}

	public String getCertPic() {
		return certPic;
	}

	public void setCertPic(String certPic) {
		this.certPic = certPic;
	}

	public String getStorePic() {
		return storePic;
	}

	public void setStorePic(String storePic) {
		this.storePic = storePic;
	}

	public String getBusPic() {
		return busPic;
	}

	public void setBusPic(String busPic) {
		this.busPic = busPic;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getCompanyStatusName() {
		return companyStatusName;
	}

	public void setCompanyStatusName(String companyStatusName) {
		this.companyStatusName = companyStatusName;
	}

	public String getCompanySubId() {
		return companySubId;
	}

	public void setCompanySubId(String companySubId) {
		this.companySubId = companySubId;
	}
	
	

}
