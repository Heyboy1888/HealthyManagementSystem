package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCodeModifyRecord implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 身份证号（md5加密）
     */
    private String certCode;

    /**
     * 修改前个人健康状态。0不健康，1健康，2异常，3红码待审核'
     */
    private String isHealthyBefore;

    /**
     * 修改后个人健康状态。0不健康，1健康，2异常，3红码待审核'
     */
    private String isHealthyAfter;

    /**
     * 隔离天数
     */
    private Integer isolationDays;

    /**
     * 隔离日期
     */
    private Date isolationDate;

    /**
     * 修改编码
     */
    private String modifyCode;

    /**
     * 变更理由
     */
    private String modifyReason;

    /**
     * 修改人
     */
    private String modifyPerson;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getIsHealthyBefore() {
        return isHealthyBefore;
    }

    public void setIsHealthyBefore(String isHealthyBefore) {
        this.isHealthyBefore = isHealthyBefore == null ? null : isHealthyBefore.trim();
    }

    public String getIsHealthyAfter() {
        return isHealthyAfter;
    }

    public void setIsHealthyAfter(String isHealthyAfter) {
        this.isHealthyAfter = isHealthyAfter == null ? null : isHealthyAfter.trim();
    }

    public Integer getIsolationDays() {
        return isolationDays;
    }

    public void setIsolationDays(Integer isolationDays) {
        this.isolationDays = isolationDays;
    }

    public Date getIsolationDate() {
        return isolationDate;
    }

    public void setIsolationDate(Date isolationDate) {
        this.isolationDate = isolationDate;
    }

    public String getModifyCode() {
        return modifyCode;
    }

    public void setModifyCode(String modifyCode) {
        this.modifyCode = modifyCode == null ? null : modifyCode.trim();
    }

    public String getModifyReason() {
        return modifyReason;
    }

    public void setModifyReason(String modifyReason) {
        this.modifyReason = modifyReason == null ? null : modifyReason.trim();
    }

    public String getModifyPerson() {
        return modifyPerson;
    }

    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson == null ? null : modifyPerson.trim();
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
        sb.append(", realName=").append(realName);
        sb.append(", certCode=").append(certCode);
        sb.append(", isHealthyBefore=").append(isHealthyBefore);
        sb.append(", isHealthyAfter=").append(isHealthyAfter);
        sb.append(", isolationDays=").append(isolationDays);
        sb.append(", isolationDate=").append(isolationDate);
        sb.append(", modifyCode=").append(modifyCode);
        sb.append(", modifyReason=").append(modifyReason);
        sb.append(", modifyPerson=").append(modifyPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}