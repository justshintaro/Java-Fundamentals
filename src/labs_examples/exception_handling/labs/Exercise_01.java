package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 *
 *
 */

class Exercise01 {
    public static void main(String[] args) {
        int num[] = new int[3];

        try {
            num[4] = 10;
            System.out.println("Done !");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds!");
        }
    }
}
