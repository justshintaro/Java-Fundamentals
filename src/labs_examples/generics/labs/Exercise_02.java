package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type
 *      and returns the sum of all Numbers in the ArrayList.
 *      Demonstrate how to call this method from the main() method.
 */
import java.awt.font.NumericShaper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Demo{

    public static <E extends Number> double printArray(ArrayList<E> arrayList){
        double sum = 0;

        for (int i = 0; i < arrayList.size(); i++){
            sum += arrayList.get(i).doubleValue();

            System.out.println(arrayList.get(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Number> al = new ArrayList<>();
        al.add(100);
        al.add(1.1111);
        al.add(2.9);
        System.out.println(printArray(al));

    }
}