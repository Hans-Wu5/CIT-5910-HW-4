import java.util.Arrays;

public class Deck {

///////////////////////////////////////// method for creating a deck of cards //////////////////////////////////////////

    public static String[] deck() {
        //setup deck array
        String[] deck = new String[52];
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int counter = 0;
        //nested for loops to merge suits with numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[counter] = suits[i] + ranks[j];
                counter++;
            }
        }
        return deck;
    }
}