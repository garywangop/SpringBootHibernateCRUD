package com.example.employee.service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDao.findAll();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeeDao.findById(id);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeDao.deleteById(id);
    }
}
