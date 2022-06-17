package com.solvd.Library.daos.DAOImpl;

import com.solvd.Library.daos.ClientDAO;
import com.solvd.Library.entitie.Book;
import com.solvd.Library.entitie.Client;
import com.solvd.Library.exception.DAOException;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAOimpl extends AbstractJDBCDao implements ClientDAO {

    private final static String INSERT = "INSERT INTO client(idclient, first_name, last_name, documentation) VALUES(?, ?, ?, ?)";
    private final static String UPDATE = "UPDATE client SET first_name = ?, last_name = ?, documentation = ? WHERE idclient = ?";
    private final static String DELETE = "DELETE FROM client WHERE idclient = ?";
    private final static String GET_ALL = "SELECT idclient, first_name, last_name, documentation FROM client";
    private final static String GET_ONE = "SELECT idclient, first_name, last_name, documentation FROM client WHERE idclient = ?";
    private final static String GROUP_BY_FNAME = "SELECT * FROM client WHERE first_name=?";
    private final static String GROUP_BY_LNAME = "SELECT * FROM client WHERE last_name=?";

    @Override
    public void insert(Client a) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, a.getIdClient());
            stat.setString(2, a.getFirstName());
            stat.setString(3, a.getLastName());
            stat.setInt(4, a.getDocumentation());

            if (stat.executeUpdate() == 0) {
                throw new DAOException("May not have been saved");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public void deleteById(int id) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, id);


            if (stat.executeUpdate() == 0) {
                throw new DAOException("May not have been saved");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public void update(Client a) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(UPDATE);

            stat.setString(1, a.getFirstName());
            stat.setString(2, a.getLastName());
            stat.setInt(3, a.getDocumentation());
            stat.setInt(4, a.getIdClient());

            if (stat.executeUpdate() == 0) {
                throw new DAOException("May not have been saved");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    private Client convert(ResultSet rs) throws SQLException {
        String first_name = rs.getString("first_name");
        String last_name = rs.getString("last_name");
        Integer documentation = rs.getInt("documentation");
        Client client = new Client(first_name, last_name, documentation);
        client.setIdClient(rs.getInt("idclient"));
        return client;
    }

    @Override
    public List<Client> getAll() throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        List<Client> clients = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GET_ALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                clients.add(convert(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }

        }
        return clients;
    }

    @Override
    public Client getById(int id) throws DAOException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        Client a;
        try {
            statement = conn.prepareStatement(GET_ONE);
            statement.setInt(1, id);
            rs = statement.executeQuery();

            if (rs.next()) {
                a = convert(rs);
            } else {
                throw new DAOException("not found.");
            }
        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
        }
        return a;
    }
}
