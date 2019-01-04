package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Reader {
	@Id
	@GeneratedValue
private int readerid;
private String email;
private String fname;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="Reader_Sub",joinColumns= {
		@JoinColumn(name="ReaderId",referencedColumnName="readerid") },
		 inverseJoinColumns= {@JoinColumn(name="SubscriptionId",referencedColumnName= "subId") })
private List<Subscription> sb;
public int getReaderid() {
	return readerid;
}
public void setReaderid(int readerid) {
	this.readerid = readerid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public List<Subscription> getSb() {
	return sb;
}
public void setSb(List<Subscription> sb) {
	this.sb = sb;
}
@Override
public String toString() {
	return "Reader [readerid=" + readerid + ", email=" + email + ", fname=" + fname + ", sb=" + sb + "]";
}
public Reader(String email, String fname) {
	super();
	this.readerid = readerid;
	this.email = email;
	this.fname = fname;
	this.sb = sb;
}
public Reader() {
	super();
	// TODO Auto-generated constructor stub
}

}
