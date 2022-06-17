package com.solvd.Library.daos.DAOImpl;

import com.solvd.Library.daos.OrderDAO;
import com.solvd.Library.entitie.Order;
import com.solvd.Library.exception.DAOException;
import org.apache.commons.lang3.NotImplementedException;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDAOImpl extends AbstractJDBCDao implements OrderDAO {

    private final static String INSERT = "INSERT INTO orders(idorders, client_idclient) VALUES(?, ?)";
    private final static String UPDATE = "UPDATE orders SET client_clientid= ? WHERE idorders = ?";
    private final static String DELETE = "DELETE FROM orders WHERE idorders = ?";
    private final static String GET_ALL = "SELECT idorders, client_idclient, checkouts_id FROM orders";
    private final static String GET_ONE = "SELECT idorders, client_idclient, checkouts_id FROM orders WHERE idorders = ?";


    @Override
    public void insert(Order a) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, a.getIdOrders());
            stat.setInt(2, a.getClientId());

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
        throw new NotImplementedException("not implemented");
    }

    @Override
    public void update(Order a) throws DAOException, ConnectException {
        throw new NotImplementedException("not implemented");
    }

    @Override
    public List<Order> getAll() throws DAOException, ConnectException {
        throw new NotImplementedException("not implemented");
    }

    @Override
    public Order getById(int id) throws DAOException, ConnectException {
        throw new NotImplementedException("not implemented");
    }
}
