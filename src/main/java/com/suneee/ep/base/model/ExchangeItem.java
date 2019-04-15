package com.suneee.ep.base.model;

public class ExchangeItem {
    private Short id;

    private Short eid;

    private String oldTitle;

    private String oldNumid;

    private String oldOuterid;

    private Short oldNum;

    private String newNumid;

    private String newOuterid;

    private Short newNum;

    private String orderId;

    private Short unitId;

    private Short parentUnitId;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getEid() {
        return eid;
    }

    public void setEid(Short eid) {
        this.eid = eid;
    }

    public String getOldTitle() {
        return oldTitle;
    }

    public void setOldTitle(String oldTitle) {
        this.oldTitle = oldTitle == null ? null : oldTitle.trim();
    }

    public String getOldNumid() {
        return oldNumid;
    }

    public void setOldNumid(String oldNumid) {
        this.oldNumid = oldNumid == null ? null : oldNumid.trim();
    }

    public String getOldOuterid() {
        return oldOuterid;
    }

    public void setOldOuterid(String oldOuterid) {
        this.oldOuterid = oldOuterid == null ? null : oldOuterid.trim();
    }

    public Short getOldNum() {
        return oldNum;
    }

    public void setOldNum(Short oldNum) {
        this.oldNum = oldNum;
    }

    public String getNewNumid() {
        return newNumid;
    }

    public void setNewNumid(String newNumid) {
        this.newNumid = newNumid == null ? null : newNumid.trim();
    }

    public String getNewOuterid() {
        return newOuterid;
    }

    public void setNewOuterid(String newOuterid) {
        this.newOuterid = newOuterid == null ? null : newOuterid.trim();
    }

    public Short getNewNum() {
        return newNum;
    }

    public void setNewNum(Short newNum) {
        this.newNum = newNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Short getUnitId() {
        return unitId;
    }

    public void setUnitId(Short unitId) {
        this.unitId = unitId;
    }

    public Short getParentUnitId() {
        return parentUnitId;
    }

    public void setParentUnitId(Short parentUnitId) {
        this.parentUnitId = parentUnitId;
    }
}