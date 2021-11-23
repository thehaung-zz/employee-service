package com.hhhvn.service;

import org.springframework.http.HttpStatus;

import com.hhhvn.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public HttpStatus deleteEmployee(Long id);
    public Employee updateEmployeeId(Long id, Employee employeeData);
}
