package com.generic.ch05;

import com.effective.ch02.NutrionFacts;

/**
 * Created by nckwon on 2017. 4. 3..
 */
public class Client {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        for (int i=0; i<4; i++)
            stack.push(new Integer(i));

        assert stack.toString().equals("stack[0, 1, 2, 3]");

        int top = ((Integer)stack.pop()).intValue();
        assert top == 3 && stack.toString().equals("stack[0, 1, 2]");

        Stack reverse = Stacks.reverse(stack);
        assert stack.empty();
        assert reverse.toString().equals("stack[2, 1, 0]");

        Class<Integer> ki = Integer.class;
        Number n = new Integer(42);
        Class<? extends Number> kn = n.getClass();
        assert ki != kn;

    }
}
