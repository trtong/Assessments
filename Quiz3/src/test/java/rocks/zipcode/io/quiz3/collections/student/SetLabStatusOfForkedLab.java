package rocks.zipcode.io.quiz3.collections.student;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.collections.Lab;
import rocks.zipcode.io.quiz3.collections.Student;
import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class SetLabStatusOfForkedLab {
    @Test
    public void testCompleted() {
        // given
        Lab lab = new Lab("duplicate deleter");
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("COMPLETED");

        // when
        student.forkLab(lab);
        student.setLabStatus(lab, expected);
        LabStatus actual = student.getLabStatus(lab.getName());

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPending() {
        // given
        Lab lab = new Lab("duplicate deleter");
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("PENDING");

        // when
        student.forkLab(lab);
        student.setLabStatus(lab, expected);
        LabStatus actual = student.getLabStatus(lab.getName());

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncomplete() {
        // given
        Lab lab = new Lab("duplicate deleter");
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("INCOMPLETE");

        // when
        student.forkLab(lab);
        student.setLabStatus(lab, expected);
        LabStatus actual = student.getLabStatus(lab.getName());

        // then
        Assert.assertEquals(expected, actual);
    }
}
