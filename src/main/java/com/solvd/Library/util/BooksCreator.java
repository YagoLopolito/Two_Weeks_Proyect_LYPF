package com.solvd.Library.util;

import com.solvd.Library.entitie.Book;
import com.solvd.Library.service.jacksonImpl.JacksonImpl;
import com.solvd.Library.service.jdbcImpl.BookServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public class BooksCreator {
    private static final Logger log = LogManager.getLogger(BooksCreator.class);

    public static void main(String[] args) throws ConnectException {
        Book book = new Book();
        BookServiceImpl books = new BookServiceImpl();
        int cant = 1000;
        int num = (int) (Math.random() * 62);
        int num2 = (int) (Math.random() * 62);
        int num3 = (int) (Math.random() * 62);
        int num4 = (int) (Math.random() * 62);
        int num5 = (int) (Math.random() * 10);
        int num6 = (int) (Math.random() * 14);
        int num7 = (int) (Math.random() * 6);
        int num8 = (int) (Math.random() * 10);

        List<String> titleWords = new ArrayList<>();
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("");
        titleWords.add("The ");
        titleWords.add("Adventure ");
        titleWords.add("Amazing ");
        titleWords.add("Travel ");
        titleWords.add("Mission ");
        titleWords.add("Thunder ");
        titleWords.add("Final ");
        titleWords.add("Spectacular ");
        titleWords.add("The ");
        titleWords.add("Wizard ");
        titleWords.add("Knight ");
        titleWords.add("Power ");
        titleWords.add("Of ");
        titleWords.add("Lord ");
        titleWords.add("Village ");
        titleWords.add("Game ");
        titleWords.add("Inglorious ");
        titleWords.add("Pride ");
        titleWords.add("Citadel ");
        titleWords.add("Music ");
        titleWords.add("Glorious ");
        titleWords.add("Jerk ");
        titleWords.add("Die ");
        titleWords.add("Dead ");
        titleWords.add("Castle ");
        titleWords.add("Wonderful ");
        titleWords.add("Caos ");
        titleWords.add("Person ");
        titleWords.add("Prince ");
        titleWords.add("King ");
        titleWords.add("City ");
        titleWords.add("Work ");
        titleWords.add("Empress ");
        titleWords.add("Evil ");
        titleWords.add("Good ");
        titleWords.add("Perfect ");
        titleWords.add("Sin ");
        titleWords.add("Formal ");
        titleWords.add("Plastic ");
        titleWords.add("Taurus ");
        titleWords.add("Dental ");
        titleWords.add("Guard ");
        titleWords.add("Kill ");
        titleWords.add("Traitor ");
        titleWords.add("Suspicious ");
        titleWords.add("Among ");
        titleWords.add("Us ");
        titleWords.add("They ");
        titleWords.add("That ");
        titleWords.add("Wolf ");
        titleWords.add("Eternal ");
        titleWords.add("Life ");

        List<String> authors = new ArrayList<>();
        authors.add("Jane Austen");
        authors.add("Alan Moore");
        authors.add("Neil Gaiman");
        authors.add("J.R.R Tolkien");
        authors.add("George R.R. Martin");
        authors.add("Pedro Saborido");
        authors.add("Cortazar");
        authors.add("Jorge Luis Borges");
        authors.add("JK Rowling");
        authors.add("George Orwell");

        List<String> genreList = new ArrayList<>();

        genreList.add("Adventure");
        genreList.add("Drama");
        genreList.add("Science Fiction");
        genreList.add("Romance");
        genreList.add("Mystery");
        genreList.add("Thriller");
        genreList.add("Gotic");
        genreList.add("Comic");
        genreList.add("Manga");
        genreList.add("Fantasy");
        genreList.add("Epic");
        genreList.add("Detective");
        genreList.add("Young Adults");
        genreList.add("Erotic");
        genreList.add("Classics");

        List<Integer> priceList = new ArrayList<>();
        priceList.add(8);
        priceList.add(10);
        priceList.add(15);
        priceList.add(17);
        priceList.add(30);
        priceList.add(50);

        List<Integer> stockList = new ArrayList<>();

        stockList.add(1);
        stockList.add(2);
        stockList.add(3);
        stockList.add(4);
        stockList.add(5);
        stockList.add(6);
        stockList.add(7);
        stockList.add(8);
        stockList.add(9);
        stockList.add(10);


        for (int i = 0; i <= cant; i = i + 1) {

            book.setIdBook(i);
            book.setTitle(titleWords.get(num)
                    + titleWords.get(num2)
                    + titleWords.get(num3)
                    + titleWords.get(num4));

            book.setAuthor(authors.get(num5));

            book.setGenre(genreList.get(num6));

            book.setPrice(priceList.get(num7));

            book.setStock(stockList.get(num8));


            books.insert(book);
            log.info("-* " + book);
            num = (int) (Math.random() * 62);
            num2 = (int) (Math.random() * 62);
            num3 = (int) (Math.random() * 62);
            num4 = (int) (Math.random() * 62);
            num5 = (int) (Math.random() * 10);
            num6 = (int) (Math.random() * 15);
            num7 = (int) (Math.random() * 6);
            num8 = (int) (Math.random() * 10);
        }
    }
}
