package com.junitaction.ch07;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class MockAccountManager implements AccountManager {

    private Map<String, Account> accounts = new HashMap<String, Account>();

    public void addAccount(String userId, Account account) {
        this.accounts.put(userId, account);
    }

    public Account findAccountForUser(String userId) {
        return this.accounts.get(userId);
    }

    public void updateAccount(Account account) {

    }
}
