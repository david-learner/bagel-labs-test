package example01;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringUtilsTest {

    @Test
    public void convertToUserInput() {
        String inputNumbers = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2";
        UserInput input = StringUtils.convertToUserInput(inputNumbers);

        String defaultResult = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16";
        String convertedNumbers = Arrays.stream(input.getNumbers())
                                    .flatMapToInt(Arrays::stream)
                                    .mapToObj(Integer::toString)
                                    .collect(Collectors.joining(", "));

        assertThat(defaultResult.equals(convertedNumbers),is(true));
        assertThat(input.getRotatingCount(),is(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_over_numbers_size() {
        String abnormalUserInput = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 2";
        StringUtils.convertToUserInput(abnormalUserInput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_under_numbers_size() {
        String abnormalUserInput = "1, 2";
        StringUtils.convertToUserInput(abnormalUserInput);
    }

    @Test(expected = IllegalStateException.class)
    public void exception_over_numbers_range() {
        String abnormalUserInput = "100, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2";
        StringUtils.convertToUserInput(abnormalUserInput);
    }

    @Test(expected = IllegalStateException.class)
    public void exception_under_numbers_range() {
        String abnormalUserInput = "-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2";
        StringUtils.convertToUserInput(abnormalUserInput);
    }

    @Test(expected = NumberFormatException.class)
    public void exception_not_number_input() {
        String abnormalUserInput = "ㄱ, ㄴ, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2";
        StringUtils.convertToUserInput(abnormalUserInput);
    }
}
