package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TmpTrafficeFromForeign implements Serializable {
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

    private Date createTime;
    
    private String fileDate;

    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHouseholdCode() {
        return householdCode;
    }

    public void setHouseholdCode(String householdCode) {
        this.householdCode = householdCode == null ? null : householdCode.trim();
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName == null ? null : householdName.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    

    public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", certCode=").append(certCode);
        sb.append(", phone=").append(phone);
        sb.append(", householdCode=").append(householdCode);
        sb.append(", householdName=").append(householdName);
        sb.append(", districtCode=").append(districtCode);
        sb.append(", currentDistrict=").append(currentDistrict);
        sb.append(", currentStreet=").append(currentStreet);
        sb.append(", currentCommunity=").append(currentCommunity);
        sb.append(", liveAddress=").append(liveAddress);
        sb.append(", createTime=").append(createTime);
        sb.append(", fileDate=").append(fileDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}