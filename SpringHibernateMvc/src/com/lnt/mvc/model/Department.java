package com.lnt.mvc.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Component
@Entity

public class Department  implements Serializable{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
private int department_id;
	@Column
private String departmentName;
	@OneToMany(cascade =CascadeType.ALL)
private Set<EmployeeDetails>employee;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departmentName, Set<EmployeeDetails> employee) {
		super();
	
		this.departmentName = departmentName;
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", departmentName=" + departmentName + ", employee="
				+ employee + "]";
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Set<EmployeeDetails> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<EmployeeDetails> employee) {
		this.employee = employee;
	}

}
