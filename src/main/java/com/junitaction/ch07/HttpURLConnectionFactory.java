package com.junitaction.ch07;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class HttpURLConnectionFactory implements ConnectionFactory {

    private URL url;
    public HttpURLConnectionFactory(URL url) {
        this.url = url;
    }

    public InputStream getData() throws Exception {
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        return connection.getInputStream();
    }
}
