package com.generic.ch09.function;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nckwon on 2017. 4. 14..
 */
public class Functions {
    public static <A, B, X extends Throwable> List<B> applyAll(
            Function<A, B, X> f, List<A> list) throws X {

        List<B> result = new ArrayList<B>(list.size());
        for (A x : list)
            result.add(f.apply(x));
        return result;
    }

    public static void main(String[] args) {
        Function<String, Integer, Error> length =
                new Function<String, Integer, Error>() {
                    public Integer apply(String x) throws Error {
                        return x.length();
                    }
                };

        Function<String, Class<?>, ClassNotFoundException> forName =
                new Function<String, Class<?>, ClassNotFoundException>() {
                    public Class<?> apply(String x) throws ClassNotFoundException {
                        return Class.forName(x);
                    }
                };

        Function<String, Method, Exception> getRunMethod =
                new Function<String, Method, Exception>() {
                    public Method apply(String x) throws Exception {
                        return Class.forName(x).getMethod("run");
                    }
                };

        List<String> strings = Arrays.asList(args);
        System.out.println(applyAll(length, strings));

        try {
            System.out.println(applyAll(forName, strings));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(applyAll(getRunMethod, strings));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
