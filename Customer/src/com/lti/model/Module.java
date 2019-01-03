package com.lti.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
@Entity
public class Module extends Project implements Serializable{
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Module(String moduleName) {
		super();
		ModuleName = moduleName;
	}

	@Override
	public String toString() {
		return "Module [ModuleName=" + ModuleName + "]";
	}
	

}
