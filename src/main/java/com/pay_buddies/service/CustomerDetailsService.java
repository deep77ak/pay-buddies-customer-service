package com.pay_buddies.service;

import com.pay_buddies.dto.CustomerDto;
import com.pay_buddies.model.Customer;

public interface CustomerDetailsService {
    public Customer registerCustomerDetails(CustomerDto customerPayload);
//    public Customer getCustomerByEmail(String emailId);
}
