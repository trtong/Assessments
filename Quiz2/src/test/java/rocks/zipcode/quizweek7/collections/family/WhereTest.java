package rocks.zipcode.quizweek7.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Family;
import rocks.zipcode.quizweek7.objectorientation.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author leon on 28/11/2018.
 */
public class WhereTest {
    @Test
    public void whereNameStartsWithA() {
        // : Given there is a family
        Family family = new Family();

        // : Given there is a person named andrew
        Person andrew = new Person();
        andrew.setName("Andrew");

        // : Given there is a person named andrea
        Person andrea = new Person();
        andrea.setName("Andrea");

        // : Given there is a person named greg
        Person greg = new Person();
        greg.setName("Greg");

        // : Given andrew, andrea, & greg are part of the same family
        family.add(andrew);
        family.add(andrea);
        family.add(greg);


        // : When I find people where name starts with A
        Predicate<Person> nameStartsWithA = person -> person.getName().toLowerCase().startsWith("a");
        List<Person> personList = family.where(nameStartsWithA);

        // : Then the results should contain andrew & andrea
        Assert.assertTrue(personList.contains(andrew));
        Assert.assertTrue(personList.contains(andrea));
    }

    @Test
    public void whereIdIsGreaterThan5() {
        // : Given there is a family
        Family family = new Family();

        // : Given there is a person with ID of 10
        Person andrew = new Person();
        andrew.setId(10L);

        // : Given there is a person with ID of 15
        Person andrea = new Person();
        andrea.setId(15L);

        // : Given there is a person with ID of 1
        Person greg = new Person();
        greg.setId(1L);

        // : Given andrew, andrea, & greg are part of the same family
        family.add(andrew);
        family.add(andrea);
        family.add(greg);


        // : When I find people where name starts with A
        Predicate<Person> idIsGreaterThan5 = person -> person.getId() > 2;
        List<Person> personList = family.where(idIsGreaterThan5);

        // : Then the results should contain andrew & andrea
        Assert.assertTrue(personList.contains(andrew));
        Assert.assertTrue(personList.contains(andrea));
    }

}
