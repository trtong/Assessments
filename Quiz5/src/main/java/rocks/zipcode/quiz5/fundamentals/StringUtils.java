package rocks.zipcode.quiz5.fundamentals;

import java.util.*;


/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + getMiddleCharacter(str).toString().toUpperCase() + str.substring(str.length()/2 + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + getMiddleCharacter(str).toString().toLowerCase() + str.substring(str.length()/2 + 1);
    }

    public static Boolean isIsogram(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c: arr
             ) {
            set.add(c);
        }
        return set.size() == arr.length;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        boolean isDupe = false;
        String[] arr = str.split("");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[ i + 1 ])) {
                isDupe = true;
                break;
            }
        }
        return isDupe;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (!([A[i] < 1) {
                if (A[i + 1] != (A[i] + 1)) {
                    return (A[i] + 1);
                }
            }
        }
        return 1;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        // if there are consecutive dupes, remove both
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i+1])) {
                i++;
            } else {
                sb.append(arr[i]);
            }

            if (i == arr.length - 2) {
                sb.append(arr[i +1]);
            }
        }
       return sb.toString();
    }

    public static String invertCasing(String str) {
        return org.apache.commons.lang3.StringUtils.swapCase(str);
    }
}