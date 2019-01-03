package com.lti.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Person implements Serializable{
	@Id
	@GeneratedValue
private int PersonId;
private String name;
@OneToOne(cascade=CascadeType.ALL)
private PersonData pdetails;
public int getPersonId() {
	return PersonId;
}

public PersonData getPdetails() {
	return pdetails;
}

public void setPdetails(PersonData pdetails) {
	this.pdetails = pdetails;
}

public void setPersonId(int personId) {
	PersonId = personId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Person(int personId, String name) {
	super();
	PersonId = personId;
	this.name = name;
}
public Person() {
	super();
	
}
@Override
public String toString() {
	return "Person [PersonId=" + PersonId + ", name=" + name + "]";
}

}
