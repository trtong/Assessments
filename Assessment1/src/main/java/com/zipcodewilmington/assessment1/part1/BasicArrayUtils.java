package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {

        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        if (stringArray[1] != null) {
            return stringArray[1];
        } else {
            return null;
        }

    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {

        String[] reversedString = new String[stringArray.length];

        for (int i = stringArray.length - 1, j = 0; i >= 0; i--, j++) {
            reversedString[j] = stringArray[i];
        }
        return reversedString;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {

        String upperAcro = "";

        for(int i = 0; i < stringArray.length; ++i) {
            upperAcro += Character.toString(stringArray[i].charAt(0));
        }

        return upperAcro;
    }
}
