package com.effective.ch47;

import java.util.Random;

/**
 * Created by nckwon on 2017. 3. 25..
 */
public class Demo {

    private static final Random rnd = new Random();

    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i=0; i<1000000; i++) {
            if (random(n) < n/2)
                low++;
        }

        System.out.println(low);

        Integer i1 = new Integer(42);
        Integer i2 = new Integer(42);

        if (i1 == i2)
            System.out.println("equals");
        else
            System.out.println("not equals");


    }
}
