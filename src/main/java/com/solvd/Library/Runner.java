package com.solvd.Library;

import com.solvd.Library.entitie.Book;
import com.solvd.Library.entitie.Client;
import com.solvd.Library.service.jdbcImpl.BookServiceImpl;
import com.solvd.Library.service.jdbcImpl.ClientServiceImpl;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws ConnectException {

        book.setAuthor("Cortazar");

        System.out.println(bookService.groupByAuthor());
    }
}
