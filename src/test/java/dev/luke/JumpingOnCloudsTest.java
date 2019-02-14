package dev.luke;

import static org.junit.Assert.*;

public class JumpingOnCloudsTest {

    @org.junit.Test
    public void jumpingOnClouds_test_1() {
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};

        int step = JumpingOnClouds.jumpingOnClouds(c);
        assertEquals(4, step);

    }


    @org.junit.Test
    public void jumpingOnClouds_test_2() {
        int[] c = new int[]{0, 1, 0, 0, 0, 1, 0};
        int step = JumpingOnClouds.jumpingOnClouds(c);
        assertEquals(3, step);

    }
}