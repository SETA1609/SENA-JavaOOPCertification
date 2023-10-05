package org.sebastianTamayo.bussiness.clientService;

import org.sebastianTamayo.dao.client.Client;
import org.sebastianTamayo.dao.client.ClientType;
import org.sebastianTamayo.dao.client.Investor;
import org.sebastianTamayo.dao.client.employee.Employee;
import org.sebastianTamayo.dao.client.employee.Position;
import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientService implements ClientServiceInterface{

    private List<Client> clientList;

    public ClientService() {
        setClientList(new ArrayList<Client>());
    }

    public ClientService(List<Client> clientList) {
      setClientList(clientList);
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public Client getClientById(List<Client> clientList, long id) {
        return null;
    }

    @Override
    public Client getClientByUsername(List<Client> clientList, String username) {
        return null;
    }

    @Override
    public boolean createNewClient(String username, String password) {
        for (Client currentClient:clientList
             ) {
            if (currentClient.getUsername().equals(username)){
                return false;
            }
        }
        long id= (long) Math.floor(Math.random()*999999);
        Client newClient= new Client(id,username,password);
        clientList.add(newClient);
        return true;
    }

    @Override
    public boolean createNewEmployee(String username, String password, int startingYear, Position position) {
        for (Client currentClient:clientList
        ) {
            if (currentClient.getUsername().equals(username)){
                return false;
            }
        }
        long id= (long) Math.floor(Math.random()*999999);
        Client newClient= new Employee(id,username,password,startingYear,position);
        clientList.add(newClient);
        return true;
    }

    @Override
    public boolean createNewInvestor(String username, String password, int yearsOfExperience) {
        for (Client currentClient:clientList
        ) {
            if (currentClient.getUsername().equals(username)){
                return false;
            }
        }
        long id= (long) Math.floor(Math.random()*999999);
        Client newClient= new Investor(id,username,password,yearsOfExperience);
        clientList.add(newClient);
        return true;
    }

    @Override
    public void deleteClientById(long id) {
        for (Client currentClient:clientList
        ) {
            if (currentClient.getId()==id){
                clientList.remove(currentClient);
            }
        }
    }


    @Override
    public int getVacationDaysById(long id) {
        for (Client currentClient:clientList
        ) {
            if (currentClient.getId()==id){
                int vacationDays;
                switch (int startingYear){
                   // change the code and give a list for employees as the polymorphy made then clients and I cannot access  the staring year
                }
            }
        }
    }
}
