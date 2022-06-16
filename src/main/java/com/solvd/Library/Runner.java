package com.solvd.Library;

import com.solvd.Library.entitie.Book;
import com.solvd.Library.service.jdbcImpl.BookServiceImpl;

import java.net.ConnectException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws ConnectException {
        Book Books = new Book();
        BookServiceImpl kok = new BookServiceImpl();
        Books.setIdBook(1);
        Books.setAuthor("sas");
        Books.setGenre("pom");
        Books.setTittle("SANGUCHE");
        kok.insert(Books);

    }
}
