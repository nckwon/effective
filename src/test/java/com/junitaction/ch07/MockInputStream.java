package com.junitaction.ch07;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public class MockInputStream extends InputStream {
    private String buffer;
    private int position = 0;
    private int closeCount = 0;

    public void setBuffer(String buffer) {
        this.buffer = buffer;
    }



    @Override
    public int read() throws IOException {
        if (position == buffer.length())
            return -1;
        return buffer.charAt(this.position++);
    }

    public void close() throws IOException {
        closeCount++;
        super.close();
    }

    public void verify() throws AssertionError {
        if (closeCount != 1)
            throw new AssertionError("close() should have been called and once only");
    }
}
