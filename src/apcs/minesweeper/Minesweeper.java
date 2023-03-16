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
            leftClickFunction(row, col);
        } else if (board[row][col].getNumOfBomb() != 0) {
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

    public void leftClickFunction(int row, int col) {
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

    public void leftClickFunction2(int row, int col, int oldRow, int oldCol) {
        for (int r1 = row - 1; r1 <= row + 1; r1++) {
            for (int c1 = col - 1; c1 <= col + 1; c1++) {
                if (!(r1 < 0 || r1 > size - 1 || c1 < 0 || c1 > size - 1)) {
                    if (board[r1][c1].getNumOfBomb() != 0) {
                        board[r1][c1].reveal();
                    } else if (board[r1][c1].getNumOfBomb() == 0 && oldRow != r1 && oldCol != c1  && !board[r1][c1].isBomb()) {
                        board[r1][c1].reveal();
                        for (int r2 = r1 - 1; r2 <= r1 + 1; r2++) {
                            for (int c2 = c1 - 1; c2 <= c1 + 1; c2++) {
                                if (!(r2 < 0 || r2 > size - 1 || c2 < 0 || c2 > size - 1)) {
                                    if (board[r2][c2].getNumOfBomb() != 0  && !board[r2][c2].isBomb()) {
                                        board[r2][c2].reveal();
                                    } else if (board[r2][c2].getNumOfBomb() == 0 && oldRow != r2 && oldCol != c2 && !board[r2][c2].isBomb()) {
                                        board[r2][c2].reveal();
                                        for (int r3 = r2 - 1; r3 <= r2 + 1; r3++) {
                                            for (int c3 = c2 - 1; c3 <= c2 + 1; c3++) {
                                                if (!(r3 < 0 || r3 > size - 1 || c3 < 0 || c3 > size - 1)) {
                                                    if (board[r3][c3].getNumOfBomb() != 0  && !board[r3][c3].isBomb()) {
                                                        board[r3][c3].reveal();
                                                    } else if (board[r3][c3].getNumOfBomb() == 0 && oldRow != r3 && oldCol != c3 && !board[r3][c3].isBomb()) {
                                                        board[r3][c3].reveal();
                                                        for (int r4 = r3 - 1; r4 <= r3 + 1; r4++) {
                                                            for (int c4 = c3 - 1; c4 <= c3 + 1; c4++) {
                                                                if (!(r4 < 0 || r4 > size - 1 || c4 < 0 || c4 > size - 1)) {
                                                                    if (board[r4][c4].getNumOfBomb() != 0  && !board[r4][c4].isBomb()) {
                                                                        board[r4][c4].reveal();
                                                                    } else if (board[r4][c4].getNumOfBomb() == 0 && oldRow != r4 && oldCol != c4 && !board[r4][c4].isBomb()) {
                                                                        board[r4][c4].reveal();
                                                                        for (int r5 = r4 - 1; r5 <= r4 + 1; r5++) {
                                                                            for (int c5 = c4 - 1; c5 <= c4 + 1; c5++) {
                                                                                if (!(r5 < 0 || r5 > size - 1 || c5 < 0 || c5 > size - 1)) {
                                                                                    if (board[r5][c5].getNumOfBomb() != 0  && !board[r5][c5].isBomb()) {
                                                                                        board[r5][c5].reveal();
                                                                                    } else if (board[r5][c5].getNumOfBomb() == 0 && oldRow != r5 && oldCol != c5 && !board[r5][c5].isBomb()) {
                                                                                        board[r5][c5].reveal();
                                                                                        for (int r6 = r5 - 1; r6 <= r5 + 1; r6++) {
                                                                                            for (int c6 = c5 - 1; c6 <= c5 + 1; c6++) {
                                                                                                if (!(r6 < 0 || r6 > size - 1 || c6 < 0 || c6 > size - 1)) {
                                                                                                    if (board[r6][c6].getNumOfBomb() != 0  && !board[r6][c6].isBomb()) {
                                                                                                        board[r6][c6].reveal();
                                                                                                    } else if (board[r6][c6].getNumOfBomb() == 0 && oldRow != r6 && oldCol != c6 && !board[r6][c6].isBomb()) {
                                                                                                        board[r6][c6].reveal();
                                                                                                        for (int r7 = r6 - 1; r7 <= r6 + 1; r7++) {
                                                                                                            for (int c7 = c6 - 1; c7 <= c6 + 1; c7++) {
                                                                                                                if (!(r7 < 0 || r7 > size - 1 || c7 < 0 || c7 > size - 1)) {
                                                                                                                    if (board[r7][c7].getNumOfBomb() != 0  && !board[r7][c7].isBomb()) {
                                                                                                                        board[r7][c7].reveal();
                                                                                                                    } else if (board[r7][c7].getNumOfBomb() == 0 && oldRow != r7 && oldCol != c7 && !board[r7][c7].isBomb()) {
                                                                                                                        board[r7][c7].reveal();
                                                                                                                    }

                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }

                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }

                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
            public void rightClick(int row, int col){
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

            public static void lose () {
                System.out.println("You lost");
                System.exit(1);
            }

            public int getNumBomb () {
                return numBomb;
            }

        }
