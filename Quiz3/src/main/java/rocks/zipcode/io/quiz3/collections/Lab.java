package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Comparator;

import static java.lang.String.valueOf;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable {

    private String labName;
    private LabStatus labStatus;


    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getLabStatus() {
        return labStatus.getValue(labStatus);
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = LabStatus.valueOf(labStatus);
    }

    public String getName() {
        return this.labName;
    }

    @Override
    public int compareTo(Object o) {
        Lab o2 = (Lab) o;
        return this.getName().compareTo(o2.getName());
    }
}
