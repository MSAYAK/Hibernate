package com.customer.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.Bidders;

import customer.util.HibernateUtil;

public class BidDaoImpl implements IBidDao{
	SessionFactory factory = HibernateUtil.getSessionFactory();
	public void addBid(Bidders bid)
	{
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(bid);
		/*Bidders b1=new Bidders();
		b1.setFarmerid(bid.getFarmerid());
		b1.setAmount(bid.getAmount());
		b1.setQty(bid.getQty());
		session.save(b1);*/
		System.out.println("Record Added!!");
		tx.commit();
		session.close();
	}
	public void  deleteBid(int m)
	{
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		Bidders b1=(Bidders) session.load(Bidders.class, m);
		session.delete(b1);
		tx.commit();
		session.close();
		 
	}
	public void updateBid(Bidders bid,int b_id) 
	{
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		Bidders b2= (Bidders) session.load(Bidders.class, b_id);
		bid.setBidId(b_id);
		b2=bid;
		session.saveOrUpdate(b2);
		tx.commit();
		session.close();
	}
	public void  ListById(int id)
	{
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		List<Bidders> bidl= new ArrayList<Bidders>();
		Bidders b3=new Bidders();
		
		tx.commit();
		session.close();
	}
	public void ListAllBids() {
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		Query query =session.createQuery("from Bidders");
		List<Bidders> bidlist =query.list();
		for(Bidders b1:bidlist)
			System.out.println(b1);
		tx.commit();
		session.close();
		
	}
}
