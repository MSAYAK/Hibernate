package com.lnt.mvc.model;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class EmployeeDetails implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int employeeid;
private String lastname;
private String firstname;
private String emailAddress;
private double salary;
private String phoneNumber;
private String password;
private int jobId;
private int department_id;
private Date hiredate;

public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getJobId() {
	return jobId;
}
public void setJobId(int jobId) {
	this.jobId = jobId;
}
public int getDepartment_id() {
	return department_id;
}
public void setDepartment_id(int department_id) {
	this.department_id = department_id;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
public EmployeeDetails(int employeeid, String lastname, String firstname, String emailAddress, double salary,
		String phoneNumber, String password, int jobId, int department_id, Date hiredate) {
	super();
	this.employeeid = employeeid;
	this.lastname = lastname;
	this.firstname = firstname;
	this.emailAddress = emailAddress;
	this.salary = salary;
	this.phoneNumber = phoneNumber;
	this.password = password;
	this.jobId = jobId;
	this.department_id = department_id;
	this.hiredate = hiredate;
}
public EmployeeDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmployeeDetails [employeeid=" + employeeid + ", lastname=" + lastname + ", firstname=" + firstname
			+ ", emailAddress=" + emailAddress + ", salary=" + salary + ", phoneNumber=" + phoneNumber + ", password="
			+ password + ", jobId=" + jobId + ", department_id=" + department_id + ", hiredate=" + hiredate + "]";
}

}
