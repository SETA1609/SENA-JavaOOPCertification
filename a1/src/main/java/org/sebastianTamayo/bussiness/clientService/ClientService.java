package org.sebastianTamayo.bussiness.clientService;

import org.sebastianTamayo.dao.client.Client;

import java.util.List;

public class ClientService implements ClientServiceInterface{
    @Override
    public Client getClientById(List<Client> clientList, long id) {
        return null;
    }

    @Override
    public Client getClientByUsername(List<Client> clientList, String username) {
        return null;
    }

    @Override
    public Client createNewClient(String username, String password) {
        return null;
    }
}
