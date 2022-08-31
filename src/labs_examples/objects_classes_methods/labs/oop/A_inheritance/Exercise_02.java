package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * Initialized A object which only has data from class A. But because class B extends A, it can be initialized A=B.sla
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int j = 30;
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
        System.out.println(((B)a).j);

    }
}