package com.cohortshomework2.service;

import com.cohortshomework2.entities.Company;
import com.cohortshomework2.entities.Order;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyService {
    static List<Company> companyList = new ArrayList<>();
    static Map<Company, List<Order>> companyCustomerListMap = new HashMap<>();

    //this method processes adding companies to the system.
    public void addCompany(Company company){
        companyList.add(company);
        companyCustomerListMap.put(company,company.companyInvoiceList);
    }

    //this method lists the sector of companies whose average of the invoices of the month entered is below the value entered.
    public void getCompanySectorListByMonthAndBelowInvoiceAverage(Double value, Month month){
        for (Company company:companyList){
            OrderService.getCompanySectorByMonthAndBelowInvoiceAverage(company,value,month);
        }
    }
}
