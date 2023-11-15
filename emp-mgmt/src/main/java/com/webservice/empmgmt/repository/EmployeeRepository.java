package com.webservice.empmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.empmgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
