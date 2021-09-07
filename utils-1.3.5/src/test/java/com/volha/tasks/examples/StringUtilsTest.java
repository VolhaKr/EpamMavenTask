package com.volha.tasks.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testStringUtilsIsPositiveShouldReturnTrueWhenPositive() {
        String intput = "23456";
        assertTrue (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }

    @Test
    public void testStringUtilsIsPositiveShouldReturnFalseWhenNegative() {
        String intput = "-23456";
        assertFalse (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }

    @Test
    public void testStringUtilsIsPositiveShouldReturnFalseWhenNotOnlyNumbers() {
        String intput = "-234,56";
        assertFalse (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }

    @Test
    public void testStringUtilsIsPositiveShouldReturnFalseWhenNull() {
        String intput = null;
        assertFalse (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }

    @Test
    public void testStringUtilsIsPositiveShouldReturnFalseWhenEmpty() {
        String intput = "";
        assertFalse (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }

    @Test
    public void testStringUtilsIsPositiveShouldReturnFalseWhenTooLong() {
        String intput = "452134561243626462451361267537636751267";
        assertFalse (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }
}

