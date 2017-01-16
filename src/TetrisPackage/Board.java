package TetrisPackage;

/**
 * Created by derek_000 on 1/15/2017.
 */
public class Board extends Thread {
    private String[][] board;

    public Board() {
        board = new String[22][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ".";
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
