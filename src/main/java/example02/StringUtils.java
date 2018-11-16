package example02;

import java.util.HashMap;

public class StringUtils {

    public static HashMap<Integer, Integer> convertToHashMap(String userInput) {
        Integer defaultValue = 1;
        Integer increaseCount = 1;

        HashMap<Integer, Integer> numberFrequencyChart = new HashMap<>();
        String[] numbers = userInput.split(", ");
        if (numbers.length < 1 || numbers.length > 99) {
            throw new IllegalArgumentException("에러 : 1개이상 99개이하의 자연수를 입력해주세요");
        }
        for (String num : numbers) {
            Integer number = null;
            try {
                number = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("에러 : 숫자만 입력 가능합니다");
            }
            numberFrequencyChart.merge(number, defaultValue, (existingValue, newValue) -> newValue = existingValue + increaseCount);
        }
        return numberFrequencyChart;
    }
}
