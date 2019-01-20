package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import static java.lang.Character.isLetter;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        int arraySize = getArraySize(str);

        String[] wavez = new String[arraySize];

        int wordIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isLetter(str.charAt(i)))
            wavez[wordIndex++] = StringUtils.capitalizeNthCharacter(str.toLowerCase(), i);
        }

        return wavez;
    }

    private static int getArraySize(String str) {
        int arraySize = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isLetter(str.charAt(i))) {
                arraySize++;
            }
        }
        return arraySize;
    }
}
