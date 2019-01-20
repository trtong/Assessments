package rocks.zipcode.quizweek7.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.fundamentals.StringUtils;

/**
 * @author leon on 28/11/2018.
 */
public class ReplaceLastSubStringTest {
    @Test
    public void testReplaceLastString1() {
        // Given
        String input = "]]]Hey thereHey there;Hey there[]'";
        String expected = "]]]Hey thereHey there;[]'";
        String stringToRemove = "Hey there";

        // when
        String actual = StringUtils.replaceLastSubString(input, stringToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceLastString2() {
        // Given
        String input = "1*7!PassingTests-PassingTests.PassingTests";
        String expected = "1*7!PassingTests-PassingTests.";
        String stringToRemove = "PassingTests";

        // when
        String actual = StringUtils.replaceLastSubString(input, stringToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }
}
