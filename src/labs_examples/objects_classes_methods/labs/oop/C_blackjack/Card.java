package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    protected char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    protected int cardValue;
    protected int suit;

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
        return "Card{" +
                "cardValue=" + cardValue +
                ", suit=" + suit +
                '}';
    }
}
