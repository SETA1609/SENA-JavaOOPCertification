package org.sebastianTamayo.bussiness.clientService;

import org.sebastianTamayo.dao.client.Client;
import org.sebastianTamayo.dao.client.employee.Position;

import java.util.List;

public interface ClientServiceInterface {
    Client getClientById(List<Client> clientList, long id);
    Client getClientByUsername(List<Client> clientList, String username);
    boolean createNewClient(String username, String password);
    boolean createNewEmployee(String username, String password, int startingYear, Position position);
    boolean createNewInvestor(String username, String password, int yearsOfExperience);
    void deleteClientById(long id);
    int getVacationDaysById(long id);
}
