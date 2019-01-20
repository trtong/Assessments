package rocks.zipcode.quizweek7.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Family;
import rocks.zipcode.quizweek7.objectorientation.Person;

/**
 * @author leon on 28/11/2018.
 */
public class RemoveTest {
    @Test
    public void test() {
        // Given
        Family family = new Family();
        Person newFamilyMember = new Person();
        family.add(newFamilyMember);

        // when
        family.remove(newFamilyMember);
        Boolean outcome = family.contains(newFamilyMember);

        // then
        Assert.assertFalse(outcome);
    }
}
