package java.com.dao;

import java.com.model.Book;
import java.util.List;

public interface IBookDAO {
public int addBook(Book b);
public void  updateBook(Book b);
public void  remove(Book b);
public   List<Book> listAllBooks();
public void  getBookById(int id);
}
