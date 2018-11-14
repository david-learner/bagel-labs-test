package example01;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotatingMatrixTest {

    private final int[][] numbers = {
            {1, 2, 3, 4}
            , {5, 6, 7, 8}
            , {9, 10, 11, 12}
            , {13, 14, 15, 16}
    };

    private final int rotatingCount = 2;

    private String defaultResult = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16";


    @Test
    public void create() {
        RotatingMatrix matrix = new RotatingMatrix(new UserInput(numbers, rotatingCount));
    }

    @Test
    public void printResult() {
        RotatingMatrix matrix = new RotatingMatrix(new UserInput(numbers, rotatingCount));
        assertThat(matrix.printResult(), is(defaultResult));
    }

    // TODO Ignore for private method
    @Test
    public void rotate() {
        String resultByRotate1Times = "5, 1, 2, 3, 9, 6, 7, 4, 13, 10, 11, 8, 14, 15, 16, 12";
        RotatingMatrix matrix = new RotatingMatrix(new UserInput(numbers, rotatingCount));
        matrix.rotate();
        assertThat(matrix.printResult(), is(resultByRotate1Times));
    }

    @Test
    public void rotateNTimes() {
        String resultByRotate2Times = "9, 5, 1, 2, 13, 6, 7, 3, 14, 10, 11, 4, 15, 16, 12, 8";
        RotatingMatrix matrix = new RotatingMatrix(new UserInput(numbers, rotatingCount));
        matrix.rotateNTimes();
        assertThat(matrix.printResult(), is(resultByRotate2Times));
    }
}
