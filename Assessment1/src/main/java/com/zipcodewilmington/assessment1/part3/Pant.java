package com.zipcodewilmington.assessment1.part3;

/**
 * Uncomment `src/test/java/com.zipcodewilmington.assessment1/part3/PantTest`
 * Make sure all the test pass.
 *
 * A pant extends a Garment
 */
public class Pant extends Garment {

    private int length;


    /**
     * FIELDS
     *
     * A pant has three fields: price, size, and length.
     * Price and size are implemented in Garment so you
     * only need to add the length field.
     *
     * - create a field called "length" of type int
     */

    /*
     * CONSTRUCTOR
     *
     * Create three constructors:
     * 1. an empty constructor which takes no params. Initialize
     *      Initialize price to 0 and size to "Universal", and length 32.
     *
     * 2. a constructor that takes a "price" and "size".
     *      Set the instance price and size field to the parameter field.
     *      Set the length to 32.
     *
     * 3. a constructor that takes a price, size, and length.
     *     Set the params to the instance fields.
     *
     */


    public Pant() {

        this.price = 0;
        this.size = "Universal";
        this.length = 32;
    }

    public Pant(double price, String size) {
        this.price = price;
        this.size = size;
        this.length = 32;
    }

    public Pant(double price, String size, int length) {
        this.price = price;
        this.size = size;
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public String getDescription() {
        return String.format("This is a pant. It is " + getSize() + ". It is " + this.length + "cm. It costs $%.2f", this.getPrice());
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }
    /*
     * METHODS
     *
     * Add a new method called "String getDescription()". It returns a String description of the object.
     * It should be formatted like this:
     *  "This is a pant. It is [size]. It is [length]cm. It costs $[price]."
     *  Example: "This is a pant. It is Large. It is 32cm. It costs $19.99."
     */

}
