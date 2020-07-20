/**
 * 
 */
package xkt.personal.mgmt.web.vo;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

/**
 * @author admin
 *
 */
public class TotalCheckInfoVo extends EBaseVo {

	// 唯一标识
	private String id;
	// 医院所属区
	private String districtName;
	private String districtCode;
	// 医院名称
	private String hospitalName;
	private String hospitalCode;
	private String startTime;
    
    private String endTime;
    private String greenNum;
    private String yellowNum;
    private String redNum;
    private String totalNum;
    private String checkedName;
    private String checkedMobile;
    private String certCodeHide;
    private String checkPointType;
    private String checkPointName;
    private String checker;
    private String checkerMobile;
    private String checkedRole;
    private String temperatureType;
    private String symptom;
    private String whereabouts;
    private String checkTime;
    private String isHealthy;
    
    
    private String orgNo;
	@DicAttribute(dicName = "auth_org_dic", subType = "", key = "orgNo")
	private String orgName;
	private String orgType;
	
    
    
	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getIsHealthy() {
		return isHealthy;
	}

	public void setIsHealthy(String isHealthy) {
		this.isHealthy = isHealthy;
	}

	public String getCheckedName() {
		return checkedName;
	}

	public void setCheckedName(String checkedName) {
		this.checkedName = checkedName;
	}

	public String getCheckedMobile() {
		return checkedMobile;
	}

	public void setCheckedMobile(String checkedMobile) {
		this.checkedMobile = checkedMobile;
	}

	public String getCertCodeHide() {
		return certCodeHide;
	}

	public void setCertCodeHide(String certCodeHide) {
		this.certCodeHide = certCodeHide;
	}

	public String getCheckPointType() {
		return checkPointType;
	}

	public void setCheckPointType(String checkPointType) {
		this.checkPointType = checkPointType;
	}

	public String getCheckPointName() {
		return checkPointName;
	}

	public void setCheckPointName(String checkPointName) {
		this.checkPointName = checkPointName;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getCheckerMobile() {
		return checkerMobile;
	}

	public void setCheckerMobile(String checkerMobile) {
		this.checkerMobile = checkerMobile;
	}

	public String getCheckedRole() {
		return checkedRole;
	}

	public void setCheckedRole(String checkedRole) {
		this.checkedRole = checkedRole;
	}

	public String getTemperatureType() {
		return temperatureType;
	}

	public void setTemperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getWhereabouts() {
		return whereabouts;
	}

	public void setWhereabouts(String whereabouts) {
		this.whereabouts = whereabouts;
	}

	public String getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getGreenNum() {
		return greenNum;
	}

	public void setGreenNum(String greenNum) {
		this.greenNum = greenNum;
	}

	public String getYellowNum() {
		return yellowNum;
	}

	public void setYellowNum(String yellowNum) {
		this.yellowNum = yellowNum;
	}

	public String getRedNum() {
		return redNum;
	}

	public void setRedNum(String redNum) {
		this.redNum = redNum;
	}

	public String getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
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

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	/**
	 * @Title: getId
	 * @Description: please write your description
	 * @return: String
	 */
	public String getId() {
		return id;
	}

	/**
	 * @Title: setId
	 * @Description: please write your description
	 * @return: String
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @Title: getDistrictName
	 * @Description: please write your description
	 * @return: String
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @Title: setDistrictName
	 * @Description: please write your description
	 * @return: String
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @Title: getHospitalName
	 * @Description: please write your description
	 * @return: String
	 */
	public String getHospitalName() {
		return hospitalName;
	}

	/**
	 * @Title: setHospitalName
	 * @Description: please write your description
	 * @return: String
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}