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
}
