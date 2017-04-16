package com.generic.ch11_1;

import java.util.Iterator;

/**
 * Created by nckwon on 2017. 4. 16..
 */
public class Counter implements Iterable<Integer> {
    private int count;
    public Counter(int count) {
        this.count = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int i = 0;
            public boolean hasNext() {
                return i < count;
            }

            public Integer next() {
                i++;
                return i;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }


}
