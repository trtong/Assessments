package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String content;
    public StringEvaluatorObject(String str) {
        content = str;
    }

    public String[] getAllPrefixes() {
        return StringEvaluator.getAllPrefixes(content);
    }

    public String[] getCommonPrefixes(String secondInput) {
        return StringEvaluator.getCommonPrefixes(content, secondInput);
    }

    public String getLargestCommonPrefix(String secondInput) {
        return StringEvaluator.getLargestCommonPrefix(content, secondInput);
    }
}
