package com.effective.ch28;

import java.util.*;

/**
 * Created by nckwon on 2017. 3. 20..
 */
public class Stack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void pushAll(Iterator<? extends E> src) {
//        for (E e : src) {
//            push(e);
//        }
        while (src.hasNext()) {
            E e = src.next();
            push(e);
        }
    }

    /**
     * PECS (Produce - Extends, Consumer - Super)
    **/
    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public boolean isEmpty() {
        return false;
    }

    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        Iterator<? extends T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }

    public void swap(List<?> list, int i, int j) {
         swapHelper(list, i, j);
    }

    private <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());

    }
}
