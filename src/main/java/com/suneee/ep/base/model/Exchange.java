package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class Exchange {
    private Short id;

    private String code;

    private String remark;

    private String itemPay;

    private String whoPay;

    private Short postFee;

    private String wlNo;

    private String wlName;

    private Date postTime;

    private String tid;

    private String sendWlName;

    private BigDecimal sendPostFee;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getItemPay() {
        return itemPay;
    }

    public void setItemPay(String itemPay) {
        this.itemPay = itemPay == null ? null : itemPay.trim();
    }

    public String getWhoPay() {
        return whoPay;
    }

    public void setWhoPay(String whoPay) {
        this.whoPay = whoPay == null ? null : whoPay.trim();
    }

    public Short getPostFee() {
        return postFee;
    }

    public void setPostFee(Short postFee) {
        this.postFee = postFee;
    }

    public String getWlNo() {
        return wlNo;
    }

    public void setWlNo(String wlNo) {
        this.wlNo = wlNo == null ? null : wlNo.trim();
    }

    public String getWlName() {
        return wlName;
    }

    public void setWlName(String wlName) {
        this.wlName = wlName == null ? null : wlName.trim();
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getSendWlName() {
        return sendWlName;
    }

    public void setSendWlName(String sendWlName) {
        this.sendWlName = sendWlName == null ? null : sendWlName.trim();
    }

    public BigDecimal getSendPostFee() {
        return sendPostFee;
    }

    public void setSendPostFee(BigDecimal sendPostFee) {
        this.sendPostFee = sendPostFee;
    }
}