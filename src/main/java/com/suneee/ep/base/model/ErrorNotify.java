package com.suneee.ep.base.model;

import java.util.Date;

public class ErrorNotify {
    private Short errorId;

    private String errorType;

    private String interfaceName;

    private String errorCode;

    private String remark;

    private Date createTime;

    private String isNotify;

    private Date notifyTime;

    public Short getErrorId() {
        return errorId;
    }

    public void setErrorId(Short errorId) {
        this.errorId = errorId;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType == null ? null : errorType.trim();
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(String isNotify) {
        this.isNotify = isNotify == null ? null : isNotify.trim();
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }
}