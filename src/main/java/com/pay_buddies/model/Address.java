package com.pay_buddies.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String houseNumber;
    private String area;
    private String landMark;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String officialLanguage;
}
