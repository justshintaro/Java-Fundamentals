package labs_examples.objects_classes_methods.labs.methods;

import java.util.*;

public class MethodTraining{
    public static void main(String[] args) {

        // 1) Demonstrate method overloading in this class
        double a = addition(12, 12,12);   // why is this choosing the middle method despite specifying double? And why printing double?
        System.out.println("overloading method: "+a);
        System.out.println(addition(12, 12,12));
        System.out.println();

        // 2) Demonstrate the difference between "pass by value" and "pass by reference"
        int x = 1;
        int y = 2;
        System.out.println("before x "+ x);
        System.out.println("before y "+ y);
        someMethod(x, y);

        Reference shin = new Reference();
        shin.person(50, 175, "Shin");
        Reference jon = new Reference(54, 183, "Jon");
        jon.person();
        addAge(shin);
        shin.person();  //why is this still referring to shin 23
        System.out.println();

        // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        varargsMethod(112, 223, 311, 1, 3, 5, 10, 11, 12);
        System.out.println();

        // 4) Write a method to count all consonants (the opposite of vowels) in a String
        int count = countConsonants("AEIUEOUuauiowxa");
        System.out.println(count);
        System.out.println();

        // 5) Write a method that will determine whether a number is prime
        boolean answer = prime(2);
        System.out.println(answer);
        System.out.println();

        //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array, which is passed in as an argument
        int[] array = arrayHighLow(new int[]{1, 2, 4, 5, 6, 1, 2, 8, 5, 6});
        System.out.println(array[0]);
        System.out.println(array[1]);

        //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        System.out.println(myMethod(100, 3, 5));
        System.out.println(" ");

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        int[] ar = reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 100});
        System.out.println(ar);


    }

    // 1) Demonstrate method overloading in this class
    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static double addition(double a, double b, double c){
        return a+b+c;
    }

    // 2)Demonstrate the difference between "pass by value" and "pass by reference"
    public static void someMethod(int x, int y){
        x = x*5;
        System.out.println(x);
        y = y*5;
        System.out.println(y);
    }
    public static void addAge(Reference person){
        person.age = person.age + 100;
     }

    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static void varargsMethod(Integer... v){
        ArrayList<Integer> largestNums = new ArrayList();
        largestNums.addAll(Arrays.asList(v));  // have for loop within the method
//        for(int i=0; i<v.length; i++){
//            largestNums.add(v[i]);
//        }
        Collections.sort(largestNums, Collections.reverseOrder());
        System.out.println(largestNums.get(0));
    }

    // 4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String arg){
        String vowels = "aeiouAEIOU";
        int count = 0;
        int i = 0;
        while (i < arg.length()){
            if(vowels.indexOf(arg.charAt(i))>=0){
                count++;
            }
            i++;
        }
//        for(int index = 0; index<arg.length(); index++){
//            for(int val=0; val<vowels.length() ; val++){
//                if (arg.charAt(index) == vowels.charAt(val)) {
//                    count++;
//                }
//              }
//        }
        return arg.length()-count;

    }

    // 5) Write a method that will determine whether a number is prime
    public static boolean prime(int num){
        int i = 2;
        if(num < 2){
            return false;
        }else if (num==2){
            return true;
        }
        while(i <= num/2){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array, which is passed in as an argument
    public static int[] arrayHighLow(int[] array){
        int[] output = new int[2];
        output[0] = array[0];
        output[1] = array[0];
        for(int i=0; i < array.length; i++){
            if(array[i]>= output[0]){
                output[0] = array[i];
            }
            if(array[i]<=output[1]){
                output[1] = array[i];
            }
        }
        return output;
    }

    //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    public static ArrayList<Integer> myMethod(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> arr = new ArrayList();
        for(int i=1; i<maxNum; i++){
            if(i%divisor1==0 && i%divisor2==0){
                arr.add(i);
            }
        }
        return arr;
    }

    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    public static int[] reverseArray(int[] array){   //update
        int temp;
        for(int j=0; j<=array.length/2; j++){
//            temp = array.get(j);
//            array.set(j, array.get(array.size()-1-j));
//            array.set(array.size()-1-j, temp);
            temp = array[j];
            array[j] =  array[array.length-1-j];
            array[array.length-1-j] =  temp;
        }
        System.out.println(array);

        return array;
    }


}