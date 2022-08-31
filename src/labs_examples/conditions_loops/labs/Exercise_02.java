package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 * <p>
 * Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 * if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 * to accomplish this task.
 * <p>
 * Bonus Tricky Challenge: Use a "nested-if" statement.
 */

public class Exercise_02 {
    public static void main(String[] args) {
    
        // write completed here

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7: ");
        // assign input to variable as int
        int weekday = scanner.nextInt();

        if (weekday == 1) {
            System.out.println("Mon");
        } else if (weekday == 2) {
            System.out.println("Tue");
        } else if (weekday == 3) {
            System.out.println("Wed");
        } else if (weekday == 4) {
            System.out.println("Thu");
        } else if (weekday == 5) {
            System.out.println("Fri");
        } else if (weekday == 6) {
            System.out.println("Sat");
        } else if (weekday == 7) {
            System.out.println("Sun");
        } else {
            System.out.println("Other");
        }


    }
}
