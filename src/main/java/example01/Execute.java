package example01;

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        RotatingMatrix matrix = new RotatingMatrix(StringUtils.convertToIntArrays(userInput));
        matrix.rotateNTimes();

        System.out.println(matrix.printResult());
    }
}
