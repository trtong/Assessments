package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int num: intArray) {
            sum += num;

        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;
        // mulitply all ints of array together, return product

        for (int i = 0; i < intArray.length - 1; i++) {
            product += product * intArray[i];
        }

        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        double sum = (double) getSum(intArray);
        double length = (double) intArray.length;

        return sum/length;
    }



    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {

        int largest = intArray[0];
        for (int i = 1; i < intArray.length; i++)
            if (intArray[i] > largest) {
                largest = intArray[i];
            }

        return largest;
    }
}
