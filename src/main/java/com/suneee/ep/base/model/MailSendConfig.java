package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class MailSendConfig {
    private Short cfgId;

    private String smtpServer;

    private String account;

    private String pass;

    private String sendAddr;

    private String sendSrc;

    private Short redoTimes;

    private Short redoInter;

    private BigDecimal addedLimited;

    private String updator;

    private Date updateTime;

    private String sendPartial;

    public Short getCfgId() {
        return cfgId;
    }

    public void setCfgId(Short cfgId) {
        this.cfgId = cfgId;
    }

    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer == null ? null : smtpServer.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getSendAddr() {
        return sendAddr;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr == null ? null : sendAddr.trim();
    }

    public String getSendSrc() {
        return sendSrc;
    }

    public void setSendSrc(String sendSrc) {
        this.sendSrc = sendSrc == null ? null : sendSrc.trim();
    }

    public Short getRedoTimes() {
        return redoTimes;
    }

    public void setRedoTimes(Short redoTimes) {
        this.redoTimes = redoTimes;
    }

    public Short getRedoInter() {
        return redoInter;
    }

    public void setRedoInter(Short redoInter) {
        this.redoInter = redoInter;
    }

    public BigDecimal getAddedLimited() {
        return addedLimited;
    }

    public void setAddedLimited(BigDecimal addedLimited) {
        this.addedLimited = addedLimited;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSendPartial() {
        return sendPartial;
    }

    public void setSendPartial(String sendPartial) {
        this.sendPartial = sendPartial == null ? null : sendPartial.trim();
    }
}