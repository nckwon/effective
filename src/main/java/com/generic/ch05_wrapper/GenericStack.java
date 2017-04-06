package com.generic.ch05_wrapper;

/**
 * Created by nckwon on 2017. 4. 4..
 */
interface GenericStack<E> {
    public Stack unwrap();
    public boolean empty();
    public void push(E elt);
    public E pop();
}
