package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Food {

    protected String name;
    protected double price;
    protected double calories;
    protected boolean popular;


    public Food(String name, double price, double calories, boolean popular) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.popular = popular;
    }


    // methods for override
    public void organic(boolean natural){
        if(natural=true){
            System.out.println("It is organic!");
        }else{
            System.out.println("It is NOT organic");
        }
    }

    public void gift(boolean present){
        if(present=true){
            System.out.println("It is a gift !");
        }else {
            System.out.println("It is for yourself");
        }
    }

    public void discount(double deduction){
        System.out.println(deduction + " will be discounted from the price");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }
}
