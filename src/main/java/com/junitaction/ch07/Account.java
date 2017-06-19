package com.junitaction.ch07;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class Account {

    private String accountId;
    private long balance;

    public Account(String id, long balance) {
        this.accountId = id;
        this.balance = balance;
    }

    public void debit(long amount) {
        this.balance -= amount;
    }

    public void credit(long amount) {
        this.balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}
