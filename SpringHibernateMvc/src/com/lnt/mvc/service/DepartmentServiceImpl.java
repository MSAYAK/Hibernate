package com.lnt.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.mvc.dao.IDepartmentDao;
import com.lnt.mvc.model.Department;
@Service
public class DepartmentServiceImpl implements IDepartmentService{
	@Autowired
	private IDepartmentDao departmentDao;
	
	

	public void setDepartmentdao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	@Transactional
	public void addDepartment(Department d) {
		departmentDao.createDepartment(d);
		
	}

	@Override
	@Transactional
	public void updateDepartment(Department d) {
		departmentDao.updateDepartment(d);
		
	}

	@Override
	@Transactional
	public void deleteDepartment(int id) {
		departmentDao.deleteDepartment(id);
		
	}

	@Override
	@Transactional
	public List<Department> listAllDepartment() {
		return departmentDao.getAllDepartment();
	}

	@Override
	@Transactional
	public Department departmentById(int id) {
		return departmentDao.getDepartment(id);
	}
	

}
