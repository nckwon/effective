package com.generic.ch05_wrapper;

/**
 * Created by nckwon on 2017. 4. 4..
 */
public class GenericStackWrapper<E> implements GenericStack<E> {

    private Stack stack;
    public GenericStackWrapper(Stack stack) {
        this.stack = stack;
    }

    public Stack unwrap() {
        return stack;
    }

    public boolean empty() {
        return stack.empty();
    }

    public void push(E elt) {
        stack.push(elt);
    }

    public E pop() {
        return (E)stack.pop();
    }

    public String toString() {
        return stack.toString();
    }
}
