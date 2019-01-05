package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService1")
public class EmpService implements IEmpService{
	@Autowired
	private IEmpDAO dao;

	@Override
	public void addEmp(Employee e) {
dao.addEmployee(e);
		
	}

	@Override
	public void delEmp(Employee e) {
dao.delEmployee(e);
		
	}
	

}
