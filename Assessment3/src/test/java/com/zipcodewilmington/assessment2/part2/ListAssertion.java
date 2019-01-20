package com.zipcodewilmington.assessment2.part2;

import org.junit.Assert;

import java.util.List;

public class ListAssertion {

    public static void assertEquals(List<Integer> expected, List<Integer> actual) {
        if (expected.size() != actual.size()) {
            Assert.fail();
        }

        for(int i = 0; i < expected.size(); i++) {
            Integer expectedI = expected.get(i);
            Integer actualI = actual.get(i);

            Assert.assertEquals(expectedI, actualI);
        }
    }
}
