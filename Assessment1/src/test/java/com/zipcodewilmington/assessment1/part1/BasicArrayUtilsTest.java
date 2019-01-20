package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtilsTest {
    @Test
    public void getFirstElementTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "The";

        // When
        String actual = BasicArrayUtils.getFirstElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirstElementTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "Somewhere";

        // When
        String actual = BasicArrayUtils.getFirstElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "quick";

        // When
        String actual = BasicArrayUtils.getSecondElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "over";

        // When
        String actual = BasicArrayUtils.getSecondElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseArrayTest() {
        // Given
        String[] input = {"The", "quick", "brown"};
        String[] expected = {"brown", "quick", "The"};

        // When
        String[] actual = BasicArrayUtils.reverse(input);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseArrayTest2() {
        // Given
        String[] expected = {"Somewhere", "over", "the", "rainbow"};

        // When
        String[] actual = BasicArrayUtils.reverse(BasicArrayUtils.reverse(expected));

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void firstLetterTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown", "fox"};
        String expected = "Tqbf";

        // When
        String actual = BasicArrayUtils.getFirstLetterOfEachElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstLetterTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "Sotr";

        // When
        String actual = BasicArrayUtils.getFirstLetterOfEachElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
