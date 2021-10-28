package labs_examples.arrays.labs;

import videos_source_code.arrays.ArrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        List<List> listOfMixedTypes = new ArrayList<>();

        ArrayList<String> listOfString = new ArrayList<String>();
        listOfString.add("abc");
        listOfString.add("def");
        listOfString.add("ghi");
        listOfString.add("jkl");
        listOfString.add("mno");
        listOfString.add("pqr");


        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
        listOfInteger.add(123);
        listOfInteger.add(456);
        listOfInteger.add(789);
        listOfInteger.add(10);


        listOfMixedTypes.add(listOfString);
        listOfMixedTypes.add(listOfInteger);
        System.out.println(listOfMixedTypes);
        System.out.println();

        for(int i = 0; i < listOfMixedTypes.size();i ++){
            System.out.println(listOfMixedTypes.get(i));
            for(int j = 0; j < listOfMixedTypes.get(i).size(); j++ ){
                System.out.println(listOfMixedTypes.get(i).get(j)+" ");
            }
        }

        System.out.println();


        System.out.println("We are removeing an element from the array list= "+listOfMixedTypes.remove(0));


//      Clear out the list
        listOfMixedTypes.clear();
        System.out.println("there is nothing to print out of the array list= "+listOfMixedTypes);


    }
}
