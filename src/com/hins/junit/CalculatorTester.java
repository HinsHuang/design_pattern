package com.hins.junit;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTester extends TestCase {

    @Override
    public void setUp() throws Exception {
        System.out.println("测试开始...");
    }

    @Override
    public void tearDown() throws Exception {
        System.out.println("测试结束...");
    }

    public void testAdd() {
        int result = Calculator.add(1, 2);
        Assert.assertEquals(3, result);
    }

    public void testSub() {
        int result = Calculator.sub(5, 4);
        Assert.assertEquals(1, result);
    }

    public void testMultiply() {
        int result = Calculator.multiply(4, 5);
        Assert.assertEquals(20, result);
    }



}
