package com.company.nckwon;

import com.company.nckwon.dao.ConnectionMaker;
import com.company.nckwon.dao.DConnectionMaker;
import com.company.nckwon.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nckwon on 2017. 2. 24..
 */
@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
