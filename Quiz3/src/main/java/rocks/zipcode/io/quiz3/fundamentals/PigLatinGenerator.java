package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] strArr = str.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String s: strArr
             ) {
            if (VowelUtils.startsWithVowel(s)) {
                sb.append(s + "way ");
            } else if (!VowelUtils.hasVowels(s.toLowerCase())) {
                sb.append(s + "ay ");
            } else {
                int vowelIndex = VowelUtils.getIndexOfFirstVowel(s.toLowerCase());
                sb.append(s.substring(vowelIndex) + s.substring(0, vowelIndex) + "ay ");
            }
        }
        return sb.toString().trim();
    }
}
