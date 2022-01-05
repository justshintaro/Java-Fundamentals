package labs_examples.static_nonstatic.labs;

import javax.print.attribute.standard.MediaSize;

public class Math {

    public static void main(String[] args) {

        // 1) A static method calling another static method in the same class
        additionTwo(1, 2);

        // 2) A static method calling a non-static method in the same class
        Math objA = new Math();
        objA.additionThree(1, 2 , 3);

        // 3) A static method calling a static method in another class
        OtherMath.Substraction(10, 2);

        // 4) A static method calling a non-static method in another class
        OtherMath objB = new OtherMath();
        objB.Division(5, 2);

    }

    public static void additionTwo(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public void additionThree(int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }

}
