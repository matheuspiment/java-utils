package com.github.matheuspiment.utils.year;

import org.junit.Test;
import static org.junit.Assert.*;

public class YearTest {

    @Test(expected = IllegalStateException.class)
    public void testIllegalState() throws Exception {
        new Year();
    }

    @Test
    public void testIsLeapYear() {
        assertEquals(true, Year.isLeapYear(2016));
    }

    @Test
    public void testIsNotLeapYear() {
        assertEquals(false, Year.isLeapYear(2018));
    }
}