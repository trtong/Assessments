package com.zipcodewilmington.assessment1.part3;

/**
 * Uncomment `src/test/java/com.zipcodewilmington.assessment1/part3/CoatTest`
 * Make sure all the test pass.
 *
 * A coat extends a Garment
 */
public class Coat extends Garment {

    /**
     * FIELDS
     *
     * A coat has three fields: price, size, and color.
     * Price and size are implemented in Garment so you
     * only need to add the color field.
     *
     * - create a field called "color" of type String
    */

    String color;

    /*
     * CONSTRUCTOR
     *
     * Create three constructors:
     * 1. an empty constructor which takes no params. Initialize
     *      price to 0 and size to "Universal", and color to "Black".
     *
     * 2. a constructor that takes a "price". Set the instance price field
     *      to the parameter field.
     *      Set the size to "Universal" and color to "Black".
     *
     * 3. a constructor that takes a price, size, and color.
     *     Set the params to the instance fields.
     *
     */

    public Coat() {
        this.price = 0;
        this.size = "Universal";
        this.color = "Black";
    }

    public Coat(double price) {
        this.price = price;
        this.size = "Universal";
        this.color = "Black";

    }

    public Coat(double price, String size, String color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    /*
     * METHODS
     *
     * Add a new method called "String getDescription()". It returns a String description of the object.
     * It should be formatted like this:
     *    "This is a [size] [color] coat. It costs $[price]."
     *    Example: "This is a Large Green coat. It costs $19.99."

     */

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return String.format("This is a " + this.size + " " + this.color + " coat. It costs $%.2f", this.price);
    }
}
