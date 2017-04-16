package com.generic.ch11_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nckwon on 2017. 4. 16..
 */
public class Demo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        for (Iterator it = list.iterator() ; it.hasNext(); ) {
            System.out.println(it.next());
        }

        for (Object str:
             list) {
            System.out.println(str);
        }
        int total = 0;
        for (int i : new Counter(4)) {
            total += i;
        }
        System.out.println(total);

    }


}
