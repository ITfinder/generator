package com.suneee.ep.base.model;

import java.math.BigDecimal;

public class ReceiptDetail {
    private Short recordId;

    private String rid;

    private String skuCode;

    private Short quantity;

    private String itemStyle;

    private String resonCode;

    private Short realQuantity;

    private String status;

    private String itemWhoPay;

    private String postWhoPay;

    private String confirmCode;

    private String confirmReson;

    private String memo;

    private BigDecimal price;

    private Short unitId;

    private Short parentUnitId;

    private Short promotionParentId;

    private BigDecimal origeinPrice;

    private BigDecimal actualPrice;

    private BigDecimal lineAmount;

    public Short getRecordId() {
        return recordId;
    }

    public void setRecordId(Short recordId) {
        this.recordId = recordId;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public String getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(String itemStyle) {
        this.itemStyle = itemStyle == null ? null : itemStyle.trim();
    }

    public String getResonCode() {
        return resonCode;
    }

    public void setResonCode(String resonCode) {
        this.resonCode = resonCode == null ? null : resonCode.trim();
    }

    public Short getRealQuantity() {
        return realQuantity;
    }

    public void setRealQuantity(Short realQuantity) {
        this.realQuantity = realQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getItemWhoPay() {
        return itemWhoPay;
    }

    public void setItemWhoPay(String itemWhoPay) {
        this.itemWhoPay = itemWhoPay == null ? null : itemWhoPay.trim();
    }

    public String getPostWhoPay() {
        return postWhoPay;
    }

    public void setPostWhoPay(String postWhoPay) {
        this.postWhoPay = postWhoPay == null ? null : postWhoPay.trim();
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode == null ? null : confirmCode.trim();
    }

    public String getConfirmReson() {
        return confirmReson;
    }

    public void setConfirmReson(String confirmReson) {
        this.confirmReson = confirmReson == null ? null : confirmReson.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public Short getPromotionParentId() {
        return promotionParentId;
    }

    public void setPromotionParentId(Short promotionParentId) {
        this.promotionParentId = promotionParentId;
    }

    public BigDecimal getOrigeinPrice() {
        return origeinPrice;
    }

    public void setOrigeinPrice(BigDecimal origeinPrice) {
        this.origeinPrice = origeinPrice;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public BigDecimal getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(BigDecimal lineAmount) {
        this.lineAmount = lineAmount;
    }
}