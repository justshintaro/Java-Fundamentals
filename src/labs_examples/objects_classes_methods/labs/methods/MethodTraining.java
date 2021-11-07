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
        arrayHighLow(12.9, 23.0, 12.0, 1.1, 100.11);
        System.out.println();

        //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        myMethod(100, 3, 5);
        System.out.println(" ");

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        reverseArray(1,2,3,4,5,6,7,8,9,10, 11, 12, 13);


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
        List<Integer> largestNums = new ArrayList();
        for(int i=0; i<v.length; i++){
            largestNums.add(v[i]);
        }
        Collections.sort(largestNums, Collections.reverseOrder());
        System.out.println(largestNums.subList(0,4));
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
        boolean Prime = true;
        int i = 2;
        if(num < 2){
            Prime = false;
        }else if (num==2){
            Prime = true;
        }
        while(i <= num/2){
            if(num%i==0){
                Prime = false;
                break;
            }
            i++;
        }
        return Prime;
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array, which is passed in as an argument
    public static void arrayHighLow(Double... d){    //what is the difference between double and Double
        List<Double> returnArray = new ArrayList();  // Arraylist has a lot of methods to it which is useful. Then how can I make an array list without taking this step?
        for(int i=0; i<d.length; i++){
            returnArray.add(d[i]);
        }
        Collections.sort(returnArray);
        System.out.println("The lowest number = "+returnArray.get(0));
        System.out.println("The highest number = "+returnArray.get(returnArray.size()-1));

    }

    //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    public static void myMethod(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> arr = new ArrayList();
        for(int i=1; i<maxNum; i++){
            if(i%divisor1==0 && i%divisor2==0){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }

    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    public static void reverseArray(Integer... I){
        int temp;
        List<Integer> arr = new ArrayList();
        for(int i=0; i<I.length; i++){
            arr.add(I[i]);
        }

        for(int j=0; j<=arr.size()/2; j++){
            temp = arr.get(j);
            arr.set(j, arr.get(arr.size()-1-j));
            arr.set(arr.size()-1-j, temp);
        }
        System.out.println(arr);

    }


}