package com.lti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SecondaryTable(name="custdetails")
public class Customer implements Serializable{
private int custid;
private String custname;

private String custadd;

private int creditscore;

private int rewardpoints;

@Id
@GeneratedValue(generator="test_seq", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="test_seq",sequenceName="test_seq")
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
@Column(name="Address",table="custdetails")
public String getCustadd() {
	return custadd;
}
public void setCustadd(String custadd) {
	this.custadd = custadd;
}
@Column(name="Credit_Score",table="custdetails")
public int getCreditscore() {
	return creditscore;
}
public void setCreditscore(int creditscore) {
	this.creditscore = creditscore;
}
@Column(name="Reward_Points",table="custdetails")
public int getRewardpoints() {
	return rewardpoints;
}
public void setRewardpoints(int rewardpoints) {
	this.rewardpoints = rewardpoints;
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", custname=" + custname + ", custadd=" + custadd + ", creditscore="
			+ creditscore + ", rewardpoints=" + rewardpoints + "]";
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String custname, String custadd, int creditscore, int rewardpoints) {
	super();
	this.custname = custname;
	this.custadd = custadd;
	this.creditscore = creditscore;
	this.rewardpoints = rewardpoints;
}

}
