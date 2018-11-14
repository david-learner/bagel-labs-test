package example02;

import java.util.HashMap;

public class StringUtils {

    public static HashMap<Integer, Integer> convertToHashMap(String userInput) {
        Integer defaultValue = 1;
        Integer increaseCount = 1;

        HashMap<Integer, Integer> numberFrequencyChart = new HashMap<>();
        String[] numbers = userInput.split(", ");
        for (String num : numbers) {
            numberFrequencyChart.merge(Integer.parseInt(num), defaultValue, (existingValue, newValue) -> newValue = existingValue + increaseCount);
        }
        return numberFrequencyChart;
    }
}
