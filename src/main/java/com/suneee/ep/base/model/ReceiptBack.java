package com.suneee.ep.base.model;

public class ReceiptBack {
    private Short recordId;

    private String rid;

    private Short unitId;

    private Short parentUnitId;

    private String skuCode;

    private Short realQuantity;

    private String status;

    private String itemWhoPay;

    private String postWhoPay;

    private String confirmCode;

    private String confirmReson;

    private String memo;

    private Short promotionParentId;

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

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
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

    public Short getPromotionParentId() {
        return promotionParentId;
    }

    public void setPromotionParentId(Short promotionParentId) {
        this.promotionParentId = promotionParentId;
    }
}