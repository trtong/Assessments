package rocks.zipcode.quiz5.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] arr1 = Arrays.copyOfRange(values, 0, values.length/2);
        String[] arr2 = Arrays.copyOfRange(values, values.length/2 + 1, values.length);

        String[] allValues = new String[values.length - 1];
        System.arraycopy(arr1, 0, allValues, 0, arr1.length);
        System.arraycopy(arr2, 0,
                allValues,
                arr1.length,
                arr2.length);

        return allValues;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOfRange(values, 0, values.length-1);
    }
}