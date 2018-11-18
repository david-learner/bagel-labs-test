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

    public static String convert(String naturalNumber) {
        String[] tokens = naturalNumber.split("");

        if (tokens.length == 2) {
            return convertTenth(tokens[0]) + "" + convertUnit(tokens[1]);
        }

        if (tokens.length == 3) {
            return convertHundred(tokens[0]);
        }

        return convertUnit(tokens[0]);
    }

    public static String convertUnit(String unitNumber) {
        return ROMAN_NUMERALS_CHART.get(Integer.parseInt(unitNumber));
    }

    public static String convertTenth(String tenthNumber) {
        Integer ten = 10;
        Integer fifty = 50;
        Integer hundred = 100;
        Integer tenth = Integer.parseInt(tenthNumber);
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

    private static StringBuilder tenToThirty(StringBuilder sb, Integer tenth) {
        for (int count = 0; count < tenth; count++) {
            sb.append(ROMAN_NUMERALS_CHART.get(10));
        }
        return sb;
    }


    public static String convertHundred(String hundredNumber) {
        Integer hundred = Integer.parseInt(hundredNumber) * 100;
        return ROMAN_NUMERALS_CHART.get(hundred);
    }
}
