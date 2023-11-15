package com.webservice.empmgmt.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long employeeId;
	@Size(min=2, max = 25, message = "Employee first name should minimum of 2 and maximum of 25 characters.")
	private String firstName;
	@Size(min=2, max = 25, message = "Employee last name should minimum of 2 and maximum of 25 characters.")
	private String lastName;
	@Size(min=7, max = 50, message = "Employee email should minimum of 7 and maximum of 25 characters.")
	@Email(message = "Employee email should be in hte format abc@abc.xyz.")
	private String emailAddress;
	@Digits(integer = 10, fraction = 0, message = "Employee phone number must name numbers and 10 characters long.")
	private String phone;
	@Past
	private Date birthDate;
	private String jobTitle;
	private String department;
	private String location;
	private Date startDate;
	private String manager;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	
		
}
