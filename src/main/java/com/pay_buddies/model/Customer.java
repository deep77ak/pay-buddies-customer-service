package com.pay_buddies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customers")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {
    private String customerId;
    private String customerName;
    private List<PhoneNumberDetails> phoneNumberDetails;
    private Address customerAddressDetails;
    private List<CustomerUpiDetails> customerUpiIdDetails;
    private CustomerGender customerGender;
    private String customerDOB;
    private List<CustomerEmailAddress> customerEmailAddress;
    private List<CustomerBankDetails> customerBankDetails;
    private String customerCreatedDate;
    private String customerUpdatedDate;


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PhoneNumberDetails {
        private Integer countryCode;
        private Long phoneNumber;
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
