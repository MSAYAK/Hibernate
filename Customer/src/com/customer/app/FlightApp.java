package com.customer.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.aeroplane.Airline;
import com.lti.aeroplane.Flight;

import customer.util.HibernateUtil;

public class FlightApp {
	public static void main(String args[]) { 
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx =session.beginTransaction();
	Flight f1=new Flight();
	f1.setCapacity(400);
	f1.setFromSector("Mumbai");
	f1.setToSector("BANGKOK");
	
	Airline a1=new Airline("Spicejet");
	Airline a2=new Airline("Indigo");
	List<Airline> airlinelist= new ArrayList<>();
	airlinelist.add(a1);
	airlinelist.add(a2);
	f1.setAirlinelist(airlinelist);
	
	session.save(f1);
	tx.commit();
	System.out.println("Data saved");
	session.close();
	
	
	}
}
