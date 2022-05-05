package com.project.adel;

import com.project.adel.services.CustomerService;

public class Main {
    public static void main(String[] args) {
        var customer = new CustomerService("Adel", "Helal");
        System.out.printf("Hello %s!%n", customer.getCustomerName());
    }
}
