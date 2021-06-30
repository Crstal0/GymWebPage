package com.southwind.entity;

public class Credit {
    private Integer creditId;
    private Integer customerId;
    private Integer remain;

    public Credit(Integer creditId, Integer customerId, Integer remain) {
        this.creditId = creditId;
        this.customerId = customerId;
        this.remain = remain;
    }

    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }
}
