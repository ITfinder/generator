package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShipOrder {
    private Short orderId;

    private String oid;

    private String tid;

    private String buyerMemo;

    private String csMemo;

    private Date payTime;

    private BigDecimal payFee;

    private String needInvoice;

    private String outStatus;

    private Date outTime;

    private String wlName;

    private String wlNo;

    private String wtcCardNo;

    private String wid;

    private String invoiceNo;

    private String tidOrigin;

    private String widOrigin;

    private String invoiceCode;

    public Short getOrderId() {
        return orderId;
    }

    public void setOrderId(Short orderId) {
        this.orderId = orderId;
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

    public String getBuyerMemo() {
        return buyerMemo;
    }

    public void setBuyerMemo(String buyerMemo) {
        this.buyerMemo = buyerMemo == null ? null : buyerMemo.trim();
    }

    public String getCsMemo() {
        return csMemo;
    }

    public void setCsMemo(String csMemo) {
        this.csMemo = csMemo == null ? null : csMemo.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(String needInvoice) {
        this.needInvoice = needInvoice == null ? null : needInvoice.trim();
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus == null ? null : outStatus.trim();
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
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

    public String getWtcCardNo() {
        return wtcCardNo;
    }

    public void setWtcCardNo(String wtcCardNo) {
        this.wtcCardNo = wtcCardNo == null ? null : wtcCardNo.trim();
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getTidOrigin() {
        return tidOrigin;
    }

    public void setTidOrigin(String tidOrigin) {
        this.tidOrigin = tidOrigin == null ? null : tidOrigin.trim();
    }

    public String getWidOrigin() {
        return widOrigin;
    }

    public void setWidOrigin(String widOrigin) {
        this.widOrigin = widOrigin == null ? null : widOrigin.trim();
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }
}