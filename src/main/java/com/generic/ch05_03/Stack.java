package com.generic.ch05_03;

/**
 * Created by nckwon on 2017. 4. 4..
 */
interface Stack<E> {
    public boolean empty();
    public void push(E elt);
    public E pop();
}
