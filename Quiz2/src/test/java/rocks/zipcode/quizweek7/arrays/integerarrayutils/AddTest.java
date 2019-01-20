package rocks.zipcode.quizweek7.arrays.integerarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.arrays.IntegerArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class AddTest {
    @Test
    public void testAdd1() {
        // given
        Integer valueToBeAdded = 10;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, valueToBeAdded};

        // when
        Integer[] actual = IntegerArrayUtils.add(intArray, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        // given
        Integer firstValueToBeAdded = 10;
        Integer secondValueToBeAdded = 17;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, firstValueToBeAdded, secondValueToBeAdded};

        // when
        Integer[] result = IntegerArrayUtils.add(intArray, firstValueToBeAdded);
        Integer[] actual = IntegerArrayUtils.add(result, secondValueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }
}