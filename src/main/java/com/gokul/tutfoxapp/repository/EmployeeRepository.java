package com.gokul.tutfoxapp.repository;

import com.gokul.tutfoxapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByNameLike(String name);
}
