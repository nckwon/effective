package com.effective.ch41;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by nckwon on 2017. 3. 25..
 */
public class CollectionClassifier {

    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> collection) {

        //return "Unknown Collection";
        return collection instanceof Set ? "Set" :
                collection instanceof List ? "List" : "Unknown Collection";
    }

    public static void main(String[] args) {

        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c :
                collections) {
            System.out.println(classify(c));


        }
    }
}
