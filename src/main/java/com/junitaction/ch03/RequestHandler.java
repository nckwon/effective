package com.junitaction.ch03;

/**
 * Created by nckwon on 2017. 6. 16..
 */
public interface RequestHandler {
    Response process(Request request) throws Exception;
}
