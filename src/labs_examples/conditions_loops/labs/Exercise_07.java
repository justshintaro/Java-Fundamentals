package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();              //reads string



        String vowels = "aeiou";

        int i=0;

        while (i < str.length()){

//            System.out.println(vowels.indexOf(str.charAt(i)));

            if(vowels.indexOf(str.charAt(i)) >= 0){
                System.out.println(str.charAt(i));
                System.out.println(str);
                break;
            }
           i++;

            }
        }
    }
