package com.southwind.entity;

public class Record {
    private Integer recordId;
    private Boolean recordState;
    private Integer recordScore;
    private Integer customerId;
    private Integer arrangeId;

    public Record(Integer recordId, Boolean recordState, Integer recordScore, Integer customerId, Integer arrangeId) {
        this.recordId = recordId;
        this.recordState = recordState;
        this.recordScore = recordScore;
        this.customerId = customerId;
        this.arrangeId = arrangeId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public Integer getRecordScore() {
        return recordScore;
    }

    public void setRecordScore(Integer recordScore) {
        this.recordScore = recordScore;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getArrangeId() {
        return arrangeId;
    }

    public void setArrangeId(Integer arrangeId) {
        this.arrangeId = arrangeId;
    }
}
