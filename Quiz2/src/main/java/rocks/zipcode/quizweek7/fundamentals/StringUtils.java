package rocks.zipcode.quizweek7.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            sb.append(stringToBeRepeated);
        }
        return sb.toString();
    }

    /**
     * @param baseString - String to be evaluated
     * @param stringToRemove - String to be removed from `baseString`
     * @return `baseString` with the last occurrence of `stringToRemove` removed
     */
    public static String replaceLastSubString(String baseString, String stringToRemove) {
        int start = baseString.lastIndexOf(stringToRemove);
        StringBuilder sb = new StringBuilder();
        sb.append(baseString, 0, start);
        sb.append(baseString.substring(start + stringToRemove.length()));

        return sb.toString();
    }

    /**
     * @param baseString - String to be evaluated
     * @param stringToRemove - String to be removed from `baseString`
     * @return `baseString` with the nth occurrence of `stringToRemove` removed
     */
    public static String replaceNthSubstring(String baseString, String stringToRemove, int nthOccurrence) {
        StringBuilder sb = new StringBuilder();
        sb.append(baseString.substring(0,getIndexOfNthSubstring(baseString, stringToRemove, nthOccurrence)));
        sb.append(baseString.substring((getIndexOfNthSubstring(baseString,stringToRemove,nthOccurrence) + stringToRemove.length())));
        return sb.toString();
    }

    /**
     * @param baseString - String to be evaluated
     * @param subString - String to be identified in `baseString`
     * @param nthOccurrence - nth-occurrence of `subString` in `baseString`
     * @return the starting index of the nth-subString
     */
    public static Integer getIndexOfNthSubstring(String baseString, String subString, Integer nthOccurrence) {
        int index = baseString.indexOf(subString);

        while (--nthOccurrence > 0 && index != -1){
            index = baseString.indexOf(subString, index + 1);

        }

        return index;

    }

    /**
     * @param baseString - String to be evaluated
     * @param subString - String to be identified in `baseString`
     * @return number of occurrences of `subString` in `baseString`
     */
    public static Integer getNumberOfOccurrences(String baseString, String subString) {
        int count = 0;
        for (int i = baseString.indexOf(subString); i >= 0; i = baseString.indexOf(subString, i + 1)) {
            count++;
        }

        return count;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String pattern= "[a-zA-Z\\s]+";
        return string.matches(pattern);

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String pattern = "[0-9]+" ;
        return string.matches(pattern);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String pattern = "[^a-zA-Z0-9\\s]+";
        return string.matches(pattern);
    }
}
