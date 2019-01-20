package rocks.zipcode.quizweek7.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Family;
import rocks.zipcode.quizweek7.objectorientation.Person;

/**
 * @author leon on 28/11/2018.
 */
public class GetTest {
    @Test
    public void test1() {
        // Given
        Family family = new Family();
        Person expected = new Person();
        family.add(expected);

        // when
        Person actual = family.get(0);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Family family = new Family();
        Person person = new Person();
        Person expected = new Person();
        family.add(person);
        family.add(expected);

        // when
        Person actual = family.get(1);

        // then
        Assert.assertEquals(expected, actual);
    }

}
