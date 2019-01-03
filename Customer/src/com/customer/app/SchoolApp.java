package com.customer.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.School;
import com.lti.model.SchoolDetails;

import customer.util.HibernateUtil;

public class SchoolApp {
	public static void main(String args[])
	{
		
	School s1=new School ("Apeejay");
	SchoolDetails schooldetails=new SchoolDetails();
	schooldetails.setAddress("Nerul");
	schooldetails.setSc_count(1000);
	schooldetails.setIsPublicSchool("yes");
	s1.setSchooldetails(schooldetails);
	
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx =session.beginTransaction();
	session.save(s1);
	
	tx.commit();
	session.close();
}
}
