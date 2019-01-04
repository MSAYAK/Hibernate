package com.lti.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.Reader;
import com.lti.model.Subscription;

import hibernateUtil.HibernateUtil;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SessionFactory factory= HibernateUtil.getSessionFactory();
    private Session session;
    private Transaction tx;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=factory.openSession();
		tx=session.beginTransaction();
		Reader r1=new Reader();
		Reader r2=new Reader();
		Reader r3=new Reader();
		Reader r4=new Reader();
		r1.setEmail("abc@gmail.com");
		r1.setFname("abc");
		r2.setEmail("xyz@gmail.com");
		r2.setFname("xyz");
		r3.setEmail("nbc@gmail.com");
		r3.setFname("nbc");
		r4.setEmail("kbc@gmail.com");
		r4.setFname("kbc");
		Subscription s1=new Subscription();
		s1.setSubtitle("s1");
		Subscription s3=new Subscription();
		s3.setSubtitle("s3");
		Subscription s2=new Subscription();
		s2.setSubtitle("s2");
		Subscription s4=new Subscription();
		s4.setSubtitle("s4");
		
		r1.setSb(Arrays.asList(s1,s2,s3));
		r2.setSb(Arrays.asList(s2,s3));
		r3.setSb(Arrays.asList(s1,s4));
		r4.setSb(Arrays.asList(s2,s3,s4));
		
		session.save(r1);
		session.save(r2);
		session.save(r3);
		session.save(r4);
		tx.commit();
		//response.getWriter().println(" Hellooo");
		SQLQuery query=session.createSQLQuery("select r.readerid,email,fname,subtitle from Reader r,Subscription s,Reader_Sub rs"
				+ " where r.readerid=rs.ReaderId and s.subId=rs.SubscriptionId");
		
		List rlist=query.list();
		request.setAttribute("readerlist", rlist);
		request.getRequestDispatcher("Data2.jsp").forward(request, response);
		
		session.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
