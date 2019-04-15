package com.suneee.ep.base.model;

import java.util.Date;

public class ShipInfo {
    private String oid;

    private String mallNo;

    private String warehouseNo;

    private String shipType;

    private String tid;

    private String buyerNick;

    private String cardNo;

    private String receiverName;

    private String receiverCountry;

    private String receiverState;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

    private String receiverMobile;

    private String receiverPhone;

    private String receiverEmail;

    private String wlName;

    private String status;

    private String createPersion;

    private Date createTime;

    private String isFeedback;

    private Date feedbackTime;

    private String invoiceNo;

    private String cancelFlag;

    private String cancelResult;

    private String cancelBackCode;

    private Date cancelBackTime;

    private String cancelBackMemo;

    private Short feedbackWeight;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
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

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry == null ? null : receiverCountry.trim();
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState == null ? null : receiverState.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail == null ? null : receiverEmail.trim();
    }

    public String getWlName() {
        return wlName;
    }

    public void setWlName(String wlName) {
        this.wlName = wlName == null ? null : wlName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag == null ? null : cancelFlag.trim();
    }

    public String getCancelResult() {
        return cancelResult;
    }

    public void setCancelResult(String cancelResult) {
        this.cancelResult = cancelResult == null ? null : cancelResult.trim();
    }

    public String getCancelBackCode() {
        return cancelBackCode;
    }

    public void setCancelBackCode(String cancelBackCode) {
        this.cancelBackCode = cancelBackCode == null ? null : cancelBackCode.trim();
    }

    public Date getCancelBackTime() {
        return cancelBackTime;
    }

    public void setCancelBackTime(Date cancelBackTime) {
        this.cancelBackTime = cancelBackTime;
    }

    public String getCancelBackMemo() {
        return cancelBackMemo;
    }

    public void setCancelBackMemo(String cancelBackMemo) {
        this.cancelBackMemo = cancelBackMemo == null ? null : cancelBackMemo.trim();
    }

    public Short getFeedbackWeight() {
        return feedbackWeight;
    }

    public void setFeedbackWeight(Short feedbackWeight) {
        this.feedbackWeight = feedbackWeight;
    }
}