package com.gokul.tutfoxapp.controllers;

import com.gokul.tutfoxapp.models.Employee;
import com.gokul.tutfoxapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/test")
    public List<Employee> test(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/test2")
    public Optional<Employee> test2(){
        int id=2;
        return employeeRepository.findById(id);
    }

    @GetMapping(value="/test3")
    public List<Employee>test3(){
        String name="Gokul";
        String likeName="%"+name+"%";
        return employeeRepository.findByNameLike(name);
    }


}
