package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    String name;
    Hand hand;
    int potValue;


    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public boolean computerAI() {
        if (getHand().returnScore() < 16) {
            return true;
        } else {
            return false;
        }
    }

    public void Betting(int bet, boolean result) {
        if (result) {
            this.potValue += bet * 2;
            System.out.println("Return is " + bet * 2);
        } else {
            this.potValue -= bet;
            System.out.println("Loss is -" + bet);
        }
    }

    @Override
    public String toString() {
        return "current potValue=" + this.potValue;
    }
}

