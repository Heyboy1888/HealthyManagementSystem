package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCompanyInfo implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 单位名称
     */
    private String companyName;

    /**
     * 注册地址
     */
    private String regAddress;

    /**
     * 社会信息代码
     */
    private String infoCode;

    /**
     * 工商注册号
     */
    private String regNo;

    /**
     * 法定代表人姓名
     */
    private String legalName;

    /**
     * 法定代表人身份证
     */
    private String legalCardNo;

    /**
     * 组织机构代码
     */
    private String orgNo;

    /**
     * 起源
     */
    private String origin;

    /**
     * 是否认证（0、否 1、是）
     */
    private String isAccred;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode == null ? null : infoCode.trim();
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalCardNo() {
        return legalCardNo;
    }

    public void setLegalCardNo(String legalCardNo) {
        this.legalCardNo = legalCardNo == null ? null : legalCardNo.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getIsAccred() {
        return isAccred;
    }

    public void setIsAccred(String isAccred) {
        this.isAccred = isAccred == null ? null : isAccred.trim();
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
        sb.append(", companyName=").append(companyName);
        sb.append(", regAddress=").append(regAddress);
        sb.append(", infoCode=").append(infoCode);
        sb.append(", regNo=").append(regNo);
        sb.append(", legalName=").append(legalName);
        sb.append(", legalCardNo=").append(legalCardNo);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", origin=").append(origin);
        sb.append(", isAccred=").append(isAccred);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}