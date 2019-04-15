package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class MailBody {
    private Short mailId;

    private String fromAddr;

    private String toAddr;

    private String copyToAddr;

    private String secretToAddr;

    private String subject;

    private String mailType;

    private String mailFlag;

    private String srcAdded;

    private String decAdded;

    private BigDecimal mailSize;

    private Date inTime;

    private Date sendTime;

    private String sendRet;

    private Date operTime;

    private String workNo;

    private String boxId;

    private String content;

    public Short getMailId() {
        return mailId;
    }

    public void setMailId(Short mailId) {
        this.mailId = mailId;
    }

    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr == null ? null : fromAddr.trim();
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr == null ? null : toAddr.trim();
    }

    public String getCopyToAddr() {
        return copyToAddr;
    }

    public void setCopyToAddr(String copyToAddr) {
        this.copyToAddr = copyToAddr == null ? null : copyToAddr.trim();
    }

    public String getSecretToAddr() {
        return secretToAddr;
    }

    public void setSecretToAddr(String secretToAddr) {
        this.secretToAddr = secretToAddr == null ? null : secretToAddr.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getMailType() {
        return mailType;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType == null ? null : mailType.trim();
    }

    public String getMailFlag() {
        return mailFlag;
    }

    public void setMailFlag(String mailFlag) {
        this.mailFlag = mailFlag == null ? null : mailFlag.trim();
    }

    public String getSrcAdded() {
        return srcAdded;
    }

    public void setSrcAdded(String srcAdded) {
        this.srcAdded = srcAdded == null ? null : srcAdded.trim();
    }

    public String getDecAdded() {
        return decAdded;
    }

    public void setDecAdded(String decAdded) {
        this.decAdded = decAdded == null ? null : decAdded.trim();
    }

    public BigDecimal getMailSize() {
        return mailSize;
    }

    public void setMailSize(BigDecimal mailSize) {
        this.mailSize = mailSize;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendRet() {
        return sendRet;
    }

    public void setSendRet(String sendRet) {
        this.sendRet = sendRet == null ? null : sendRet.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId == null ? null : boxId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}