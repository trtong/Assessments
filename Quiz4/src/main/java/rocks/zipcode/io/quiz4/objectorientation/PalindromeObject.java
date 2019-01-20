package rocks.zipcode.io.quiz4.objectorientation;

import com.sun.deploy.util.StringUtils;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;
    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        // check palindromic

        return input.equals(reverseString());
    }

    public String reverseString(){
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
