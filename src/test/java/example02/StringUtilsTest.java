package example02;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import static org.junit.Assert.assertNotNull;

public class StringUtilsTest {

    @Test
    public void convertToHashMap() {
        String userInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";
        HashMap<Integer, Integer> numberFrequencyChar = StringUtils.convertToHashMap(userInput);
        assertNotNull(numberFrequencyChar);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_over_numbers_size() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int index = 1; index <= 11; index++) {
            joiner.add("3, 8, 8, 3, 2, 8, 1, 2, 4, 56");
        }

        String overSizeUserInput = joiner.toString();
        StringUtils.convertToHashMap(overSizeUserInput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_under_numbers_size() {
        String underSizeUserInput = "";
        StringUtils.convertToHashMap(underSizeUserInput);
    }

    @Test(expected = NumberFormatException.class)
    public void exception_not_number_input() {
        String underSizeUserInput = "a, b, b, 1, 2, 3, 1, 2";
        StringUtils.convertToHashMap(underSizeUserInput);
    }

    @Test
    public void print() {
        String userInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";
        HashMap<Integer, Integer> numberFrequencyChar = StringUtils.convertToHashMap(userInput);
        for (Map.Entry<Integer, Integer> entry : numberFrequencyChar.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
