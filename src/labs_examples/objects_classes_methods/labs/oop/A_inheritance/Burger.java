package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import org.omg.CORBA.WStringSeqHelper;

public class Burger extends Food{

    protected String typeOfMeat;
    protected boolean vegan;

    protected int expirationDate;
    protected String origin;


    public Burger(String name, double price, double calories, boolean popular, String typeOfMeat, boolean vegan){
        super(name, price, calories, popular);
        this.typeOfMeat = typeOfMeat;
        this.vegan = vegan;
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





    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
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
