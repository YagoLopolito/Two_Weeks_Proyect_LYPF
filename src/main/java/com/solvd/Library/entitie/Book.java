package com.solvd.Library.entitie;

import java.util.Objects;

public class Book {
    int idBook, price, stock;
    String genre, title, author;

    public Book() {

    }

    public Book(int idBook, String genre, String title, String author, int price, int stock) {
        this.idBook = idBook;
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return idBook == book.idBook && Objects.equals(genre, book.genre) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, genre, title, author);
    }

    @Override
    public String toString() {
        return    "\nBook"
                + "\nId: "
                + idBook
                + "\nTitle: "
                + title
                + "\nAuthor: "
                + author
                + "\nCategory: "
                + genre
                + "\nPrice: "
                + price
                + "\nStock: "
                + stock
                ;
    }
}
