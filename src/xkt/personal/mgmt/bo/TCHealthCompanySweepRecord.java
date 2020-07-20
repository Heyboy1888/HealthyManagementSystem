package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCompanySweepRecord implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * openid
     */
    private String openId;

    /**
     * 身份证
     */
    private String certCode;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 公司id
     */
    private String companyId;
    
    /**
     * 公司分部id
     */
    private String companySubId;

    /**
     * 健康状态
     */
    private String isHealth;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }
    
    

    public String getCompanySubId() {
		return companySubId;
	}

	public void setCompanySubId(String companySubId) {
		this.companySubId = companySubId;
	}

	public String getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(String isHealth) {
        this.isHealth = isHealth == null ? null : isHealth.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "TCHealthCompanySweepRecord [id=" + id + ", openId=" + openId
				+ ", certCode=" + certCode + ", realName=" + realName
				+ ", companyId=" + companyId + ", companySubId=" + companySubId
				+ ", isHealth=" + isHealth + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

   
}