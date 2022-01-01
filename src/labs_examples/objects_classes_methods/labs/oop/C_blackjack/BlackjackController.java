package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Locale;
import java.util.Scanner;  // Import the Scanner class

public class BlackjackController {

    public static void main(String[] args) {

//        System.out.println(player2.getHand().over21());

        playBlackJack();

    }

    public static void playBlackJack(){

        Scanner scanner = new Scanner(System.in);

        // create two player objects
        System.out.println("what is your name: ");
        String username = scanner.nextLine();
        Player user = new Player(username);

        System.out.println("what is a computer name: ");
        String computername = scanner.nextLine();
        Player computer = new Player(computername);

        // create a deck
        Deck deck = new Deck();

        // deal user
        deck.deal(user);
        deck.deal(user);
        System.out.println("Your current hand value is " + user.getHand().toString());
        System.out.println("Hand value= "+ user.getHand().returnScore());
        System.out.println("would you like another card? answer yes or no");
        String anotherCard = scanner.nextLine();
        while(anotherCard.compareToIgnoreCase("yes")==0){
            deck.deal(user);
            System.out.println(user.getHand().toString());
            System.out.println("Hand value="+ user.getHand().returnScore());

            if(user.getHand().over21()){
                System.out.println("Your hand value is over 21");
                break;
            }

            System.out.println("would you like another card? answer yes or no");
            anotherCard = scanner.nextLine();
        }


        // deal computer
        System.out.println("\nNow computer's turn");
        deck.deal(computer);
        deck.deal(computer);
        System.out.println("Computer chooses whether to take another card");
        while(computer.computerAI()){
            deck.deal(computer);
            System.out.println("computer took one more");

            if(computer.getHand().over21()){
                System.out.println("computer's hand value is over 21");
                break;
            }
        }

        // show the result
        System.out.println("\nUser's hand and hand value are below:");
        System.out.println(user.getHand().toString());
        System.out.println("Hand value="+ user.getHand().returnScore());

        System.out.println("\nComputer's hand and hand value are below:");
        System.out.println(computer.getHand().toString());
        System.out.println("Hand value="+ computer.getHand().returnScore());

        System.out.println("\nTherefore the winner is...");

        if(user.getHand().over21() && computer.getHand().over21()) {
            System.out.println("Both you lost");
        }else if(user.getHand().over21() && !computer.getHand().over21()){
            System.out.println("Computer win");
        }else if(!user.getHand().over21() && computer.getHand().over21()){
            System.out.println("You win");
        }else{
            if(user.getHand().returnScore() < computer.getHand().returnScore()){
                System.out.println("Computer win");
            }else if(user.getHand().returnScore() > computer.getHand().returnScore()){
                System.out.println("You win");
            }else{
                System.out.println("No winner");
            }
        }
    }
}
