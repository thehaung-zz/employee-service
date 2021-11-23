package com.hhhvn.service;

import com.hhhvn.enntity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public String deleteEmployee(Long id);
    public Employee updateEmployeeId(Long id, Employee employeeIdd);
}
