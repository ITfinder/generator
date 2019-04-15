package com.suneee.ep.base.model;

public class SystemConfig {
    private String configItemKey;

    private String value;

    private String remark;

    public String getConfigItemKey() {
        return configItemKey;
    }

    public void setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey == null ? null : configItemKey.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}