package com.solvd.Library.daos;

import com.solvd.Library.entitie.Book;
import com.solvd.Library.exception.DAOException;

import java.net.ConnectException;
import java.util.List;

public interface BookDAO extends DAO<Book, Integer> {
    @Override
    void insert(Book a) throws DAOException, ConnectException;

    @Override
    void deleteById(int id) throws DAOException, ConnectException;

    @Override
    void update(Book a) throws DAOException, ConnectException;

    @Override
    List<Book> getAll() throws DAOException, ConnectException;

    @Override
    Book getById(int id) throws DAOException, ConnectException;

    List<Book> groupByGenre(Book a) throws DAOException, ConnectException;

    List<Book> groupByAuthor(Book a) throws DAOException, ConnectException;

    List<Book> groupByAuthorAndGenre(Book a) throws DAOException, ConnectException;
}
