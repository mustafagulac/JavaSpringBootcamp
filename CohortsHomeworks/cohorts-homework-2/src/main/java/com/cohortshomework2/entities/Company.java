package com.cohortshomework2.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private int id;
    private String companyName;
    private CompanySectors companySectors;
    public List<Order> companyInvoiceList = new ArrayList<>();
    public Map<Customer, List<Order>> customerListMap = new HashMap<>();

    public Company(int id, String companyName, CompanySectors companySectors) {
        this.id = id;
        this.companyName = companyName;
        this.companySectors = companySectors;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanySectors getCompanySectors() {
        return companySectors;
    }

    public void setCompanySectors(CompanySectors companySectors) {
        this.companySectors = companySectors;
    }

    public List<Order> getCompanyInvoiceList() {
        return companyInvoiceList;
    }

    public void setCompanyInvoiceList(List<Order> companyInvoiceList) {
        this.companyInvoiceList = companyInvoiceList;
    }

    public Map<Customer, List<Order>> getCustomerListMap() {
        return customerListMap;
    }

    public void setCustomerListMap(Map<Customer, List<Order>> customerListMap) {
        this.customerListMap = customerListMap;
    }
}
