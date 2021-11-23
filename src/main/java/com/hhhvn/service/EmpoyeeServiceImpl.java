package com.hhhvn.service;

import com.hhhvn.VO.Department;
import com.hhhvn.VO.ResponseTemplateVO;
import com.hhhvn.enntity.Employee;
import com.hhhvn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmpoyeeServiceImpl {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save((employee));
    }
    public List<Employee> getAllEmployee() {
        List<Employee> list= employeeRepository.findAll();
        return list;
    }

    public ResponseTemplateVO getEmployeeWithDepartment(Long id){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee employee = employeeRepository.findById(id).get();
        vo.setEmployee(employee);
        Department department = restTemplate.getForObject("http://localhost:9001/departments/"
                +employee.getDepartmentId(), Department.class);
        vo.setDepartment(department);
        return vo;
    }

}
