package com.lti.onetomany;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountEntity implements Serializable {
	@Id
	@Column(name="Accountid",unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int AccountId;
	
	@Column(length=40)
private String Accountno;


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
	@Override
	public String toString() {
		return "AccountEntity [AccountId=" + AccountId + ", Accountno=" + Accountno + "]";
	}

	public AccountEntity(String accountno) {
		super();
	
		this.Accountno = accountno;

	}

	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
