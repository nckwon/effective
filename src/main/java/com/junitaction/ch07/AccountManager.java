package com.junitaction.ch07;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public interface AccountManager {
    Account findAccountForUser(String userId);
    void updateAccount(Account account);
}
