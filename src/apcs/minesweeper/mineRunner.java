package apcs.minesweeper;

import apcs.pixLab.ImageGUI;

import javax.swing.*;
import java.awt.*;
public class mineRunner {
    public static void display (String title) {

        // duplicate pixel data to instance variable

        // create a JFrame to display the image in
        JFrame theGUI = new JFrame();

        int height = 500;
        int width = 500;

        theGUI.setTitle(title);
        theGUI.setSize(width, height);
        theGUI.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // create a custom ColorPanel to insert the image into a single-paned JFrame

        // view the JFrame
        theGUI.setVisible(true);
    }

    public static void main(String[] args) {
        Game game = new Game(9, 9);
        game.makeBoard();
        game.printBoard();
        game.click(0,0);

        game.printBoard();
        mineRunner.display("Minesweeper");

    }
}
