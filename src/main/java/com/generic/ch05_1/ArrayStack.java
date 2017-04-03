package com.generic.ch05_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nckwon on 2017. 4. 3..
 */
public class ArrayStack<E> implements Stack<E> {

    private List<E> list;
    public ArrayStack() {
        list = new ArrayList<E>();
    }

    public boolean empty() {
        return list.size() == 0;
    }

    public void push(E elt) {
        list.add(elt);
    }

    public E pop() {
        E elt = list.remove(list.size()-1);
        return elt;
    }

    public String toString() {
        return "stack" + list.toString();
    }
}
