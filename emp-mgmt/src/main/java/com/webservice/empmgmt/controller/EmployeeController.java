package com.webservice.empmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.empmgmt.entity.Employee;
import com.webservice.empmgmt.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable long id)
	{
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/")
	public Employee createEmployee(@Valid @RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployeeById(@PathVariable long id)
	{
		employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployeeById(@Valid @RequestBody Employee employee, @PathVariable long id)
	{
		if (employee.getEmployeeId() == null)
		{
			employee.setEmployeeId(id);
		}
		return employeeService.updateEmployee(employee);
	}
}
