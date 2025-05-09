package com.pay_buddies.service;

import com.pay_buddies.dto.CustomerDto;
import com.pay_buddies.exception.CustomerException;
import com.pay_buddies.model.Customer;

public interface CustomerDetailsService {
    public Customer registerCustomerDetails(CustomerDto customerPayload) throws CustomerException;
    public Customer getCustomerByEmail(String customerId) throws Exception;
}
