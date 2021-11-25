package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Stadium {

    public static void main(String[] args) {

        Soccer soccer1 = new Soccer(11, "Barcelona");
        soccer1.popular(true);
        soccer(soccer1);

        Americanfootball football1 = new Americanfootball(11, "New York Giants");
        football1.sportPopulation(101219481212125l);
        football(football1);

    }


    public static void soccer(Sport s) {
        s.country("Spain");

    }
    public static void football(Sport s) {
        s.country("the US");

    }
}
