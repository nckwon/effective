package com.generic.ch12_1;

/**
 * Created by nckwon on 2017. 4. 19..
 */
public final class CodingTask extends Task {
    private final String spec;
    public CodingTask(String spec) {
        this.spec = spec;
    }
    public String getSpec() {
        return this.spec;
    }

    @Override
    public String toString() {
        return "code " + spec;
    }
}
