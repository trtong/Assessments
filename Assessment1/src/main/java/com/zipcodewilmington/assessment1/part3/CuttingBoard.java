package com.zipcodewilmington.assessment1.part3;

/**
 * Uncomment `src/test/java/com.zipcodewilmington.assessment1/part3/CuttingBoardTest`
 * Make sure all the test pass.
 *
 * A CuttingBoard implements Product
 */
public class CuttingBoard implements Product{
    /**
     * FIELDS
     *
     * A cutting board has two instance fields:
     *  - price is a double
     *  - size is a String
     */

    private double price;
    private String size;

    public CuttingBoard(double price) {
        this.price = price;
    }


    /*
     * CONSTRUCTOR
     *
     * Create 1 constructor that takes a "price". Set the instance price field
     * to the parameter price.
     *
     */

    public double getPrice() {
        return this.price;
    }

    public String getSize() {
        return this.size;
    }

    public String getDescription() {
        return String.format("This cutting board costs $%.2f", this.price);
    }
    /*
     * METHODS
     *
     * 1. Create a getter method called "getPrice" to return the price.
     *    The return type is double.
     *
     * 2.Create a getter method called "getSize" which return the size.
     *    The return type is String.
     *
     * 2. Create a method called "getDescription()". It returns a
     *  String description of the object.
     *      It should be formatted like this:
     *      "This cutting board costs $[price]."
     *      Example: "This cutting board costs $19.99."
     */

}
