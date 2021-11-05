package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining{
    public static void main(String[] args) {

        //Demonstrate method overloading in this class
        double a = addition(12, 12,12);   // why is this choosing the middle method despite specifying double? And why printing double?
        System.out.println("overloading method: "+a);
        System.out.println(addition(12, 12,12));

        //Demonstrate the difference between "pass by value" and "pass by reference"
        int x = 1;
        int y = 2;
        System.out.println("before x "+ x);
        System.out.println("before y "+ y);
        someMethod(x, y);

        Reference shin = new Reference();
        shin.person(50, 175, "Shin");

        Reference jon = new Reference(54, 183, "Jon");
        jon.person();

        System.out.println(shin.toString());
        addAge(shin);
        System.out.println(shin.toString());



    }
    // Demonstrate method overloading in this class
    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static double addition(double a, double b, double c){
        return a+b+c;
    }

    //Demonstrate the difference between "pass by value" and "pass by reference"
    public static void someMethod(int x, int y){
        x = x*5;
        System.out.println(x);
        y = y*5;
        System.out.println(y);
    }
    public static void addAge(Reference person){
        person.age = person.age + 100;
    }
}
