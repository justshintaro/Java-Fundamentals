package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
        populate();
        this.usedCards = new ArrayList<>();
    }


    public void populate(){
        this.cards = new Card[52];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                this.cards[k] = new Card(j, i);
                k++;
            }
        }
    }

    public void deal(Player player){
        Random rand = new Random();
        int upperbound = 52;
        int int_random = rand.nextInt(upperbound);

        while(this.usedCards.contains(int_random)){
            int_random = rand.nextInt(upperbound);
            }

        player.getHand().addCard(cards[int_random]);
        this.usedCards.add(int_random);
    }
}

