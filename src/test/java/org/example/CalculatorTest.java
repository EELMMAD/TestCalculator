package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero(){
        int sum = calculator.add(0,0);
         assertEquals(0, sum);
    }
    @Test
    public void canAddOnePlusOne(){
        int sum = calculator.add(1,1);
        assertEquals(2, sum);
    }
    @Test
    public void canAddNegativeNumbers(){
        int sum = calculator.add(-1,-1);
        assertEquals(-2, sum);
    }
    @Test
    public void canAddNegativeWithPositive(){
        int sum = calculator.add(2,-8);
        assertEquals(-6, sum);
    }


}