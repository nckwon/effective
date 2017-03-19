package com.effective.ch28;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by nckwon on 2017. 3. 20..
 */
public class Stack<E> {


    public void pushAll(Iterator<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public void push(E e) {

    }

    public boolean isEmpty() {
        return false;
    }

    public E pop(){

    }
}
