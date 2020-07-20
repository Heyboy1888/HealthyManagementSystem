package xkt.personal.mgmt.web.vo;

import java.util.Date;

import com.ls.pf.base.api.framework.DicAttribute;

import eeos.sp.core.base.vo.EBaseVo;

public class PersonalInfoChangeRecordVo extends EBaseVo{
	private String isHealthy;
	
	@DicAttribute(dicName = "syscode_code_dic", subType = "XKM_HealthyCode", key = "isHealthy")
	private String isHealthyName;
	
	private String reason;
	
	private Date updateTime;

	public String getIsHealthy() {
		return isHealthy;
	}

	public void setIsHealthy(String isHealthy) {
		this.isHealthy = isHealthy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsHealthyName() {
		return isHealthyName;
	}

	public void setIsHealthyName(String isHealthyName) {
		this.isHealthyName = isHealthyName;
	}
	
	
}
