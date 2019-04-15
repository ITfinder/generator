package com.suneee.ep.base.model;

public class WmsMallItemKey {
    private String skuCode;

    private String mallNo;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getMallNo() {
        return mallNo;
    }

    public void setMallNo(String mallNo) {
        this.mallNo = mallNo == null ? null : mallNo.trim();
    }
}