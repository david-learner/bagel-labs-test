package example01;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void convertToIntArrays() {
        String inputNumbers = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2";
        UserInput input = StringUtils.convertToIntArrays(inputNumbers);
    }
}
