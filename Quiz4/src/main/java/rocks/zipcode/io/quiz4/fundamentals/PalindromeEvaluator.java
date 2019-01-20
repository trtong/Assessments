package rocks.zipcode.io.quiz4.fundamentals;

import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> palindromes = new ArrayList<>();

        for (String s: StringEvaluator.getAllPrefixes(string)) {
            if (isPalindrome(s)) {
                palindromes.add(s);
            }
        }
        return StringEvaluator.toStringArray(palindromes);
    }

    public static Boolean isPalindrome(String string) {
        return new PalindromeObject(string).isPalindrome();
    }

    public static String reverseString(String string) {
        return new PalindromeObject(string).reverseString();
    }
}
