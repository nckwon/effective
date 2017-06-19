package com.junitaction.ch06;

import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;


/**
 * Created by nckwon on 2017. 6. 18..
 */
public class CalculatorTest {

    private Calculator mock;
    //private RunCalculator runner;
    private RunCalculator runner;

    @Before
    public void setUp() {
        mock = createMock(Calculator.class);
        runner = new RunCalculator();
        runner.setCal(mock);
    }

    @Test
    public void testDoSum() {
        expect(mock.sum(1,2)).andReturn(3);
        replay(mock);
        assertEquals(3, runner.doSum(1, 2));
        verify(mock);
    }

    @Test
    public void testSayHello() {
        mock.echo("Hello");
        replay(mock);
        runner.sayHello("Hello");
        runner.sayHello("Hello");
        runner.sayHello("Hello bcho");
        verify(mock);

    }

}
