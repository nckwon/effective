package com.effective.ch16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nckwon on 2017. 3. 17..
 */
public class InstrumentedHashSet2<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet2(Set<E> s) {
        super(s);
    }

    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        InstrumentedHashSet2<String> s = new InstrumentedHashSet2<String>(set);
        //s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        s.addAll(Arrays.asList("aaa", "bbb", "cccc"));
        System.out.println("size:" + s.size());
        System.out.println("addCount:" + s.getAddCount());
    }
}
