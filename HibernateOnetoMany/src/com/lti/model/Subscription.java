package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subscription {
	@Id
	@GeneratedValue
private int subId;
	private String subtitle;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="sb")
	private List<Reader> readers;

	@Override
	public String toString() {
		return "Subscription [subId=" + subId + ", subtitle=" + subtitle + ", readers=" + readers + "]";
	}

	public Subscription(String subtitle) {
		super();
		this.subId = subId;
		this.subtitle = subtitle;
		this.readers = readers;
	}

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public List<Reader> getReaders() {
		return readers;
	}

	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}

}
