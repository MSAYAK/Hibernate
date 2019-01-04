package java.com.dao;

import java.com.model.Book;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateUtil.HibernateUtil;

public class BookDAO {
	private static SessionFactory sf = HibernateUtil.getSessionFactory();
 public static int addBook(Book b1)
 {
 Configuration config = new Configuration();
 config.configure("hibernate.cfg.xml");
 
     
      Session sess =  sf.openSession();
      Transaction tr=sess.beginTransaction();
      
       int idd =(int) sess.save(b1);
       tr.commit();
       sess.close();
       return idd;
 
 
 }

 public List<Book> listAllBooks()
 {

     Session sess =  sf.openSession();
     Transaction tr=sess.beginTransaction();
     List<Book> books =sess.createQuery("from Book").list();
     tr.commit();
     sess.close();
    return books;
 }
 public void getBookById(int id)
 {

     Session sess =  sf.openSession();
     Transaction tr=sess.beginTransaction();
     Book b=(Book)sess.load(Book.class,id);
     tr.commit();
     System.out.println(b);
     sess.close();

 }
 
 
}

    

