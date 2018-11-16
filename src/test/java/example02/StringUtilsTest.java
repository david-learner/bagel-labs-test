package example02;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import static org.junit.Assert.assertNotNull;

public class StringUtilsTest {

    private String defaultUserInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";

    @Test
    public void convertToHashMap() {

        HashMap<Integer, Integer> numberFrequencyChar = StringUtils.convertToHashMap(defaultUserInput);
        assertNotNull(numberFrequencyChar);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_over_numbers_size() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int index = 1; index <= 11; index++) {
            joiner.add(defaultUserInput);
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

    @Ignore
    @Test
    public void print() {
        HashMap<Integer, Integer> numberFrequencyChart = StringUtils.convertToHashMap(defaultUserInput);
        for (Map.Entry<Integer, Integer> entry : numberFrequencyChart.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
