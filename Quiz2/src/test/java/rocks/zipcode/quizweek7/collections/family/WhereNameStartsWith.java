package rocks.zipcode.quizweek7.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Family;
import rocks.zipcode.quizweek7.objectorientation.Person;

import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class WhereNameStartsWith {
    @Test
    public void whereNameStartsWithB() {
        // : Given there is a family
        Family family = new Family();

        // : Given there is a person named Bandrew
        Person bandrew = new Person();
        bandrew.setName("Bandrew");

        // : Given there is a person named Bandrea
        Person bandrea = new Person();
        bandrea.setName("Bandrea");

        // : Given there is a person named greg
        Person greg = new Person();
        greg.setName("Greg");

        // : Given andrew, andrea, & greg are part of the same family
        family.add(bandrew);
        family.add(bandrea);
        family.add(greg);


        // : When I find people where name starts with B
        List<Person> personList = family.whereNameStartsWith("b");

        personList.stream().forEach(System.out::print);
        // : Then the results should contain bandrew & bandrea
        Assert.assertTrue(personList.contains(bandrew));
        Assert.assertTrue(personList.contains(bandrea));
    }

    @Test
    public void whereNameStartsWithC() {
        // : Given there is a family
        Family family = new Family();

        // : Given there is a person named Candrew
        Person candrew = new Person();
        candrew.setName("Candrew");

        // : Given there is a person named Candrea
        Person candrea = new Person();
        candrea.setName("Candrea");

        // : Given there is a person named greg
        Person greg = new Person();
        greg.setName("Greg");

        // : Given andrew, andrea, & greg are part of the same family
        family.add(candrew);
        family.add(candrea);
        family.add(greg);


        // : When I find people where name starts with C
        List<Person> personList = family.whereNameStartsWith("c");

        // : Then the results should contain candrew & candrea
        Assert.assertTrue(personList.contains(candrew));
        Assert.assertTrue(personList.contains(candrea));
    }
}