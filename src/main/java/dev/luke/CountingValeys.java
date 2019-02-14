package dev.luke;

public class CountingValeys {

    public static void main(String[] args) {

        String s = "UDDDUDUU";
        int n = 8;

        int countingValleys = countingValleys(n, s);
        System.out.println("number of count: " + countingValleys);

    }

    static int countingValleys(int n, String s) {

        char[] chars = s.toCharArray();
        int valleyCount = 0;
        int sum = 0;
        boolean mountain;
        for (int i = 0; i < n; i++) {
            char c = chars[i];
            if (sum > 0) {
                mountain = true;
            } else {
                mountain = false;
            }
            if (c == 'U') {
                sum += 1;
            } else if (c == 'D') {
                sum -= 1;
            }
            if (sum == 0 && !mountain) {
                valleyCount++;
            }

        }
        return valleyCount;
    }
}
