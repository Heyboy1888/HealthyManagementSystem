package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class MonitorUserVo extends EBaseVo {

	/**
	 * 主键
	 */
	private String id;

	/**
	 * Md5加密身份证
	 */
	private String certCodeSecret;

	private String certCode;

	/**
	 * 人员类型
	 */
	private String userType;

	private String userTypeName;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 更新时间
	 */
	private String updateTime;

	/**
	 * 辖区code
	 */
	private String districtCode;

	/**
	 * 辖区名称
	 */
	private String districtName;

	/**
	 * 是否有效(1:有效，0:无效)
	 */
	private String flag;

	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_IsOrNot", key = "flag")
	private String flagName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCertCodeSecret() {
		return certCodeSecret;
	}

	public void setCertCodeSecret(String certCodeSecret) {
		this.certCodeSecret = certCodeSecret;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
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

	@Override
	public String toString() {
		return "MonitorUserVo [id=" + id + ", certCodeSecret=" + certCodeSecret
				+ ", certCode=" + certCode + ", userType=" + userType
				+ ", userTypeName=" + userTypeName + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", districtCode="
				+ districtCode + ", districtName=" + districtName + ", flag="
				+ flag + ", flagName=" + flagName + "]";
	}

}
