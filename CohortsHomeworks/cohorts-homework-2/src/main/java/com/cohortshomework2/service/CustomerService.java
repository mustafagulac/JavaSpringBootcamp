package com.cohortshomework2.service;

import com.cohortshomework2.entities.Customer;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    static List<Customer> customerList = new ArrayList<>();

    //this method processes adding customers to the system.
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    //this method lists all customers
    public void getAllCustomers(){
        customerList.stream().map(customer -> "Customer Id : " +customer.getId() + " | " + "Customer Name: " + customer.getName() + " | " + "Age: " +customer.getAge() + " | " + "Register Date: " + customer.getRegistrationDate())
                .forEach(System.out::println);
    }
    //this method shows the customer name according to id.
    public static String getCustomerNameById(int id){
        return customerList.stream().filter(customer -> customer.getId() == id).map(Customer::getName).collect(Collectors.joining());
    }
    //this method filters by registration date and shows the customer list.
    public static List<Customer> getFilteredCustomerListByRegistrationDate(Month month){
        return customerList.stream().filter(customer -> customer.getRegistrationDate().name()
                .equals(month.name())).toList();
    }
    //this method checks and filters whether the entered letter is in the customer's name and lists those customers.
    public void getFilteredCustomerListByLetter(String letter){
        customerList.stream().map(customer -> "Id:" + customer.getId() + " --> " + customer.getName()).filter(customer -> (customer.contains(letter.toUpperCase()) || (customer.contains(letter.toLowerCase()))))
                .forEach(System.out::println);
    }
}
