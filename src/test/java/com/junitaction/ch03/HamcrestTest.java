package com.junitaction.ch03;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by nckwon on 2017. 6. 17..
 */
public class HamcrestTest {

    private List<String> values;

    @Before
    public void setUpList() {
        values = new ArrayList<String>();
        values.add("x");
        values.add("y");
        values.add("z");
    }

    @Test
    @Ignore
    public void testWithoutHamcrest() {
        assertTrue(values.contains("one")
        || values.contains("two")
        || values.contains("three"));
    }

    @Test
    public void testWithHamcrest() {
        //assertThat(values, hasItem(anyOf(equalTo("one"), equalTo("two"), equalTo("three"))));
        assertThat(values, not(hasItem("one")));
        //assertThat(values, not(hasItem("z")));

    }



}
