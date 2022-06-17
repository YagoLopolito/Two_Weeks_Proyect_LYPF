package com.solvd.Library.entitie;

import java.util.Objects;

public class Checkout {
    int idCheckouts, idBook;
    String dueBy;

    public Checkout() {
    }

    public Checkout(int idCheckouts, String dueBy, int idBook) {
        this.idCheckouts = idCheckouts;
        this.dueBy = dueBy;
        this.idBook = idBook;
    }

    public int getIdCheckouts() {
        return idCheckouts;
    }

    public void setIdCheckouts(int idCheckouts) {
        this.idCheckouts = idCheckouts;
    }

    public String getDueBy() {
        return dueBy;
    }

    public void setDueBy(String dueBy) {
        this.dueBy = dueBy;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkout checkout = (Checkout) o;
        return idCheckouts == checkout.idCheckouts && Objects.equals(dueBy, checkout.dueBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCheckouts, dueBy);
    }

    @Override
    public String toString() {
        return  "\n--------------------------------------------------------------------"
                +"\nCheckout"
                + "\nId: "
                + idCheckouts
                + "\nId book: "
                + idBook
                + "\nDue by: "
                + dueBy
                 ;
    }
}
