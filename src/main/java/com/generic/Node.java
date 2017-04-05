package com.generic;

/**
 * Created by nckwon on 2017. 4. 2..
 */
public class Node<T> {

    public T data;
    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
