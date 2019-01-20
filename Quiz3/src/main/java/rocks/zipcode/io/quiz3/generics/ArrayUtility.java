package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;
    private Map<SomeType, Integer> counts;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
        counts = new HashMap<>();
        populateMap();
    }

    private void populateMap() {
        for (SomeType t: array
             ) {
            if (counts.keySet().contains(t)) {
                counts.put(t, counts.get(t) + 1);
            } else {
                counts.put(t, 1);
            }
        }
    }


    public SomeType findOddOccurringValue() {
        for (SomeType t: counts.keySet()
             ) {
            if (counts.get(t) % 2 != 0)
                return t;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType t: counts.keySet()
        ) {
            if (counts.get(t) % 2 == 0)
                return t;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return counts.get(valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        ArrayList<SomeType> someTypes = new ArrayList<>();
        for (SomeType t: array) {
            if (predicate.apply(t)) {
                someTypes.add(t);
            }
        }
        SomeType[] arr2 = (SomeType[]) Array.newInstance(array.getClass().getComponentType(), someTypes.size());

        return someTypes.toArray(arr2);
    }

}
