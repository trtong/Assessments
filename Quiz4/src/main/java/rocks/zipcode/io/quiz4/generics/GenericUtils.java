package rocks.zipcode.io.quiz4.generics;

import rocks.zipcode.io.quiz4.collections.ComparableTreeSet;

import java.util.*;


/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {

        ArrayList<_> genericList = new ArrayList<>(originalSet);
        Group<Iterable<_>> treeSet = new Group<>();
        treeSet.insert(originalSet);

        for (int i = 0; i < originalSet.size(); i++) {
            for (int j = originalSet.size() -1; j >= 0  ; j--) {
                ArrayList<_> sortedGroup = new ArrayList<>();
                sortedGroup.add(genericList.get(i));

                if (!treeSet.has(sortedGroup)) {
                    treeSet.insert(sortedGroup);
                }
            }
        }
        treeSet.insert(new ComparableTreeSet<>());

        return treeSet;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

