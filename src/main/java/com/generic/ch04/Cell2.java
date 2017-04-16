package com.generic.ch04;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Collection;
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

    public static <T> List<T> asList(Collection<T> collection) {
        if (collection instanceof List<?>) {
            return (List<T>) collection;
        }
        else {
            String[] errors = new String[] {"", ""};
            throw new IllegalArgumentException("");
        }
    }
}
