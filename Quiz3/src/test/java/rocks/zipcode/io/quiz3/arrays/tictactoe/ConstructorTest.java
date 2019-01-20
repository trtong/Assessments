package rocks.zipcode.io.quiz3.arrays.tictactoe;

import org.junit.Test;
import rocks.zipcode.io.quiz3.arrays.TicTacToe;

/**
 * @author leon on 10/12/2018.
 */
public class ConstructorTest {
    //    @Test
    public void nullaryConstructor() {
    }

    @Test
    public void parametrizedConstructor() {
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
    }
}
