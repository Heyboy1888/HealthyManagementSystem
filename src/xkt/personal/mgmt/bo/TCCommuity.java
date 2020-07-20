package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TCCommuity implements Serializable {
    /**
     * 小区ID
     */
    private String commuityId;

    /**
     * 小区分类
     */
    private String cmmtyType;

    /**
     * 小区编号
     */
    private String commuityNo;

    /**
     * 小区名称
     */
    private String commuityName;

    /**
     * 省码
     */
    private String provinceCode;

    /**
     * 市码
     */
    private String cityCode;

    /**
     * 区县码
     */
    private String countyCode;

    /**
     * 街道码（乡镇）
     */
    private String streetCode;

    /**
     * 居委会码（村）
     */
    private String villageCode;

    /**
     * 道路码
     */
    private String roadCode;

    /**
     * 小区地址
     */
    private String commuityAddr;

    /**
     * 单位
     */
    private String orgNo;

    private static final long serialVersionUID = 1L;

    public String getCommuityId() {
        return commuityId;
    }

    public void setCommuityId(String commuityId) {
        this.commuityId = commuityId == null ? null : commuityId.trim();
    }

    public String getCmmtyType() {
        return cmmtyType;
    }

    public void setCmmtyType(String cmmtyType) {
        this.cmmtyType = cmmtyType == null ? null : cmmtyType.trim();
    }

    public String getCommuityNo() {
        return commuityNo;
    }

    public void setCommuityNo(String commuityNo) {
        this.commuityNo = commuityNo == null ? null : commuityNo.trim();
    }

    public String getCommuityName() {
        return commuityName;
    }

    public void setCommuityName(String commuityName) {
        this.commuityName = commuityName == null ? null : commuityName.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode == null ? null : streetCode.trim();
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode == null ? null : villageCode.trim();
    }

    public String getRoadCode() {
        return roadCode;
    }

    public void setRoadCode(String roadCode) {
        this.roadCode = roadCode == null ? null : roadCode.trim();
    }

    public String getCommuityAddr() {
        return commuityAddr;
    }

    public void setCommuityAddr(String commuityAddr) {
        this.commuityAddr = commuityAddr == null ? null : commuityAddr.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commuityId=").append(commuityId);
        sb.append(", cmmtyType=").append(cmmtyType);
        sb.append(", commuityNo=").append(commuityNo);
        sb.append(", commuityName=").append(commuityName);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", countyCode=").append(countyCode);
        sb.append(", streetCode=").append(streetCode);
        sb.append(", villageCode=").append(villageCode);
        sb.append(", roadCode=").append(roadCode);
        sb.append(", commuityAddr=").append(commuityAddr);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}