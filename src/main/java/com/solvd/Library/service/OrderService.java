package com.solvd.Library.service;

import com.solvd.Library.entitie.Client;
import com.solvd.Library.entitie.Order;
import com.solvd.Library.exception.DAOException;

import java.net.ConnectException;
import java.util.List;

public interface OrderService {
    void insert(Order a) throws DAOException, ConnectException;

    void deleteById(int id) throws DAOException, ConnectException;

    void update(Order a) throws DAOException, ConnectException;

    List<Client> getAll() throws DAOException, ConnectException;

    Client getById(int id) throws DAOException, ConnectException;
}
