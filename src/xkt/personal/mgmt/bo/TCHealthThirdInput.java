package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthThirdInput implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 身份证号
     */
    private String certCode;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 区域
     */
    private String currentDistrict;

    /**
     * 街道
     */
    private String currentStreet;

    /**
     * 社区
     */
    private String currentCommunity;
    
    /**
     * 社区
     */
    private String communityCode;


    /**
     * 社区核对时间
     */
    private Date communityCheckDate;

    /**
     * 居家状态
     */
    private String currentType;

    /**
     * 状态
     */
    private String flag;

    /**
     * 渠道
     */
    private String channel;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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

    public Date getCommunityCheckDate() {
        return communityCheckDate;
    }

    public void setCommunityCheckDate(Date communityCheckDate) {
        this.communityCheckDate = communityCheckDate;
    }

    public String getCurrentType() {
        return currentType;
    }

    public void setCurrentType(String currentType) {
        this.currentType = currentType == null ? null : currentType.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
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
    
    

    public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", certCode=").append(certCode);
        sb.append(", realName=").append(realName);
        sb.append(", mobile=").append(mobile);
        sb.append(", currentDistrict=").append(currentDistrict);
        sb.append(", currentStreet=").append(currentStreet);
        sb.append(", currentCommunity=").append(currentCommunity);
        sb.append(", communityCheckDate=").append(communityCheckDate);
        sb.append(", currentType=").append(currentType);
        sb.append(", flag=").append(flag);
        sb.append(", channel=").append(channel);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}