package com.solvd.Library.daos.DAOImpl;


import com.solvd.Library.util.ConnectionPool;

import java.net.ConnectException;
import java.sql.Connection;

public abstract class AbstractJDBCDao {

    public Connection getConnection() throws ConnectException {
        return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnection(Connection connection) {
        ConnectionPool.getInstance().returnConnection(connection);
    }
}