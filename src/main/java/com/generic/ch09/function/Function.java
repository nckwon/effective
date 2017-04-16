package com.generic.ch09.function;

/**
 * Created by nckwon on 2017. 4. 14..
 */
public interface Function<A, B, X extends Throwable> {
    public B apply(A x) throws X;
}
