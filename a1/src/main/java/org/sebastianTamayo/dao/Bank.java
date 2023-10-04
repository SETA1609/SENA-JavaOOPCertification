package org.sebastianTamayo.dao;

import org.sebastianTamayo.dao.account.Account;
import org.sebastianTamayo.dao.client.Client;
import org.sebastianTamayo.dao.client.employee.Employee;
import org.sebastianTamayo.dao.investmentFond.InvestmentFond;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accountList;
    private List<Client> clientList;
    private List<InvestmentFond> investmentFondList;
    private List<Employee> employeeList;

    public Bank() {
        setAccountList(new ArrayList<Account>());
        setClientList(new ArrayList<Client>());
        setInvestmentFondList(new ArrayList<InvestmentFond>());
        setEmployeeList(new ArrayList<Employee>());
    }

    public Bank(List<Account> accountList, List<Client> clientList, List<InvestmentFond> investmentFondList, List<Employee> employeeList) {
        this.accountList = accountList;
        this.clientList = clientList;
        this.investmentFondList = investmentFondList;
        this.employeeList = employeeList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<InvestmentFond> getInvestmentFondList() {
        return investmentFondList;
    }

    public void setInvestmentFondList(List<InvestmentFond> investmentFondList) {
        this.investmentFondList = investmentFondList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
