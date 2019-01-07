package com.lti.dao;

import java.util.List;

import com.lti.model.Employee;

public interface EmpDao {

	void create(Employee e);
	Employee getEmployee(Integer eid);
	List listEmployees();
	void delete(Integer eid);
	void update(Integer eid,Integer eage);
	
}
