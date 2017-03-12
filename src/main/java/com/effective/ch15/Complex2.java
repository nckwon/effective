package com.effective.ch15;

/**
 * Created by nckwon on 2017. 3. 12..
 */
public class Complex2 {
    private final double re;
    private final double im;

    private Complex2(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex2 valueOf(double re, double im) {
        return new Complex2(re, im);
    }
}
