package com.junitaction.ch03;

/**
 * Created by nckwon on 2017. 6. 16..
 */
public interface Controller {
    Response processRequest(Request request);
    void addHandler(Request request, RequestHandler requestHandler);
}
