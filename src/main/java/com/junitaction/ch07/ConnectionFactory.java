package com.junitaction.ch07;

import java.io.InputStream;

/**
 * Created by nckwon on 2017. 6. 18..
 */
public interface ConnectionFactory {
    InputStream getData() throws Exception;
}
