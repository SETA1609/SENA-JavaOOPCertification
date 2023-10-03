package org.sebastianTamayo.dao.investmentFond;

import org.sebastianTamayo.dao.client.Client;
import org.sebastianTamayo.dao.client.Investor;

import java.util.ArrayList;
import java.util.List;

public class InvestmentFond {
    private InversionRisk inversionRisk;
    private long id;
    private String name;
    private String password;
    private List<Client> clientList;
    private List<Investor> investorList;

    public InvestmentFond() {
        setId(0);
        setName("");
        setPassword("");
        setInversionRisk(null);
        setInvestorList(new ArrayList<Investor>());
        setClientList(new ArrayList<Client>());
    }

    public InvestmentFond(InversionRisk inversionRisk, long id, String name, String password, List<Client> clientList, List<Investor> investorList) {
        this.inversionRisk = inversionRisk;
        this.id = id;
        this.name = name;
        this.password = password;
        this.clientList = clientList;
        this.investorList = investorList;
    }

    public InversionRisk getInversionRisk() {
        return inversionRisk;
    }

    public void setInversionRisk(InversionRisk inversionRisk) {
        this.inversionRisk = inversionRisk;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Investor> getInvestorList() {
        return investorList;
    }

    public void setInvestorList(List<Investor> investorList) {
        this.investorList = investorList;
    }
}
