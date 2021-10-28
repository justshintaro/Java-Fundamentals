package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */
import javax.sound.midi.Soundbank;
import java.util.Scanner;  // Import the Scanner class

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number from 1-10");
        int index = myObj.nextInt();  // Read user input

        System.out.println(array[index]);


    }
}