package example03;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsConverterTest {
    @Test
    public void create() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
    }

    @Test
    public void convert() {
        int[] zeroToTen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String romanNumeral = RomanNumeralsConverter.convert(zeroToTen[0]);
        assertThat(romanNumeral, is(""));

        romanNumeral = RomanNumeralsConverter.convert(zeroToTen[1]);
        assertThat(romanNumeral, is("I"));
    }
}
