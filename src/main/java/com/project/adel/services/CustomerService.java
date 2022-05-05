package com.project.adel.services;

public class CustomerService {
    private final String customerName;

    public CustomerService() {
        this.customerName = "Jane Doe";
    }

    public CustomerService(String firstName, String lastName) {
        this.customerName = firstName + " " + lastName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
