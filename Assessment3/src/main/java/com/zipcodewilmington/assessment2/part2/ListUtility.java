package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import org.h2.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtility {
    List<Integer> list;
    int addSize = 0;

    public ListUtility() {
        list = new ArrayList<>();
    }

    public boolean add(int i) {
        list.add(i);
        setAddSize();

        return (list.contains(i));
    }

    public void setAddSize() {
        this.addSize ++;
    }

    public int size() {
        return this.addSize;
    }

    public List<Integer> getUnique() {
        // use a stream?
        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());

        return unique;
    }


    public String join() {

        StringBuilder sb = new StringBuilder();
        if (this.addSize > 1) {
            for (Integer i : list) {
                sb.append(i + ", ");
            }
            return sb.toString().substring(0, sb.toString().length() - 2);
        }
        return list.get(0).toString();
    }

    public Integer mostCommon() {

        Integer[] commonArray = list.toArray(new Integer[list.size()]);

        return ArrayUtility.mostCommon(commonArray);
    }
}
