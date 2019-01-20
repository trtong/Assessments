package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;
import com.zipcodewilmington.assessment1.part1.IntegerUtils;

/**
 * Jagged array is an array of array (aka 2D array).
 * The arrays may not be the same length, hence the name jagged.
 * You can read more about it here https://en.wikipedia.org/wiki/Jagged_array.
 */
public class JaggedArrayUtils {

    /**
     * @param jaggedIntArray jagged array
     * @return the sum of all integers in all arrays in the input
     */
    public static Integer sum(Integer[][] jaggedIntArray) {

        int sum = 0;

        for (int i = 0; i < jaggedIntArray.length; i++) {
            for (int j = 0; j < jaggedIntArray[i].length; j++) {
                sum += jaggedIntArray[i][j];
            }
        }
        return sum;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return an array with the sums of each array in the input ordered in the same
     * order as the original i.e. the first array should have its sum in the first
     * slot of the outputted array
     */
    public static Integer[] rowsSum(Integer[][] jaggedIntArray) {

        int sumLength = jaggedIntArray.length;

        Integer[] arraySums = new Integer[sumLength];
        int sum = 0;

        for (int i = 0; i < jaggedIntArray.length; i++) {
            sum = 0;
            for (int j = 0; j < jaggedIntArray[i].length; j++) {
                sum += jaggedIntArray[i][j];
            }
            arraySums[i] = sum;
        }


        return arraySums;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the sum of the last item in each array in the input
     */
    public static Integer sumOfLastItems(Integer[][] jaggedIntArray) {
        int sum = 0;

        for (int i = 0; i < jaggedIntArray.length; i++) {
                sum += jaggedIntArray[i][jaggedIntArray[i].length-1];
        }
        return sum;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the average of all integers in the input
     */
    public static Integer average(Integer[][] jaggedIntArray) {

        return sum(jaggedIntArray)/getTotalCells(jaggedIntArray);
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the maximum sum among the sums of each array in the input
     * e.g. {{1, 2, 3}, {1, 2}} would have sums 6 and 3. 6 would be the return
     */
    public static Integer getMaxSum(Integer[][] jaggedIntArray) {

        Integer[] sums = rowsSum(jaggedIntArray);

        return IntegerArrayUtils.getLargest(sums);
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the number of integers in the input
     */
    public static Integer getTotalCells(Integer[][] jaggedIntArray) {
        int totalNums = 0;
        for (int i = 0; i < jaggedIntArray.length; i++) {

            for (int j = 0; j < jaggedIntArray[i].length; j++) {
                totalNums++;
            }

        }
        return totalNums;
    }
}


