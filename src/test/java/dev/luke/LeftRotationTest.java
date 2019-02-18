package dev.luke;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void rotLeft_test_1() {
        int[] input = new int[]{1, 2 ,3, 4, 5};
        int d = 4;
        int[] actual = LeftRotation.rotLeft(input, d);
        System.out.println(Arrays.toString(actual));
        boolean equals = Arrays.equals(new int[]{5, 1, 2, 3, 4}, actual);
        assertTrue(equals);
    }

    @Test
    public void rotLeft_test_2() {
        int[] input = new int[]{1, 2 ,3, 4, 5};
        int d = 2;
        int[] actual = LeftRotation.rotLeft(input, d);
        System.out.println(Arrays.toString(actual));
        boolean equals = Arrays.equals(new int[]{3, 4, 5, 1, 2}, actual);
        assertTrue(equals);
    }
}