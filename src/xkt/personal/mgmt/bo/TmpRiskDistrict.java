package xkt.personal.mgmt.bo;

public class TmpRiskDistrict {
	private String districtCode;

	private String riskLevel;

	private String isVaild;

	private int id;

	private String districtFullName;

	private String districtType;

	private String districtName;

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	

	public String getIsVaild() {
		return isVaild;
	}

	public void setIsVaild(String isVaild) {
		this.isVaild = isVaild;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrictFullName() {
		return districtFullName;
	}

	public void setDistrictFullName(String districtFullName) {
		this.districtFullName = districtFullName;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	@Override
	public String toString() {
		return "TmpRiskDistrict [districtCode=" + districtCode + ", riskLevel="
				+ riskLevel + ", isValid=" + isVaild + ", id=" + id
				+ ", districtFullName=" + districtFullName + ", districtType="
				+ districtType + ", districtName=" + districtName + "]";
	}

}
