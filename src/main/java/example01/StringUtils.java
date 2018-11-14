package example01;

public class StringUtils {
    public static UserInput convertToIntArrays(String inputNumbers) {
        String[] tokens = inputNumbers.split(", ");
        if (tokens.length != 17) {
            throw new IllegalArgumentException("에러 : 행렬 회전 수를 포함하여 총 17개의 자연수를 입력해주세요");
        }

        int[][] numbers = new int[4][4];
        int index = 0;

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                int token = Integer.parseInt(tokens[index]);
                if (token < 1 || token > 99) {
                    throw new IllegalStateException("에러 : 1~99 자연수만 입력 가능합니다");
                }
                numbers[row][column] = Integer.parseInt(tokens[index]);
                index++;
            }
        }

        return new UserInput(numbers, Integer.parseInt(tokens[16]));
    }
}
