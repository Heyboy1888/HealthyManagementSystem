package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

/**
 * 站点管理员
 * 
 * @author Hanson
 *
 */
public class SiteUserRelaVo extends EBaseVo {
	/**
	 * 主键
	 */
	private String id;

	/**
	 * 站点code
	 */
	private String siteCode;

	/**
	 * 站点名称
	 */
	private String siteName;

	/**
	 * 人员类型（0:分管领导,1:联系人）
	 */
	private String userType;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_siteUserType", key = "userType")
	private String userTypeName;
	/**
	 * 用户姓名
	 */
	private String userName;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 是否有效（1：有限，0：无效）
	 */
	private String flag;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_ApplyStatus", key = "flag")
	private String flagName;

	private String fileOriginPath;

	private String createTimeFrom;

	private String createTimeTo;

	private String createTime;

	private String updateTime;

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

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public String getFlagName() {
		return flagName;
	}

	public void setFlagName(String flagName) {
		this.flagName = flagName;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode == null ? null : siteCode.trim();
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName == null ? null : siteName.trim();
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType == null ? null : userType.trim();
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag == null ? null : flag.trim();
	}
}
