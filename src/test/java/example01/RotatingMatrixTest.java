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

    @Test
    public void create() {
        RotatingMatrix matrix = new RotatingMatrix(new UserInput(numbers, rotatingCount));
    }

    @Test
    public void printResult() {
        String defaultResult = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16";
        RotatingMatrix matrix = new RotatingMatrix(new UserInput(numbers, rotatingCount));
        assertThat(matrix.printResult(), is(defaultResult));
    }

    @Test
    public void rotate() {

    }
}
