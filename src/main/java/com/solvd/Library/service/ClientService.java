package com.solvd.Library.service;

import com.solvd.Library.entitie.Client;
import com.solvd.Library.exception.DAOException;

import java.net.ConnectException;
import java.util.List;

public interface ClientService {
    void insert(Client a) throws DAOException, ConnectException;

    void deleteById(int id) throws DAOException, ConnectException;

    void update(Client a) throws DAOException, ConnectException;

    List<Client> getAll() throws DAOException, ConnectException;

    Client getById(int id) throws DAOException, ConnectException;
}
