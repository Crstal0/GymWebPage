package com.southwind.entity;

import java.util.Date;

public class Arrange {
    private Integer arrangeId;
    private Date arrangeTime;
    private Integer arrangeCapacity;
    private Integer groundId;
    private Integer coachId;

    public Arrange(Integer arrangeId, Date arrangeTime, Integer arrangeCapacity, Integer groundId, Integer coachId) {
        this.arrangeId = arrangeId;
        this.arrangeTime = arrangeTime;
        this.arrangeCapacity = arrangeCapacity;
        this.groundId = groundId;
        this.coachId = coachId;
    }

    public Integer getArrangeId() {
        return arrangeId;
    }

    public void setArrangeId(Integer arrangeId) {
        this.arrangeId = arrangeId;
    }

    public Date getArrangeTime() {
        return arrangeTime;
    }

    public void setArrangeTime(Date arrangeTime) {
        this.arrangeTime = arrangeTime;
    }

    public Integer getArrangeCapacity() {
        return arrangeCapacity;
    }

    public void setArrangeCapacity(Integer arrangeCapacity) {
        this.arrangeCapacity = arrangeCapacity;
    }

    public Integer getGroundId() {
        return groundId;
    }

    public void setGroundId(Integer groundId) {
        this.groundId = groundId;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }
}
