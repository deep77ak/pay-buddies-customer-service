package com.pay_buddies.controller;

import com.pay_buddies.dto.CustomerDto;
import com.pay_buddies.exception.CustomerException;
import com.pay_buddies.model.Customer;
import com.pay_buddies.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerDetailsService customerDetailsService;

    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomerDetails(@RequestBody CustomerDto customerPayload) throws CustomerException {
        Customer registeredCustomer = customerDetailsService.registerCustomerDetails(customerPayload);
        return new ResponseEntity<>(registeredCustomer, HttpStatus.CREATED);
    };




}
