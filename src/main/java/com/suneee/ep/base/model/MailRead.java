package com.suneee.ep.base.model;

import java.util.Date;

public class MailRead {
    private Short id;

    private Short mailId;

    private String readPerson;

    private Date readTime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getMailId() {
        return mailId;
    }

    public void setMailId(Short mailId) {
        this.mailId = mailId;
    }

    public String getReadPerson() {
        return readPerson;
    }

    public void setReadPerson(String readPerson) {
        this.readPerson = readPerson == null ? null : readPerson.trim();
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }
}