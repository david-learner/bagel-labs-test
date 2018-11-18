package example03;

import example03.StringUtils;
import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringUtilsTest {

    @Test
    public void convertToInteger() {
        int userInput = 9;
        int number = StringUtils.convertToInteger(userInput);
        assertThat(number, is(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_over_size_number() {
        int userInput = 101;
        StringUtils.convertToInteger(userInput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_under_size_number() {
        Integer userInput = -1;
        StringUtils.convertToInteger(userInput);
    }
}