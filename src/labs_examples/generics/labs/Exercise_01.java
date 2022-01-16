package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */
class GenericEx1<T, V>{
    T val1;
    V val2;

    public GenericEx1(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    void showTypes(){
        System.out.println("Type of T is " + val1.getClass().getName());
        System.out.println("Type of V is " + val2.getClass().getName());
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public V getVal2() {
        return val2;
    }

    public void setVal2(V val2) {
        this.val2 = val2;
    }


}

class ControllerEx1{
    public static void main(String[] args) {
        GenericEx1<Integer, Double> ge1 = new GenericEx1<>(5, 12.123);
        GenericEx1<String, Float> ge2 = new GenericEx1<>("ABC", 12.123f);

        ge1.showTypes();
        System.out.println();
        ge2.showTypes();

    }
}
