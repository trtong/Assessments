package com.zipcodewilmington.assessment1.part3;

/**
 *
 *  Uncomment `src/test/java/com.zipcodewilmington.assessment1/part3/GarmentTest`
 *  and make sure all the test in the class pass.
 *
 *  Garment is an abstract class. It implements Product.
 */

public abstract class Garment implements Product {

    public double price;
    public String size;

    public Garment() {
        this.price = 0;
        this.size = "Universal";
    }

    public Garment(double price) {
        this.price = price;
        this.size = "Universal";
    }

    public Garment(double price, String size) {
        this.price = price;
        this.size = size;
    }


    public double getPrice(){
        return this.price;
    }

    public String getSize() {
        return this.size;
    }
}