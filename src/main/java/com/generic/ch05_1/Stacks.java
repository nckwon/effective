package com.generic.ch05_1;

/**
 * Created by nckwon on 2017. 4. 3..
 */
class Stacks {
    public static <T> Stack<T> reverse(Stack<T> in) {
        Stack<T> out = new ArrayStack<T>();
        while (!in.empty()) {
            T elt = in.pop();
            out.push(elt);
        }
        return out;
    }
}
