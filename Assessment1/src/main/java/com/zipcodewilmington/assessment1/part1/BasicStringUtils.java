package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] capitalizedLetters = str.split(" ");
        String camelCaseString = "";

        for (int i = 0; i < capitalizedLetters.length; i++) {
            camelCaseString += capitalizedLetters[i].substring(0, 1).toUpperCase() + capitalizedLetters[i].substring(1);

            camelCaseString += " ";
        }

        return camelCaseString.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversedStr = "";

        for (int i = str.length() -1 ; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        // Same string contents, same order, but each word is reversed

        String[] strArray = str.split(" ");
        String reversedWord = "";

        for (String word: strArray) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedWord += " ";
        }

        return reversedWord.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        StringBuilder builder = new StringBuilder();

        for (char letter: str.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                letter = Character.toLowerCase(letter);
            } else if (Character.isLowerCase(letter)) {
                letter = Character.toUpperCase(letter);
            }
            builder.append(letter);
        }

        return builder.toString();
    }

}
