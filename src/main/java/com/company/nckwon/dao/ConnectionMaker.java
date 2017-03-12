package com.company.nckwon.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by nckwon on 2017. 2. 24..
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
