package xkt.personal.mgmt.bo;

import java.io.Serializable;
import java.util.Date;

public class TCPcLogInfo implements Serializable {
    /**
     * 主键
     */
    private Long logId;
    


    /**
     * 被查人员身份证号
     */
    private String checkedCardCode;

    /**
     * 访问时间
     */
    private Date createTime;

    /**
     * 登陆账号
     */
    private String loginNo;

    /**
     * 登陆人姓名
     */
    private String loginName;

    private String userAgent;

    /**
     * 功能模块;01锡康码02卫健委
     */
    private String moudleType;

    /**
     * 访问路径
     */
    private String requestUrl;

    /**
     * 远程地址
     */
    private String remoteAddr;

    /**
     * 请求入参
     */
    private String requestArgs;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 预留属性1
     */
    private String preAttr1;

    /**
     * 预留属性2
     */
    private String preAttr2;

    /**
     * 预留属性3
     */
    private String preAttr3;

    /**
     * 预留属性4
     */
    private String preAttr4;

    /**
     * 预留属性5
     */
    private String preAttr5;

    /**
     * 日志类型
     */
    private String logType;

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getCheckedCardCode() {
        return checkedCardCode;
    }

    public void setCheckedCardCode(String checkedCardCode) {
        this.checkedCardCode = checkedCardCode == null ? null : checkedCardCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoginNo() {
        return loginNo;
    }

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo == null ? null : loginNo.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    public String getMoudleType() {
        return moudleType;
    }

    public void setMoudleType(String moudleType) {
        this.moudleType = moudleType == null ? null : moudleType.trim();
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    public String getRequestArgs() {
        return requestArgs;
    }

    public void setRequestArgs(String requestArgs) {
        this.requestArgs = requestArgs == null ? null : requestArgs.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPreAttr1() {
        return preAttr1;
    }

    public void setPreAttr1(String preAttr1) {
        this.preAttr1 = preAttr1 == null ? null : preAttr1.trim();
    }

    public String getPreAttr2() {
        return preAttr2;
    }

    public void setPreAttr2(String preAttr2) {
        this.preAttr2 = preAttr2 == null ? null : preAttr2.trim();
    }

    public String getPreAttr3() {
        return preAttr3;
    }

    public void setPreAttr3(String preAttr3) {
        this.preAttr3 = preAttr3 == null ? null : preAttr3.trim();
    }

    public String getPreAttr4() {
        return preAttr4;
    }

    public void setPreAttr4(String preAttr4) {
        this.preAttr4 = preAttr4 == null ? null : preAttr4.trim();
    }

    public String getPreAttr5() {
        return preAttr5;
    }

    public void setPreAttr5(String preAttr5) {
        this.preAttr5 = preAttr5 == null ? null : preAttr5.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", checkedCardCode=").append(checkedCardCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginNo=").append(loginNo);
        sb.append(", loginName=").append(loginName);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", moudleType=").append(moudleType);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", remoteAddr=").append(remoteAddr);
        sb.append(", requestArgs=").append(requestArgs);
        sb.append(", requestMethod=").append(requestMethod);
        sb.append(", remark=").append(remark);
        sb.append(", preAttr1=").append(preAttr1);
        sb.append(", preAttr2=").append(preAttr2);
        sb.append(", preAttr3=").append(preAttr3);
        sb.append(", preAttr4=").append(preAttr4);
        sb.append(", preAttr5=").append(preAttr5);
        sb.append(", logType=").append(logType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}