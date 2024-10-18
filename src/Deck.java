public class Deck {

    //method for creating a deck of cards
    public String[] deck() {
        //setup deck array
        String[] deck = new String[52];
        String[] suits = {"♣", "♦", "♥", "♠"};
        int counter = 0;

        //nested for loops to merge suits with numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                deck[counter] = suits[i] + (j);
                counter++;
            }
        }
        return deck;
    }
}