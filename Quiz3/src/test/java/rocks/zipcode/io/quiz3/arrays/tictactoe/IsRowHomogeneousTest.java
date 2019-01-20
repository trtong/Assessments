package rocks.zipcode.io.quiz3.arrays.tictactoe;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.arrays.TicTacToe;

/**
 * @author leon on 10/12/2018.
 */
public class IsRowHomogeneousTest {
    @Test
    public void test1() {
        // given
        String[] row1 = {"X", "X", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        Integer rowIndex = 0;

        Assert.assertTrue(ticTacToe.isRowHomogenous(rowIndex));
    }

    @Test
    public void test2() {
        // given
        String[] row1 = {"X", "X", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        Integer rowIndex = 1;

        Assert.assertTrue(ticTacToe.isRowHomogenous(rowIndex));
    }


    @Test
    public void test3() {
        // given
        String[] row1 = {"X", "X", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        Integer rowIndex = 2;

        Assert.assertFalse(ticTacToe.isRowHomogenous(rowIndex));
    }


    @Test
    public void test4() {
        // given
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "O", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        Integer rowIndex = 2;

        Assert.assertTrue(ticTacToe.isRowHomogenous(rowIndex));
    }
}
