import java.util.Scanner;

public class BlackjackSolitaire {

//////////////////////////////////////////////////////// fields ////////////////////////////////////////////////////////

    private static String[][] gameBoard = {{"[  ]", "[  ]", "[  ]", "[  ]", "[  ]"},
                                           {"[  ]", "[  ]", "[  ]", "[  ]", "[  ]"},
                                           {"    ", "[  ]", "[  ]", "[  ]", "    "},
                                           {"    ", "[  ]", "[  ]", "[  ]", "    "}};
    private static String[][] discards = {{"[  ]", "[  ]"}, {"[  ]", "[  ]"}}; //REMOVE STATIC
    private boolean isComplete = false;
    private Scanner userInput = new Scanner(System.in);

////////////////////////////////////////////////////// play method /////////////////////////////////////////////////////

    public void play(){
        //Instructions.welcomeMessage();

        //game loop
        while(!isComplete){
        System.out.println("Card: " + Card.card());
        gameBoard();
        System.out.println("Where would you like to place " + Card.card() + " ?");
        String input = userInput.nextLine();   //use "nextLine" so that incorrect inputs won't cause error and quit the program
        
        //use regex to clean input
        String cleanedInput = input.replaceAll("[^0-9]", "");

        //extract digits (-'0' converts charAt() to int)
        int row = cleanedInput.charAt(0) - '0' - 1;
        int col = cleanedInput.charAt(1) - '0' - 1;
        gameBoard[row][col] = "[" + Card.card() + "]";
        }
    }

/////////////////////////////////////////////////// gameBoard method ///////////////////////////////////////////////////

    public static void gameBoard() {
        //gameboard top 2 rows
        System.out.println("\t" + 1 + "\t" + " " +  2 + "\t" + " " + " " + 3 + "\t" + " " + " " + " " + 4 + "\t" + 5);
        for (int i = 0; i < 4; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
        //discard pile
        System.out.println();
        System.out.println("Discards");
        System.out.println("\t" + "\t" + " " + " " + " " + 1 + "\t" + 2);
        for (int i = 0; i < 2; i++) {
            System.out.print(" " + " " + " " + " " + " " + " " + " " + (i + 1) + " ");
            for (int j = 0; j < 2; j++) {
                System.out.print(discards[i][j] + " ");
            }
            System.out.println();
        }
    }

}
