package com.lti.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountEntity implements Serializable {
	@Id
	@Column(name="Id",nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int AccountId;
	
	@Column(nullable=false,length=40)
private String Accountno;

	@OneToOne(cascade=CascadeType.ALL,mappedBy="account")
	private EmployeeEntity employee ;

	public int getAccountId() {
		return AccountId;
	}

	public void setAccountId(int accountId) {
		AccountId = accountId;
	}

	public String getAccountno() {
		return Accountno;
	}

	public void setAccountno(String accountno) {
		Accountno = accountno;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "AccountEntity [AccountId=" + AccountId + ", Accountno=" + Accountno + "]";
	}

	public AccountEntity(String accountno) {
		super();
	
		this.Accountno = accountno;
		this.employee = employee;
	}

	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
