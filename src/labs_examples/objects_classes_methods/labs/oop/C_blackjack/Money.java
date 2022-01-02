package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Money {

    int budget;

    public Money(int budget) {
        this.budget = budget;
    }

    public void Betting(int bet, boolean result){
        if(result){
            this.budget += bet*2;
            System.out.println("Return is "+ bet*2);
        }else{
            this.budget -= bet;
            System.out.println("Loss is -"+ bet);
        }
    }

    @Override
    public String toString() {
        return "current budget= " + this.budget;

    }
}
