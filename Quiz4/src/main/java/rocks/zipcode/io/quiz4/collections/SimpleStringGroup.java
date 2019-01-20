package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    private List<String> group;

    public SimpleStringGroup() {
        group = new ArrayList<>();
    }

    public Integer count() {
        return group.size();
    }

    public void insert(String string) {
        group.add(string);
    }

    public Boolean has(String valueToInsert) {
        return group.contains(valueToInsert);
    }

    public String fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    public void delete(String valueToInsert) {
        group.remove(valueToInsert);
    }

    public void clear() {
        group.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return group.iterator();
    }
}
