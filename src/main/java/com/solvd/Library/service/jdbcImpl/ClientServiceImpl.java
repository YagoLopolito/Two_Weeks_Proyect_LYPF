package com.solvd.Library.service.jdbcImpl;

import com.solvd.Library.daos.ClientDAO;
import com.solvd.Library.daos.DAOImpl.ClientDAOimpl;
import com.solvd.Library.entitie.Client;
import com.solvd.Library.exception.DAOException;
import com.solvd.Library.service.ClientService;

import java.net.ConnectException;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    @Override
    public void insert(Client a) throws DAOException, ConnectException {
        ClientDAO client = new ClientDAOimpl();
        client.insert(a);
    }

    @Override
    public void deleteById(int id) throws DAOException, ConnectException {
        ClientDAO client = new ClientDAOimpl();
        client.deleteById(id);
    }

    @Override
    public void update(Client a) throws DAOException, ConnectException {
        ClientDAO client = new ClientDAOimpl();
        client.update(a);
    }

    @Override
    public List<Client> getAll() throws DAOException, ConnectException {
        ClientDAO client = new ClientDAOimpl();
        List<Client> clientsList;
        clientsList = client.getAll();

        return clientsList;
    }

    @Override
    public Client getById(int id) throws DAOException, ConnectException {
        ClientDAO client = new ClientDAOimpl();
        Client client1;
        client1 = client.getById(id);

        return client1;
    }
}
