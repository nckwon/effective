package com.generic;

/**
 * Created by nckwon on 2017. 4. 1..
 */
public class Orange extends Fruit implements Comparable<Orange> {

    public Orange(int size) {
        super("Orange", size);
    }

    public int compareTo(Orange o) {
        return super.compareTo(o);
    }
}
