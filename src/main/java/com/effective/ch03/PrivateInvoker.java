package com.effective.ch03;

import java.lang.reflect.Constructor;

/**
 * Created by nckwon on 2017. 3. 12..
 */
public class PrivateInvoker {

    public static void main(String[] args) throws Exception {
        Constructor<?> con = Private.class.getDeclaredConstructors()[0];
        con.setAccessible(true);
        Private p = (Private) con.newInstance();

    }

    class Private {
        private Private() {
            System.out.println("Hello");
        }
    }
}
