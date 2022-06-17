package com.solvd.Library.service.jdbcImpl;

import com.solvd.Library.daos.BookDAO;
import com.solvd.Library.daos.DAOImpl.BookDAOImpl;
import com.solvd.Library.entitie.Book;
import com.solvd.Library.service.BookService;

import java.net.ConnectException;
import java.util.List;

public class BookServiceImpl implements BookService {

    @Override
    public void insert(Book a) throws ConnectException {
        BookDAO books = new BookDAOImpl();
        books.insert(a);
    }

    @Override
    public void update(Book a) throws ConnectException {
        BookDAO books = new BookDAOImpl();
        books.update(a);
    }


    @Override
    public void deleteById(int id) throws ConnectException {
        BookDAO books = new BookDAOImpl();
        books.deleteById(id);
    }

    @Override
    public Book getById(int id) throws ConnectException {
        BookDAO books = new BookDAOImpl();
        Book book;
        book = books.getById(id);

        return book;
    }

    @Override
    public List<Book> getAll() throws ConnectException {
        BookDAO book = new BookDAOImpl();
        List<Book> bookList;
        bookList = book.getAll();

        return bookList;
    }

    @Override
    public List<Book> groupByGenre(Book a) throws ConnectException {
        BookDAO book = new BookDAOImpl();
        List<Book> bookList;
        bookList = book.groupByGenre(a);

        return bookList;
    }

    @Override
    public List<Book> groupByAuthor(Book a) throws ConnectException {
        BookDAO book = new BookDAOImpl();
        List<Book> bookList;
        bookList = book.groupByAuthor(a);

        return bookList;
    }

    @Override
    public List<Book> groupByAuthorAndGenre(Book a) throws ConnectException {
        BookDAO book = new BookDAOImpl();
        List<Book> bookList;
        bookList = book.groupByAuthor(a);

        return bookList;
    }
}
