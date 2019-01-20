package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Test;

public class GarmentTest {
    private static final double DELTA = 0.01;

    @Test
    public void testDefaultConstructor(){
        Garment garment = new Shirt();
        Assert.assertEquals("Universal", garment.getSize());
        Assert.assertEquals(0, garment.getPrice(), DELTA);
    }


    @Test
    public void testGetPriceConstructor(){
        double price = 9.99;
        Garment garment = new Shirt(price);

        Assert.assertEquals("Universal", garment.getSize());
        Assert.assertEquals(price, garment.getPrice(), DELTA);
    }

    @Test
    public void testGetPrice(){
        double price = 9.99;
        Garment garment = new Shirt(price, "M");

        Assert.assertEquals(price, garment.getPrice(), DELTA);
    }

    @Test
    public void testGetSize(){
        String size = "L";
        Garment garment = new Shirt(1.99, size);

        Assert.assertEquals(size, garment.getSize());
    }

    @Test
    public void testGetDescription(){
        Garment garment = new Shirt(1, "M");
        Assert.assertEquals("shirt", garment.getDescription());
    }

    protected static class Shirt extends Garment {

        protected Shirt(double price, String size) {
            super(price, size);
        }

        public Shirt() {
            super();
        }

        public Shirt(double price) {
            super(price);
        }

        @Override
        public String getDescription() {
            return "shirt";
        }
    }
}
