package com.students.travis;

import org.junit.Assert;
import org.junit.Test;

class MainTest {

    @Test
    public void sumPositiveTest() {
        int a = 5;
        int b = 10;
        int expectedResult = 15;

        int actualResult = a + b;

        Assert.assertEquals("Incorrect sum!", expectedResult, actualResult);
    }

}