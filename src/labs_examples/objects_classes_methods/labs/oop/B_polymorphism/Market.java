package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import sun.nio.cs.US_ASCII;

import java.util.ArrayList;

public class Market {

    public static void main(String[] args) {

        Tuna tuna_1 = new Tuna(13, "US");
//        tuna_1.edible();
        sub(tuna_1);
        tuna_1.swim(14);

        Salmon salmon_1 = new Salmon(10, "Russia");
//        salmon_1.edible();
        sub(salmon_1);
        salmon_1.swim(50);

        Goldfish goldfish_1 = new Goldfish(5, "Japan");
//        goldfish_1.edible();
        sub(goldfish_1);
        goldfish_1.swim(43);

    }

    public static void sub(Fish x) {
        x.edible();


    }


}
