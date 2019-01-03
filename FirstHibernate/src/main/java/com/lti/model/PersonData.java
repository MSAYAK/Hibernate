package com.lti.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class PersonData  implements Serializable{
	
@Id
@GeneratedValue
private int pid;
private float salary;
private String aadhar;
public PersonData(int pid, float salary, String aadhar) {
	super();
	this.pid = pid;
	this.salary = salary;
	this.aadhar = aadhar;
}
public PersonData() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PersonData [pid=" + pid + ", salary=" + salary + ", aadhar=" + aadhar + "]";
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}

}
