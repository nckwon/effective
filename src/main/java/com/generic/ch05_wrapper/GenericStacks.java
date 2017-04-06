package com.generic.ch05_wrapper;

/**
 * Created by nckwon on 2017. 4. 4..
 */
public class GenericStacks {

    public static <T> GenericStack<T> reverse(GenericStack<T> in) {
        Stack rawIn = in.unwrap();
        Stack rawOut = Stacks.reverse(rawIn);
        return new GenericStackWrapper<T>(rawOut);
    }
}
