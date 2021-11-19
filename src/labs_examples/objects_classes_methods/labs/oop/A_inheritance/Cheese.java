package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Cheese extends Burger{

    private float grams;


    public Cheese(String name, double price, double calories, boolean popular, String typeOfMeat, boolean vegan, float grams) {
        super(name, price, calories, popular, typeOfMeat, vegan);
        this.grams = grams;
    }





    public float getGrams() {
        return grams;
    }

    public void setGrams(float grams) {
        this.grams = grams;
    }
}
