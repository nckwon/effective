package com.generic;

/**
 * Created by nckwon on 2017. 4. 2..
 */
public class Node2 {

    public Object data;
    public Node2(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        System.out.println("Node2.setData");
        this.data = data;
    }
}
