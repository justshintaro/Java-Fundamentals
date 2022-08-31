package labs_examples.exception_handling.labs;
import labs_examples.static_nonstatic.labs.Math;
/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise2{
    public static void main(String[] args) {
        int numer[] = {2, 4, 6, 8, 10};
        int demon[] = {2, 0, 4, 2, 10, 1};

        for(int i=0; i<demon.length; i++){

            try {
                System.out.println(numer[i]+" / "+
                        demon[i] + " is " +
                        numer[i] / demon[i]);
            }

            catch (ArithmeticException e1) {
                System.out.println("cannot be divided by 0");
            }

            catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Index out of bounds!");
            }

        }
    }
}

