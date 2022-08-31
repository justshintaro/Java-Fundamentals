package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise4{
    public static void main(String[] args) {
        int numer[] = {2, 4, 6, 8, 10};
        int demon[] = {2, 0, 4, 2, 10, 1};

        try {
            for (int i = 0; i < demon.length; i++) {

                try {
                    System.out.println(numer[i] + " / " +
                            demon[i] + " is " +
                            numer[i] / demon[i]);
                } catch (ArithmeticException e1) {
                    System.out.println("cannot be divided by 0");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Index out of bounds!");
            System.out.println("Fatal error -- program terminated. ");
        }
    }
}
