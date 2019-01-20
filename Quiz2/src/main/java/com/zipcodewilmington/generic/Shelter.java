package com.zipcodewilmington.generic;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 *
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 *
 */
public class Shelter<T extends Ageable> {
    private ArrayList<T> shelter = new ArrayList<>();
    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(T ager) {
        shelter.add(ager);
    }

    public T getYoungest() {
        return null;
    }

    public T removeLast() {
        if (size() > 0) {
            return shelter.get(size()-1);
        }
        return null;
    }
}