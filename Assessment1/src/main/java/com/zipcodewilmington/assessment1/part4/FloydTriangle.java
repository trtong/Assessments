package com.zipcodewilmington.assessment1.part4;

/**
 * Floyd's triangle is a right-angled triangular array of natural numbers.
 * It is defined by filling the rows of the triangle with consecutive numbers,
 * starting with a 1 in the top left corner:
 *
 * 1
 * 2 	3
 * 4 	5 	6
 * 7 	8 	9 	10
 *
 * https://en.wikipedia.org/wiki/Floyd%27s_triangle
 */
public class FloydTriangle {
    /**
     * @param numOfRows number of rows that should be returned by the generator
     * @return a floyd triangle completed up the numOfRows rows
     */
    public static String generateTriangle(Integer numOfRows) {

        StringBuilder builder = new StringBuilder();
        int num = 1;

        String floydTriangle = "";

        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                builder.append(String.format("%1d ",num));
                num++;
                if (j == i) {
                    floydTriangle += builder.toString().trim();
                    floydTriangle += "\n";
                    builder.setLength(0);
                }
            }
        }

        return floydTriangle.trim();
    }


    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) {

        double halfRow = (row * 0.5);
        double lastNumber = 0;
        // Find the last number
        // last number - row = first number
        // for loop to append and print out

        StringBuilder builder = new StringBuilder();

        if (row % 2 == 0) {
            lastNumber = (halfRow * row) + halfRow;
        } else if (row % 2 == 1) {
            lastNumber = (halfRow + 0.5) * row;
        }

        int firstNumber = (int) lastNumber - row + 1;


        for (int i = firstNumber; i <= lastNumber; i++) {
            builder.append(i + " ");
        }

        return builder.toString().trim();
    }
}
