package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        int radius = 10;
        int height = 5;
        float pi = 3.14f;

        double volume = (radius*radius) * pi * height;
        double area = 2*pi*(radius*radius) + 2*height*radius*pi;
        System.out.println("are = "+area);
        System.out.println("volume = "+volume);

    }
}