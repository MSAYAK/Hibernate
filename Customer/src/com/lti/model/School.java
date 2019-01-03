package com.lti.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class School implements Serializable{
private int sc_id;
private String  sc_name;
private SchoolDetails schooldetails;

@Id
@GeneratedValue(generator="test_seq", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="test_seq",sequenceName="test_seq")
public int getSc_id() {
	return sc_id;
}
public void setSc_id(int sc_id) {
	this.sc_id = sc_id;
}
public String getSc_name() {
	return sc_name;
}
public void setSc_name(String sc_name) {
	this.sc_name = sc_name;
}
public School(String sc_name) {
	super();
	this.sc_id = sc_id;
	this.sc_name = sc_name;
}

public School() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "School [sc_id=" + sc_id + ", sc_name=" + sc_name + "]";
}
public SchoolDetails getSchooldetails() {
	return schooldetails;
}
public void setSchooldetails(SchoolDetails schooldetails) {
	this.schooldetails = schooldetails;
}

}
