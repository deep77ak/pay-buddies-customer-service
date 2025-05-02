package com.pay_buddies.dto;

import com.pay_buddies.model.Address;
import com.pay_buddies.model.Customer;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
       @NotBlank(message = "{Bank account number is required}")
        private String bankAccountNumber;
        @NotBlank(message = "{UPI ID is required}")
        private List<String> upiIds;
        @NotBlank(message = "{IFSC code is required}")
        private String IFSC;
       @NotBlank(message = "{Bank name is required}")
        private String bankName;
       @NotBlank(message = "Bank address is required")
       @Pattern( regexp = "^(?=.*\\b\\d{6}\\b)[a-zA-Z0-9\\s,./#\\-()]{10,100}$",
        message = "Address must be 10–100 characters and include a valid 6-digit PIN code.")
        private Address bankAddress;
    }

}
