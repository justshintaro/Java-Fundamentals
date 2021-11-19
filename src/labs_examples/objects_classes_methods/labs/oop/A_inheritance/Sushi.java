package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Sushi extends Food{

    protected int expirationDate;
    protected String origin;

    public Sushi(String name, double price, double calories, boolean popular, int expirationDate, String origin) {
        super(name, price, calories, popular);
        this.expirationDate = expirationDate;
        this.origin = origin;
    }




    @Override
    public void gift(boolean present){
        if(present=true){
            System.out.println("It is a gift !");
        }else {
            System.out.println("It is for yourself");
        }
    }

    @Override
    public void discount(double deduction){
        System.out.println(deduction + " will be discounted from the price");
    }





    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
