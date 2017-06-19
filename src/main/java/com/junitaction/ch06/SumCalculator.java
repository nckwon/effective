package com.junitaction.ch06;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class SumCalculator implements Calculator {
    public int sum(int a, int b) {
        return a+b;
    }

    public void echo(String echo) {
        System.out.println("SumCalculator");
    }
}
