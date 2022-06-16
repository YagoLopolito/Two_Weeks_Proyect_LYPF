package com.solvd.Library.daos.DAOImpl;

import com.solvd.Library.daos.ClientDAO;

public class ClientDAOimpl extends AbstractJDBCDao implements ClientDAO {

    private final static String INSERT = "INSERT INTO client(idclient, first_name, last_name, documentation) VALUES(?, ?, ?, ?)";
    private final static String UPDATE = "UPDATE client SET first_name = ?, last_name = ?, documentation = ? WHERE idclient = ?";
    private final static String DELETE = "DELETE FROM client WHERE idclient = ?";
    private final static String GET_ALL = "SELECT idclient, first_name, last_name, documentation FROM client";
    private final static String GET_ONE = "SELECT idclient, first_name, last_name, documentation FROM client WHERE idclient = ?";
    private final static String GROUP_BY_FNAME = "SELECT * FROM client WHERE first_name=?";
    private final static String GROUP_BY_LNAME = "SELECT * FROM client WHERE last_name=?";
}
