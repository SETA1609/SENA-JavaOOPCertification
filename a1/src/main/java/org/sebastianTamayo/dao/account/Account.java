package org.sebastianTamayo.dao.account;

import org.sebastianTamayo.dao.client.Client;

public class Account {
    private AccountType accountType;
    private long id;
    private Client client;
    private String password;
    private double balance;

    public Account() {
        setAccountType(null);
        setId(0);
        setClient(null);
        setPassword("password");
        setBalance(0.0);
    }

    public Account(AccountType accountType, long id, Client client, String password, double balance) {
        this.accountType = accountType;
        this.id = id;
        this.client = client;
        this.password = password;
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
