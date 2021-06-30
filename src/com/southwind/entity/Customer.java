package com.southwind.entity;

public class Customer {
    private Integer customerId;
    private String customerName;
    private String customerTel;

    public Customer(Integer customerId, String customerName, String customerTel) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerTel = customerTel;
    }

    public Integer getId() {
        return customerId;
    }

    public void setId(Integer id) {
        this.customerId = id;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getTel() {
        return customerTel;
    }

    public void setTel(String tel) {
        this.customerTel = tel;
    }
}
