package rocks.zipcode.quizweek7.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] addArray = Arrays.copyOf(integerArray, integerArray.length + 1);
        addArray[addArray.length - 1] = valueToBeAdded;
        return addArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number` indexToInsertAt`
     */
    public static Integer[] insert(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        try {
            return integerArray[indexToFetch];
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
            System.out.println("Integer at that index was not found.");
            outOfBoundsException.printStackTrace();

        }
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            if (checkEvenOdd(integerArray[i])) {
                integerArray[i] += 1;
            } else {
                integerArray[i] -= 1;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            if (checkEvenOdd(integerArray[i])) {
                integerArray[i] += 1;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            if (!checkEvenOdd(input[i])) {
                input[i] -= 1;
            }
        }
        return input;
    }

    private static Boolean checkEvenOdd(Integer i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

}
