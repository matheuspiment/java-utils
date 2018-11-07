package com.github.matheuspiment.utils.number;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RomanNumeral {
    private final static int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final static String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static int toArabic(String number) {
        if (isValidArgument(number) == false) {
            throw new IllegalArgumentException("The " + number + " argument contains invalid characters");
        }

        int result = 0;
        String targetNumber = number;

        for (int i = 0; i < decimals.length; i++) {
            while (targetNumber.indexOf(romans[i]) == 0) {
                result += decimals[i];
                targetNumber = targetNumber.substring(romans[i].length());
            }
        }

        if (result < 1 || result > 4999) {
            throw new IllegalArgumentException("Valid args are between 1 and 4999");
        }

        return result;
    }

    public static boolean isValidArgument(String number) {
        ArrayList<String> romansAsList = new ArrayList<String>(Arrays.asList(romans));
        char[] letters = number.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (!romansAsList.contains(String.valueOf(letters[i]))) {
                return false;
            }
        }

        return true;
    }
}
