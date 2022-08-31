package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Goldfish implements Fish {

    protected int price;
    protected String originCountry;

    public Goldfish() {
    }

    public Goldfish(int price) {
        this.price = price;
    }

    public Goldfish(String originCountry) {
        this.originCountry = originCountry;
    }

    public Goldfish(int price, String originCountry) {
        this.price = price;
        this.originCountry = originCountry;
    }

    @Override
    public boolean edible() {
        System.out.println("you cannot eat it!");
        return false;
    }

    @Override
    public void swim(int cps) {
        System.out.println("it can swim at "+cps);
    }

    @Override
    public void jump(int cm) {
        System.out.println("jumps "+ cm +" cm in the air");

    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
