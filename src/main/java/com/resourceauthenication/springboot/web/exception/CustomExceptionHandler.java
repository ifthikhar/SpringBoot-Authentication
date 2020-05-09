package com.resourceauthenication.springboot.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<Object> handleUserException(RecordNotFoundException exception, WebRequest webRequest)
    {
        List<String> details = new ArrayList<>();
        details.add(exception.getLocalizedMessage());

        Error recordError = new Error(exception.toString(), 40, exception.getLocalizedMessage());
        // ErrorResponse response = new ErrorResponse("Record Not Found", details);
        return new ResponseEntity<>(recordError, HttpStatus.NOT_FOUND);
        // Here instead of Detail array, we can define a sepereate class which we want to show the details


    }


    @ExceptionHandler(NumberFormatException.class)
    public final ResponseEntity<Object> handleCommonException(NumberFormatException exception, WebRequest webRequest)
    {
        List<String> details = new ArrayList<>();
        details.add(exception.getLocalizedMessage());

        Error recordError = new Error(exception.toString(), 50, exception.getLocalizedMessage());
        // ErrorResponse response = new ErrorResponse("Record Not Found", details);
        return new ResponseEntity<>(recordError, HttpStatus.BAD_REQUEST);
        // Here instead of Detail array, we can define a sepereate class which we want to show the details


    }
}
