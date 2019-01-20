package com.zipcodewilmington.generic;

import org.junit.Assert;
import org.junit.Test;

public class ShelterTest {
    @Test
    public void testSize(){
        Shelter<Person> shelter = new Shelter<Person>();
        Assert.assertEquals(0, shelter.size());

        shelter.add(new Person(2015));
        Assert.assertEquals(1, shelter.size());

        shelter.add(new Person(2016));
        Assert.assertEquals(2, shelter.size());

        shelter.add(new Person(2011));

        Assert.assertEquals(3, shelter.size());


        // for bird
        Shelter<Bird> birdShelter = new Shelter<Bird>();
        Assert.assertEquals(0, birdShelter.size());

        for(int i = 0; i < 100; i++) {
            birdShelter.add(new Bird(i + 2000));
        }

        Assert.assertEquals(100, birdShelter.size());
    }

    @Test
    public void testGetYoungest(){
        Shelter<Person> shelter = new Shelter<Person>();
        Assert.assertEquals(0, shelter.size());

        Person youngest = new Person(2018);

        shelter.add(new Person(2015));
        shelter.add(new Person(2016));
        shelter.add(youngest);
        shelter.add(new Person(2011));

        Person actualPerson = shelter.getYoungest();
        Assert.assertEquals(youngest, actualPerson);

        //for bird
        Shelter<Bird> birdShelter = new Shelter<Bird>();

        Bird youngestBird = new Bird(1950);

        birdShelter.add(new Bird(1910));
        birdShelter.add(new Bird(1916));
        birdShelter.add(youngestBird);
        birdShelter.add(new Bird(1911));

        Bird actualBird = birdShelter.getYoungest();
        Assert.assertEquals(youngestBird, actualBird);

    }

    @Test
    public void testRemoveLast(){
        Shelter<Person> shelter = new Shelter<Person>();

        Person youngest = new Person(2018);

        shelter.add(new Person(2015));
        shelter.add(new Person(2016));
        shelter.add(new Person(2011));
        shelter.add(youngest);

        Person actualPerson = shelter.removeLast();
        Assert.assertEquals(youngest, actualPerson);

        //for bird
        Shelter<Bird> birdShelter = new Shelter<Bird>();

        Bird bird1 = new Bird(1950);
        Bird bird2 = new Bird(1951);

        birdShelter.add(new Bird(1910));
        birdShelter.add(new Bird(1916));
        birdShelter.add(bird1);
        birdShelter.add(bird2);

        Bird actualBird = birdShelter.removeLast();
        Assert.assertEquals(bird2, actualBird);

        Bird actualBird2 = birdShelter.removeLast();
        Assert.assertEquals(bird1, actualBird2);
    }

    public class Person extends Ageable {
        public Person(int yearOfBirth){
            super(yearOfBirth);
        }


    }

    public class Bird extends Ageable{
        public Bird(int yearOfBirth){
            super(yearOfBirth);
        }
    }

}
