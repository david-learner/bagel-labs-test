package example01;

import java.util.Arrays;

public class StringUtils {
    public static UserInput convertToIntArrays(String inputNumbers) {
        String[] tokens = inputNumbers.split(", ");

        int[][] numbers = new int[4][4];
        int index = 0;

        for (int row = 0; row < 4; row++) {
            for(int column = 0; column < 4; column++) {
                int token = Integer.parseInt(tokens[index]);
                if (token < 1 || token > 99) {
                    throw new IllegalStateException("Error : Input only natural number");
                }
                numbers[row][column] = Integer.parseInt(tokens[index]);
                index++;
            }
        }

        return new UserInput(numbers, Integer.parseInt(tokens[16]));
    }
}
