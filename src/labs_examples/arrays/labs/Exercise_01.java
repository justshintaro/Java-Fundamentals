package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        int[] vals = new int[10];
        for (int i=0; i < vals.length; i++){


            System.out.println("Enter a number from 1-10");
            int index = myObj.nextInt();  // Read user input

            vals[i] = index;
        }

        for (int i : vals){
            System.out.println(i);
        }

        float sum = 0;
        for (int i: vals){
            sum += i;
        }
        System.out.println("sum is "+sum);

        float ave = sum/vals.length;
        System.out.println("average is "+ ave );

    }

}