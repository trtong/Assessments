package rocks.zipcode.quizweek7.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.fundamentals.StringUtils;

/**
 * @author leon on 28/11/2018.
 */
public class GetNumberOfOccurrencesTest {
    @Test
    public void getNumberOfOccurrencesTest1() {
        // Given
        String baseString = "]]]Hey thereHey there;Hey there[]'";
        String subString = "Hey there";
        Integer expected = 3;

        // when
        Integer actual = StringUtils.getNumberOfOccurrences(baseString, subString);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getNumberOfOccurrencesTest2() {
        // Given
        String baseString = "1*7!PassingTests-PassingTests.PassingTests;PassingTests'PassingTests";
        String subString= "PassingTests";
        Integer expected = 5;

        // when
        Integer actual = StringUtils.getNumberOfOccurrences(baseString, subString);

        // then
        Assert.assertEquals(expected, actual);
    }
}
