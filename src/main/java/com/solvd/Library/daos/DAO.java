package com.solvd.Library.daos;

import com.solvd.Library.exception.DAOException;

import java.net.ConnectException;
import java.util.List;

public interface DAO<T, K> {
    void insert(T a) throws DAOException, ConnectException;

    void deleteById(int id) throws DAOException, ConnectException;

    void update(T a) throws DAOException, ConnectException;

    List<T> getAll() throws DAOException, ConnectException;

    T getById(int id) throws DAOException, ConnectException;

    List<T> groupByGenre() throws DAOException, ConnectException;

    List<T> groupByAuthor() throws DAOException, ConnectException;
}
