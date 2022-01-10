package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;  // Import the Scanner class

public class BlackjackController {

    static int numOfGames = 0;
    static int numOfWins = 0;
    static int numOfLoss = 0;

    public static void main(String[] args) {
        playBlackJack();
    }

    public static void playBlackJack(){

        // start a game
        Scanner scanner = new Scanner(System.in);

        // create two player objects
        System.out.println("what is your name: ");
        String username = scanner.nextLine();
        Player user = new Player(username);

        System.out.println("what is a computer name: ");
        String computername = scanner.nextLine();
        Player computer = new Player(computername);


        // give the user and computer both an initial sum of money
        System.out.println("what is your sum of money, "+ username + "?");
        int budgetUser = scanner.nextInt();
        user.setPotValue(budgetUser);

        System.out.println("what is your sum of money, "+ computername + "?");
        int budgetPC = scanner.nextInt();
        computer.setPotValue(budgetPC);

        while(user.getPotValue() > 0 && computer.getPotValue() > 0){

            // ask how much each player bets
            System.out.println();
            System.out.println("\n"+username + " , how much would you like to bet? Currently, you have "+ user.getPotValue());
            int betUser = scanner.nextInt();
            scanner.nextLine();
            System.out.println(computername + " will bet five dollars");
            int betPC = 5;

            // create a deck
            Deck deck = new Deck();

            // deal user
            deck.deal(user);
            deck.deal(user);
            System.out.println("\n"+username +"'s hand value is " + user.getHand().toString());
            System.out.println("Hand value= "+ user.getHand().returnScore());
            System.out.println("would you like another card? answer yes or no");
            String anotherCard = scanner.nextLine();
            while(anotherCard.compareToIgnoreCase("yes")==0){
                deck.deal(user);
                System.out.println(user.getHand().toString());
                System.out.println("Hand value="+ user.getHand().returnScore());

                if(user.getHand().over21()){
                    System.out.println(username + "'s hand value is over 21");
                    break;
                }

                System.out.println("would you like another card? answer yes or no");
                anotherCard = scanner.nextLine();
            }

            // deal computer
            System.out.println("\nNow " + computername + "'s turn");
            deck.deal(computer);
            deck.deal(computer);
            System.out.println(computername + " will choose whether to take another card");
            while(computer.computerAI()){
                deck.deal(computer);
                System.out.println(computername + " took one more");

                if(computer.getHand().over21()){
                    System.out.println(computername + "'s hand value is over 21");
                    break;
                }
            }

            // show the result & reflect budget
            System.out.println("\n" + username + "'s hand and hand value are below:");
            System.out.println(user.getHand().toString());
            System.out.println("Hand value="+ user.getHand().returnScore());

            System.out.println("\n" + computername + "'s hand and hand value are below:");
            System.out.println(computer.getHand().toString());
            System.out.println("Hand value="+ computer.getHand().returnScore());

            System.out.println("\nTherefore...");

            if(user.getHand().over21() && computer.getHand().over21()) {
                System.out.println("Both you lost");
                user.Betting(betUser, false);
                computer.Betting(betPC, false);

            }else if(user.getHand().over21() && !computer.getHand().over21()){
                System.out.println(computername + " win");
                user.Betting(betUser, false);
                computer.Betting(betPC, true);
                numOfLoss++;

            }else if(!user.getHand().over21() && computer.getHand().over21()){
                System.out.println(username + " win");
                user.Betting(betUser, true);
                computer.Betting(betPC, false);
                numOfWins++;

            }else{
                if(user.getHand().returnScore() < computer.getHand().returnScore()){
                    System.out.println(computername + " win");
                    user.Betting(betUser, false);
                    computer.Betting(betPC, true);
                    numOfLoss++;

                }else if(user.getHand().returnScore() > computer.getHand().returnScore()){
                    System.out.println(username + " win");
                    user.Betting(betUser, true);
                    computer.Betting(betPC, false);
                    numOfWins++;

                }else{
                    System.out.println("No winner, and try again");
                }
            }

            System.out.println();
            System.out.println(username+ " : " + user.toString());
            System.out.println(computername+ " : " + computer.toString());

            user.getHand().setCards(new ArrayList<>());
            computer.getHand().setCards(new ArrayList<>());

            numOfGames++;

        }

        System.out.println("# of Games = "+numOfGames);
        System.out.println("# of wins by "+ username + " = "+ numOfWins);
        System.out.println("# of wins by "+ computername + " = "+ numOfLoss);

    }
}
