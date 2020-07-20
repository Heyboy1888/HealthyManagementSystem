package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TGRegionCatalog implements Serializable {
    private Integer id;

    /**
     * 账户编号
     */
    private String accountCode;

    /**
     * 父账户编号
     */
    private String pId;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 区域编码
     */
    private String districtCode;

    /**
     * 街道编码
     */
    private String streetCode;

    /**
     * 社区编码
     */
    private String communityCode;

    /**
     * 级别
     */
    private String levelNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode == null ? null : streetCode.trim();
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode == null ? null : communityCode.trim();
    }

    public String getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(String levelNum) {
        this.levelNum = levelNum == null ? null : levelNum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", pId=").append(pId);
        sb.append(", accountName=").append(accountName);
        sb.append(", districtCode=").append(districtCode);
        sb.append(", streetCode=").append(streetCode);
        sb.append(", communityCode=").append(communityCode);
        sb.append(", levelNum=").append(levelNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}