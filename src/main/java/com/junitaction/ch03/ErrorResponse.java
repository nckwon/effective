package com.junitaction.ch03;

/**
 * Created by nckwon on 2017. 6. 16..
 */
public class ErrorResponse implements Response {
    private Request originalRequest;
    private Exception originalException;
    private final String NAME = "ErrorResponse";

    public ErrorResponse(Request request, Exception exception) {
        this.originalRequest = request;
        this.originalException = exception;
    }

    public Request getOriginalRequest() {
        return originalRequest;
    }

    public Exception getOriginalException() {
        return originalException;
    }

    public String getName() {
        return NAME;
    }
}
