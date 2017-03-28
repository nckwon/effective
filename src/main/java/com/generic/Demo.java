package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nckwon on 2017. 3. 29..
 */
public class Demo {

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<T>();
        for (T elt:arr)
            list.add(elt);

        return list;
    }

    public static void main(String[] args) {

        Integer[] a = {1,2,3};
        List<Integer> aList = Demo.toList(a);
        System.out.println(aList);

        Double[] b = {1.0, 2.0};
        List<Double> bList = Demo.toList(b);
        System.out.println(bList);
    }
}
