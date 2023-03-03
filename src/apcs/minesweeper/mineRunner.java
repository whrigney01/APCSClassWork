package apcs.minesweeper;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class mineRunner {
    static JFrame frame;
    static JPanel textPanel;
    static JPanel buttonPanel;
    static JButton[][] buttons;
    static JLabel textField;
    static int size;
    static Game game;

    public static void display(String title) {
        mineRunner.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        textPanel = new JPanel();
        textPanel.setVisible(true);
        textPanel.setBackground(Color.WHITE);

        buttonPanel = new JPanel();
        buttonPanel.setVisible(true);
        buttonPanel.setLayout(new GridLayout(size, size));

        textField = new JLabel();
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setFont(new Font("monospace", Font.BOLD, 34));
        textField.setForeground(Color.BLACK);
        textField.setText(mineRunner.game.getNumBomb() + " Bombs");

        buttons = new JButton[size][size];
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFocusable(false);
                buttons[i][j].setFont(new Font("monospace", Font.BOLD, 12));
                buttons[i][j].setText("");
                buttonPanel.add(buttons[i][j]);
            }
        }

        textPanel.add(textField);
        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        frame.setSize(570, 570);
        frame.revalidate();
        frame.setLocationRelativeTo(null);



    }

    public static void main(String[] args) {
        mineRunner.size = 9;
        game = new Game(size, size);

        mineRunner.display("Minesweeper");
        game.makeBoard();
        for (int i = 0; i < Game.board.length; i++) {
            for (int j = 0; j < Game.board[i].length; j++) {
                buttons[i][j].setText(Game.board[i][j].toString());
            }
        }
//        game.leftClick(0, 0);
//        game.rightClick(1, 1);
//        game.printBoard();

    }
}
