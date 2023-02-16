package apcs.penny;


import java.util.Scanner;

public class PennyRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int totalScore = 0;
        Square [][] board = new Square[5][5];
        //Initializing
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                if(i == 0 || i == 4 || j == 0 || j == 4){
                    board[i][j] = new Square(1);
                }else if(i == 1 || i == 3 || j == 1 || j == 3){
                    board[i][j] = new Square(2);
                }else{
                    board[i][j] = new Square(3);
                }
            }
        }
        //Printing
        PennyRunner.print(board);


        for(int i = 0; i < 5; i++){
            System.out.print("\nPress enter to pitch penny " + (i+1) + " ");
            String response = reader.nextLine();
            int randRow = (int)(Math.random() * 5);
            int randCol = (int)(Math.random() * 5);
            int scorenessly = board[randRow][randCol].getScore();

            if(!board[randRow][randCol].isOccupied()) {
                totalScore += scorenessly;
                board[randRow][randCol].setOccupied(true);
                System.out.println("\nYou hit row " + (randRow + 1) + " and column " + (randCol + 1));
                PennyRunner.print(board);
                System.out.println("You Scored: " + scorenessly + " point! Your total is: " + totalScore);
            }else{
                board[randRow][randCol].setOccupied(false);
                totalScore -= scorenessly;
                System.out.println("\nYou hit another penny and knocked it off the board! Your total is now: " + totalScore);
            }
        }
        if(totalScore < 10){
            System.out.println("\nGame over - you scored " + totalScore + " points!. You suck at this game. Imagine losing even with a random number generator doing all of the work. smh my head");
        }else{
            System.out.println("\nGame over - you scored " + totalScore + " points!. You actually won but you suck at this game. Imagine winning with a random number generator doing all of the work. smh my head");
        }
    }

    public static void print(Square[][] board){
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
