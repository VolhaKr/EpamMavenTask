package com.volha.tasks.examples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testStringUtilsIsPositiveShouldReturnTrue() {
        String intput = "23456";
        assertTrue (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }

    @Test
    public void testStringUtilsIsPositiveShouldReturnFalse() {
        String intput = "-23456";
        assertFalse (com.volha.tasks.examples.StringUtils.isPositiveNumber(intput));
    }
}

