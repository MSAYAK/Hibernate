package com.lnt.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.dao.IEmployeeDetailsDao;
import com.lnt.mvc.model.EmployeeDetails;
@Service
public class EmployeeDetailsServiceImpl implements IEmployeeDetailsService{
	
	
	private IEmployeeDetailsDao iEmployeeDetailsDao;
	
	@Autowired
	public void setIEmployeeDetailsDao(IEmployeeDetailsDao iEmployeeDetailsDao) {
		this.iEmployeeDetailsDao = iEmployeeDetailsDao;
	}

	@Override
	@Transactional
	public void addDetails(EmployeeDetails employeedetails) {
		iEmployeeDetailsDao.createEmployeeDetails(employeedetails);
		
	}

	@Override
	@Transactional
	public void updateDetails(EmployeeDetails employeedetails) {
		iEmployeeDetailsDao.updateEmployeeDetails(employeedetails);
		
	}

	@Override
	@Transactional
	public void deleteDetails(int id) {
		iEmployeeDetailsDao.deleteEmployeeDetails(id);
		
	}

	@Override
	@Transactional
	public List<EmployeeDetails> listEmpDetails() {
	return iEmployeeDetailsDao.getAllEmployeeDetails();
	}

	@Override
	@Transactional
	public EmployeeDetails getDetailsById(int id) {
return iEmployeeDetailsDao.getEmployeeDetails(id);
	}

	@Override
	@Transactional
	public List<EmployeeDetails> getDetailsByName(String name) {
	return iEmployeeDetailsDao.getByName(name);
	}
	

}
