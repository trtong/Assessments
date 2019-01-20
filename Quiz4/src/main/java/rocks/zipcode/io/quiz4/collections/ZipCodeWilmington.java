package rocks.zipcode.io.quiz4.collections;

import rocks.zipcode.io.quiz4.objectorientation.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> students;

    public ZipCodeWilmington() {
        students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s: students
             ) {
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for (Student s: students
             ) {
            studyMap.putIfAbsent(s, s.getTotalStudyTime());
        }
        return studyMap;
    }
}
