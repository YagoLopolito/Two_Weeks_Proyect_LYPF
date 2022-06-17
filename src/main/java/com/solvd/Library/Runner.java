package com.solvd.Library;

import com.solvd.Library.daos.BookDAO;
import com.solvd.Library.daos.DAOImpl.BookDAOImpl;
import com.solvd.Library.entitie.Book;
import com.solvd.Library.entitie.Client;
import com.solvd.Library.service.jdbcImpl.BookServiceImpl;
import com.solvd.Library.util.BooksCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.Library.service.jdbcImpl.ClientServiceImpl;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) throws ConnectException {
        BookDAO bookService = new BookDAOImpl();
        Book book = new Book();
        Scanner scannerName = new Scanner(System.in);

//        log.info("Hello! Please entry your name: ");
//        client.setName(scannerName.nextLine());
//        Scanner scannerLastName = new Scanner(System.in);
//        log.info("\nNow please entry your last name: ");
//        client.setLastName(scannerLastName.nextLine());
//        Scanner scannerDocument = new Scanner(System.in);
//        log.info("\nAnd lastly please entry your document Nº: ");
//        client.setDocument(scannerDocument.nextInt());

        log.info("Hi " + "\nDo you want to: \n1- Sort the list of books by genre."
                + "\n2- Sort the list of books by author.\n3- Sort the list of books by author and genre.");
        Scanner scannerOption = new Scanner(System.in);

        switch (scannerOption.nextInt()) {
            case 1:
                log.info("Did you want to see the list of:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                        "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                        "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                        "\n14- Erotic books\n15- Classics books");
                Scanner scannerGenreChoice = new Scanner(System.in);
                switch (scannerGenreChoice.nextInt()) {
                    case 1:
                        book.setGenre("Adventure");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 2:
                        book.setGenre("Drama");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 3:
                        book.setGenre("Science Fiction");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 4:
                        book.setGenre("Romance");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 5:
                        book.setGenre("Mystery");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 6:
                        book.setGenre("Thriller");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 7:
                        book.setGenre("Gothic");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 8:
                        book.setGenre("Comic");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 9:
                        book.setGenre("Manga");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 10:
                        book.setGenre("Fantasy");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 11:
                        book.setGenre("Epic");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 12:
                        book.setGenre("Detective");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 13:
                        book.setGenre("Young Adults");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 14:
                        book.setGenre("Erotic");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;
                    case 15:
                        book.setGenre("Classics");
                        log.info("The books are loading...");
                        log.info(bookService.groupByGenre(book));
                        break;

                }
                break;

            case 2:
                log.info("Which authors collection would you like to see:\n1- Jane Austen\n2- Alan Moore\n3- Neil Gaiman" +
                        "\n4- J.R.R Tolkien\n5- George R.R. Martin\n6- Pedro Saborido\n7- Cortazar\n8- Jorge Luis Borges" +
                        "\n9- JK Rowling\n10- George Orwell");

                Scanner scannerAuthorChoice = new Scanner(System.in);
                switch (scannerAuthorChoice.nextInt()) {
                    case 1:
                        book.setAuthor("Jane Austen");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 2:
                        book.setAuthor("Alan Moore");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 3:
                        book.setAuthor("Neil Gaima");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 4:
                        book.setAuthor("J.R.R Tolkien");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 5:
                        book.setAuthor("George R.R. Martin");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 6:
                        book.setAuthor("Pedro Saborido");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 7:
                        book.setAuthor("Cortazar");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 8:
                        book.setAuthor("Jorge Luis Borges");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 9:
                        book.setAuthor("JK Rowling");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                    case 10:
                        book.setAuthor("George Orwell");
                        log.info("The books are loading...");
                        log.info(bookService.groupByAuthor(book));
                        break;
                }
                break;


            case 3:
                log.info("Which authors collection would you like to see:\n1- Jane Austen\n2- Alan Moore\n3- Neil Gaiman" +
                        "\n4- J.R.R Tolkien\n5- George R.R. Martin\n6- Pedro Saborido\n7- Cortazar\n8- Jorge Luis Borges" +
                        "\n9- JK Rowling\n10- George Orwell");
                Scanner scannerAuthorChoice2 = new Scanner(System.in);
                switch (scannerAuthorChoice2.nextInt()) {
                    case 1:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice2 = new Scanner(System.in);
                        switch (scannerGenreChoice2.nextInt()) {
                            case 1:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("Jane Austen");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;

                    case 2:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice3 = new Scanner(System.in);
                        switch (scannerGenreChoice3.nextInt()) {
                            case 1:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("Alan Moore");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 3:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice4 = new Scanner(System.in);
                        switch (scannerGenreChoice4.nextInt()) {
                            case 1:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("Neil Gaiman");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 4:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice5 = new Scanner(System.in);
                        switch (scannerGenreChoice5.nextInt()) {
                            case 1:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("J.R.R Tolkien");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("J.R.R Tolkien");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 5:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice6 = new Scanner(System.in);
                        switch (scannerGenreChoice6.nextInt()) {
                            case 1:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("George R.R. Martin");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }

                        break;
                    case 6:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice7 = new Scanner(System.in);
                        switch (scannerGenreChoice7.nextInt()) {
                            case 1:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("Pedro Saborido");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 7:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice8 = new Scanner(System.in);
                        switch (scannerGenreChoice8.nextInt()) {
                            case 1:
                                book.setAuthor("Cortazar");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("Cortazar");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("Cortazar");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("Cortazar");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("Cortazar");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("Cortazar");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("Cortazar");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("Cortazar");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("Cortazar");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("Cortazar");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("Cortazar");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("Cortazar");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("Cortazar");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("Cortazar");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("Cortazar");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 8:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice9 = new Scanner(System.in);
                        switch (scannerGenreChoice9.nextInt()) {
                            case 1:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("Jorge Luis Borges");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 9:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice10 = new Scanner(System.in);
                        switch (scannerGenreChoice10.nextInt()) {
                            case 1:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("JK Rowling");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                    case 10:
                        log.info("And what genre:\n1- Adventure books\n2- Drama books\n3- Science Fiction books" +
                                "\n4- Romance books\n5- Mystery books\n6- Thriller books\n7- Gothic books\n8- Comics" +
                                "\n9- Mangas\n10- Fantasy books\n11- Epic books\n12-Detective books\n13- Young Adults books" +
                                "\n14- Erotic books\n15- Classics books");
                        Scanner scannerGenreChoice11 = new Scanner(System.in);
                        switch (scannerGenreChoice11.nextInt()) {
                            case 1:
                                book.setAuthor("George Orwell");
                                book.setGenre("Adventure");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 2:
                                book.setAuthor("George Orwell");
                                book.setGenre("Drama");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 3:
                                book.setAuthor("George Orwell");
                                book.setGenre("Science Fiction");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 4:
                                book.setAuthor("George Orwell");
                                book.setGenre("Romance");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 5:
                                book.setAuthor("George Orwell");
                                book.setGenre("Mystery");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 6:
                                book.setAuthor("George Orwell");
                                book.setGenre("Thriller");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 7:
                                book.setAuthor("George Orwell");
                                book.setGenre("Gothic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 8:
                                book.setAuthor("George Orwell");
                                book.setGenre("Comic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 9:
                                book.setAuthor("George Orwell");
                                book.setGenre("Manga");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 10:
                                book.setAuthor("George Orwell");
                                book.setGenre("Fantasy");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 11:
                                book.setAuthor("George Orwell");
                                book.setGenre("Epic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 12:
                                book.setAuthor("George Orwell");
                                book.setGenre("Detective");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 13:
                                book.setAuthor("George Orwell");
                                book.setGenre("Young Adults");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 14:
                                book.setAuthor("George Orwell");
                                book.setGenre("Erotic");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                            case 15:
                                book.setAuthor("George Orwell");
                                book.setGenre("Classics");
                                log.info("The books are loading...");
                                log.info(bookService.groupByAuthorAndGenre(book));
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
