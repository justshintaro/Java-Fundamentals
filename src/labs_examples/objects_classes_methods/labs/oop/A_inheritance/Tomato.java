package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Tomato extends Burger{

    private int numOfSlices;
    private double sweetness;


    public Tomato(String name, double price, double calories, boolean popular, String typeOfMeat, boolean vegan, int numOfSlices, double sweetness) {
        super(name, price, calories, popular, typeOfMeat, vegan);
        this.numOfSlices = numOfSlices;
        this.sweetness = sweetness;
    }

    @Override
    public void organic(boolean natural){
        if(natural=true){
            System.out.println("It is organic!");
        }else{
            System.out.println("It is NOT organic");
        }
    }



    public int getNumOfSlices() {
        return numOfSlices;
    }

    public void setNumOfSlices(int numOfSlices) {
        this.numOfSlices = numOfSlices;
    }

    public double getSweetness() {
        return sweetness;
    }

    public void setSweetness(double sweetness) {
        this.sweetness = sweetness;
    }
}


