package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TmpXkmChinaDistrict implements Serializable {
    private Integer id;

    private String districtFullName;

    private String districtCode;

    private String districtType;

    private String districtName;

    private String pDistrictCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrictFullName() {
        return districtFullName;
    }

    public void setDistrictFullName(String districtFullName) {
        this.districtFullName = districtFullName == null ? null : districtFullName.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getDistrictType() {
        return districtType;
    }

    public void setDistrictType(String districtType) {
        this.districtType = districtType == null ? null : districtType.trim();
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public String getpDistrictCode() {
        return pDistrictCode;
    }

    public void setpDistrictCode(String pDistrictCode) {
        this.pDistrictCode = pDistrictCode == null ? null : pDistrictCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", districtFullName=").append(districtFullName);
        sb.append(", districtCode=").append(districtCode);
        sb.append(", districtType=").append(districtType);
        sb.append(", districtName=").append(districtName);
        sb.append(", pDistrictCode=").append(pDistrictCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}