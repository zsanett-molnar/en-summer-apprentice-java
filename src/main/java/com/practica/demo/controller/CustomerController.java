package com.practica.demo.controller;

import com.practica.demo.entity.Customer;
import com.practica.demo.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
        System.out.println("Creating customer controller");
    }

    @PostMapping("/customer/addCustomer")
    public Customer insertCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    @GetMapping("/customer/{customerID}")
    public Optional<Customer> getCustomer(@PathVariable int customerID) {
        return customerService.getCustomer(customerID);
    }
    @GetMapping("/customer/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }





}
