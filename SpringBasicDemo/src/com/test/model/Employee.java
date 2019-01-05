package com.test.model;

import java.io.Serializable;

public class Employee implements Serializable {
private int id;
private String name;
private Address address;
private Department dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public Employee(int id, String name, Address address, Department dept) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.dept = dept;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", dept=" + dept + "]";
}
public void init()
{System.out.println("Initializing..");}
public void destroy()
{System.out.println("Destroyed..");}
}
