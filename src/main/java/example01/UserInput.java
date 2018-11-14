package example01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UserInput {

    private int[][] numbers;
    private int rotatingCount;

    public UserInput(int[][] numbers, int rotatingCount) {
        this.numbers = numbers;
        this.rotatingCount = rotatingCount;
    }

    public int[][] getNumbers() {
        return numbers;
    }

    public int getRotatingCount() {
        return rotatingCount;
    }

    public String printNumbers() {
        return Arrays.stream(numbers).flatMapToInt(Arrays::stream).mapToObj(Integer::toString).collect(Collectors.joining(", "));
    }
}
