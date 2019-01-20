package rocks.zipcode.io.quiz3.collections.student;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.collections.Lab;
import rocks.zipcode.io.quiz3.collections.Student;
import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class ToStringTest {
    @Test
    public void test1() {
        // given
        Lab duplicateDeleter = new Lab("duplicate deleter");
        Lab learnerLab = new Lab("learner lab");
        Student student = new Student();
        LabStatus completed = LabStatus.valueOf("COMPLETED");
        String expected = "duplicate deleter > COMPLETED\nlearner lab > PENDING";

        // when
        student.forkLab(learnerLab);
        student.forkLab(duplicateDeleter);
        student.setLabStatus(duplicateDeleter, completed);
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Lab casino = new Lab("casino");
        Lab learnerLab = new Lab("learner lab");
        Student student = new Student();
        LabStatus completed = LabStatus.valueOf("COMPLETED");
        LabStatus incomplete = LabStatus.valueOf("INCOMPLETE");
        String expected = "casino > COMPLETED\nlearner lab > INCOMPLETE";

        // when
        student.forkLab(learnerLab);
        student.forkLab(casino);
        student.setLabStatus(casino, completed);
        student.setLabStatus(learnerLab, incomplete);
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }
}
