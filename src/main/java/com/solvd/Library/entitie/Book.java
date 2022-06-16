package com.solvd.Library.entitie;

import java.util.Objects;

public class Book {
    int idBook;
    String genre, tittle, author;

    public Book() {

    }

    public Book(int idBook, String genre, String tittle, String author) {
        this.idBook = idBook;
        this.genre = genre;
        this.tittle = tittle;
        this.author = author;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String category) {
        this.genre = category;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return idBook == book.idBook && Objects.equals(genre, book.genre) && Objects.equals(tittle, book.tittle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, genre, tittle, author);
    }

    @Override
    public String toString() {
        return    "Book"
                + "\nId: "
                + idBook
                + "\nTittle: "
                + tittle
                + "\nAuthor: "
                + author
                + "\nCategory: "
                + genre
                ;
    }
}
