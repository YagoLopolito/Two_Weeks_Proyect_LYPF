package com.solvd.Library.service.jdbcImpl;

import com.solvd.Library.daos.DAOImpl.OrderDAOImpl;
import com.solvd.Library.daos.OrderDAO;
import com.solvd.Library.entitie.Client;
import com.solvd.Library.entitie.Order;
import com.solvd.Library.exception.DAOException;
import com.solvd.Library.service.OrderService;
import org.apache.commons.lang3.NotImplementedException;

import java.net.ConnectException;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Override
    public void insert(Order a) throws DAOException, ConnectException {
        OrderDAO order = new OrderDAOImpl();
        order.insert(a);
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
    public List<Client> getAll() throws DAOException, ConnectException {
        throw new NotImplementedException("not implemented");
    }

    @Override
    public Client getById(int id) throws DAOException, ConnectException {
        throw new NotImplementedException("not implemented");
    }
}
