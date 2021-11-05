package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining{
    public static void main(String[] args) {

        //Demonstrate method overloading in this class
        double a = addition(12, 12,12);   // why is this choosing the middle method despite specifying double? And why printing double?
        System.out.println("overloading method: "+a);

        //Demonstrate the difference between "pass by value" and "pass by reference"
        int x = 1;
        int y = 2;
        System.out.println("before x "+ x);
        System.out.println("before y "+ y);
        someMethod(x, y);


    }
    // Demonstrate method overloading in this class
    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static double addition(double a, double b, double c){
        return ((int)(a+b+c));                   // why do we specify int here?
    }
    //Demonstrate the difference between "pass by value" and "pass by reference"
    public static void someMethod(int x, int y){
        x = x*5;
        System.out.println(x);
        y = y*5;
        System.out.println(y);
    }
//    public static void addMore(Exercise_01, num){
//
//    }
}
