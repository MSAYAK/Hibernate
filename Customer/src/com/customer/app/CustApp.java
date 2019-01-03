package com.customer.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.lti.model.Customer;

import customer.util.HibernateUtil;

public class CustApp {
public static void main(String args[])
{
	/*AnnotationConfiguration config=new AnnotationConfiguration();
	config.configure().buildSessionFactory();
	config.addAnnotatedClass(Customer.class);*/
	
	Customer c1=new Customer("Mark","NY",230,30);
	Customer c2=new Customer("Ruffalo","LA",330,50);
	Customer c3=new Customer("Ben","SF",430,60);
	Customer c4=new Customer("Shapiro","CHI",130,80);
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx =session.beginTransaction();
	
	int retval=(int)session.save(c2);
	Customer cust=(Customer)session.load(Customer.class,retval);
	System.out.println(cust);
	System.out.println("Customer Data Saved!!");
	session.save(c1);
	session.save(c3);
	session.save(c4);
	tx.commit();
	Query query=session.createQuery("from Customer");
	List<Customer> custlist=query.list();
	for(Customer customer : custlist)
	{
		System.out.println(customer);
	}
	System.out.println("Closing Session..");
	session.close();
	
	Session session2=factory.openSession();
	Transaction tx1 =session2.beginTransaction();
	Customer c=(Customer)session2.load(Customer.class, c3.getCustid());
	c.setCustadd("KALVA");
	c.setCreditscore(2000);
	c.setRewardpoints(90);
	session2.saveOrUpdate(c);
	query=session2.createQuery("from Customer");
	custlist=query.list();
	for(Customer customer : custlist)
	{
		System.out.println(customer);
	}
	System.out.println("Closing Session..");
	tx1.commit();
	Criteria cuscriteria=session2.createCriteria(Customer.class);
	cuscriteria.add(Restrictions.gt("creditscore", 1000));
	custlist=cuscriteria.list();
	System.out.println("Customers with credit score more than 1000 are...");
	for (Customer c11:custlist)
		System.out.println(c11);
	session2.close();
}
}
