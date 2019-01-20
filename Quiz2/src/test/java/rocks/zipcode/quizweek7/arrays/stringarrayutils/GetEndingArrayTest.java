package rocks.zipcode.quizweek7.arrays.stringarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.arrays.StringArrayUtils;

/**
 * @author leon on 29/11/2018.
 */
public class GetEndingArrayTest {
    @Test
    public void testGetEndingArrayFrom0() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 0;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        for (String s: actual
             ) {
            System.out.println(s);
        }
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetEndingArrayFrom1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndingArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = 98;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEndingArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = -1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
