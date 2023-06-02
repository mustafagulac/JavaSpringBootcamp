package com.cohortshomework2.entities;

import java.time.Month;

public class Order {
    private int id;
    private int customerId;
    private int companyId;
    private int price;
    private String orderDescription;
    private Month orderMonth;

    public Order(int id, int customerId, int companyId, int price, String orderDescription, Month orderMonth) {
        this.id = id;
        this.customerId = customerId;
        this.companyId = companyId;
        this.price = price;
        this.orderDescription = orderDescription;
        this.orderMonth = orderMonth;
    }

    public int getId() {
        return id;
    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Month getOrderMonth() {
        return orderMonth;
    }

    public void setOrderMonth(Month orderMonth) {
        this.orderMonth = orderMonth;
    }
}
