package com.cohortshomework2;

import com.cohortshomework2.entities.Company;
import com.cohortshomework2.entities.CompanySectors;
import com.cohortshomework2.entities.Customer;
import com.cohortshomework2.entities.Order;
import com.cohortshomework2.service.CompanyService;
import com.cohortshomework2.service.CustomerService;
import com.cohortshomework2.service.OrderService;

import java.time.Month;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        CompanyService companyService = new CompanyService();
        OrderService orderService = new OrderService();

        //Customer, Company and Order objects are created manually. If desired, object creation can be performed by receiving data from the user.

        Customer customer1 = new Customer(1,23,"Mustafa", Month.JUNE);
        Customer customer2 = new Customer(2,19,"Ahmet", Month.JUNE);
        Customer customer3 = new Customer(3,46,"Canan", Month.JANUARY);
        Customer customer4 = new Customer(4,42,"Veli", Month.DECEMBER);
        Customer customer5 = new Customer(5,16,"Hasan", Month.JUNE);
        Customer customer6 = new Customer(6,75,"Cemil", Month.APRIL);
        Customer customer7 = new Customer(7,23,"Azize", Month.OCTOBER);
        Customer customer8 = new Customer(8,26,"Dilara", Month.JUNE);

        customerService.addCustomer(customer1);
        customerService.addCustomer(customer2);
        customerService.addCustomer(customer3);
        customerService.addCustomer(customer4);
        customerService.addCustomer(customer5);
        customerService.addCustomer(customer6);
        customerService.addCustomer(customer7);
        customerService.addCustomer(customer8);


        Company company1 = new Company(1,"Burger King", CompanySectors.FOOD);
        Company company2 = new Company(2,"Medipol", CompanySectors.HEALTH);
        Company company3 = new Company(3,"Gratis", CompanySectors.COSMETIC);
        Company company4 = new Company(4,"Teknosa", CompanySectors.TECHNOLOGY);

        companyService.addCompany(company1);
        companyService.addCompany(company2);
        companyService.addCompany(company3);
        companyService.addCompany(company4);


        Order order1 = new Order(1,customer1.getId(),company1.getId(),250,"Big King Menu",Month.JUNE);
        Order order2 = new Order(2,customer1.getId(),company4.getId(),9000,"Laptop",Month.JUNE);
        Order order3 = new Order(3,customer2.getId(),company2.getId(),400,"Treatment",Month.JUNE);
        Order order4 = new Order(4,customer2.getId(),company3.getId(),150,"Perfume",Month.JUNE);
        Order order5 = new Order(5,customer3.getId(),company3.getId(),650,"Make-up",Month.JUNE);
        Order order6 = new Order(6,customer4.getId(),company4.getId(),400,"Joystick",Month.JUNE);
        Order order7 = new Order(7,customer4.getId(),company1.getId(),120,"King Chicken Menu",Month.JUNE);
        Order order8 = new Order(8,customer5.getId(),company2.getId(),3000,"Surgery",Month.JUNE);
        Order order9 = new Order(9,customer5.getId(),company4.getId(),8000,"Television",Month.JUNE);
        Order order10 = new Order(10,customer6.getId(),company4.getId(),12000,"PS5",Month.JUNE);
        Order order11 = new Order(11,customer6.getId(),company2.getId(),250,"Pharmacy Costs",Month.JUNE);
        Order order12 = new Order(12,customer7.getId(),company3.getId(),450,"Nail Polish Set",Month.JUNE);
        Order order13 = new Order(13,customer7.getId(),company1.getId(),350,"Whooper Menu",Month.JUNE);
        Order order14 = new Order(14,customer8.getId(),company3.getId(),1250,"Make-up Set(Large)",Month.JUNE);
        Order order15 = new Order(15,customer8.getId(),company4.getId(),750,"Headset",Month.JUNE);

        orderService.addOrder(order1,customer1,company1);
        orderService.addOrder(order2,customer1,company4);
        orderService.addOrder(order3,customer2,company2);
        orderService.addOrder(order4,customer2,company3);
        orderService.addOrder(order5,customer3,company3);
        orderService.addOrder(order6,customer4,company4);
        orderService.addOrder(order7,customer4,company1);
        orderService.addOrder(order8,customer5,company2);
        orderService.addOrder(order9,customer5,company4);
        orderService.addOrder(order10,customer6,company4);
        orderService.addOrder(order11,customer6,company2);
        orderService.addOrder(order12,customer7,company3);
        orderService.addOrder(order13,customer7,company1);
        orderService.addOrder(order14,customer8,company3);
        orderService.addOrder(order15,customer8,company4);

        boolean exit = false;

        while(!exit) {
            System.out.println("\n");
            System.out.println("----------------------SYSTEM MENU----------------------");
            System.out.println("--------------------------------------------------------");
            System.out.println("--------------------------------------------------------");
            System.out.println("1 : List All Customers");
            System.out.println("2 : List Customers with a C Letter in the Name");
            System.out.println("3 : Show Total Amount of Invoices of Customers Registered in June");
            System.out.println("4 : List All Invoices in the System");
            System.out.println("5 : List Invoices Above 1500TL in the System");
            System.out.println("6 : Calculate and Show Average of Invoices Above 1500TL in the System");
            System.out.println("7 : List the Names of Customers with Invoices Under 500TL in the System");
            System.out.println("8 : List In Which Sector The Companies With Average Invoices Less Than 750 TL In June");
            System.out.println("0 : Exit system");
            System.out.println("--------------------------------------------------------");

            int choice;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select the action you want to do:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("All Customers:");
                    customerService.getAllCustomers();
                    break;
                case 2:
                    System.out.println("List of customers with the letter ‘C’ in the Name:");
                    customerService.getFilteredCustomerListByLetter("c");
                    break;
                case 3:
                    System.out.println("Total amounts of invoices for customers registered in June:");
                    orderService.getSumOrdersPriceByMonth(Month.JUNE);
                    break;
                case 4:
                    System.out.println("All invoices in the system:");
                    orderService.getAllOrders();
                    break;
                case 5:
                    System.out.println("List of invoices above 1500TL in the system:");
                    orderService.getOrdersGreaterThanValue(1500.00);
                    break;
                case 6:
                    System.out.println("Average of invoices above 1500TL in the system:");
                    orderService.getAverageOfOrdersGreaterThanValue(1500.00);
                    break;
                case 7:
                    System.out.println("Names of customers with invoices under 500TL in the system:");
                    orderService.getCustomersWithOrderByBelowThanValue(500.00);
                    break;
                case 8:
                    System.out.println("List In Which Sector The Companies With Average Invoices Less Than 750 TL In June:");
                    companyService.getCompanySectorListByMonthAndBelowInvoiceAverage(750.00, Month.JUNE);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}