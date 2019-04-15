package com.suneee.ep.base.model;

import java.util.Date;

public class MailRecvConfig {
    private Short cfgId;

    private String popServer;

    private String account;

    private String pass;

    private String keepBackup;

    private String updator;

    private Date updateTime;

    public Short getCfgId() {
        return cfgId;
    }

    public void setCfgId(Short cfgId) {
        this.cfgId = cfgId;
    }

    public String getPopServer() {
        return popServer;
    }

    public void setPopServer(String popServer) {
        this.popServer = popServer == null ? null : popServer.trim();
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

    public String getKeepBackup() {
        return keepBackup;
    }

    public void setKeepBackup(String keepBackup) {
        this.keepBackup = keepBackup == null ? null : keepBackup.trim();
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
}