package com.customer.app;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.Module;
import com.lti.model.Project;
import com.lti.model.Task;

import customer.util.HibernateUtil;

public class ProjApp {
public static void main(String args[]) {
	Project p1=new Project();
	p1.setStartDate(Date.valueOf("2018-01-01"));
	p1.setTitle("Banking");
	Module m1=new Module();
	m1.setModuleName("Withdrawal");
	Task t1=new Task();
	t1.setTaskName("Exception Handling");
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx =session.beginTransaction();
	
	session.save(p1);
	session.save(m1);
	session.save(t1);
	
	tx.commit();
	session.close();
	
	
	
}
}
