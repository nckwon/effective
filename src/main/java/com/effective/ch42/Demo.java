package com.effective.ch42;

import java.util.Arrays;

/**
 * Created by nckwon on 2017. 3. 25..
 */
public class Demo {

    static int min(int... args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Too few arguments");

        int min = args[0];
        for (int i=1; i<args.length; i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }

    public static void main(String[] args) {
        int result = min(10, 1, 3, 5);
        System.out.println(result);

        int[] digits = {3, 1, 4, 5, 6};
        System.out.println(Arrays.asList(digits));
        System.out.println(Arrays.toString(digits));

        for (int i:
             digits) {
            System.out.println(i);
        }
    }
}
