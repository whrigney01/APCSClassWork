package apcs.minesweeper;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class mineRunner implements ActionListener {

    static Game game;
    static int size = 9;

    public static void main(String[] args) {
        Minesweeper board = new Minesweeper();
        game = new Game(size, size);
        game.makeBoard();


        for (int i = 0; i < Game.board.length; i++) {
            for (int j = 0; j < Game.board[i].length; j++) {
                Minesweeper.buttons[i][j].setText(Game.board[i][j].toString());
            }
        }

    }
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < Minesweeper.buttons.length; i++) {
            for (int j = 0; j < Minesweeper.buttons[i].length; j++) {
                if (e.getSource().equals(Minesweeper.buttons[i][j])) {
                    System.out.println("clicked");
                }
            }
        }
    }
}
