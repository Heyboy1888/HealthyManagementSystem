package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCompanyApply implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 单位id
     */
    private String companyId;

    /**
     * openid
     */
    private String openId;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 身份证md5
     */
    private String cardCode;

    /**
     * 身份证明文
     */
    private String brightCardCode;

    /**
     * 是否分支机构（0、否 1、是）
     */
    private String isBranch;

    /**
     * 上级姓名
     */
    private String parentInfoName;

    /**
     * 上级社会信息代码
     */
    private String parentInfoCode;

    /**
     * 分支机构层级
     */
    private String branchLevel;

    /**
     * 对外营业名称
     */
    private String externalName;

    /**
     * 行业分类
     */
    private String industryCat;

    /**
     * 实际经营地址
     */
    private String addressId;

    /**
     * 实际经营管理人姓名
     */
    private String actualName;

    /**
     * 实际经营管理人身份证
     */
    private String actualCertCode;

    /**
     * 实际经营管理人脱敏身份证
     */
    private String actualCertCodeHide;

    /**
     * 实际经营管理人MD5
     */
    private String actualCertCodeSecret;

    /**
     * 实际经营管理人手机号
     */
    private String actualMobile;

    /**
     * 身份证照片
     */
    private String certPic;

    /**
     * 店面照片
     */
    private String storePic;

    /**
     * 营业执照照片
     */
    private String busPic;

    /**
     * 审核状态（0、失败 1、成功）
     */
    private String checkStatus;

    /**
     * 审核理由
     */
    private String checkReason;

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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    public String getBrightCardCode() {
        return brightCardCode;
    }

    public void setBrightCardCode(String brightCardCode) {
        this.brightCardCode = brightCardCode == null ? null : brightCardCode.trim();
    }

    public String getIsBranch() {
        return isBranch;
    }

    public void setIsBranch(String isBranch) {
        this.isBranch = isBranch == null ? null : isBranch.trim();
    }

    public String getParentInfoName() {
        return parentInfoName;
    }

    public void setParentInfoName(String parentInfoName) {
        this.parentInfoName = parentInfoName == null ? null : parentInfoName.trim();
    }

    public String getParentInfoCode() {
        return parentInfoCode;
    }

    public void setParentInfoCode(String parentInfoCode) {
        this.parentInfoCode = parentInfoCode == null ? null : parentInfoCode.trim();
    }

    public String getBranchLevel() {
        return branchLevel;
    }

    public void setBranchLevel(String branchLevel) {
        this.branchLevel = branchLevel == null ? null : branchLevel.trim();
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName == null ? null : externalName.trim();
    }

    public String getIndustryCat() {
        return industryCat;
    }

    public void setIndustryCat(String industryCat) {
        this.industryCat = industryCat == null ? null : industryCat.trim();
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName == null ? null : actualName.trim();
    }

    public String getActualCertCode() {
        return actualCertCode;
    }

    public void setActualCertCode(String actualCertCode) {
        this.actualCertCode = actualCertCode == null ? null : actualCertCode.trim();
    }

    public String getActualCertCodeHide() {
        return actualCertCodeHide;
    }

    public void setActualCertCodeHide(String actualCertCodeHide) {
        this.actualCertCodeHide = actualCertCodeHide == null ? null : actualCertCodeHide.trim();
    }

    public String getActualCertCodeSecret() {
        return actualCertCodeSecret;
    }

    public void setActualCertCodeSecret(String actualCertCodeSecret) {
        this.actualCertCodeSecret = actualCertCodeSecret == null ? null : actualCertCodeSecret.trim();
    }

    public String getActualMobile() {
        return actualMobile;
    }

    public void setActualMobile(String actualMobile) {
        this.actualMobile = actualMobile == null ? null : actualMobile.trim();
    }

    public String getCertPic() {
        return certPic;
    }

    public void setCertPic(String certPic) {
        this.certPic = certPic == null ? null : certPic.trim();
    }

    public String getStorePic() {
        return storePic;
    }

    public void setStorePic(String storePic) {
        this.storePic = storePic == null ? null : storePic.trim();
    }

    public String getBusPic() {
        return busPic;
    }

    public void setBusPic(String busPic) {
        this.busPic = busPic == null ? null : busPic.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getCheckReason() {
        return checkReason;
    }

    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason == null ? null : checkReason.trim();
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
        sb.append(", companyId=").append(companyId);
        sb.append(", openId=").append(openId);
        sb.append(", channel=").append(channel);
        sb.append(", cardCode=").append(cardCode);
        sb.append(", brightCardCode=").append(brightCardCode);
        sb.append(", isBranch=").append(isBranch);
        sb.append(", parentInfoName=").append(parentInfoName);
        sb.append(", parentInfoCode=").append(parentInfoCode);
        sb.append(", branchLevel=").append(branchLevel);
        sb.append(", externalName=").append(externalName);
        sb.append(", industryCat=").append(industryCat);
        sb.append(", addressId=").append(addressId);
        sb.append(", actualName=").append(actualName);
        sb.append(", actualCertCode=").append(actualCertCode);
        sb.append(", actualCertCodeHide=").append(actualCertCodeHide);
        sb.append(", actualCertCodeSecret=").append(actualCertCodeSecret);
        sb.append(", actualMobile=").append(actualMobile);
        sb.append(", certPic=").append(certPic);
        sb.append(", storePic=").append(storePic);
        sb.append(", busPic=").append(busPic);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", checkReason=").append(checkReason);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}