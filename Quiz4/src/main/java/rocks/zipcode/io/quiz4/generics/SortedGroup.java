package rocks.zipcode.io.quiz4.generics;

import java.util.Comparator;


/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {

    public SortedGroup() {
        super();
    }

    @Override
    public void insert(_ value) {
        group.add(value);
        group.sort(Comparator.naturalOrder());
    }

    @Override
    public void delete(_ value) {
        group.remove(value);
    }

    public Integer indexOf(_ firstValue) {
        return group.indexOf(firstValue);
    }
}
