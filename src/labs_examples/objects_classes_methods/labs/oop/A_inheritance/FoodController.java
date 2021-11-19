package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class FoodController {

    public static void main(String[] args) {


        Tomato sweetTomato = new Tomato("Regular Burger", 8.5, 1300.13, true, "Beef", false, 3, 81.99);
        System.out.println("This tomato sweetness was "+ sweetTomato.getSweetness()+". Because of sweetness, it usually goes well with "+sweetTomato.getTypeOfMeat()+". " +
                " They are used for "+sweetTomato.getName()+". The price is "+ sweetTomato.getPrice());
        sweetTomato.organic(true);
        sweetTomato.discount(123);
        System.out.println();



        Cheese blueCheese = new Cheese("Double Cheese Burger", 12.3, 1500.7, true, "Chicken", true, 500);
        System.out.println("This bluecheese is used for "+ blueCheese.getName()+". It goes well with "+blueCheese.getTypeOfMeat()+". " +
                " They are used for "+blueCheese.getName()+". The price is "+ blueCheese.getPrice());
        System.out.println();



        Rice jasmineRice = new Rice("California Rolls", 15.4, 504.4, false, 1001, "China", 200.53, true);
        System.out.println("This jasmine Rice is used for "+ jasmineRice.getName()+", which is from "+jasmineRice.getOrigin()+". " +
                " The price is "+ jasmineRice.getPrice());
        jasmineRice.gift(true);
        System.out.println();


        Fish Tuna = new Fish("Tuna Rolls", 13.455, 432.12, true, 1230, "US", 6, 120);
        System.out.println("This Tuna is used for "+ Tuna.getName()+", which is from "+Tuna.getOrigin()+". " +
                " The price is "+ Tuna.getPrice());
        Tuna.organic(false);
        System.out.println();



    }
}
