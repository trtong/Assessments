package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoatTest {

    private static final double DELTA = 0.01;
    private double price = 19.99;
    private String color = "Green";
    private String size = "Large";

    private Coat coat;

    @Before
    public void setup(){
        coat = new Coat(price, size, color);
    }

    @Test
    public void testEmptyConstruction(){
        coat = new Coat();

        Assert.assertEquals("Universal", coat.getSize());
        Assert.assertEquals("Black", coat.getColor());
        Assert.assertEquals(0, coat.getPrice(), DELTA);
    }

    @Test
    public void testPriceConstruction(){
        double price = 19.88;
        coat = new Coat(price);

        Assert.assertEquals("Universal", coat.getSize());
        Assert.assertEquals("Black", coat.getColor());
        Assert.assertEquals(price, coat.getPrice(), DELTA);
    }

    @Test
    public void testGetPrice(){
        Assert.assertEquals(price, coat.getPrice(), DELTA);
    }

    @Test
    public void testGetSize(){
        Assert.assertEquals(size, coat.getSize());
    }

    @Test
    public void testGetColor(){
        Assert.assertEquals(color, coat.getColor());
    }

    @Test
    public void testGetSetColor(){
        String newColor = "Red";
        coat.setColor(newColor);

        Assert.assertEquals(newColor, coat.getColor());
    }

    @Test
    public void testGetDescription(){
        String expected = "This is a Large Green coat. It costs $19.99";

        Assert.assertEquals(expected, coat.getDescription());
    }

    @Test
    public void testGetDescription_differentDescription(){
        coat = new Coat(49.99, "medium", "black");
        String expected = "This is a medium black coat. It costs $49.99";

        Assert.assertEquals(expected, coat.getDescription());
    }
    @Test
    public void testIsProduct(){
        Assert.assertTrue(coat instanceof Product);
    }

    @Test
    public void testIsGarment(){
        Assert.assertTrue(coat instanceof Garment);
    }
}
