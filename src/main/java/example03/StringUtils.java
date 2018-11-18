package example03;

public class StringUtils {
    public static int convertToInteger(int userInput) {
        if (userInput < 1 || userInput > 100) {
            throw new IllegalArgumentException("에러 : 1이상 100이하의 자연수만 입력해주세요");
        }
        return userInput;
    }
}
