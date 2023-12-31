package org.sebastianTamayo.bussiness.accountService;

import org.sebastianTamayo.bussiness.clientService.ClientService;
import org.sebastianTamayo.bussiness.clientService.ClientServiceInterface;
import org.sebastianTamayo.dao.account.Account;
import org.sebastianTamayo.dao.account.AccountType;
import org.sebastianTamayo.dao.client.Client;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements AccountServiceInterface {

    private List<Account> accountList;
    private ClientServiceInterface clientServiceInterface;

    public AccountService() {
        setAccountList(new ArrayList<Account>());
        setClientServiceInterface(new ClientService());
    }

    public AccountService(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public ClientServiceInterface getClientServiceInterface() {
        return clientServiceInterface;
    }

    public void setClientServiceInterface(ClientServiceInterface clientServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
    }

    @Override
    public boolean withdraw(int amount, Account account, Client client) {
        if (account.getAccountType()==AccountType.SAVINGS){
            for (Account currentAccount:accountList) {
                if (currentAccount.getClient().getId()==client.getId()){
                   if (currentAccount.getBalance()>500.0){
                       currentAccount.setBalance(currentAccount.getBalance()-amount);
                       return true;
                   }
                }
            }
        } else if (account.getAccountType()==AccountType.INVESTMENT) {
            for (Account currentAccount:accountList) {
                if (currentAccount.getClient().getId()==client.getId()){
                    if (currentAccount.getBalance()>10000.0){
                        currentAccount.setBalance(currentAccount.getBalance()-amount);
                        return true;
                    }
                }
            }
        }else {
            return false;
        }
        return false;
    }

    @Override
    public boolean deposit(int amount, Account account, Client client) {
        if (account.getAccountType()==AccountType.SAVINGS){
            for (Account element:accountList) {
                if (element.getClient().getId()==client.getId()){
                    element.setBalance(element.getBalance()+amount);
                    return true;
                }
            }
        } else if (account.getAccountType()==AccountType.INVESTMENT) {
            for (Account element:accountList) {
                if (element.getClient().getId()==client.getId()){
                    element.setBalance(element.getBalance()+amount);
                    return true;
                }
            }
        }else {
            return false;
        }
        return false;
    }

    @Override
    public void createNewAccount(AccountType accountType, Client client, String password) {
        Account newAccount;
        if (accountType == AccountType.SAVINGS){
            int randomPrefix=(int) Math.floor(Math.random()*999);
            int filteredPrefix= randomPrefix<500?randomPrefix:randomPrefix-499;
            addNewAccount(accountType, client, password, filteredPrefix);
        } else if (accountType == AccountType.INVESTMENT) {
            int randomPrefix=(int) Math.floor(Math.random()*999);
            int filteredPrefix= randomPrefix>500?randomPrefix:randomPrefix+499;
            addNewAccount(accountType, client, password, filteredPrefix);
        }
    }

    private void addNewAccount(AccountType accountType, Client client, String password, int filteredPrefix) {
        int randomSuffix= (int) Math.floor(Math.random()*999999);
        String idString= filteredPrefix+""+randomSuffix;
        long id = Long.parseLong(idString);
        double balance = accountType == AccountType.SAVINGS? 1000:10000 ;
        Account account= new Account(accountType,id,client,password,balance);
        if (getAccountById(id,accountList).getId()!=id){
            accountList.add(account);
        }
    }

    @Override
    public Account getAccountById(long id, List<Account> accountList) {
        for (Account element:accountList) {
            if (element.getClient().getId()==id){
               return element;
            }
        }
        return null;
    }

    @Override
    public List<Account> getAccountsByClient(Client client) {
        List<Account> accountsFromClient= new ArrayList<Account>();

        for (Account currentAccount: accountList) {
            if (currentAccount.getClient().getId()== client.getId()){
                accountsFromClient.add(currentAccount);
            }
        }
        return accountsFromClient;
    }

    @Override
    public boolean deleteAccountById(long id) {

        for (Account currentAccount: accountList) {
            if (currentAccount.getId()== id){
                accountList.remove(currentAccount);
                return true;
            }
        }
        return false;
    }


}
