package TetrisPackage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by derek_000 on 1/15/2017.
 */
public class TetrisGUI {
    private JPanel panel1;

    public static void main(String[] args) {
        final JFrame frame = new JFrame("TetrisGUI");
        frame.setContentPane(new TetrisGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(22, 10));
        Board b = new Board();
        String[][] board = b.getBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].equals(".")) {
                    frame.add(new JLabel(new ImageIcon(TetrisGUI.class.getResource("emptyTetro.png"))));
                }
            }

        }
        frame.pack();
        frame.setVisible(true);
    }
}
