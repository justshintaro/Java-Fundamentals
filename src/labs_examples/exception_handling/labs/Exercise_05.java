package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new RuntimeException();
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
    }
}