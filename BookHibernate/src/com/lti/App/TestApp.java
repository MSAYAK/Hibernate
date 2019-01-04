package com.lti.App;

import java.com.dao.BookDAO;
import java.com.model.Book;
import java.util.List;
import java.util.Scanner;

public class TestApp {
	private static Book book1;
private static BookDAO  bdao;

public static void  addDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter title");
String bookname = sc.nextLine();
System.out.println("Enter price");
float b_price=sc.nextFloat();
System.out.println("Enter ISDNno");
String isdn = sc.nextLine();
book1=new Book(bookname,b_price,isdn);
}
public static void main(String args[])
{
	int n=1;
	System.out.println(" Select the option");
	Scanner sc1=new Scanner(System.in);
	n=sc1.nextInt();
	while (n>=1&&n<=6)
	{
		System.out.println("What do you want to do?");
		System.out.println("1.Add Book   2.Delete Book   3.Update Book   4.List by IdBook   5.List All BidsBook   6.Exit");
	}
	 n= sc1.nextInt();
	switch(n)
	{
	case 1: addDetails();
		bdao.addBook(book1);
				break;
/*	case 2:  updateBook(Book b);
					break;
	case 3:  remove(Book b);
	              break;*/
	case 2 :  bdao.listAllBooks();
	                break;
	case 3: System.out.println("ENTER ID");
				int id=sc1.nextInt();
				bdao.getBookById(id);
	                  break;
	case 4: 
}
}
}
