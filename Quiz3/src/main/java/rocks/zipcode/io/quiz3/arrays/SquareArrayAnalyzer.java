package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        Boolean isSquared = true;

        if (input.length != squaredValues.length) {
            return false;
        }

        for (Integer nonSq: input
             ) {
            Stream<Integer> streamMe = Arrays.stream(squaredValues);
            Integer test = nonSq * nonSq;
            isSquared = streamMe.anyMatch(x -> x.equals(test));

            if (!isSquared) {
                break;
            }
        }
        return isSquared;
    }
}
