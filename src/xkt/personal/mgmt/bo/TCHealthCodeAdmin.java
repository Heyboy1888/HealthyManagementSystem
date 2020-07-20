package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthCodeAdmin implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String cardCode;

    /**
     * 脱敏身份证
     */
    private String cardCodeHide;

    /**
     * 明文身份证
     */
    private String cardCodeBright;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 社区id
     */
    private String communityId;

    /**
     * 警察局id
     */
    private String policeStationId;

    /**
     * 是否特殊账号（0、否 1、是）
     */
    private String isSpecial;

    /**
     * 管理员类型（0、核查和网格 1、核查 2、网格）
     */
    private String adminType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 人员类型（01:业务人员;02:区管理员;03:街道管理员）
     */
    private String personnelType;

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

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    public String getCardCodeHide() {
        return cardCodeHide;
    }

    public void setCardCodeHide(String cardCodeHide) {
        this.cardCodeHide = cardCodeHide == null ? null : cardCodeHide.trim();
    }

    public String getCardCodeBright() {
        return cardCodeBright;
    }

    public void setCardCodeBright(String cardCodeBright) {
        this.cardCodeBright = cardCodeBright == null ? null : cardCodeBright.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId == null ? null : communityId.trim();
    }

    public String getPoliceStationId() {
        return policeStationId;
    }

    public void setPoliceStationId(String policeStationId) {
        this.policeStationId = policeStationId == null ? null : policeStationId.trim();
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial == null ? null : isSpecial.trim();
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType == null ? null : adminType.trim();
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

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType == null ? null : personnelType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realName=").append(realName);
        sb.append(", cardCode=").append(cardCode);
        sb.append(", cardCodeHide=").append(cardCodeHide);
        sb.append(", cardCodeBright=").append(cardCodeBright);
        sb.append(", password=").append(password);
        sb.append(", mobile=").append(mobile);
        sb.append(", certType=").append(certType);
        sb.append(", communityId=").append(communityId);
        sb.append(", policeStationId=").append(policeStationId);
        sb.append(", isSpecial=").append(isSpecial);
        sb.append(", adminType=").append(adminType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", personnelType=").append(personnelType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}