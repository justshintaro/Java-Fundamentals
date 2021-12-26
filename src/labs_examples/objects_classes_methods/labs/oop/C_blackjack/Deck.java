package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    protected Card[] cards;;
    protected ArrayList<Integer> usedCards;

    public void populate(){

        this.cards = new Card[52];

        String[] suits = {"spade", "heart", "diamond", "club"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
//                cards[??] = i +" " +j;
            }
        }
    }
}




