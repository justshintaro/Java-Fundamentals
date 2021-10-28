package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        Object[][] irregular = {
                { 1, 2, 3 },
                { 1, 2, 3, 4 },
                {102, 121, 12, 12 },
                {"test", "random"},
                {"String",12345.111111}
        };

        for (Object[] output : irregular){
            for (Object vals : output){
                System.out.print(vals+" ");

            }
        System.out.println();
        }

    }

}
