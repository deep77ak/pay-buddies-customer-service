package com.pay_buddies.util;

import com.pay_buddies.exception.CustomerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<ErrorInfo> customerException(CustomerException ex) {
        ErrorInfo errorInfo = new ErrorInfo("Type Valid Input", HttpStatus.BAD_REQUEST.toString(), new Date());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> globalException(Exception ex){
        ErrorInfo errorInfo=new ErrorInfo("Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR.toString(),new Date());
        return new ResponseEntity<>(errorInfo,HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
