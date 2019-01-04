package com.lti.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int employeeid;
private String firstname;
private String lastname;
@OneToOne(cascade=CascadeType.ALL)
//For mapping based on this
private AccountEntity account;
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public AccountEntity getAccount() {
	return account;
}
//no need to call account.setEmployee 
public void setAccount(AccountEntity account) {
	this.account = account;
}
@Override
public String toString() {
	return "EmployeeEntity [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", account=" + account + "]";
}
public EmployeeEntity(String firstname, String lastname) {
	super();
	this.employeeid = employeeid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.account = account;
}
public EmployeeEntity() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
