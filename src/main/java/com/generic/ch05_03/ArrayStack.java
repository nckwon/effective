package com.generic.ch05_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nckwon on 2017. 4. 4..
 */
public class ArrayStack<E> implements Stack<E> {

    private List list;

    public ArrayStack() {
        list = new ArrayList();
    }

    public boolean empty() {
        return list.size() == 0;
    }

    public void push(E elt) {
        list.add(elt);
    }

    public E pop() {
        Object elt = list.remove(list.size()-1);
        return (E)elt;
    }

    public String toString() {
        return "stack" + list.toString();
    }
}
