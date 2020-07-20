package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCodeSweepRecord implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 证件号
     */
    private String certCode;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 是否健康
     */
    private String isHealth;

    /**
     * 社区id
     */
    private String communityId;

    /**
     * 操作人员
     */
    private String checkPerson;

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

    public String getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(String isHealth) {
        this.isHealth = isHealth == null ? null : isHealth.trim();
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId == null ? null : communityId.trim();
    }

    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson == null ? null : checkPerson.trim();
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", certCode=").append(certCode);
        sb.append(", realName=").append(realName);
        sb.append(", isHealth=").append(isHealth);
        sb.append(", communityId=").append(communityId);
        sb.append(", checkPerson=").append(checkPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}