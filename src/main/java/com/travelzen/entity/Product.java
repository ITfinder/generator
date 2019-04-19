package com.travelzen.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Long id;

    private String number;

    private BigDecimal faceValue;

    private BigDecimal priceNoneTax;

    private BigDecimal priceContainTax;

    private BigDecimal priceCostTax;

    private Boolean isDistinguishServer;

    private String distinguishServerId;

    private String useHelp;

    private String useScope;

    private Integer orderThreshold;

    private String thresholdType;

    private String type;

    private Integer status;

    private String remark;

    private Boolean isDeleted;

    private Long categoryId;

    private String requestParams;

    private BigDecimal validDuration;

    private Integer validDurationUnit;

    private String platformType;

    private String creator;

    private Long creatorId;

    private Date createTime;

    private String lastOperator;

    private Long lastOperatorId;

    private Date lastModifyTime;

    private Integer invoiceType;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }

    public BigDecimal getPriceNoneTax() {
        return priceNoneTax;
    }

    public void setPriceNoneTax(BigDecimal priceNoneTax) {
        this.priceNoneTax = priceNoneTax;
    }

    public BigDecimal getPriceContainTax() {
        return priceContainTax;
    }

    public void setPriceContainTax(BigDecimal priceContainTax) {
        this.priceContainTax = priceContainTax;
    }

    public BigDecimal getPriceCostTax() {
        return priceCostTax;
    }

    public void setPriceCostTax(BigDecimal priceCostTax) {
        this.priceCostTax = priceCostTax;
    }

    public Boolean getIsDistinguishServer() {
        return isDistinguishServer;
    }

    public void setIsDistinguishServer(Boolean isDistinguishServer) {
        this.isDistinguishServer = isDistinguishServer;
    }

    public String getDistinguishServerId() {
        return distinguishServerId;
    }

    public void setDistinguishServerId(String distinguishServerId) {
        this.distinguishServerId = distinguishServerId;
    }

    public String getUseHelp() {
        return useHelp;
    }

    public void setUseHelp(String useHelp) {
        this.useHelp = useHelp;
    }

    public String getUseScope() {
        return useScope;
    }

    public void setUseScope(String useScope) {
        this.useScope = useScope;
    }

    public Integer getOrderThreshold() {
        return orderThreshold;
    }

    public void setOrderThreshold(Integer orderThreshold) {
        this.orderThreshold = orderThreshold;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public BigDecimal getValidDuration() {
        return validDuration;
    }

    public void setValidDuration(BigDecimal validDuration) {
        this.validDuration = validDuration;
    }

    public Integer getValidDurationUnit() {
        return validDurationUnit;
    }

    public void setValidDurationUnit(Integer validDurationUnit) {
        this.validDurationUnit = validDurationUnit;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    public Long getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Long lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}