package apcs.minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Minesweeper {
    static JFrame frame;
    static JPanel buttonPanel;
    public static JButton[][] buttons;
    static int size = 9;

    public Minesweeper() {
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
                buttons[i][j].setFont(new Font("monospace", Font.BOLD, 12));
                buttons[i][j].addActionListener((ActionListener) this);
                buttons[i][j].setText("");
                buttonPanel.add(buttons[i][j]);

            }
        }

        frame.add(buttonPanel);

        frame.setSize(570, 570);
        frame.revalidate();
        frame.setLocationRelativeTo(null);

    }
}
