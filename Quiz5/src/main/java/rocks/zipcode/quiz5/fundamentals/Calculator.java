package rocks.zipcode.quiz5.fundamentals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static Double squareRoot(Double value) {
        return round(Math.sqrt(value), 2);
    }

    public static Double square(Double value) {
        return round(Math.pow(value, 2.0), 4);
    }

    public static Double[] squareRoots(Double... value) {
        for (int i = 0; i < value.length; i++) {
            value[i] = squareRoot(value[i]);
        }
        return value;
    }

    public static Double[] squares(Double... values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = square(values[i]);
        }
        return values;
    }

    public static Double add(Double value1, Double value2) {
        return round((value1 + value2), 2);
    }

    public static Double subtract(Double value1, Double value2) {
        return round((value1 - value2), 4);
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
