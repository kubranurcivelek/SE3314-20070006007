package org.example;

import junit.framework.TestCase;

import java.util.ArrayList;

public class CustomerTest extends TestCase {

    public void testAddAccount() {
        Customer customer = new Customer("Kübra",0);
        Account account = new Account();

        customer.addAccount(account);

        ArrayList<Account> accounts = customer.getAccounts();

        assertNotNull(customer.getAccounts());
        assertEquals(1, accounts.size());
        assertEquals(0, accounts.get(0).checkBalance());

    }

    public void testTestGetName() {
        Customer customer = new Customer("Lina",0);
        Account account = new Account();

        customer.addAccount(account);

        assertNotNull(customer.getAccounts());
        assertEquals(1, customer.getAccounts().size());
        assertEquals(0, customer.getAccounts().get(0).checkBalance());
    }


}