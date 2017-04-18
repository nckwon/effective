package com.generic.ch12_1;

/**
 * Created by nckwon on 2017. 4. 19..
 */
public final class PhoneTask extends Task {

    private final String name;
    private final String number;

    public PhoneTask(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "phone " + name;
    }
}
