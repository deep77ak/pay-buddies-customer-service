package com.pay_buddies.dto;

import com.pay_buddies.model.Address;
import com.pay_buddies.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto{
    private String customerName;
    private List<Customer.PhoneNumberDetails> phoneNumberDetails;
    private Address customerAddressDetails;
    private List<Customer.CustomerUpiDetails> customerUpiIdDetails;
    private Customer.CustomerGender customerGender;
    private String customerDOB;
    private List<Customer.CustomerEmailAddress> customerEmailAddress;
    private List<Customer.CustomerBankDetails> customerBankDetails;


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PhoneNumberDetails {
        private Integer countryCode;
        private Integer phoneNumber;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerUpiDetails {
        private String upiId;
        private Byte upiQr;
    }


    public enum CustomerGender {
        M,
        F,
        T
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerEmailAddress {
        private String emailId;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerBankDetails {
        private String bankAccountNumber;
        private List<String> upiIds;
        private String IFSC;
        private String bankName;
        private Address bankAddress;
    }

}
