package com.junitaction.ch06;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class RunCalculator {

    Calculator cal;

    public RunCalculator() {
        cal = new SumCalculator();
    }

    public void setCal(Calculator cal) {
        this.cal = cal;
    }

    // return sum of a and b
    public int doSum(int a,int b){
        //System.out.println("## summing "+a+"+"+b+"="+ cal.sum(a, b) );
        return cal.sum(a, b);
    }

    // echo string to console
    public void sayHello(String str){
        cal.echo(str);
    }

}
