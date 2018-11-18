package example03;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {
    private static Map<Integer, String> ROMAN_NUMERALS_CHART = new HashMap<Integer, String>() {
        {
            put(0, "");
            put(1, "I");
            put(2, "II");
            put(3, "III");
            put(4, "IV");
            put(5, "V");
            put(6, "VI");
            put(7, "VII");
            put(8, "VIII");
            put(9, "IX");
            put(10, "X");
            put(50, "L");
            put(100, "C");
        }
    };


    public static String convert(int number) {
        if (number >= 10 && number <= 99) {
            return convertTenth(number / 10) + "" + convertUnit(number % 10);
        }

        if (number >= 1 && number <= 9) {
            return convertUnit(number);
        }

        return convertHundred(number);

    }

    public static String convertUnit(int unitNumber) {
        return ROMAN_NUMERALS_CHART.get(unitNumber);
    }

    public static String convertTenth(int tenth) {
        Integer ten = 10;
        Integer fifty = 50;
        Integer hundred = 100;
        StringBuilder sb = new StringBuilder();

        if (tenth == 4) {
            return sb.append(ROMAN_NUMERALS_CHART.get(ten)).append(ROMAN_NUMERALS_CHART.get(fifty)).toString();
        }

        if (tenth == 5) {
            return sb.append(ROMAN_NUMERALS_CHART.get(fifty)).toString();
        }

        if (tenth == 9) {
            return sb.append(ROMAN_NUMERALS_CHART.get(ten)).append(ROMAN_NUMERALS_CHART.get(hundred)).toString();
        }

        if (tenth > 5) {
            sb.append(ROMAN_NUMERALS_CHART.get(fifty));
            return tenToThirty(sb, tenth - 5).toString();
        }

        return tenToThirty(sb, tenth).toString();
    }

    private static StringBuilder tenToThirty(StringBuilder sb, int tenth) {
        for (int count = 0; count < tenth; count++) {
            sb.append(ROMAN_NUMERALS_CHART.get(10));
        }
        return sb;
    }


    public static String convertHundred(int hundredNumber) {
        return ROMAN_NUMERALS_CHART.get(hundredNumber);
    }
}
