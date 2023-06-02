package com.cohortshomework2.service;

import com.cohortshomework2.entities.Company;
import com.cohortshomework2.entities.Customer;
import com.cohortshomework2.entities.Order;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderService {
    List<Order> orderList = new ArrayList<>();

    //this method processes adding orders to the system.
    public void addOrder(Order order, Customer customer, Company company){
        orderList.add(order);
        customer.getOrderList().add(order);
        company.getCompanyInvoiceList().add(order);
    }
    //this method lists all invoices.
    public void getAllOrders(){
        orderList.stream().map(order -> "Invoice ID " +order.getId() + " --> " + " Customer ID : " + order.getCustomerId() + " | " + " Company ID : " + order.getCompanyId() + " | " + "Price : " + order.getPrice())
                .forEach(System.out::println);
    }
    //this method shows the total price of the invoices of customers registered in that month according to the month entered.
    public void getSumOrdersPriceByMonth(Month month){
        List<Customer> customerList = CustomerService.getFilteredCustomerListByRegistrationDate(month);
        Double sum = customerList.stream().mapToDouble(customer -> customer.getOrderList().stream().mapToDouble(Order::getPrice).sum()).sum();
        System.out.println(sum);
    }
    //this method lists all invoices above the entered value.
    public void getOrdersGreaterThanValue(Double value){
        orderList.stream().filter(order -> order.getPrice() > value).map(order -> CustomerService.getCustomerNameById(order.getCustomerId()) + " : " + order.getPrice() + "TL")
                .forEach(System.out::println);
    }
    //this method shows the average of all invoices above the entered value.
    public void getAverageOfOrdersGreaterThanValue(Double value){
        System.out.println(orderList.stream().filter(order -> order.getPrice() > value)
                .mapToDouble(Order::getPrice).average().getAsDouble());
    }
    //this method shows the names of customers with invoices below the entered value.
    public void getCustomersWithOrderByBelowThanValue(Double value){
        List<String> stringList = orderList.stream().filter(order -> order.getPrice() < value).map(order ->  CustomerService.getCustomerNameById(order.getCustomerId()) + " : " + order.getPrice() + " TL")
                .collect(Collectors.toList());
        Set<String> stringSet = new HashSet<String>(stringList);
        stringSet.forEach(System.out::println);
    }
    //If the average of the invoices of the company entered in this method is below the entered value, it shows the sector of that company.
    public static void getCompanySectorByMonthAndBelowInvoiceAverage(Company company, Double value, Month month){
        if(company.getCompanyInvoiceList().stream().filter(order -> order.getOrderMonth().equals(month))
                .mapToDouble(order -> order.getPrice()).average().getAsDouble() < value){
            System.out.println(company.getCompanySectors());
        }
    }
}
