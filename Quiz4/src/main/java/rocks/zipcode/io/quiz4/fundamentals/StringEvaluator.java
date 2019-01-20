package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllPrefixes(String string) {

        Set<String> prefixes = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                if (isAlpha(string.substring(i, j))) {
                    prefixes.add(string.substring(i, j));
                }
            }
        }
        return toStringArray(prefixes);
    }

    public static String[] getAllPrefixWithSpaces(String string) {

        Set<String> prefixes = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                prefixes.add(string.substring(i, j));
            }
        }
        return toStringArray(prefixes);
    }

    public static String[] getCommonPrefixes(String string1, String string2) {
        String[] prefixes1 = getAllPrefixWithSpaces(string1);
        List<String> prefixes2 = Arrays.asList(getAllPrefixWithSpaces(string2));
        Set<String> allPrefixes = new TreeSet<>();
        for (String s : prefixes1
             ) {
            if (prefixes2.contains(s)) {
                allPrefixes.add(s);
            }
        }
        return toStringArray(allPrefixes);
    }

    public static String getLargestCommonPrefix(String string1, String string2) {
        String[] commonPrefix = getCommonPrefixes(string1, string2);

        return Arrays.stream(commonPrefix).max(Comparator.comparing(String::length)).get();
    }

    public static boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static String[] toStringArray(Collection<String> c) {
        return c.toArray(new String[0]);
    }
}
