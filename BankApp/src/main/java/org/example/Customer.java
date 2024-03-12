package org.example;

import java.util.ArrayList;

public class Customer {


    String name;
    long initialDeposit;
    ArrayList<Account> accounts;

    /**
     * _requires_ A string parameter name and a long parameter initialDeposit
     * _effects_ Function is constructor, constructor create a new customer with name and initial deposit
     * @param name Name of the customer
     * @param initialDeposit İnitial deposit amount of the customer
     */
    public Customer(String name, long initialDeposit) {
        this.name = name;
        this.initialDeposit = initialDeposit;
        accounts = new ArrayList<Account>();

    }

    /**
     * _requires_ A Account parameter account
     * _effects_ Account adds list of accounts
     * @param account to add to accounts of the customer
     */
    public void addAccount(Account account){
        accounts.add(account);
    }

    /**
     * _effects_ Getting name of customer
     * @return return customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * _effects_ Getting initial deposit of customer
     * @return return customer's initial deposit
     */
    public long getInitialDeposit() {
        return initialDeposit;
    }

    /**
     * _effects_ Getting accounts of customer in account list
     * @return return customer's accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
