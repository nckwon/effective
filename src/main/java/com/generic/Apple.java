package com.generic;

/**
 * Created by nckwon on 2017. 4. 1..
 */
public class Apple extends Fruit implements Comparable<Apple> {

    public Apple(int size) {
        super("Apple", size);
    }

    protected Apple(String name, int size) {
        super(name, size);
    }

    public int compareTo(Apple a) {
        return super.compareTo(a);
    }
}
