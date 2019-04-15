package com.suneee.ep.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class WmsMallItem extends WmsMallItemKey {
    private Short itemId;

    private Short itemNum;

    private Short safeNum;

    private Short lockNum;

    private Short sellNum;

    private Date stockUpdate;

    private BigDecimal itemPrice;

    private BigDecimal newPrice;

    private BigDecimal sellPrice;

    private Date priceUpdate;

    private String needUpdate;

    private String itemName;

    private String feedId;

    private Short juNum;

    private Short currentJuNum;

    private String status;

    private String confirmPerson;

    private String wareHouse;

    public Short getItemId() {
        return itemId;
    }

    public void setItemId(Short itemId) {
        this.itemId = itemId;
    }

    public Short getItemNum() {
        return itemNum;
    }

    public void setItemNum(Short itemNum) {
        this.itemNum = itemNum;
    }

    public Short getSafeNum() {
        return safeNum;
    }

    public void setSafeNum(Short safeNum) {
        this.safeNum = safeNum;
    }

    public Short getLockNum() {
        return lockNum;
    }

    public void setLockNum(Short lockNum) {
        this.lockNum = lockNum;
    }

    public Short getSellNum() {
        return sellNum;
    }

    public void setSellNum(Short sellNum) {
        this.sellNum = sellNum;
    }

    public Date getStockUpdate() {
        return stockUpdate;
    }

    public void setStockUpdate(Date stockUpdate) {
        this.stockUpdate = stockUpdate;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Date getPriceUpdate() {
        return priceUpdate;
    }

    public void setPriceUpdate(Date priceUpdate) {
        this.priceUpdate = priceUpdate;
    }

    public String getNeedUpdate() {
        return needUpdate;
    }

    public void setNeedUpdate(String needUpdate) {
        this.needUpdate = needUpdate == null ? null : needUpdate.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId == null ? null : feedId.trim();
    }

    public Short getJuNum() {
        return juNum;
    }

    public void setJuNum(Short juNum) {
        this.juNum = juNum;
    }

    public Short getCurrentJuNum() {
        return currentJuNum;
    }

    public void setCurrentJuNum(Short currentJuNum) {
        this.currentJuNum = currentJuNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(String confirmPerson) {
        this.confirmPerson = confirmPerson == null ? null : confirmPerson.trim();
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse == null ? null : wareHouse.trim();
    }
}