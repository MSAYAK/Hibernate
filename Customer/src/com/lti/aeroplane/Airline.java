package com.lti.aeroplane;

import java.util.List;

public class Airline {
private int airlineid;
private String name;
private int capacity;

public int getAirlineid() {
	return airlineid;
}
public void setAirlineid(int airlineid) {
	this.airlineid = airlineid;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Airline(String name) {
	super();
	this.airlineid = airlineid;
	this.name = name;
}
public Airline() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Airline [airlineid=" + airlineid + ", name=" + name + "]";
}


}
