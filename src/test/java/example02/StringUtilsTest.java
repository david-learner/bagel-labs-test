package example02;

import org.junit.Test;

import java.util.HashMap;

public class StringUtilsTest {

    @Test
    public void convertToUserInput() {
        String userInput = "1, 1, 1, 2, 2, 3, 6, 6, 6, 6, 9, 9, 9";
        // 1 - 3
        // 2 - 2
        // 3 - 1
        // 6 - 4
        // 9 - 3

        HashMap<Integer, Integer> numberFrequencyChart = new HashMap<>();
        HashMap<Integer, Integer> nfc = new HashMap<>();
        String[] numbers = userInput.split(", ");
        for (String num : numbers) {
            Integer number = Integer.parseInt(num);
            numberFrequencyChart.merge(number, 1, (existingValue, newValue) -> newValue = existingValue + 1);
            nfc.put(number, nfc.containsKey(number) ? nfc.get(number) + 1 : 1);
        }
        System.out.println(nfc.toString());
        System.out.println(numberFrequencyChart.toString());
    }
}
