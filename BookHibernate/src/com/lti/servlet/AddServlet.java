package com.lti.servlet;

import java.com.dao.BookDAO;
import java.com.model.Book;
import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Book bookdetails;
	private static BookDAO  bdao; 
	
 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookname=request.getParameter("title");
		String r=request.getParameter("isdn");
		String  b=request.getParameter("price");
		Float  b_price=Float.parseFloat(b);
				bookdetails=new Book(bookname,b_price,r);
				bdao.addBook(bookdetails);
		List<Book> bl =bdao.listAllBooks();
		request.setAttribute("ListBooks",bl);
		request.getRequestDispatcher("list.jsp").forward(request,response);
		

	     
	     
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
