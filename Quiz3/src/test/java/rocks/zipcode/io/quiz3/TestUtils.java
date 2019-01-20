package rocks.zipcode.io.quiz3;

import org.junit.Assert;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TestUtils {
    public static <ObjectType> void assertArrayEquals(ObjectType[] array1, ObjectType[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        Assert.assertEquals(Arrays.toString(array1), Arrays.toString(array2));
    }
}
