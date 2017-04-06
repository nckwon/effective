package com.generic.ch05_1;

/**
 * Created by nckwon on 2017. 4. 3..
 */
 interface Stack<E> {
    public boolean empty();
    public void push(E elt);
    public E pop();
}
