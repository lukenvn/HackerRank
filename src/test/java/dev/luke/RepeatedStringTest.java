package dev.luke;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString_test1() {

        String input = "aba";
        long n = 10;

        long repeatedString = RepeatedString.repeatedString(input, n);

        assertEquals(7, repeatedString);


    }

    @Test
    public void repeatedString_test2() {

        String input = "a";
        long n = 1000000000000L;

        long repeatedString = RepeatedString.repeatedString(input, n);

        assertEquals(1000000000000L, repeatedString);


    }
}