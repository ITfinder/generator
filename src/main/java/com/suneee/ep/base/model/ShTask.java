package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShTask {
    private Short id;

    private String tid;

    private String oid;

    private String buyerNick;

    private String wid;

    private String taskStatus;

    private String eosFlag;

    private String busType;

    private String orderType;

    private String opType;

    private String sid;

    private String rid;

    private Date tradeTime;

    private Date createTime;

    private String mallNo;

    private Short eid;

    private String eosCode;

    private String refundId;

    private BigDecimal refundFee;

    private BigDecimal sellTotalFee;

    private BigDecimal refundPostFee;

    private BigDecimal postFee;

    private String operMode;

    private String tradeStatus;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public String getEosFlag() {
        return eosFlag;
    }

    public void setEosFlag(String eosFlag) {
        this.eosFlag = eosFlag == null ? null : eosFlag.trim();
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMallNo() {
        return mallNo;
    }

    public void setMallNo(String mallNo) {
        this.mallNo = mallNo == null ? null : mallNo.trim();
    }

    public Short getEid() {
        return eid;
    }

    public void setEid(Short eid) {
        this.eid = eid;
    }

    public String getEosCode() {
        return eosCode;
    }

    public void setEosCode(String eosCode) {
        this.eosCode = eosCode == null ? null : eosCode.trim();
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

    public BigDecimal getSellTotalFee() {
        return sellTotalFee;
    }

    public void setSellTotalFee(BigDecimal sellTotalFee) {
        this.sellTotalFee = sellTotalFee;
    }

    public BigDecimal getRefundPostFee() {
        return refundPostFee;
    }

    public void setRefundPostFee(BigDecimal refundPostFee) {
        this.refundPostFee = refundPostFee;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    public String getOperMode() {
        return operMode;
    }

    public void setOperMode(String operMode) {
        this.operMode = operMode == null ? null : operMode.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }
}