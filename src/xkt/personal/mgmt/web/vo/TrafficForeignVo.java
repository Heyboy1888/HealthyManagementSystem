package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class TrafficForeignVo extends EBaseVo{
	private String userName;

    private String certCode;

    private String phone;

    private String householdCode;

    private String householdName;

    private String districtCode;

    private String currentDistrict;

    private String currentStreet;

    private String currentCommunity;

    private String liveAddress;

    private String createTime;
    
    private String codeColour;
    
    private String fileDate;
    
    @DicAttribute(dicName = "syscode_code_dic", subType = "	XKM_CODECOLOUR	", key = "codeColour")
    private String codeColourName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHouseholdCode() {
		return householdCode;
	}

	public void setHouseholdCode(String householdCode) {
		this.householdCode = householdCode;
	}

	public String getHouseholdName() {
		return householdName;
	}

	public void setHouseholdName(String householdName) {
		this.householdName = householdName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCodeColour() {
		return codeColour;
	}

	public void setCodeColour(String codeColour) {
		this.codeColour = codeColour;
	}

	public String getCodeColourName() {
		return codeColourName;
	}

	public void setCodeColourName(String codeColourName) {
		this.codeColourName = codeColourName;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}
    
    

}
