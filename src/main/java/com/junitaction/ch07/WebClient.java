package com.junitaction.ch07;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class WebClient {

    public String getContent(ConnectionFactory connectionFactory) {
        String result;
        StringBuffer content = new StringBuffer();
        InputStream is = null;

        try {
            //HttpURLConnection connection = createHttpURLConnection(url);
            //connection.setDoInput(true);
            is = connectionFactory.getData();// connection.getInputStream();
            int count;
            while(-1 != (count = is.read())) {
                content.append(new String(Character.toChars(count)));
            }
            result = content.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                result = null;
            }
        }
        return result;
    }

    protected HttpURLConnection createHttpURLConnection(URL url) throws IOException {
        return (HttpURLConnection)url.openConnection();
    }
}
