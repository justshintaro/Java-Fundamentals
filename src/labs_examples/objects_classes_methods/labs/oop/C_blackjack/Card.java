package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    String[] cardValues = new String[]{"one", "two",  "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;
    int suit;


    public Card() {
    }

    public Card(int cardValue, int suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "cardValue=" + cardValues[cardValue-1] +
                "/suit=" + suits[suit];
    }
}
