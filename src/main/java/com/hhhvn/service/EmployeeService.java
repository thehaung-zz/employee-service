package com.hhhvn.service;

import com.hhhvn.enntity.Employee;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public HttpStatus deleteEmployee(Long id);
    public Employee updateEmployeeId(Long id, Employee employeeData);
}
