package rocks.zipcode.quizweek7.objectorientation.person;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 */
public class PersonEqualsTest {
    @Test
    public void checkDefaultPersonEquivalence() {
        // given
        Person person1 = new Person();
        Person person2 = new Person();

        // when
        Boolean outcome = person1.equals(person2);

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkDefaultPersonNonEquivalence() {
        // given
        Person person1 = new Person(null, "PersonName", null);
        Person person2 = new Person();

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void checkNonDefaultPersonEquivalence() {
        // given
        Person person1 = new Person(null, "PersonName", null);
        Person person2 = new Person(null, "PersonName", null);

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertTrue(outcome);
    }
}