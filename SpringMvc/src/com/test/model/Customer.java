package com.test.model;

public class Customer {
private int id;
private String name;
private  String email;
private double creditallowed;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getCreditallowed() {
	return creditallowed;
}
public void setCreditallowed(double creditallowed) {
	this.creditallowed = creditallowed;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", creditallowed=" + creditallowed + "]";
}
public Customer(int id, String name, String email, double creditallowed) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.creditallowed = creditallowed;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
