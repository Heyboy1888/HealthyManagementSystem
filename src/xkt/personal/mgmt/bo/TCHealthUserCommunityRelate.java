package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCHealthUserCommunityRelate implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 社区id
     */
    private String communityId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 扩展属性1
     */
    private String extAttr1;

    /**
     * 扩展属性2
     */
    private String extAttr2;

    /**
     * 扩展属性3
     */
    private String extAttr3;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId == null ? null : communityId.trim();
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

    public String getExtAttr1() {
        return extAttr1;
    }

    public void setExtAttr1(String extAttr1) {
        this.extAttr1 = extAttr1 == null ? null : extAttr1.trim();
    }

    public String getExtAttr2() {
        return extAttr2;
    }

    public void setExtAttr2(String extAttr2) {
        this.extAttr2 = extAttr2 == null ? null : extAttr2.trim();
    }

    public String getExtAttr3() {
        return extAttr3;
    }

    public void setExtAttr3(String extAttr3) {
        this.extAttr3 = extAttr3 == null ? null : extAttr3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realName=").append(realName);
        sb.append(", mobile=").append(mobile);
        sb.append(", communityId=").append(communityId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", extAttr1=").append(extAttr1);
        sb.append(", extAttr2=").append(extAttr2);
        sb.append(", extAttr3=").append(extAttr3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}