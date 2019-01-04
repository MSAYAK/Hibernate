package com.lti.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import com.lti.model.AccountEntity;
//import com.lti.model.EmployeeEntity;
import com.lti.onetomany.AccountEntity;
import com.lti.onetomany.EmployeeEntity;
import hibernateUtil.HibernateUtil;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private SessionFactory factory= HibernateUtil.getSessionFactory();
       private Session session;
       private Transaction tx;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=factory.openSession();
		tx=session.beginTransaction();
		EmployeeEntity empent=new EmployeeEntity();
		empent.setFirstname("Sam");
		empent.setLastname("Tarley");
		AccountEntity actent=new AccountEntity();
		actent.setAccountno("6775");
		AccountEntity actent1=new AccountEntity();
		actent1.setAccountno("7855");
		AccountEntity actent2=new AccountEntity();
		actent1.setAccountno("9474");
		
		List<AccountEntity> acclst=new ArrayList<>();
		acclst.add(actent);
		acclst.add(actent1);
		acclst.add(actent2);
		empent.setAcctlist(acclst);
		
		session.save(empent);
		Query query=session.createQuery("from EmployeeEntity");
		List<EmployeeEntity> emplist=query.list();
		
		request.setAttribute("list1", emplist);
		request.getRequestDispatcher("Data.jsp").forward(request, response);
		tx.commit();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
