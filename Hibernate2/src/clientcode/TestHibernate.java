package clientcode;



import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class TestHibernate {
public static void main(String args[])
{
	Employee e1 =new Employee();
	
	Configuration config = new Configuration();
	SessionFactory sfac=config.configure().buildSessionFactory();
	Session session=sfac.openSession();
	Transaction tx=session.beginTransaction();
	e1.setEmail("mm.gmail.com");
	e1.setEmpjoindate(new GregorianCalendar(2018,10,3));
	e1.setEmplogin(Date.valueOf("2019-01-01"));
	e1.setName("Meeta");
	e1.setPassword("Mitali");
	e1.setPermanent(true);
	

	int id=(int) session.save(e1);
	System.out.println("ID of newly created object is " +id);
	tx.commit();
	session.close();
	e1.setEmail("dd@gmail.com");
	Session session1=sfac.openSession();
	Employee e2=session1.load(Employee.class,id);
	System.out.println("before changes" +e2);
	session1.saveOrUpdate(e1);
	System.out.println("after changes" +e2);
	Employee e3=session1.load(Employee.class,id);
	tx.commit();
	session1.close();
	
}
}
