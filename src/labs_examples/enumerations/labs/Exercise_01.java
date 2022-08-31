package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */
enum Month{
    January, February, March, April, May, June, July, August, September, October, November, December



}

class ShowEnum{
    public static void main(String[] args) {
        for(Month month :  Month.values())
            System.out.println(month + " has orginal values of "+
                    month.ordinal());
    }
}



