package com.suneee.ep.base.model;

import java.util.Date;

public class MailMessageId {
    private String messgeId;

    private Date inTime;

    public String getMessgeId() {
        return messgeId;
    }

    public void setMessgeId(String messgeId) {
        this.messgeId = messgeId == null ? null : messgeId.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }
}