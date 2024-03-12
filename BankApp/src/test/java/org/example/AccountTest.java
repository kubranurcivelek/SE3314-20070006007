package org.example;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

    public void testDepositMoney() {

        Account account = new Account();
        long depositMoney = 100;
        account.depositMoney(depositMoney);
        assertEquals("test deposit money", 100, account.checkBalance() );
    }

    public void testWithdrawMoney() {
        Account account = new Account();
        long depositMoney = 100;
        account.depositMoney(depositMoney);
        account.withdrawMoney(50);
        assertEquals("test withdraw money", 50, account.checkBalance());
    }

    public void testCheckBalance() {
        Account account = new Account();
        assertEquals("test check balance", 0, account.checkBalance());
    }
}