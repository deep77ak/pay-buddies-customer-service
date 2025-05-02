package com.pay_buddies;

import com.pay_buddies.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PayBuddiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayBuddiesApplication.class, args);

// to do-> customerService update
//		Customer c = new Customer();
//		Customer.CustomerBankDetails customerbank = Customer.CustomerBankDetails.builder()
//				.IFSC("2345").build();
//		List<Customer.CustomerBankDetails> customerBankDetailsList= new ArrayList<>();
//		customerBankDetailsList.add(customerbank);
//		c.setCustomerBankDetails(customerBankDetailsList);


	}

}
