package com.example.employee.dao;

import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeDao extends JpaRepository<Employee, Integer> {
    Employee findById(int id);
}
