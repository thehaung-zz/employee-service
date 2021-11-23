package com.hhhvn.controller;

import com.hhhvn.VO.ResponseTemplateVO;
import com.hhhvn.enntity.Employee;
import com.hhhvn.service.EmpoyeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmpoyeeServiceImpl empoyeeService;

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

}
