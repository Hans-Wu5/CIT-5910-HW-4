import java.util.Scanner;

public class BlackjackSolitaire {

//////////////////////////////////////////////////////// fields ////////////////////////////////////////////////////////

    private static String[][] gameBoard = {{"[  ]", "[  ]", "[  ]", "[  ]", "[  ]"},
                                           {"[  ]", "[  ]", "[  ]", "[  ]", "[  ]"},
                                           {"    ", "[  ]", "[  ]", "[  ]", "    "},
                                           {"    ", "[  ]", "[  ]", "[  ]", "    "}};
    private static int discard = 4;
    private static int row = 0;
    private static int col = 0;
    private static int filledCells = 0;
    private static Scanner userInput = new Scanner(System.in);

////////////////////////////////////////////////////// play method /////////////////////////////////////////////////////

    public void play(){
        //Instructions.welcomeMessage();

        //game loop
        while(filledCells < 16){
        System.out.println("Card: " + Card.card());
        showGameBoard(discard);
        System.out.println("Where would you like to place " + Card.card() + " ?");
        inputCheck();

        //fill valid cell
        gameBoard[row][col] = "[" + Card.card() + "]";

        //increment filledCells
        filledCells++;
        }
        showGameBoard(discard);
        System.out.println("Game over.");
    }

/////////////////////////////////////////////////// gameBoard method ///////////////////////////////////////////////////

    public static void showGameBoard(int discards) {
        //gameBoard
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
        System.out.println("Discards remaining: " + discards);
    }

/////////////////////////////////////////////////// inputCheck method //////////////////////////////////////////////////

    public static void inputCheck() {

        while(true) {
            //accept user input
            String input = userInput.nextLine();   //use "nextLine" so wrong inputs won't cause error and quit program
            String cleanedInput;

            //check if input contains "discard"
            if (input.equalsIgnoreCase("discard") && discard > 0) {
                discard--;
                //Card.remove();
                System.out.println("Card: " + Card.card());
                showGameBoard(discard);
                System.out.println("Where would you like to place " + Card.card() + " ?");
                continue;
            } else if (input.equalsIgnoreCase("discard") && discard == 0) {
                System.out.println("🤷‍♂️No more discards left! Where would you like to place " + Card.card() + " ?");
                continue;
            } else {
                //use regex to clean input
                cleanedInput = input.replaceAll("[^0-9]", "");
                //check if input contains exactly 2 digits
                if (cleanedInput.length() != 2) {
                    System.out.println("😠Invalid input! Please try again.");
                    continue;
                }

                //extract digits (-'0' converts charAt() to int)
                row = cleanedInput.charAt(0) - '0' - 1;
                col = cleanedInput.charAt(1) - '0' - 1;

                //check if input is acceptable for gameBoard
                if (row < 0 || col < 0 || row > 3 || col > 4 || (row == 2 && col == 0) || (row == 3 && col == 0) ||
                        (row == 2 && col == 4) || (row == 3 && col == 4)) {
                    System.out.println("😠Invalid cell! Please try again.");
                    continue;
                }

                //check if cell is already filled
                if (!gameBoard[row][col].equals("[  ]")) {
                    System.out.println("🫤This cell is already filled! Please try again.");
                    continue;
                }
            }
            break;
        }
        }

}
