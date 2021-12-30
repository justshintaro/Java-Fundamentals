package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {

    public static void main(String[] args) {

        Deck deck = new Deck();

        Player player1 = new Player("Shintaro");
        deck.deal(player1);
        deck.deal(player1);
        deck.deal(player1);
        System.out.println(player1.getHand().toString());


        Player player2 = new Player("Marina");
        deck.deal(player2);
        deck.deal(player2);
        deck.deal(player2);
        System.out.println(player2.getHand().toString());
        System.out.println(player2.getHand().returnScore());
        System.out.println(player2.getHand().over21());

    }
}
