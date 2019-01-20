package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird {

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public int compareTo(Animal o) {
        return (o.getSpeed()) - this.getSpeed();
    }
}
