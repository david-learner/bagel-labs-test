package example01;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringUtilsTest {

    @Test
    public void convertToIntArrays() {
        String inputNumbers = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2";
        UserInput input = StringUtils.convertToIntArrays(inputNumbers);

        String defaultResult = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16";
        String convertedNumbers = Arrays.stream(input.getNumbers())
                                    .flatMapToInt(Arrays::stream)
                                    .mapToObj(Integer::toString)
                                    .collect(Collectors.joining(", "));

        assertThat(defaultResult.equals(convertedNumbers),is(true));
        assertThat(input.getRotatingCount(),is(2));
    }
}
