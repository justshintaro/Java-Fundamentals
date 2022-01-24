package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */
class Exercise3{
    public static void main(String[] args) {

        System.out.println(printSum(1.123, 1.1));


        String[] stringArray = {"Volvo", "BMW", "Ford", "Mazda"};
        Integer[] intArray = {10, 20, 30, 40};
        swap(stringArray, 0, 3);
        System.out.println();
        swap(intArray, 0, 3);
        System.out.println();

        List<Integer> list = Arrays.asList(10, 100, 20, 110, 30, 120, 40, 1);
        System.out.println("maxim is " + maximalElement(list, 1, 6));
        System.out.println();

        ArrayList<String> collection = new ArrayList<>();
        collection.add("Mango");
        collection.add("My gym");
        collection.add("Apple");
        collection.add("Step on no Pets");
        collection.add("Banana");
        collection.add("never odd or even");
        countPalindromes(collection);

    }

//1)
    public static <E extends Number> double printSum(E a, E b){
        double sum = a.doubleValue() + b.doubleValue();
        return sum;
    }

//2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
    public static <E extends Collection<String>> void countPalindromes(E c){
        int count = 0;
        for (String elem : c){
            int length = 0;
            for(int i = 0; i<elem.length()/2; i++){
                if(elem.charAt(i) == elem.charAt(elem.length() - 1 - i)){
                    length++;
                }
            }
        }
    }

//    public boolean Palindrome(String str){
//        for(int i = 0; i<str.length()/2; i++){
//            if(str.charAt(i) == str.charAt(str.length() - 1 - i)){
//                length++;
//            }
//
//    }



// 3) Write a generic method to exchange the positions of two different elements in an array.
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        for (T elem: array){
            System.out.print(elem+" ");
        }
    }

// 4) Write a generic method to find the largest element within the range (begin, end) of a list.
    public static <T extends Comparable> T maximalElement (List<T> list, int begin, int end){
     T max = list.get(begin);
     for (int i = begin + 1;  i < end; i++) {
         T elem1 = list.get(i);
         if (elem1.compareTo(max) > 0){
             max = elem1;
         }
     }
     return max;
    }

}