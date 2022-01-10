package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ThrowException {

    public static void genException() {
        int numer[] = {2, 4, 6, 8, 10};
        int demon[] = {2, 0, 4, 2, 10, 1};

        for (int i = 0; i < demon.length; i++) {

            try {
                System.out.println(numer[i] + " / " +
                        demon[i] + " is " +
                        numer[i] / demon[i]);
            } catch (ArithmeticException e1) {
                System.out.println("cannot be divided by 0");
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Index out of bounds!");
                throw e2;

            }
        }
    }
}
class Exercise6{
    public static void main(String[] args) {
        try {
            ThrowException.genException();
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("Fatal error --");
        }
    }
}

