package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object object: objectArray) {
            if (object.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int counter = 0;
        for (Object object: objectArray) {
            if (object.equals(objectToRemove)) {
                counter += 1;
            }
        }

        Object[] newArray = new Object[objectArray.length - counter];
        int index = 0;

        for (Object object: objectArray) {
            if (!object.equals(objectToRemove)) {
                newArray[index++] = object;
            }
        }

        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        // create hashmap with objects as key?
        // value is how many times they come up
        // return the key with highest value

        HashMap<Object, Integer> duplicateTracker = new HashMap<>();


        for (Object object: objectArray) {
            if (duplicateTracker.get(object) != null) {
                duplicateTracker.put(object, duplicateTracker.get(object) + 1);
            } else {
                duplicateTracker.put(object, 0);
            }
        }

        int largest = 0;
        Object largestObject = objectArray[0];

        for (Object key: duplicateTracker.keySet()) {
            if (duplicateTracker.get(key) > largest) {
                largestObject = key;
                largest = duplicateTracker.get(key);
            }
        }

        return largestObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {


        HashMap<Object, Integer> duplicateTracker = new HashMap<>();


        for (Object object: objectArray) {
            if (duplicateTracker.get(object) != null) {
                duplicateTracker.put(object, duplicateTracker.get(object) + 1);
            } else {
                duplicateTracker.put(object, 0);
            }
        }

        int smallest = 1;
        Object smallestObject = objectArray[0];

        for (Object key: duplicateTracker.keySet()) {
            if (duplicateTracker.get(key) <= smallest) {
                smallestObject = key;
                smallest = duplicateTracker.get(key);
            }
        }

        return smallestObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] mergedArray = new Object[objectArray.length + objectArrayToAdd.length];
        int counter = 0;

        for (int i = 0; i < objectArray.length; i++) {
            mergedArray[i] = objectArray[i];
            counter++;
        }

        for (Object object: objectArrayToAdd) {
            mergedArray[counter++] = object;
        }

        return mergedArray;
    }
}
