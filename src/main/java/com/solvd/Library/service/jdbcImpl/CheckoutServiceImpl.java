package com.solvd.Library.service.jdbcImpl;

import com.solvd.Library.daos.CheckoutDAO;
import com.solvd.Library.daos.ClientDAO;
import com.solvd.Library.daos.DAOImpl.CheckoutDAOimpl;
import com.solvd.Library.daos.DAOImpl.ClientDAOimpl;
import com.solvd.Library.entitie.Checkout;
import com.solvd.Library.entitie.Client;
import com.solvd.Library.exception.DAOException;
import com.solvd.Library.service.CheckoutService;

import java.net.ConnectException;
import java.util.List;

public class CheckoutServiceImpl implements CheckoutService {

    @Override
    public void insert(Checkout a) throws DAOException, ConnectException {
        CheckoutDAO checkoutDAO = new CheckoutDAOimpl();
        checkoutDAO.insert(a);
    }

    @Override
    public void deleteById(int id) throws DAOException, ConnectException {
        CheckoutDAO checkoutDAO = new CheckoutDAOimpl();
        checkoutDAO.deleteById(id);
    }

    @Override
    public void update(Checkout a) throws DAOException, ConnectException {
        CheckoutDAO checkoutDAO = new CheckoutDAOimpl();
        checkoutDAO.update(a);
    }

    @Override
    public List<Checkout> getAll() throws DAOException, ConnectException {
        CheckoutDAO checkoutDAO = new CheckoutDAOimpl();
        List<Checkout> checkouts;
        checkouts = checkoutDAO.getAll();

        return checkouts;
    }

    @Override
    public Checkout getById(int id) throws DAOException, ConnectException {
        CheckoutDAO checkoutDAO = new CheckoutDAOimpl();
        Checkout checkout;
        checkout = checkoutDAO.getById(id);

        return checkout;
    }
}
