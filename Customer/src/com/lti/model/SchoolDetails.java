package com.lti.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails implements Serializable{
private String Address;
private int sc_count;
private String  isPublicSchool;
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getSc_count() {
	return sc_count;
}
public void setSc_count(int sc_count) {
	this.sc_count = sc_count;
}
public String getIsPublicSchool() {
	return isPublicSchool;
}
public void setIsPublicSchool(String isPublicSchool) {
	this.isPublicSchool = isPublicSchool;
}
public SchoolDetails(String address, int sc_count, String isPublicSchool) {
	super();
	Address = address;
	this.sc_count = sc_count;
	this.isPublicSchool = isPublicSchool;
}
public SchoolDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "SchoolDetails [Address=" + Address + ", sc_count=" + sc_count + ", isPublicSchool=" + isPublicSchool + "]";
}


}
