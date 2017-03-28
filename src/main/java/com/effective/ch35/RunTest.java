package com.effective.ch35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by nckwon on 2017. 3. 23..
 */
public class RunTest {

    public static void main(String[] args) throws Exception {

        int tests = 0;
        int passed = 0;
        Class testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods() ) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;

                try {
                    m.invoke(null);
                    passed++;
                } catch (IllegalAccessException e) {
                    Throwable exc = e.getCause();
                    //e.printStackTrace();
                    System.out.println(m + " failed: " + exc);
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    //e.printStackTrace();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception e) {
                    System.out.println("INVALID @Test: "  + m);
                }
            }
        }

        System.out.printf("Passed: %d, Failed: %d\n", passed, tests - passed);
    }
}
