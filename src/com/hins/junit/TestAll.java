package com.hins.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {

    public static Test suite() {
        TestSuite ts = new TestSuite();
        ts.addTestSuite(CalculatorTester.class);
        ts.addTestSuite(CalculatorATester.class);
        return ts;
    }
}
