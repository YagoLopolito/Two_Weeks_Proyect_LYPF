package com.solvd.Library.service;

import com.solvd.Library.entitie.Book;

import java.net.ConnectException;
import java.util.List;

public interface BookService {
    void insert(Book a) throws ConnectException;

    void update(Book a) throws ConnectException;

    void deleteById(int id) throws ConnectException;

    Book getById(int id) throws ConnectException;

    List<Book> getAll() throws ConnectException;

    List<Book> groupByGenre() throws ConnectException;

    List<Book> groupByAuthor() throws ConnectException;

}
