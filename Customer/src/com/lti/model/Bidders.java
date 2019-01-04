package com.lti.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bidders implements Serializable{
private int BidId;
private int  Farmerid;
private double amount;
private int qty;

@Id
@GeneratedValue(generator="seq_test", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="seq_test",sequenceName="seq_test")
public int getBidId() {
	return BidId;
}

public void setBidId(int bidId) {
	BidId = bidId;
}
public int getFarmerid() {
	return Farmerid;
}
public void setFarmerid(int farmerid) {
	Farmerid = farmerid;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Bidders( int farmerid, double amount, int qty) {
	super();

	Farmerid = farmerid;
	this.amount = amount;
	this.qty = qty;
}
public Bidders() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Bidder [BidId=" + BidId + ", Farmerid=" + Farmerid + ", amount=" + amount + ", qty=" + qty + "]";
}

}
