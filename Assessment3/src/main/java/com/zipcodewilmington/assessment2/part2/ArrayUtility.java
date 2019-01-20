package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] mergedArray = new Integer[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
            index++;
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[index++] = array2[i];
        }

        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, int i) {

        List<?> rotateMe = Arrays.asList(array);
        Collections.rotate(rotateMe, -i);
        return (Integer[]) rotateMe.toArray();
    }

    public Integer countOccurrance(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] mergedArray = merge(array1, array2);
        int counter = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (mergedArray[i] == valueToEvaluate) {
                counter++;
            }
        }
    return counter;
    }


    public static Integer mostCommon(Integer[] array) {

        HashMap<Integer, Integer> occurances = new HashMap<>();

        for (Integer i : array) {
            if (!occurances.containsKey(i)) {
                occurances.put(i, 1);
            } else {
                occurances.put(i, occurances.get(i) + 1);
            }
        }

        Integer tempValue = 0;
        Integer returnKey = 0;

        for (Integer key : occurances.keySet()) {
            if (occurances.get(key) > tempValue) {
                tempValue = occurances.get(key);
                returnKey = key;
            }
        }

        return returnKey;
    }
}
