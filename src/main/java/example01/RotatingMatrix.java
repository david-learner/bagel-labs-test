package example01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RotatingMatrix {

    private int[][] numbers;
    private int rotatingCount;

    public RotatingMatrix(UserInput input) {
        numbers = input.getNumbers();
        rotatingCount = input.getRotatingCount();
    }

    public String printResult() {
        return Arrays.stream(numbers).flatMapToInt(Arrays::stream).mapToObj(Integer::toString).collect(Collectors.joining(", "));
    }

    private void rotate() {
        int sideLength = numbers[0].length;
        int first = numbers[0][0];

        // left side
        for (int j = 0; j < sideLength - 1; j++) {
            numbers[j][0] = numbers[j + 1][0];
        }

        // lower side
        for (int j = 0; j < sideLength - 1; j++) {
            numbers[sideLength - 1][j] = numbers[sideLength - 1][j + 1];
        }

        // right side
        for (int i = sideLength - 1; i > 0; i--) {
            numbers[i][sideLength - 1] = numbers[i - 1][sideLength - 1];
        }

        // upper side
        for (int j = sideLength - 1; j > 0; j--) {
            if (j == 1) {
                numbers[0][j] = first;
            } else {
                numbers[0][j] = numbers[0][j - 1];
            }
        }
    }


    public void rotateNTimes() {
        for (int count = 0; count < rotatingCount; count++) {
            rotate();
        }
    }
}
