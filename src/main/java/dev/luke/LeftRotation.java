package dev.luke;

import java.util.Arrays;

public class LeftRotation {


    static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++) {
            rotateLeft(a);
        }

        return a;
    }

    private static void rotateLeft(int[] a) {
        int length = a.length;
        int last = a[length - 1];
        a[length - 1] = a[0];
        for (int i = 0; i < a.length - 2; i++) {
            a[i] = a[i + 1];
        }
        a[length - 2] = last;
    }


}
