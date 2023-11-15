package com.webservice.empmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.empmgmt.entity.Employee;
import com.webservice.empmgmt.exception.EmployeeNotFoundException;
import com.webservice.empmgmt.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee getEmployee(Long id)
	{
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isEmpty())
			throw new EmployeeNotFoundException("Employee with id " + id + " not found");
		return employee.get();
		
	}
	
	@Transactional
	public void deleteEmployee(Long id)
	{
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isEmpty())
			throw new EmployeeNotFoundException("Employee with id " + id + " not found");
		employeeRepository.deleteById(id);
		
	}
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
		
	}
	
	@Transactional
	public Employee updateEmployee(Employee obj)
	{
		Optional<Employee> employeeObj = employeeRepository.findById(obj.getEmployeeId());
		if (employeeObj.isEmpty())
			throw new EmployeeNotFoundException("Employee with id " + obj.getEmployeeId() + " not found");
		
		Employee retEmp = employeeRepository.save(obj);
		return retEmp;
		
	}
	
	@Transactional
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);	
	}
}
