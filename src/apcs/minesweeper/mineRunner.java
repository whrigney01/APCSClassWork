package apcs.minesweeper;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class mineRunner{

    static Minesweeper game;
    static int size = 9;

    public static void main(String[] args) {
        game = new Minesweeper(9, 10);
        game.makeBoard();
        game.printBoard();




    }

}
