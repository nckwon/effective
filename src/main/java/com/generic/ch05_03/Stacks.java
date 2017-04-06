package com.generic.ch05_03;

/**
 * Created by nckwon on 2017. 4. 4..
 */
public class Stacks {

    public static <T> Stack<T> reverse(Stack<T> in) {
        Stack out = new ArrayStack();

        while (!in.empty()) {
            Object elt = in.pop();
            out.push(elt);
        }
        return out;
    }
}
