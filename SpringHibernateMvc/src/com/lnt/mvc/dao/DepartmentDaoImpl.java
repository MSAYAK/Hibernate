package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Department;

@Repository
public class DepartmentDaoImpl implements IDepartmentDao{
	private static final Logger logger = 			
			LoggerFactory.getLogger(DepartmentDaoImpl.class);
	private SessionFactory sessionFactory;
	@Override
	public void createDepartment(Department department) {
Session session =this.sessionFactory.getCurrentSession();
session.save(department);
	}

	@Override
	public void updateDepartment(Department department) {
		Session session =this.sessionFactory.getCurrentSession();
		session.update(department);
		logger.info("Department updated successfully, "+ "Department Details=" + department);
		
	}

	@Override
	public void deleteDepartment(int id) {
		Session session =this.sessionFactory.getCurrentSession();
		Department d=(Department)session.load(Department.class, new Integer(id));
		if(d!=null)
			session.delete(d);
		else
			logger.error("Not deleted as "+id+ " does not exist");
		logger.info("Deleted Department as"+d);
	}

	@Override
	public List<Department> getAllDepartment() {
		Session session =this.sessionFactory.getCurrentSession();
		List<Department> deptlist=session.createQuery("from Department").list();
		for(Department d:deptlist)
			logger.info("Departments are : "+d);
		return deptlist;
	}

	@Override
	public Department getDepartment(int Id) {
		Session session =this.sessionFactory.getCurrentSession();
		Department d=(Department)session.load(Department.class, new Integer(Id));
		logger.info("Department Details with ID "+Id+" is "+d);
		return d;
		
	}

}
