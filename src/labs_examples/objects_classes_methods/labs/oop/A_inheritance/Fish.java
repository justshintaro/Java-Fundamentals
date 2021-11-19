package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Fish extends Sushi{

    private int numOfSlices;
    private double omega3;


    public Fish(String name, double price, double calories, boolean popular, int expirationDate, String origin, int numOfSlices, double omega3) {
        super(name, price, calories, popular, expirationDate, origin);
        this.numOfSlices = numOfSlices;
        this.omega3 = omega3;
    }


    @Override
    public void organic(boolean natural){
        if(natural=true){
            System.out.println("It is not farmed!");
        }else{
            System.out.println("It is firmed");
        }
    }


    public int getNumOfSlices() {
        return numOfSlices;
    }

    public void setNumOfSlices(int numOfSlices) {
        this.numOfSlices = numOfSlices;
    }

    public double getOmega3() {
        return omega3;
    }

    public void setOmega3(double omega3) {
        this.omega3 = omega3;
    }
}
