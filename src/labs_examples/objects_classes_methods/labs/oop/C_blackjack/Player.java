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

    public boolean computerAI(){
        if (getHand().returnScore()<16){
            return true;
        }else{
            return false;
        }
    }
}
