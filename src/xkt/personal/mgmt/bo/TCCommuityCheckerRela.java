package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TCCommuityCheckerRela implements Serializable {
    /**
     * 关系ID
     */
    private String relaId;

    /**
     * 小区ID
     */
    private String commuityId;

    /**
     * 审核员ID
     */
    private String checkerId;

    private static final long serialVersionUID = 1L;

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId == null ? null : relaId.trim();
    }

    public String getCommuityId() {
        return commuityId;
    }

    public void setCommuityId(String commuityId) {
        this.commuityId = commuityId == null ? null : commuityId.trim();
    }

    public String getCheckerId() {
        return checkerId;
    }

    public void setCheckerId(String checkerId) {
        this.checkerId = checkerId == null ? null : checkerId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relaId=").append(relaId);
        sb.append(", commuityId=").append(commuityId);
        sb.append(", checkerId=").append(checkerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}