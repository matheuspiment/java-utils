package com.github.matheuspiment.utils.number;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralTest {

    @Test(expected = IllegalArgumentException.class)
    public void testLastRangeInvalidValue() throws Exception {
        RomanNumeral.toArabic("MMMMMM");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueWithInvalidCharacters() throws Exception {
        RomanNumeral.toArabic("MMW");
    }

    @Test
    public void testIsValidArgument() throws Exception {
        assertEquals(true, RomanNumeral.isValidArgument("XII"));
    }

    @Test
    public void testIsInvalidArgument() throws Exception {
        assertEquals(false, RomanNumeral.isValidArgument("MMW"));
    }

    @Test
    public void testFirstNumber() {
        assertEquals(1, RomanNumeral.toArabic("I"));
    }

    @Test
    public void testLastNumber() {
        assertEquals(4999, RomanNumeral.toArabic("MMMMCMXCIX"));
    }

    @Test
    public void testValidNumber() {
        assertEquals(854, RomanNumeral.toArabic("DCCCLIV"));
    }
}
