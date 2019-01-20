package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtilsTest {
    @Test
    public void camelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "She Sells Sea Shells";

        // When
        String actual = BasicStringUtils.camelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "sllehs aes slles ehs";

        // When
        String actual = BasicStringUtils.reverse(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseWordsTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "ehs slles aes sllehs";

        // When
        String actual = BasicStringUtils.reverseWords(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "Sllehs Aes Slles Ehs";

        // When
        String actual = BasicStringUtils.reverseThenCamelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeFirstAndLastCharacterTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "he sells sea shell";

        // When
        String actual = BasicStringUtils.removeFirstAndLastCharacter(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest1() {
        // Given
        String input = "shE sells SEA sHeLlS";
        String expected = "SHe SELLS sea ShElLs";

        // When
        String actual = BasicStringUtils.invertCasing(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest2() {
        // Given
        String expected = "sHE sELls SEa sHeLlS";

        // When
        String actual = BasicStringUtils.invertCasing(BasicStringUtils.invertCasing(expected));

        // Then
        Assert.assertEquals(expected, actual);
    }
}
