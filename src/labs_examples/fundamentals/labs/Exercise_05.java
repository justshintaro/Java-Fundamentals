package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int intval = str.length();
        System.out.println(intval);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean test = str.equals(str2);
        System.out.println(test);

        // please concatenate str & str2 and set the result to a new String variable below
        String new_str = str + str2;
        System.out.println(new_str);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String str_upper = str.toUpperCase();
        System.out.println(str_upper);

        int search_1 = str2.indexOf("W");
        int search_2 = str2.indexOf("o");
        System.out.println(search_1 + search_2);

        String str_sub = str.substring(2);
        System.out.println(str_sub);

//        String str_con = str.contains("hello");
        System.out.println(str.contains("hello"));







    }


}