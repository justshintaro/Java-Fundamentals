package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class NonIntResultException1 extends Exception {
    int n;
    int d;

    NonIntResultException1(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d +
                " is non-integer.";
    }
}

class CustomExceptDemo1 {
    public static void main(String args[]) {

        // Here, numer contains some odd values.
        int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        for(int i=0; i<numer.length; i++) {
            try {
                if((numer[i]%2) != 0)
                    throw new NonIntResultException1(numer[i], denom[i]);

                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("No matching element found.");
            }
            catch (NonIntResultException1 exc) {
                System.out.println(exc);
            }
        }
    }
}