package labs_examples.static_nonstatic.labs;

import org.omg.CORBA.ObjectHelper;

import javax.print.attribute.standard.MediaSize;

public class Math {

    public static void main(String[] args) {

        // 1) A static method calling another static method in the same class
        System.out.println("implement 1)");
        additionTwo(1, 2);

        // 2) A static method calling a non-static method in the same class
        System.out.println("\nimplement 2)");
        Math objA = new Math();
        objA.additionThree(1, 2 , 3);

        // 3) A static method calling a static method in another class
        System.out.println("\nimplement 3)");
        OtherMath.Substraction(10, 2);

        // 4) A static method calling a non-static method in another class
        System.out.println("\nimplement 4)");
        OtherMath objB = new OtherMath();
        objB.Division(5, 2);

        // 5) A non-static method calling a non-static method in the same class
        System.out.println("\nimplement 5)");
        Math objC = new Math();
        objC.callAdditionThree();

        // 6) A non-static method calling a non-static method in another class
        System.out.println("\nimplement 6)");
        Math objE = new Math();
        objE.callDivision();


        // 7) A non-static method calling a static method in the same class
        System.out.println("\nimplement 7)");
        Math objF = new Math();
        objF.callAdditionTwo();


        // 8) A non-static method calling a static method in another class
        System.out.println("\nimplement 8)");
        Math objG = new Math();
        objG.callSubtraction();
    }

    public static void additionTwo(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public void additionThree(int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }

    public void callAdditionThree(){
        additionThree(2, 3, 4);

    }

    public void callDivision(){
        OtherMath objD = new OtherMath();
        objD.Division(20, 4);
    }

    public void callAdditionTwo(){
        additionTwo(100, 10);
    }

    public void callSubtraction(){
        OtherMath.Substraction(100, 1);
    }
    
}
