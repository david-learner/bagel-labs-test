package example02;

import org.junit.Test;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class StringUtilsTest {

    @Test
    public void convertToHashMap() {
        String userInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";
        HashMap<Integer, Integer> numberFrequencyChar = StringUtils.convertToHashMap(userInput);
        assertNotNull(numberFrequencyChar);
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
