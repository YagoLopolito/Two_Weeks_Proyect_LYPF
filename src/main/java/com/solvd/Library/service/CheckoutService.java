package com.solvd.Library.service;


import com.solvd.Library.entitie.Checkout;

import java.net.ConnectException;
import java.util.List;

public interface CheckoutService {
    void insert(Checkout a) throws ConnectException;

    void update(Checkout a) throws ConnectException;

    void deleteById(int id) throws ConnectException;

    Checkout getById(int id) throws ConnectException;

    List<Checkout> getAll() throws ConnectException;
}
