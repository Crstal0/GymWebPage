package com.southwind.entity;

public class NationData{
    private String name;
    private Double manrat;
    private Double womanrat;

    public NationData(String name, Double manrat, Double womanrat) {
        this.name = name;
        this.manrat = manrat;
        this.womanrat = womanrat;
    }

    public String getName() {
        return name;
    }

    public Double getManrat() {
        return manrat;
    }

    public Double getWomanrat() {
        return womanrat;
    }

}
