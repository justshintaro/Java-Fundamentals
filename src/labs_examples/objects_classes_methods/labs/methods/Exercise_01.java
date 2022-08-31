package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int m = multiply(10, 11);
        System.out.println(m);

        int d = divide(100,5);
        System.out.println(d);

        joke();

        int y = years(1);
        System.out.println(y);

        varargsM("121", "string", "what about this");

        System.out.println("all done");
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }
    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a/b;
    }
    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("this is a joke");;
    }
    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int years(int years){
        return years*365*24*60*60;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargsM(String... v){
        int size = v.length;
        return size;
    }
}
