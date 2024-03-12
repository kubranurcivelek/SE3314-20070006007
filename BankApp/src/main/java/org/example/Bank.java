package org.example;

import java.util.ArrayList;

public class Bank {

    /**
     * _requires_ A Customer parameter customer
     * _effects_ Create new account and add this new account customer account list
     * @param customer to create the account for
     */
    public void createAccount(Customer customer){
        Account newAccount = new Account();
        customer.addAccount(newAccount);
    }

    /**
     * _requires_ A Customer parameter customer
     * _effects_ Getting customer all account
     * @param customer to getting accounts for
     * @return return customer's accounts
     */
    public ArrayList<Account> retrieveAccount(Customer customer){
        return customer.getAccounts();
    }
}
