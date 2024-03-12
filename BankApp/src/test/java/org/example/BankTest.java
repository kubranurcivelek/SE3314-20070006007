package org.example;

import junit.framework.TestCase;

import java.util.ArrayList;

public class BankTest extends TestCase {

    public void testCreateAccount() {
        Bank bank = new Bank();
        Customer customer = new Customer("John", 150);
        bank.createAccount(customer);
        long initialDeposit = 100;
        assertNotNull(customer.accounts);

        ArrayList<Account> accounts = customer.getAccounts();
        assertNotNull(accounts);
        assertEquals(1, accounts.size());
        assertEquals(initialDeposit, accounts.get(0).checkBalance());
    }

    public void testRetrieveAccount() {
        Bank bank = new Bank();
        Customer customer = new Customer("Emir",0);

        bank.createAccount(customer);
        bank.createAccount(customer);

        ArrayList<Account> accounts = bank.retrieveAccount(customer);

        assertNotNull(accounts);
        assertEquals(2, accounts.size());
        assertEquals(0, accounts.get(0).checkBalance());
        assertEquals(0, accounts.get(1).checkBalance());
    }
}