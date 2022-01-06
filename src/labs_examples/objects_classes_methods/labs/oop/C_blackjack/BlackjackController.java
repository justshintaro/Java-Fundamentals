package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
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

        

        // give the user and computer both an initial sum of money
        System.out.println("what is your sum of money, "+ username + "?");
        int budgetUser = scanner.nextInt();
        Money moneyUser = new Money(budgetUser);
        moneyUser.toString();

        System.out.println("what is your sum of money, "+ computername + "?");
        int budgetPC = scanner.nextInt();
        Money moneyPC = new Money(budgetPC);
        moneyPC.toString();

        while(moneyUser.budget > 0 && moneyPC.budget > 0){

            // ask how much each player bets
            System.out.println("\n"+username + " , how much would you like to bet?");
            int betUser = scanner.nextInt();
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
                moneyUser.Betting(betUser, false);
                moneyUser.toString();
                moneyPC.Betting(betPC, false);
                moneyPC.toString();

            }else if(user.getHand().over21() && !computer.getHand().over21()){
                System.out.println(computername + " win");
                moneyUser.Betting(betUser, false);
                moneyUser.toString();
                moneyPC.Betting(betPC, true);
                moneyPC.toString();

            }else if(!user.getHand().over21() && computer.getHand().over21()){
                System.out.println(username + " win");
                moneyUser.Betting(betUser, true);
                moneyUser.toString();
                moneyPC.Betting(betPC, false);
                moneyPC.toString();

            }else{
                if(user.getHand().returnScore() < computer.getHand().returnScore()){
                    System.out.println(computername + " win");
                    moneyUser.Betting(betUser, false);
                    moneyUser.toString();
                    moneyPC.Betting(betPC, true);
                    moneyPC.toString();

                }else if(user.getHand().returnScore() > computer.getHand().returnScore()){
                    System.out.println(username + " win");
                    moneyUser.Betting(betUser, true);
                    moneyUser.toString();
                    moneyPC.Betting(betPC, false);
                    moneyPC.toString();

                }else{
                    System.out.println("No winner, and try again");
                    moneyUser.toString();
                    moneyPC.toString();

                }
            }

            user.getHand().setCards(new ArrayList<>());
            computer.getHand().setCards(new ArrayList<>());
        }


//        // create a deck
//        Deck deck = new Deck();
//
//        // deal user
//        deck.deal(user);
//        deck.deal(user);
//        System.out.println(username +"'s hand value is " + user.getHand().toString());
//        System.out.println("Hand value= "+ user.getHand().returnScore());
//        System.out.println("would you like another card? answer yes or no");
//        String anotherCard = scanner.nextLine();
//        while(anotherCard.compareToIgnoreCase("yes")==0){
//            deck.deal(user);
//            System.out.println(user.getHand().toString());
//            System.out.println("Hand value="+ user.getHand().returnScore());
//
//            if(user.getHand().over21()){
//                System.out.println(username + "'s hand value is over 21");
//                break;
//            }
//
//            System.out.println("would you like another card? answer yes or no");
//            anotherCard = scanner.nextLine();
//        }
//
//        // deal computer
//        System.out.println("\nNow " + computername + "'s turn");
//        deck.deal(computer);
//        deck.deal(computer);
//        System.out.println(computername + " will choose whether to take another card");
//        while(computer.computerAI()){
//            deck.deal(computer);
//            System.out.println(computername + " took one more");
//
//            if(computer.getHand().over21()){
//                System.out.println(computername + "'s hand value is over 21");
//                break;
//            }
//        }
//
//        // show the result
//        System.out.println("\n" + username + "'s hand and hand value are below:");
//        System.out.println(user.getHand().toString());
//        System.out.println("Hand value="+ user.getHand().returnScore());
//
//        System.out.println("\n" + computername + "'s hand and hand value are below:");
//        System.out.println(computer.getHand().toString());
//        System.out.println("Hand value="+ computer.getHand().returnScore());
//
//        System.out.println("\nTherefore...");
//
//        if(user.getHand().over21() && computer.getHand().over21()) {
//            System.out.println("Both you lost");
//        }else if(user.getHand().over21() && !computer.getHand().over21()){
//            System.out.println(computername + " win");
//        }else if(!user.getHand().over21() && computer.getHand().over21()){
//            System.out.println(username + " win");
//        }else{
//            if(user.getHand().returnScore() < computer.getHand().returnScore()){
//                System.out.println(computername + " win");
//            }else if(user.getHand().returnScore() > computer.getHand().returnScore()){
//                System.out.println(username + " win");
//            }else{
//                System.out.println("No winner, and try again");
//            }
//        }


    }
}
