package rocks.zipcode.io.quiz4.generics;


import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface<_> {
    List<_> group;
    public Group() {
        group = new ArrayList<>();
    }

    public Integer count() {
        return group.size();
    }

    public void insert(_ value) {
        group.add(value);
    }

    public Boolean has(_ value) {
        return group.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    public void delete(_ value) {
        group.remove(value);
    }

    public void clear() {
        group.clear();
    }
    public Iterator<_> iterator() {
        return group.iterator();
    }

    @Override
    public String toString() {
        return group.toString();
    }
}


