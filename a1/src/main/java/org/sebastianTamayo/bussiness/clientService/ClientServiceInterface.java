package org.sebastianTamayo.bussiness.clientService;

import org.sebastianTamayo.dao.client.Client;

import java.util.List;

public interface ClientServiceInterface {
    Client getClientById(List<Client> clientList, long id);
    Client getClientByUsername(List<Client> clientList, String username);
    Client createNewClient(String username,String password);

}
