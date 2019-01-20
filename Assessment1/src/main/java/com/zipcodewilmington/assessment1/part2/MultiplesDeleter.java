package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.IntegerUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {

        int counter = 0;
        int counterNew = 0;

        for (int i = 0; i < ints.length; i++) {
            if (!IntegerUtils.isEven(ints[i])) {
                counter++;
            }
        }

        Integer[] newArray = new Integer[ints.length - counter];

        for (Integer num: ints) {
            if (!IntegerUtils.isEven(num)) {
                newArray[counterNew++] = num;
            }
        }

        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {

        int counter = 0;
        int counterNew = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) {
                counter++;
            }
        }

        Integer[] newArray = new Integer[ints.length - counter];

        for (Integer num: ints) {
            if (IntegerUtils.isEven(num)) {
                newArray[counterNew++] = num;
            }
        }

        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {

        int counter = 0;
        int counterNew = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 1) {
                counter++;
            }
        }

        Integer[] newArray = new Integer[ints.length - counter];

        for (Integer num: ints) {
            if (num % 3 == 1) {
                newArray[counterNew++] = num;
            }
        }

        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int counter = 0;
        int counterNew = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                counter++;
            }
        }

        Integer[] newArray = new Integer[ints.length - counter];

        for (Integer num: ints) {
            if (num % multiple != 0) {
                newArray[counterNew++] = num;
            }
        }

        return newArray;
    }

}

