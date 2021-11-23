package com.hhhvn.controller;

import com.hhhvn.VO.ResponseTemplateVO;
import com.hhhvn.enntity.Employee;
import com.hhhvn.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl empoyeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return empoyeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") Long employeeId){
        return empoyeeService.getEmployeeWithDepartment(employeeId);
    }
    @GetMapping("/")
    public List<Employee> getAllEmployee(){
        return empoyeeService.getAllEmployee();
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        return empoyeeService.deleteEmployee(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployeeId(@PathVariable("id") Long id, @RequestBody Employee employeeIdd){
        return  empoyeeService.updateEmployeeId(id, employeeIdd);
    }



}
