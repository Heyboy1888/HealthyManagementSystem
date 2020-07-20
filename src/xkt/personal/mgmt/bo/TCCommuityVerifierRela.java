package xkt.personal.mgmt.bo;

import java.io.Serializable;

public class TCCommuityVerifierRela implements Serializable {
    /**
     * 关系ID
     */
    private String relaId;

    /**
     * 小区ID
     */
    private String commuityId;

    /**
     * 检验员ID
     */
    private String verifierId;

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

    public String getVerifierId() {
        return verifierId;
    }

    public void setVerifierId(String verifierId) {
        this.verifierId = verifierId == null ? null : verifierId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relaId=").append(relaId);
        sb.append(", commuityId=").append(commuityId);
        sb.append(", verifierId=").append(verifierId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}