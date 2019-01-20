package rocks.zipcode.quizweek7.arrays.stringarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.arrays.StringArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class GetSubArrayTest {
    @Test
    public void testGetSubArrayFrom0To2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick", "Brown"};
        int startIndex = 0;
        int endIndex = 2;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom1To3() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown", "Fox"};
        int startIndex = 1;
        int endIndex = 3;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSubArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 98;
        int endIndex = 99;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSubArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = -1;
        int endIndex = -10;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }
}
