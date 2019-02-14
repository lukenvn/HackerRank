package dev.luke;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int step = 0;

        while (i < c.length) {
            if (i+2<c.length && c[i+2] == 0) {
                step++;
                i += 2;
            } else if (i<c.length-1 &&c[i+1] == 0) {
                step++;
                i += 1;
            }else {
                i++;
            }
        }

        return step;
    }
}
