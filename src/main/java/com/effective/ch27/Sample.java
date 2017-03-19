package com.effective.ch27;

import java.util.*;

/**
 * Created by nckwon on 2017. 3. 20..
 */
public class Sample {

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);


        String[] strings = {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for (String s: strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = identityFunction();
        for (Number n: numbers) {
            System.out.println(sameNumber.apply(n));
        }

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 40));
        int result = max(list);
        System.out.println(result);

        List<String> stringList = new ArrayList<String>(Arrays.asList("ccccc", "bbbb", "zzzzz", "aaaaa"));
        String stringResult = max(stringList);
        System.out.println(stringResult);

    }

    private static UnaryFunction<Object> IDENTITY_FUNCTION =
            new UnaryFunction<Object>() {
                public Object apply(Object arg) {
                    return arg;
                }
            };

    public interface UnaryFunction<T> {
        T apply(T arg);
    }
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }
 }
