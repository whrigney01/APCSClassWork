package apcs.minesweeper;

public class Game {
    private int rows;
    private int columns;
    private Square[][] board;

    public Game(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        board = new Square[this.rows][this.columns];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Square();
            }

        }
    }

    public void makeBoard(){
        for(int i = 0; i < 10; i++){
            int randRow = (int) (Math.random() * this.rows);
            int randCol = (int) (Math.random() * this.columns);

            if(board[randRow][randCol].isBomb()){
                i--;
            }else{
                board[randRow][randCol].setBomb(true);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int count = 0;

                for (int r1 = i - 1; r1 <= i + 1; r1++) {
                    for (int c1 = j - 1; c1 <= j + 1; c1++) {
                        if (!(r1 < 0 || r1 > rows - 1 || c1 < 0 || c1 > columns - 1)) {
                            if(board[r1][c1].isBomb()){
                                count++;
                            }
                        }
                    }
                }
                board[i][j].setNumOfBomb(count);
            }

        }


    }

    public void printBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j] + "  ");
                }else if (board[i][j] == null){
                    System.out.println("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void click(int row, int col){
        if(board[row][col].isBomb()){
            Game.lose();
        }else if(board[row][col].getNumOfBomb() == 0){
            for (int r1 = row - 1; r1 <= row + 1; r1++) {
                for (int c1 = col - 1; c1 <= col + 1; c1++) {
                    if (!(r1 < 0 || r1 > rows - 1 || c1 < 0 || c1 > columns - 1)) {
                        if(board[r1][c1].getNumOfBomb() == 0){
                            board[r1][c1] = null;
                        }else{
                            board[r1][c1].reveal();
                        }
                    }
                }
            }
        }
    }

    public static void lose(){
        System.out.println("You lost");
    }
}

