package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 10;

        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        // : Given
        Integer input = 6;

        // : When
        Boolean actual = IntegerUtils.isEven(input);

        // : Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsEven2() {
        // : Given
        Integer input = 7;

        // : When
        Boolean actual = IntegerUtils.isEven(input);

        // : Then
        Assert.assertFalse(actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}

