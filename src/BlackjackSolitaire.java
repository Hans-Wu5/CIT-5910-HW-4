import java.util.Arrays;
import java.util.Scanner;

public class BlackjackSolitaire {

//////////////////////////////////////////////////////// fields ////////////////////////////////////////////////////////

    private static String[][] gameBoard = {{"[  ]", "[  ]", "[  ]", "[  ]", "[  ]"},
                                           {"[  ]", "[  ]", "[  ]", "[  ]", "[  ]"},
                                           {"[  ]", "[  ]", "[  ]"},
                                           {"[  ]", "[  ]", "[  ]"}};
    private static String[][] discards = {{"[  ]", "[  ]"}, {"[  ]", "[  ]"}}; //REMOVE STATIC
    private static int score = 0;

////////////////////////////////////////////////////// play method /////////////////////////////////////////////////////

    public void play(){
        //instructions
        System.out.println("Hey there! Welcome to Blackjack Solitaire.");
        System.out.println("Your goal is to place cards in a grid to create as many 21s as possible.");
        System.out.println("Each row and column is a hand, and you'll score based on how many blackjack hands you" +
                            " make.");
        System.out.println("Type \"More\" to see detailed instructions or type \"Start\" to begin the game.");
    }

    /////////////CHANGE TO METHOD////////////
    public static void main(String[] args) {
        //gameboard top 2 rows
        System.out.println("\t" + 1 + "\t" + " " +  2 + "\t" + " " + " " + 3 + "\t" + " " + " " + " " + 4 + "\t" + 5);
        for (int i = 0; i < 2; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
        //gameboard bottom 2 rows
        for (int i = 2; i < 4; i++) {
            System.out.print(i + 1 + "\t" + " " + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
        //discard pile
        System.out.println();
        System.out.println("Discards");
        System.out.println("\t" + "\t" + " " + " " + 1 + "\t" + " " + " " + 2);
        for (int i = 0; i < 2; i++) {
            System.out.print(" " + " " + " " + " " + " " + " " + (i + 1) + " ");
            for (int j = 0; j < 2; j++) {
                System.out.print(discards[i][j] + " ");
            }
            System.out.println();
        }
    }

////////////////////////////////////////////////////// score method ////////////////////////////////////////////////////
    private static int score(){
        //change card to points

        return score;
    }

}
