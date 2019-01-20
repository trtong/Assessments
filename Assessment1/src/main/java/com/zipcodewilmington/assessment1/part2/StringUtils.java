package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] returnArray = sentence.split(" ");
        return returnArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        String[] sentenceArray = getWords(sentence);

        return sentenceArray[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        String reversedWord = BasicStringUtils.reverse(getFirstWord(sentence));

        String returnedString = reversedWord + sentence.substring(reversedWord.length());

        return returnedString;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        // Got the first word made it all lowercase
        String firstWordLower = getFirstWord(sentence).toLowerCase();

        // Camel Case all words in the string
        String allCamel = BasicStringUtils.camelCase(sentence);
        String withSpaces = reverseFirstWord(firstWordLower) + allCamel.substring(firstWordLower.length());

        String noUpper = withSpaces.replace(" ", "");

        return noUpper.substring(0, 1).toUpperCase() + noUpper.substring(1);
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {


        return str.substring(0, index) + str.substring(index + 1);
    }

}
