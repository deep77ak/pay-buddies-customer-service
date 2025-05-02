package com.pay_buddies.util;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
public class ErrorInfo {

    private String errorMessage;
    private String errorCode;
    private Date timeStamp;

    public ErrorInfo(String errorMessage, String errorCode, Date timeStamp) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.timeStamp = timeStamp;
    }
}
