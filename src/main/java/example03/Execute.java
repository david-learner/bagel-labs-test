package example03;

import java.util.Scanner;

public class Execute {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(RomanNumeralsConverter.convert(userInput));
    }
}
