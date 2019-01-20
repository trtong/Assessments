package rocks.zipcode.quizweek7.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Family;
import rocks.zipcode.quizweek7.objectorientation.Person;

/**
 * @author leon on 28/11/2018.
 */
public class AddTest {
    @Test
    public void test1() {
        // Given
        Family family = new Family();
        Person newFamilyMember = new Person();

        // when
        family.add(newFamilyMember);
        Boolean outcome = family.contains(newFamilyMember);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void test2() {
        // Given
        Family family = new Family();
        Person newFamilyMember = new Person();

        // when
        Boolean outcome = family.contains(newFamilyMember);

        // then
        Assert.assertFalse(outcome);
    }
}
