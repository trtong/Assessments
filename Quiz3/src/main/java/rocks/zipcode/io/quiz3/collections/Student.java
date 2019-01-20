package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab, LabStatus> map;

    public Student() {
        this(new TreeMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = map;
    }

    public void setLabStatus(Lab lab, LabStatus labStatus) {
        if (map.get(lab) == null || (!map.get(lab).equals(LabStatus.PENDING))) {
            throw new UnsupportedOperationException();
        } else {
            map.put(lab, labStatus);
        }
    }

    public void forkLab(Lab lab) {
        map.put(lab, LabStatus.valueOf("PENDING"));
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab l: map.keySet()
             ) {
            if (l.getName().equalsIgnoreCase(labName)) {
                return map.get(l);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Lab> keys = new ArrayList<>(map.keySet());

        for (Lab key : keys) {
            sb.append(key.getName());
            sb.append(" > ");
            sb.append(map.get(key));
            sb.append("\n");
        }

        return sb.toString().trim();
    }
}
