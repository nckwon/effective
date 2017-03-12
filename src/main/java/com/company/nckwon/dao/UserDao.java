package com.company.nckwon.dao;

/**
 * Created by nckwon on 2017. 2. 24..
 */
public class UserDao {

    private ConnectionMaker connectionMaker;
//    public UserDao() {
//        connectionMaker = new DConnectionMaker();
//    }
    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
