package com.suneee.ep.base.model;

import java.util.Date;

public class MailForSend {
    private Short mailId;

    private Short sendedTimes;

    private Date inTimes;

    public Short getMailId() {
        return mailId;
    }

    public void setMailId(Short mailId) {
        this.mailId = mailId;
    }

    public Short getSendedTimes() {
        return sendedTimes;
    }

    public void setSendedTimes(Short sendedTimes) {
        this.sendedTimes = sendedTimes;
    }

    public Date getInTimes() {
        return inTimes;
    }

    public void setInTimes(Date inTimes) {
        this.inTimes = inTimes;
    }
}