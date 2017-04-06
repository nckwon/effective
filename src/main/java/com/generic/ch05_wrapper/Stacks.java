package com.generic.ch05_wrapper;


/**
 * Created by nckwon on 2017. 4. 3..
 */
public class Stacks {
    public static Stack reverse(Stack in) {
        Stack out = new ArrayStack();
        while (!in.empty()) {
            Object elt = in.pop();
            out.push(elt);
        }
        return out;
    }
}
