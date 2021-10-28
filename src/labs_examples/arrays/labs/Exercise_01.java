package labs_examples.arrays.labs;

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

        int[] vals = new int[10];
        for (int i=0; i < vals.length; i++){
            vals[i] = i;
        }

        for (int i : vals){
            System.out.println(i);
        }

        int sum = 0;
        for (int i=0; i < vals.length; i++){
            sum += vals[i];
        }
        System.out.println("sum is "+sum);

        float ave = sum/vals.length;
        System.out.println("average is "+ ave );

    }

}