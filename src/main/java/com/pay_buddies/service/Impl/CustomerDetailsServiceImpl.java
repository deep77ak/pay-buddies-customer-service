package com.pay_buddies.service.Impl;


import com.pay_buddies.dto.CustomerDto;
import com.pay_buddies.exception.CustomerException;
import com.pay_buddies.model.Address;
import com.pay_buddies.model.Customer;
import com.pay_buddies.repository.CustomerRepository;
import com.pay_buddies.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer registerCustomerDetails(CustomerDto customerPayload) throws CustomerException {

        Customer customer = generateCustomer(customerPayload);
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByEmail(String customerId) throws Exception {
        return null;
    }

    private Customer generateCustomer(CustomerDto customerPayload) {
        Customer customer = Customer.builder()
                .customerId(UUID.randomUUID().toString())
                .customerName(customerPayload.getCustomerName())
                .customerGender(customerPayload.getCustomerGender())
                .customerDOB(customerPayload.getCustomerDOB())
                .customerAddressDetails(generateAddressDetails(customerPayload.getCustomerAddressDetails()))
                .customerBankDetails(customerPayload.getCustomerBankDetails())
                .customerEmailAddress(customerPayload.getCustomerEmailAddress())
                .customerUpiIdDetails(customerPayload.getCustomerUpiIdDetails())
                .phoneNumberDetails(customerPayload.getPhoneNumberDetails())
                .build();
        return customer;

    }
    private Address generateAddressDetails(CustomerDto.Address addressDetailsDto){
        return Address.builder()
                .houseNumber(addressDetailsDto.getHouseNumber())
                .area(addressDetailsDto.getArea())
                .landMark(addressDetailsDto.getLandMark())
                .city(addressDetailsDto.getCity())
                .state(addressDetailsDto.getState())
                .country(addressDetailsDto.getCountry())
                .zipCode(addressDetailsDto.getZipCode())
                .officialLanguage(addressDetailsDto.getOfficialLanguage())
                .build();
    }
}
