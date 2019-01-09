package com.lnt.mvc.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.EmployeeDetails;


@Repository
public class EmployeeDetailsDaoImpl implements IEmployeeDetailsDao{
	private static final Logger logger = 			
			LoggerFactory.getLogger(EmployeeDetailsDaoImpl.class);
	private SessionFactory sessionFactory;

	@Override
	public void createEmployeeDetails(EmployeeDetails edetails) {
		Session session = this.sessionFactory.openSession();
	session.save(edetails);
	logger.info("Employee details saved successfully as: "+edetails);
	session.close();
	}

	@Override
	public void updateEmployeeDetails(EmployeeDetails edetails) {
		Session session = this.sessionFactory.openSession();
		session.update(edetails);
		logger.info("Employee updated successfully, "+ "Employee Details=" + edetails);
		session.close();
	}

	@Override
	public void deleteEmployeeDetails(int EmployeeDetailsId) {
		Session session = this.sessionFactory.openSession();
		EmployeeDetails edetails = 
				(EmployeeDetails) session.load(EmployeeDetails.class, new Integer(EmployeeDetailsId));
		if (null != edetails) {
			session.delete(edetails);
		}else {
			logger.error
			("Employee NOT deleted, with Id=" +EmployeeDetailsId);
		}
		logger.info("Employee deleted successfully, Employee details=" +edetails );
		session.close();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		Session session = this.sessionFactory.openSession();
		List<EmployeeDetails> elist = session.createQuery("from EmployeeDetails").list();
		for (EmployeeDetails e : elist) {
			logger.info("Employee List:" + e);
		}
		session.close();
		return elist;
	}

	@Override
	public EmployeeDetails getEmployeeDetails(int EmployeeDetailsId) {
		Session session = this.sessionFactory.openSession();
		EmployeeDetails e = (EmployeeDetails) session.load(EmployeeDetails.class, new Integer(EmployeeDetailsId));
		logger.info("Employee loaded successfully, Employee details=" + e);
		session.close();
		return e;
	}

	@Override
	public List<EmployeeDetails> getByName(String name) {
		Session session = this.sessionFactory.openSession();
String hql="from EployeeDetails e where e.firstname like :names";
Query query=session.createQuery(hql);
query.setParameter("names", name+"%");
List<EmployeeDetails> emp=query.list();
session.close();
return emp;
	}
	

}
