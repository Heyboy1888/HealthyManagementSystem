package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class RiskDistrictVo extends EBaseVo{
	private String districtCode;

	private String riskLevel;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_RiskLevel", key = "riskLevel")
	private String riskLevelName;

	private String isVaild;
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_RiskVaild", key = "isVaild")
	private String isVaildName;

	private int id;

	private String districtFullName;

	private String districtType;

	private String districtName;
	
	private String pDistrictCode;

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
	
	

	public String getRiskLevelName() {
		return riskLevelName;
	}

	public void setRiskLevelName(String riskLevelName) {
		this.riskLevelName = riskLevelName;
	}

	

	public String getIsVaild() {
		return isVaild;
	}

	public void setIsVaild(String isVaild) {
		this.isVaild = isVaild;
	}

	public String getIsVaildName() {
		return isVaildName;
	}

	public void setIsVaildName(String isVaildName) {
		this.isVaildName = isVaildName;
	}

	public String getpDistrictCode() {
		return pDistrictCode;
	}

	public void setpDistrictCode(String pDistrictCode) {
		this.pDistrictCode = pDistrictCode;
	}

	@Override
	public String toString() {
		return "RiskDistrictVo [districtCode=" + districtCode + ", riskLevel="
				+ riskLevel + ", riskLevelName=" + riskLevelName + ", isVaild="
				+ isVaild + ", isVaildName=" + isVaildName + ", id=" + id
				+ ", districtFullName=" + districtFullName + ", districtType="
				+ districtType + ", districtName=" + districtName
				+ ", pDistrictCode=" + pDistrictCode + "]";
	}
	
	
	
	

}
