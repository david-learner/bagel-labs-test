package example01;

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = null;

        while(!(userInput = scanner.nextLine()).equals("end")) {
            RotatingMatrix matrix = new RotatingMatrix(StringUtils.convertToUserInput(userInput));
            matrix.rotateNTimes();
            System.out.println(matrix.printResult());
        }
    }
}
