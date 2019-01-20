package com.zipcodewilmington.assessment2.part3;

public interface Animal extends Comparable<Animal> {
    String move();
    int getSpeed();
    String color();
}
