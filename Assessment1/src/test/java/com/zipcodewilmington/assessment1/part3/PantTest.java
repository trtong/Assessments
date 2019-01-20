package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PantTest {
    private static final double DELTA = 0.01;
    private double price = 19.99;
    private String size = "Large";
    private int length = 32;

    private Pant pant;

    @Before
    public void setup() {
        pant = new Pant(price, size, length);
    }

    @Test
    public void testEmptyConstruction(){
        pant = new Pant();

        Assert.assertEquals("Universal", pant.getSize());
        Assert.assertEquals(0, pant.getPrice(), DELTA);
    }

    @Test
    public void testPriceSizeConstruction(){
        pant = new Pant(price, size);

        Assert.assertEquals(size, pant.getSize());
        Assert.assertEquals(price, pant.getPrice(), DELTA);
        Assert.assertEquals(32, pant.getLength());
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(price, pant.getPrice(), DELTA);
    }

    @Test
    public void testGetSize() {
        Assert.assertEquals(size, pant.getSize());
    }

    @Test
    public void testGetLength() {
        Assert.assertEquals(length, pant.getLength());
    }

    @Test
    public void testGetSetColor() {
        int newLength = 36;
        pant.setLength(newLength);

        Assert.assertEquals(newLength, pant.getLength());
    }

    @Test
    public void testIsProduct(){
        Assert.assertTrue(pant instanceof Product);
    }

    @Test
    public void testIsGarment(){
        Assert.assertTrue(pant instanceof Garment);
    }

    @Test
    public void testGetDescription() {
        String expected = "This is a pant. It is Large. It is 32cm. It costs $19.99";

        Assert.assertEquals(expected, pant.getDescription());
    }

    @Test
    public void testGetDescription_differentPrice() {
        pant = new Pant(39.01, "small", 40);
        String expected = "This is a pant. It is small. It is 40cm. It costs $39.01";

        Assert.assertEquals(expected, pant.getDescription());
    }
}
