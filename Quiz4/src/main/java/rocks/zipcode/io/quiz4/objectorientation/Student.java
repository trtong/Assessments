package rocks.zipcode.io.quiz4.objectorientation;

import java.util.Objects;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Integer id;
    private Double totalStudyTime = 0.0;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                getTotalStudyTime().equals(student.getTotalStudyTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotalStudyTime());
    }
}
