package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Stadium {

    public static void main(String[] args) {

        Soccer soccer1 = new Soccer(11, "Barcelona");
        soccer1.popular(false);
        soccer(soccer1);
        System.out.println(soccer1.getNumPlayers());  //why doesnt this return 11
        System.out.println("-----------------------");

        Americanfootball football1 = new Americanfootball(44, "New York Giants");
        football1.popular(true);
        football(football1);
        System.out.println(football1.getNumPlayers());

    }


    public static void soccer(Sport s) {
        s.country();
        s.sportPopulation(123456789l);

    }
    public static void football(Sport s) {
        s.country();
        s.sportPopulation(987654321l);

    }
}
