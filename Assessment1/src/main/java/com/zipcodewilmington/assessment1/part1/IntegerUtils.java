package com.zipcodewilmington.assessment1.part1;

import com.sun.tools.corba.se.idl.InterfaceGen;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String reverseVal = Integer.toString(val);

        return Integer.parseInt(BasicStringUtils.reverse(reverseVal));
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        boolean isEven = false;

        if (val % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }
}

