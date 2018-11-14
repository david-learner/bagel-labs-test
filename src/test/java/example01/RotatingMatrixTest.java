package example01;

import org.junit.Before;
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

    private String defaultResult = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16";

    private RotatingMatrix matrix;

    @Before
    public void setUp() {
        int defaultRotatingCount = 2;
        matrix = new RotatingMatrix(new UserInput(numbers, defaultRotatingCount));
    }

    @Test
    public void printResult() {
        assertThat(matrix.printResult(), is(defaultResult));
    }

    // comment for private method
//    @Test
//    public void rotate() {
//        String resultByRotate1Times = "5, 1, 2, 3, 9, 6, 7, 4, 13, 10, 11, 8, 14, 15, 16, 12";
//        matrix.rotate();
//        assertThat(matrix.printResult(), is(resultByRotate1Times));
//    }

    @Test
    public void rotateNTimes_not_lap() {
        String resultByRotate2Times = "9, 5, 1, 2, 13, 6, 7, 3, 14, 10, 11, 4, 15, 16, 12, 8";
        matrix.rotateNTimes();
        assertThat(matrix.printResult(), is(resultByRotate2Times));
    }

    @Test
    public void rotateNTimes_lap() {
        int oneLapRotatingCount = 12;
        matrix = new RotatingMatrix(new UserInput(numbers, oneLapRotatingCount));
        matrix.rotateNTimes();
        assertThat(matrix.printResult(), is(defaultResult));
    }
}
