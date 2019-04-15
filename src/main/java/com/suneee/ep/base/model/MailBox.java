package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class MailBox {
    private String boxId;

    private String boxNo;

    private String boxName;

    private String directory;

    private BigDecimal sizeLimited;

    private String updator;

    private Date updateTime;

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId == null ? null : boxId.trim();
    }

    public String getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo == null ? null : boxNo.trim();
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName == null ? null : boxName.trim();
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory == null ? null : directory.trim();
    }

    public BigDecimal getSizeLimited() {
        return sizeLimited;
    }

    public void setSizeLimited(BigDecimal sizeLimited) {
        this.sizeLimited = sizeLimited;
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