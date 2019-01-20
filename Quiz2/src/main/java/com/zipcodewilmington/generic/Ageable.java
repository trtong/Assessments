package com.zipcodewilmington.generic;

import java.util.Objects;

/**
 * DO NOT TOUCH THIS CLASS
 */
public abstract class Ageable {
    private int yearOfBirth;

    public Ageable(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ageable ageable = (Ageable) o;
        return yearOfBirth == ageable.yearOfBirth;
    }

    @Override
    public int hashCode() {

        return Objects.hash(yearOfBirth);
    }
}

