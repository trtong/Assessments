package rocks.zipcode.quizweek7.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.fundamentals.StringUtils;

/**
 * @author leon on 28/11/2018.
 */
public class GetIndexOfNthSubStringTest {
    @Test
    public void getIndexOfNthSubstringTest1() {
        // Given
        String baseString = "]]]Hey thereHey there;Hey there[]'";
        String subString = "Hey there";
        Integer nthOccurrence = 2;
        Integer expected = 12;

        // when
        Integer actual = StringUtils.getIndexOfNthSubstring(baseString, subString, nthOccurrence);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIndexOfNthSubstringTest2() {
        // Given
        String baseString = "1*7!PassingTests-PassingTests.PassingTests;PassingTests'PassingTests";
        String subString= "PassingTests";
        Integer nthOccurrence = 4;
        Integer expected = 43;


        // when
        Integer actual = StringUtils.getIndexOfNthSubstring(baseString, subString, nthOccurrence);

        // then
        Assert.assertEquals(expected, actual);
    }
}
