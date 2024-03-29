package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
    int handValue;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public int returnScore(){
        int sum = 0;
        for (Card card: cards){
            if(card.cardValue < 11){
               sum += card.cardValue;
            }else{
                sum += 10;
            }
        }
        this.handValue = sum;
        return this.handValue;
    }

    public boolean over21(){
        if(returnScore() > 21){
            return true;
        }else {
            return false;
        }
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        String str = new String();
        for(Card card :cards){
            str += " "+card;
        }

        return str;
    }
}
