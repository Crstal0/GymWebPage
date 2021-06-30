package com.southwind.entity;

public class Coach {
    private Integer coachId;
    private String coachName;

    public Coach(Integer coachId, String coachName) {
        this.coachId = coachId;
        this.coachName = coachName;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
}
