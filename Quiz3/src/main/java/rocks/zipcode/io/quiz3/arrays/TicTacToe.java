package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];

        for (int i = 0; i < 3; i++) {
            row[i] = board[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        Set<String> checker = new HashSet<>(Arrays.asList(getRow(rowIndex)));
        return !(checker.size() > 1);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        Set<String> checker = new HashSet<>(Arrays.asList(getColumn(columnIndex)));
        return !(checker.size() > 1);
    }

    public String getWinner() {
        String middle1 = getDiagonalWinner();
        if (middle1 != null) {return middle1;}

        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i) || isColumnHomogeneous(i)) {
                return board[i][i];
            }
        }

        return null;
    }

    private String getDiagonalWinner() {
        String middle = board[1][1];

        if ((middle.equalsIgnoreCase(board[0][0]) && middle.equalsIgnoreCase(board[2][2]))
                || middle.equalsIgnoreCase(board[0][2]) && middle.equalsIgnoreCase(board[2][0])) {
            return middle;
        }
        return null;
    }
}
