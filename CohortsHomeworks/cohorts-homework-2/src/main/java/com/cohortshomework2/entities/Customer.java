package com.cohortshomework2.entities;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private int age;
    private String name;
    private Month registrationDate;
    public List<Order> orderList = new ArrayList<>();

    public Customer(int id, int age, String name, Month registrationDate) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.registrationDate = registrationDate;
    }

    public Customer(int id, int age, String name, Month registrationDate, List<Order> orderList) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.registrationDate = registrationDate;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Month getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Month registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
