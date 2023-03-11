package apcs.minesweeper;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < Minesweeper.buttons.length; i++) {
            for (int j = 0; j < Minesweeper.buttons[i].length; j++) {
                if (e.getButton() == MouseEvent.BUTTON1 && e.getSource().equals(Minesweeper.buttons[i][j])) {
                    mineRunner.game.leftClick(i,j);
                }else if (e.getButton() == MouseEvent.BUTTON3 && e.getSource().equals(Minesweeper.buttons[i][j])){
                    mineRunner.game.rightClick(i,j);
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
