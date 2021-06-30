package com.southwind.entity;

import java.sql.Date;
import java.sql.Time;

public class Vip {
    public Integer vipId;
    public Integer customerId;
    public Date expiryDate;
    public Boolean vipState;

    public Vip(Integer vipId, Integer customerId, Date expiryDate, Boolean vipState) {
        this.vipId = vipId;
        this.customerId = customerId;
        this.expiryDate = expiryDate;
        this.vipState = vipState;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getVipState() {
        return vipState;
    }

    public void setVipState(Boolean vipState) {
        this.vipState = vipState;
    }
}
