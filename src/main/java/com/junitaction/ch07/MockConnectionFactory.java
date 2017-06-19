package com.junitaction.ch07;

import java.io.InputStream;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class MockConnectionFactory implements ConnectionFactory {

    private InputStream inputStream;
    public void setData(InputStream stream) {
        this.inputStream = stream;
    }
    public InputStream getData() throws Exception {
        return this.inputStream;
    }
}
