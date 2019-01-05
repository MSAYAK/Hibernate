package com.test.model;

import java.io.Serializable;
import org.springframework.stereotype.Component;
@Component
public class Address  implements Serializable{
private String streetname;
private String city;
private String pincode;
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String streetname, String city, String pincode) {
	super();
	this.streetname = streetname;
	this.city = city;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [streetname=" + streetname + ", city=" + city + ", pincode=" + pincode + "]";
}

}
