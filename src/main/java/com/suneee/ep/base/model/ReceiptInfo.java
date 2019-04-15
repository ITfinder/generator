package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class ReceiptInfo {
    private String rid;

    private String mallNo;

    private String warehouseNo;

    private String receiptType;

    private String memo;

    private String whoPay;

    private BigDecimal postFee;

    private String wlName;

    private String wlNo;

    private String oid;

    private String tid;

    private String wid;

    private Date confirmTime;

    private String status;

    private Date inTime;

    private String createPersion;

    private Date createTime;

    private String isFeedback;

    private Date feedbackTime;

    private Short codeNum;

    private String confirmReson;

    private BigDecimal pointFee;

    private String confirmCode;

    private String isAllReturn;

    private BigDecimal claimantPostFee;

    private BigDecimal couponFee;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getMallNo() {
        return mallNo;
    }

    public void setMallNo(String mallNo) {
        this.mallNo = mallNo == null ? null : mallNo.trim();
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo == null ? null : warehouseNo.trim();
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType == null ? null : receiptType.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getWhoPay() {
        return whoPay;
    }

    public void setWhoPay(String whoPay) {
        this.whoPay = whoPay == null ? null : whoPay.trim();
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    public String getWlName() {
        return wlName;
    }

    public void setWlName(String wlName) {
        this.wlName = wlName == null ? null : wlName.trim();
    }

    public String getWlNo() {
        return wlNo;
    }

    public void setWlNo(String wlNo) {
        this.wlNo = wlNo == null ? null : wlNo.trim();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getCreatePersion() {
        return createPersion;
    }

    public void setCreatePersion(String createPersion) {
        this.createPersion = createPersion == null ? null : createPersion.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsFeedback() {
        return isFeedback;
    }

    public void setIsFeedback(String isFeedback) {
        this.isFeedback = isFeedback == null ? null : isFeedback.trim();
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public Short getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(Short codeNum) {
        this.codeNum = codeNum;
    }

    public String getConfirmReson() {
        return confirmReson;
    }

    public void setConfirmReson(String confirmReson) {
        this.confirmReson = confirmReson == null ? null : confirmReson.trim();
    }

    public BigDecimal getPointFee() {
        return pointFee;
    }

    public void setPointFee(BigDecimal pointFee) {
        this.pointFee = pointFee;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode == null ? null : confirmCode.trim();
    }

    public String getIsAllReturn() {
        return isAllReturn;
    }

    public void setIsAllReturn(String isAllReturn) {
        this.isAllReturn = isAllReturn == null ? null : isAllReturn.trim();
    }

    public BigDecimal getClaimantPostFee() {
        return claimantPostFee;
    }

    public void setClaimantPostFee(BigDecimal claimantPostFee) {
        this.claimantPostFee = claimantPostFee;
    }

    public BigDecimal getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(BigDecimal couponFee) {
        this.couponFee = couponFee;
    }
}