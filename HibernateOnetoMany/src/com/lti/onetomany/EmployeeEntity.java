package com.lti.onetomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class EmployeeEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int employeeid;
private String firstname;
private String lastname;

//For mapping based on this
@OneToMany(cascade=CascadeType.ALL)
@JoinTable(name="Employee_Account",joinColumns= {
		@JoinColumn(name="EmployeeId",referencedColumnName="employeeid") },
		 inverseJoinColumns= {@JoinColumn(name="AccountId",referencedColumnName= "Accountid") })
private List<AccountEntity> acctlist;
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

public List<AccountEntity> getAcctlist() {
	return acctlist;
}
public void setAcctlist(List<AccountEntity> acctlist) {
	this.acctlist = acctlist;
}

@Override
public String toString() {
	return "EmployeeEntity [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", acctlist=" + acctlist + "]";
}
public EmployeeEntity(String firstname, String lastname) {
	super();

	this.firstname = firstname;
	this.lastname = lastname;
	
}
public EmployeeEntity() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
