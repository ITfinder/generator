package com.suneee.ep.base.model;

import java.util.Date;

public class MessageShortMsg {
    private String flowno;

    private String sendperson;

    private String recpersons;

    private String msgcont;

    private Date sendtime;

    private String pre01;

    private String pre02;

    private String delFlag;

    private String offLine;

    public String getFlowno() {
        return flowno;
    }

    public void setFlowno(String flowno) {
        this.flowno = flowno == null ? null : flowno.trim();
    }

    public String getSendperson() {
        return sendperson;
    }

    public void setSendperson(String sendperson) {
        this.sendperson = sendperson == null ? null : sendperson.trim();
    }

    public String getRecpersons() {
        return recpersons;
    }

    public void setRecpersons(String recpersons) {
        this.recpersons = recpersons == null ? null : recpersons.trim();
    }

    public String getMsgcont() {
        return msgcont;
    }

    public void setMsgcont(String msgcont) {
        this.msgcont = msgcont == null ? null : msgcont.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getPre01() {
        return pre01;
    }

    public void setPre01(String pre01) {
        this.pre01 = pre01 == null ? null : pre01.trim();
    }

    public String getPre02() {
        return pre02;
    }

    public void setPre02(String pre02) {
        this.pre02 = pre02 == null ? null : pre02.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getOffLine() {
        return offLine;
    }

    public void setOffLine(String offLine) {
        this.offLine = offLine == null ? null : offLine.trim();
    }
}