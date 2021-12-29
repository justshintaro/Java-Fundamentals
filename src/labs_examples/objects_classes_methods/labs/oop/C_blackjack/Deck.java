package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    protected Card[] cards;
    protected ArrayList<Integer> usedCards;


    public void populate(){
        this.cards = new Card[52];
//        String[] suits = {"spade", "diamond", "heart", "club"};
//        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cards[k] = new Card(i, j);
                k++;
            }
        }
    }


    protected Player player;
    public void deal(){
        Random rand = new Random();
        int upperbound = 52;
        int int_random = rand.nextInt(upperbound);
        this.usedCards = new ArrayList();

        while(this.usedCards.contains(int_random)){
            int_random = rand.nextInt(upperbound);
            }

        this.usedCards.add(int_random);
        System.out.println(this.cards[int_random]);
        this.player = new Player(this.cards[int_random]);

    }
}

