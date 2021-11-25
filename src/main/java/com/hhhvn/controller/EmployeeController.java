package com.hhhvn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhhvn.VO.ResponseTemplateVO;
import com.hhhvn.entity.Employee;
import com.hhhvn.service.EmployeeServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("employee")
@Tag(name = "Employee Controller - Quản Lý Nhân Viên")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeService;

	@PostMapping("/")
	@Operation(summary = "Thêm nhân viên mới")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/{id}")
	@Operation(summary = "Lấy thông tin chi tiết nhân viên kèm phòng ban")
	public ResponseTemplateVO getStudentWithDepartment(
			@Parameter(description = "employeeId") @PathVariable("id") Long employeeId) {
		return employeeService.getEmployeeWithDepartment(employeeId);
	}

	@GetMapping("/")
	@Cacheable("employee")
	@Operation(summary = "Lấy danh sách tất cả nhân viên")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Xoá nhân viên")
	public HttpStatus deleteEmployee(
			@Parameter(description = "employeeId") @PathVariable("id") Long id) {
		return employeeService.deleteEmployee(id);
	}

	@PutMapping("/{id}")
	@Operation(summary = "Cập nhật thông tin nhân viên")
	public Employee updateEmployeeId(
			@Parameter(description = "employeeId") @PathVariable("id") Long id,
			@RequestBody Employee employeeData) {
		return employeeService.updateEmployeeId(id, employeeData);
	}

}
