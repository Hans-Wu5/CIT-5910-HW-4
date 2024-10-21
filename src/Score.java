public class Score {

//////////////////////////////////////////////////////// fields ////////////////////////////////////////////////////////

    private int[][] points = new int[4][5];

///////////////////////////////////////////////////// score method /////////////////////////////////////////////////////

    public int Score(String[][] gameBoard){
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){
                //convert final gameboard to points
                if(gameBoard[i][j].contains("A")){
                    points[i][j] = 0;   //special case
                }
                if(gameBoard[i][j].contains("2")){
                    points[i][j] = 2;
                }
                if(gameBoard[i][j].contains("3")){
                    points[i][j] = 3;
                }
                if(gameBoard[i][j].contains("4")){
                    points[i][j] = 4;
                }
                if(gameBoard[i][j].contains("5")){
                    points[i][j] = 5;
                }
                if(gameBoard[i][j].contains("6")){
                    points[i][j] = 6;
                }
                if(gameBoard[i][j].contains("7")){
                    points[i][j] = 7;
                }
                if(gameBoard[i][j].contains("8")){
                    points[i][j] = 8;
                }
                if(gameBoard[i][j].contains("9")){
                    points[i][j] = 9;
                }
                if(gameBoard[i][j].contains("10")){
                    points[i][j] = 10;
                }
                if(gameBoard[i][j].contains("J")){
                    points[i][j] = 10;
                }
                if(gameBoard[i][j].contains("Q")){
                    points[i][j] = 10;
                }
                if(gameBoard[i][j].contains("K")){
                    points[i][j] = 10;
                }
            }
        }
        return 0;
    }
}
