import java.util.Scanner;

public class Instructions {

////////////////////////////////////////////////////// play method /////////////////////////////////////////////////////

    public static void welcomeMessage() {
        System.out.println();
        System.out.println("Hey there! Welcome to Blackjack Solitaire.");
        System.out.println("Your goal is to place cards in a grid to create as many 21s as possible.");
        System.out.println("Each row and column is a hand, and you'll score based on how many blackjack hands you" +
                " make.");
        System.out.println("The grid looks like this: ");
        BlackjackSolitaire.gameBoard();
        System.out.println();
        System.out.println("In each round, you will be shown a random card from a deck, ");
        System.out.println("Type \"More\" to see detailed instructions or type \"Start\" to begin the game.");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        while(!input.equalsIgnoreCase("more") && !input.equalsIgnoreCase("start")) {
            System.out.println("😠Invalid input! Please try again.");
            System.out.println("Type \"More\" to see detailed instructions or type \"Start\" to begin the game.");
            input = userInput.nextLine();
        }
        if(input.equalsIgnoreCase("more")) {
            Instructions.detailedInstructions();
        } else if(input.equalsIgnoreCase("start")) {
            try {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.print("Shuffling cards ");
                Thread.sleep(600);  //0.5 seconds delay
                System.out.print("♠️");
                Thread.sleep(600);
                System.out.print("♥️");
                Thread.sleep(600);
                System.out.print("♣️️");
                Thread.sleep(600);
                System.out.print("♦️");
                Thread.sleep(1000);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

///////////////////////////////////////////// detailed instructions method /////////////////////////////////////////////

    public static void detailedInstructions(){
        System.out.println("More instructions");
    }

}
