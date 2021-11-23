package com.hhhvn.controller;

import com.hhhvn.VO.ResponseTemplateVO;
import com.hhhvn.enntity.Employee;
import com.hhhvn.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeWithDepartment(employeeId);
    }
    @GetMapping("/")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployee(@PathVariable("id") Long id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployeeId(@PathVariable("id") Long id, @RequestBody Employee employeeData){
        return  employeeService.updateEmployeeId(id, employeeData);
    }

}
