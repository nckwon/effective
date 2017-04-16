package com.generic.ch06;

import java.util.AbstractList;
import java.util.Collection;
import java.util.RandomAccess;

/**
 * Created by nckwon on 2017. 4. 7..
 */
public class ArrayList<E> extends AbstractList<E> implements RandomAccess{

    private E[] arr;
    private int size;

    public ArrayList(int cap) {
        if (cap < 0)
            throw new IllegalArgumentException("Illegal Capacity: "  + cap);

        arr = (E[])new Object[cap];
    }

    public ArrayList() {
        this(10);
    }

    public ArrayList(Collection<? extends E> c) {
        this(c.size());
        addAll(c);
    }

    public void ensureCapacity(int mincap) {
        int oldcap = arr.length;
        if (mincap > oldcap) {
            int newcap = Math.max(mincap, (oldcap*3)/2+1);
            E[] oldarr = arr;
            arr = (E[])new Object[newcap];
            System.arraycopy(oldarr, 0, arr, 0, size);
        }
    }

    private void checkBounds(int i, int size) {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index:" + i + ", Size: " + size);
    }
    @Override
    public E get(int i) {
        checkBounds(i, size);
        return arr[i];
    }

    public E set(int i, E elt) {
        checkBounds(i, size);
        E old = arr[i];
        arr[i] = elt;
        return old;
    }

    public void add(int i, E elt) {
        checkBounds(i, size+1);
        ensureCapacity(size+1);
        System.arraycopy(arr, i, arr, i+1, size-1);
        arr[i] = elt;
        size++;
    }

    public E remove(int i) {
        checkBounds(i, size);
        E old = arr[i];
        arr[i] = null;
        size--;
        System.arraycopy(arr, i+1, arr, i, size-1);
        return old;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);

        System.arraycopy(arr,0,1,0,size);
        if (size < a.length)
            a[size] = null;

        return a;
    }

    public Object[] toArray() {
        return toArray(new Object[0]);
    }

    @Override
    public int size() {
        return size;
    }
}
