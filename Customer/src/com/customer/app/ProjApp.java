package com.customer.app;

import java.sql.Date;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.lti.model.Customer;
import com.lti.model.Module;
import com.lti.model.Project;
import com.lti.model.Task;

import customer.util.HibernateUtil;

public class ProjApp {

	
	
public static void main(String args[]) {
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx =session.beginTransaction();
	
	Project p1=new Project();
	p1.setStartDate(Date.valueOf("2018-01-01"));
	p1.setTitle("Banking");
	int id=(int)session.save(p1);
		
	Module m1=new Module();
	m1.setProject_id((id));
	m1.setModuleName("Withdrawal"); 
	 session.save(m1);
	 
	 Task t1=new Task();
	 t1.setProject_id(id);
	 t1.setModuleName(m1.getModuleName());
	 t1.setTaskName("Exception handling");
	 session.save(t1);
	 
	Project p2=new Project();
	p2.setStartDate(Date.valueOf("2019-03-03"));
	p2.setTitle("Railway");
	int  id2=(int) session.save(p2);
	
	Module m2=new Module();
	m2.setProject_id(id2);
	m2.setModuleName("Booking");
	session.save(m2);
	
	Task t2=new Task();
	t2.setProject_id(id2);
	t2.setModuleName(m2.getModuleName());
	t2.setTaskName("Documentation");
	session.save(t2);
	
	tx.commit();
	
	String ql="from Project p";
	Query query=session.createQuery(ql);
	List<Project> plist=query.list();
	for (Project p:plist)
		System.out.println(p);
	session.close();
	

	
}
}
