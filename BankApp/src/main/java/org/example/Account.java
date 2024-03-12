package org.example;

public class Account {

    private long balance=0;

    public Account() {
    }

    /**
     * _requires_ A long parameter amount
     * _effects_ Balance increases  by amount
     * @param amount Amount is money to the deposit
     */
    public void depositMoney(long amount){
        balance=balance+amount;
    }

    /**
     * _requires_ A long parameter amount
     * _effects_ Balance decreases by amount
     * @param amount Amount is money to the withdrawn
     */
    public void withdrawMoney(long amount){
        balance=balance-amount;
    }

    /**
     * _effects_ Function shows balance
     * @return return balance
     */
    public long checkBalance(){
        return balance;
    }
}
