package com.southwind.entity;

public class Nation {
    private String name;
    private Integer manpop;
    private Double manrat;
    private Integer womanpop;
    private Double womanrat;
    private Double mwrat;

    public Nation(String name, Integer manpop, Double manrat, Integer womanpop, Double womanrat, Double mwrat) {
        this.name = name;
        this.manpop = manpop;
        this.manrat = manrat;
        this.womanpop = womanpop;
        this.womanrat = womanrat;
        this.mwrat = mwrat;
    }

    public String getName() {
        return name;
    }

    public Integer getManpop() {
        return manpop;
    }

    public Double getManrat() {
        return manrat;
    }

    public Integer getWomanpop() {
        return womanpop;
    }

    public Double getWomanrat() {
        return womanrat;
    }

    public Double getMwrat() {
        return mwrat;
    }


}
