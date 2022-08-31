package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Rice extends Sushi{

    private double gram;
    private boolean vinegar;


    public Rice(String name, double price, double calories, boolean popular, int expirationDate, String origin, double gram, boolean vinegar) {
        super(name, price, calories, popular, expirationDate, origin);
        this.gram = gram;
        this.vinegar = vinegar;
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public boolean isVinegar() {
        return vinegar;
    }

    public void setVinegar(boolean vinegar) {
        this.vinegar = vinegar;
    }
}
