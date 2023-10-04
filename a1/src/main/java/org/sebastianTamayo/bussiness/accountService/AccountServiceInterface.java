package org.sebastianTamayo.bussiness.accountService;

import org.sebastianTamayo.dao.account.Account;
import org.sebastianTamayo.dao.account.AccountType;
import org.sebastianTamayo.dao.client.Client;

import java.util.List;

public interface AccountServiceInterface {
    boolean withdraw(int amount, Account account, Client client);

    boolean deposit(int amount, Account account, Client client);

    void createNewAccount(AccountType accountType, Client client, String password);

    Account getAccountById(long id, List<Account> accountList );

    List<Account> getAccountsByClient(Client client);

    boolean deleteAccount(Account account);


}
