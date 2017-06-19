package com.junitaction.ch07;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class TestWebClient {

    private class TestableWebClient extends WebClient {
        private HttpURLConnection connection;
        public void setHttpURLConnection(HttpURLConnection connection) {
            this.connection = connection;
        }

        @Override
        protected HttpURLConnection createHttpURLConnection(URL url) throws IOException {
            return this.connection;
        }
    }

    @Test
    public void testGetContentOk() throws Exception {
        MockConnectionFactory mockConnectionFactory = new MockConnectionFactory();
        MockInputStream mockInputStream = new MockInputStream();
        mockInputStream.setBuffer("It works");
        //mockConnectionFactory.setData(new ByteArrayInputStream("It works".getBytes()));
        mockConnectionFactory.setData(mockInputStream);
        WebClient client = new WebClient();
        String result = client.getContent(mockConnectionFactory);
        assertEquals("It works", result);
        mockInputStream.verify();

    }
}
