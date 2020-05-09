package com.resourceauthenication.springboot.web.controller;


import com.resourceauthenication.springboot.web.exception.RecordNotFoundException;
import com.resourceauthenication.springboot.web.model.Employee;
import com.resourceauthenication.springboot.web.service.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ValidationSampleController {

    @ExceptionHandler(value = NumberFormatException.class)
    public String nfeHandler(NumberFormatException e){
        return e.toString();
    }

    @Autowired
    EmployeeRespository employeeRespository;

    @PostMapping(value = "emp")
    public ResponseEntity<Employee> addEmployees(@Valid @RequestBody Employee employee)
    {
        employeeRespository.save(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @GetMapping(value = "emp/{id}")
    public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable int id)
    {

    List<Employee> employees =employeeRespository.findById(id);
        if(employees== null)
        {
            throw new RecordNotFoundException("Invalid Employee id & no user exist");
        }
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

}
