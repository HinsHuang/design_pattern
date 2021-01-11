package com.hins.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorATester extends TestCase {


    public void testAdd() {
        int result = CalculatorA.add(1, 2);
        Assert.assertEquals(3, result);
    }

    public void testSub() {
        int result = CalculatorA.sub(5, 4);
        Assert.assertEquals(1, result);
    }

    public void testMultiply() {
        int result = CalculatorA.multiply(4, 5);
        Assert.assertEquals(20, result);
    }



}
