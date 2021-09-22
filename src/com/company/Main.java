package com.company;

public class Main {

    public static void main(String[] args) {
	    // Think Java - Exercise 7.3

        // Declarer an int array with six elements.
        int[] elements = {2, 7, 22, 4, 12, 41};

        // Invokes method indexOfMax.
        indexOfMax(elements);
    }

    public static void indexOfMax(int[] element) {

        // Using this variable in the "enhanced for loop" to find the element in the array with the largest value.
        int findTheLargestValue = 0;

        // Using an enhanced for loop (for each loop).
        for (int currentValue : element) {

            // For this "if" statement the value for "findTheLargestValue" will be incremented each time the condition for "if" is true,
            // which means that "findTheLargestValue" should find the element with the highest value.
            if (findTheLargestValue < currentValue){

                findTheLargestValue = currentValue;
            }
        }
        // This sout will be printed when the loop are terminated, and it will contain a String plus the element with the highest value.
        System.out.println("The largest element is: " + findTheLargestValue);
    }

    // It seems to be possible to use an "enhanced for loop" when searching for an element with the highest value in an array,
    // but it only worked with an "if" statement inside the loop.

}
