package rocks.zipcode.io.quiz4.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet<_> implements Comparable<ComparableTreeSet<_>> {

    @SafeVarargs
    public ComparableTreeSet(_... arr) {
        super(Arrays.asList(arr));
    }

    public ComparableTreeSet() {
        super();
    }

    public ComparableTreeSet(Set<_> originalSet) {
        super(originalSet);
    }

    public ComparableTreeSet(List<_> subList) {
        super(subList);
    }

    @Override
    public int compareTo(ComparableTreeSet<_> o) {
        return this.toString().compareTo(o.toString());
    }

}
