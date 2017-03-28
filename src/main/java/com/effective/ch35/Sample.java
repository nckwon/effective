package com.effective.ch35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by nckwon on 2017. 3. 23..
 */
public class Sample {

    @Test
    public static void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }

    @Test
    public static void m3() {
        throw new RuntimeException("Boom");
    }

    public static void main(String[] args) {

    }
}
