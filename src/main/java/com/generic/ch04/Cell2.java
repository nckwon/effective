package com.generic.ch04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nckwon on 2017. 4. 2..
 */
public class Cell2<T> {
    private final T value;
    // compile error
    //private static List<T> values = new ArrayList<T>();
    private static List<Object> values = new ArrayList<Object>();
    public Cell2(T value) {
        this.value = value;
        values.add(value);
    }
    public T getValue() { return  value; }

//  compile error
//    public static List<T> getValues() {
//        return values;
//    }
    public static List<Object> getValues() {
        return values;
    }

}
