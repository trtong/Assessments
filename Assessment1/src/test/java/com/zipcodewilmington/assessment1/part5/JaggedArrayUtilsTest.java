package com.zipcodewilmington.assessment1.part5;

import org.junit.Assert;
import org.junit.Test;

public class JaggedArrayUtilsTest {

    @Test
    public void sumTest() {
        // Given
        Integer[][] input = {{1,2,3}, {18}, {9,7,5}, {2,1,2}};
        Integer expected = 50;

        // When
        Integer actual = JaggedArrayUtils.sum(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumTest2() {
        // Given
        Integer[][] input = {{25,25,25}, {18}, {9,7,5}, {2,1,2}};
        Integer expected = 119;

        // When
        Integer actual = JaggedArrayUtils.sum(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rowsSumTest() {
        // Given
        Integer[][] input = {{1,2,3}, {18}, {9,7,5}, {2,1,2}};
        Integer[] expected = {6, 18, 21, 5};

        // When
        Integer[] actual = JaggedArrayUtils.rowsSum(input);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void rowsSumTest2() {
        // Given
        Integer[][] input = {{25,25,25}, {18}, {9,7,5}, {2,1,2}};
        Integer[] expected = {75, 18, 21, 5};

        // When
        Integer[] actual = JaggedArrayUtils.rowsSum(input);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void sumOfLastItemsTest() {
        // Given
        Integer[][] input = {{1,2,3}, {2}, {9,7,5}, {2,1,2}};
        Integer expected = 12;

        // When
        Integer actual = JaggedArrayUtils.sumOfLastItems(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumOfLastItemsTest2() {
        // Given
        Integer[][] input = {{25,25}, {18}, {9,7,5}, {2,1,2,18,7,15}};
        Integer expected = 63;

        // When
        Integer actual = JaggedArrayUtils.sumOfLastItems(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void averageTest() {
        // Given
        Integer[][] input = {{1,2,3}, {18}, {9,7,5}, {2,1,2}};
        Integer expected = 5;

        // When
        Integer actual = JaggedArrayUtils.average(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSumTest() {
        // Given
        Integer[][] input = {{25,25}, {18}, {9,7,5}, {2,1,2,18,7,15}};
        Integer expected = 50;

        // When
        Integer actual = JaggedArrayUtils.getMaxSum(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalCellsTest() {
        // Given
        Integer[][] input = {{25,25}, {18}, {9,7,5}, {2,1,2,18,7,15}};
        Integer expected = 12;

        // When
        Integer actual = JaggedArrayUtils.getTotalCells(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


}
