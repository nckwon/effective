package com.generic.ch11_3;

import com.generic.ch11_2.Stack;

/**
 * Created by nckwon on 2017. 4. 17..
 */
public class SynchronizedArrayStack implements Stack {

    private final Stack stack;
    public SynchronizedArrayStack(Stack stack) {
        this.stack = stack;
    }

    public synchronized void push(int elt) {
        stack.push(elt);
    }

    public synchronized int pop() {
        return stack.pop();
    }

    public synchronized boolean isEmpty() {
        return stack.isEmpty();
    }
}
