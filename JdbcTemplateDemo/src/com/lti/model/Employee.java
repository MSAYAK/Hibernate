package com.lti.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
private int eid;
private String ename;
private  int eage;
private float salary;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEage() {
	return eage;
}
public void setEage(int eage) {
	this.eage = eage;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", salary=" + salary + "]";
}
public Employee(int eid, String ename, int eage, float salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eage = eage;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}