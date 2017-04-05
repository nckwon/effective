package com.generic;

import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

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

    public static <T> List<T> toList2(T... arr) {
        List<T> list = new ArrayList<T>();
        for (T elt:arr)
            list.add(elt);

        return list;
    }

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num :
                nums) {
            s += num.doubleValue();
        }
        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i=0; i<n; i++)
            ints.add(i);
    }

    public static double sumCont(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }

    public static <T extends Comparable<T>> T max(Collection<T> coll) {
        Iterator<T> it = coll.iterator();
        T candidate = it.next();//coll.iterator().next();
        for (T elt :
                coll) {
            if (candidate.compareTo(elt) < 0)
                candidate = elt;
        }
        return candidate;
    }

    public static <S extends Readable & Closeable,
                    T extends Appendable & Closeable>
        void copy(S src, T trg, int size) throws IOException {

        try {
            CharBuffer buf = CharBuffer.allocate(size);
            int i = src.read(buf);
            while (i >= 0) {
                buf.flip();//prepare buffer for writing
                trg.append(buf);
                buf.clear();//prepare buffer for reading
                i = src.read(buf);
            }
        } finally {
            src.close();
            trg.close();
        }
    }

    public static void main(String[] args) {

//        Integer[] a = {1,2,3};
//        List<Integer> aList = Demo.toList(a);
//        System.out.println(aList);
//
//        Double[] b = {1.0, 2.0};
//        List<Double> bList = Demo.toList(b);
//        System.out.println(bList);
//
//        List<Integer> ints = Demo.toList2(1,2,3,4);
//        System.out.println(ints);

//        List<Integer> ints = Arrays.asList(1,2,3);
//        assert Demo.sum(ints) == 6.0;
//
//        List<Number> nums = Arrays.<Number>asList(1,2,2.78,3.14);
//        assert sum(nums) == 8.92;

//        List<Integer> ints = new ArrayList<Integer>();
//        Demo.count(ints, 5);
//        System.out.println(ints.toString());
//        assert ints.toString().equals("[0, 1, 2, 3, 4]");
//
//        List<Number> nums = new ArrayList<Number>();
//        double sum = sumCont(nums, 5);
//        assert sum == 10;

//        List<Integer> ints = Arrays.asList(1,2,3);
//        List<? super Number> nums = Arrays.<Number>asList(1.0);
//        //double db1 = sum(nums);
//        //Double dd = sum(ints);
//        nums.set(0, 3.14);
//        //nums.add(1.0);
//
//        for (int i=0; i<nums.size();i++)
//            System.out.println(nums.get(i));
//
//
//        //ints.add(null);
//
//        for (int i=0; i<ints.size();i++)
//            System.out.println(ints.get(i));

        List<Integer> ints = Arrays.asList(0, 1, 2);
        assert Demo.max(ints) == 2;
    }
}

