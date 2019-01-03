package com.lti.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lti.model.Person;
import com.lti.model.PersonData;

import FirstHibernate.util.HibernateUtil;

/**
 * Servlet implementation class addPerson
 */
public class addPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private SessionFactory sf=HibernateUtil.getSessionFactory();
       private Session session;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Person p2=new Person();
p2.setName(request.getParameter("name"));

PersonData pd2= new PersonData();
pd2.setAadhar(request.getParameter("aadhar"));
pd2.setSalary(Float.parseFloat(request.getParameter("salary")));

p2.setPdetails(pd2);
session=sf.openSession();
Transaction tx= session.beginTransaction();
session.save(p2);
tx.commit();
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
