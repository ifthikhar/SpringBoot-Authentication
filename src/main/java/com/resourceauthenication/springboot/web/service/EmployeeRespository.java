package com.resourceauthenication.springboot.web.service;

import com.resourceauthenication.springboot.web.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);
    List<Employee> findById(int id);
}
