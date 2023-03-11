package apcs.minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Minesweeper {
    static JFrame frame;
    static JPanel buttonPanel;
    public static JButton[][] buttons;
    static int size = 9;
    public static Square[][] board;
    private int numBomb;

    public Minesweeper(int size, int numBomb) {
        Minesweeper.size = size;
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        buttonPanel = new JPanel();
        buttonPanel.setVisible(true);
        buttonPanel.setLayout(new GridLayout(size, size));

        buttons = new JButton[size][size];
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFocusable(false);
                buttons[i][j].setFont(new Font("monospace", Font.BOLD, 24));
                buttons[i][j].addMouseListener(new CustomMouseListener());
                buttons[i][j].setText("");
                buttonPanel.add(buttons[i][j]);

            }
        }

        frame.add(buttonPanel);

        frame.setSize(570, 570);
        frame.revalidate();
        frame.setLocationRelativeTo(null);


        board = new Square[Minesweeper.size][Minesweeper.size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Square();
            }

        }
        this.numBomb = numBomb;

    }

    public void makeBoard() {
        for (int i = 0; i < numBomb; i++) {
            int randRow = (int) (Math.random() * this.size);
            int randCol = (int) (Math.random() * this.size);

            if (board[randRow][randCol].isBomb()) {
                i--;
            } else {
                board[randRow][randCol].setBomb(true);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int count = 0;

                for (int r1 = i - 1; r1 <= i + 1; r1++) {
                    for (int c1 = j - 1; c1 <= j + 1; c1++) {
                        if (!(r1 < 0 || r1 > size - 1 || c1 < 0 || c1 > size - 1)) {
                            if (board[r1][c1].isBomb()) {
                                count++;
                            }
                        }
                    }
                }
                board[i][j].setNumOfBomb(count);
            }

        }


    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j] + "  ");
                } else if (board[i][j] == null) {
                    System.out.println("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void leftClick(int row, int col) {
        if (board[row][col].isBomb()) {
            Minesweeper.lose();
        } else if (board[row][col].getNumOfBomb() == 0) {
            leftClickFunction(row,col);
        } else if(board[row][col].getNumOfBomb() != 0){
            board[row][col].reveal();
        }

        for (int i = 0; i < Minesweeper.board.length; i++) {
            for (int j = 0; j < Minesweeper.board[i].length; j++) {
                Minesweeper.buttons[i][j].setText("");
                if (board[i][j].isRevealed()) {
                    Minesweeper.buttons[i][j].setText(Minesweeper.board[i][j].toString());
                }
                if (board[i][j].isFlagged()) {
                    buttons[i][j].setText(Minesweeper.board[i][j].toString());
                }
            }
        }


    }

    public void leftClickFunction(int row, int col){
        for (int r1 = row - 1; r1 <= row + 1; r1++) {
            for (int c1 = col - 1; c1 <= col + 1; c1++) {
                if (!(r1 < 0 || r1 > size - 1 || c1 < 0 || c1 > size - 1)) {
                    if (board[r1][c1].getNumOfBomb() != 0) {
                        board[r1][c1].reveal();
                    } else if (board[r1][c1].getNumOfBomb() == 0) {
                        board[r1][c1].reveal();
                        leftClickFunction2(r1, c1, row, col);
                    }
                }
            }
        }
    }
    public void leftClickFunction2(int row, int col, int oldRow, int oldCol){
        for (int r1 = row - 1; r1 <= row + 1; r1++) {
            for (int c1 = col - 1; c1 <= col + 1; c1++) {
                if (!(r1 < 0 || r1 > size - 1 || c1 < 0 || c1 > size - 1)) {
                    if (board[r1][c1].getNumOfBomb() != 0) {
                        board[r1][c1].reveal();
                    } else if (board[r1][c1].getNumOfBomb() == 0 && oldRow != r1 && oldCol != c1) {
                        board[r1][c1].reveal();
                        leftClickFunction(r1, c1);
                    }
                }
            }
        }
    }
    public void rightClick(int row, int col) {
        if (!board[row][col].isFlagged()) {
            board[row][col].setFlagged(true);
        } else if (board[row][col].isFlagged()) {
            board[row][col].setFlagged(false);
        }

        for (int i = 0; i < Minesweeper.board.length; i++) {
            for (int j = 0; j < Minesweeper.board[i].length; j++) {
                Minesweeper.buttons[i][j].setText("");
                if (board[i][j].isRevealed()) {
                    Minesweeper.buttons[i][j].setText(Minesweeper.board[i][j].toString());
                }
                if (board[i][j].isFlagged()) {
                    buttons[i][j].setText(Minesweeper.board[i][j].toString());
                }
            }
        }
    }

    public static void lose() {
        System.out.println("You lost");
        System.exit(1);
    }

    public int getNumBomb() {
        return numBomb;
    }

}
