package labs_examples.arrays.labs;

/**
 * 2D Array
 * <p>
 * Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] twoD = new int[5][5];
        int num = 3;
        int mul = 1;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {

                twoD[i][j] = num * mul;
                mul ++;
            }

        }
        for (int[] output : twoD) {
            for (int val : output) {
                System.out.print(val+" ");
            }
        System.out.println();
        }
    }
}
