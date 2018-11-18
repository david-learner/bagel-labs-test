package example03;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class RomanNumeralsConverterTest {
    @Test
    public void create() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        assertNotNull(converter);
    }

    @Test
    public void convert() {
        String romanNumber = RomanNumeralsConverter.convert("11");
        assertThat(romanNumber, is("XI"));
        romanNumber = RomanNumeralsConverter.convert("22");
        assertThat(romanNumber, is("XXII"));
        romanNumber = RomanNumeralsConverter.convert("33");
        assertThat(romanNumber, is("XXXIII"));
        romanNumber = RomanNumeralsConverter.convert("44");
        assertThat(romanNumber, is("XLIV"));
        romanNumber = RomanNumeralsConverter.convert("55");
        assertThat(romanNumber, is("LV"));
        romanNumber = RomanNumeralsConverter.convert("66");
        assertThat(romanNumber, is("LXVI"));
        romanNumber = RomanNumeralsConverter.convert("77");
        assertThat(romanNumber, is("LXXVII"));
        romanNumber = RomanNumeralsConverter.convert("88");
        assertThat(romanNumber, is("LXXXVIII"));
        romanNumber = RomanNumeralsConverter.convert("99");
        assertThat(romanNumber, is("XCIX"));
        romanNumber = RomanNumeralsConverter.convert("100");
        assertThat(romanNumber, is("C"));
    }

    @Test
    public void convertUnit() {
        String oneToTen = RomanNumeralsConverter.convertUnit("1");
        assertThat(oneToTen, is("I"));
        oneToTen = RomanNumeralsConverter.convertUnit("2");
        assertThat(oneToTen, is("II"));
        oneToTen = RomanNumeralsConverter.convertUnit("3");
        assertThat(oneToTen, is("III"));
        oneToTen = RomanNumeralsConverter.convertUnit("4");
        assertThat(oneToTen, is("IV"));
        oneToTen = RomanNumeralsConverter.convertUnit("5");
        assertThat(oneToTen, is("V"));
        oneToTen = RomanNumeralsConverter.convertUnit("6");
        assertThat(oneToTen, is("VI"));
        oneToTen = RomanNumeralsConverter.convertUnit("7");
        assertThat(oneToTen, is("VII"));
        oneToTen = RomanNumeralsConverter.convertUnit("8");
        assertThat(oneToTen, is("VIII"));
        oneToTen = RomanNumeralsConverter.convertUnit("9");
        assertThat(oneToTen, is("IX"));
        oneToTen = RomanNumeralsConverter.convertUnit("10");
        assertThat(oneToTen, is("X"));
    }

    @Test
    public void convertTenth() {
        String tenth = RomanNumeralsConverter.convertTenth("1");
        assertThat(tenth, is("X"));
        tenth = RomanNumeralsConverter.convertTenth("2");
        assertThat(tenth, is("XX"));
        tenth = RomanNumeralsConverter.convertTenth("3");
        assertThat(tenth, is("XXX"));
        tenth = RomanNumeralsConverter.convertTenth("4");
        assertThat(tenth, is("XL"));
        tenth = RomanNumeralsConverter.convertTenth("5");
        assertThat(tenth, is("L"));
        tenth = RomanNumeralsConverter.convertTenth("6");
        assertThat(tenth, is("LX"));
        tenth = RomanNumeralsConverter.convertTenth("7");
        assertThat(tenth, is("LXX"));
        tenth = RomanNumeralsConverter.convertTenth("8");
        assertThat(tenth, is("LXXX"));
        tenth = RomanNumeralsConverter.convertTenth("9");
        assertThat(tenth, is("XC"));
    }

    @Test
    public void convertHundred() {
        String hundred = RomanNumeralsConverter.convertHundred("1");
        assertThat(hundred, is("C"));
    }
}
