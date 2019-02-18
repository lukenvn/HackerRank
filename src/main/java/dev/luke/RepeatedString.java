package dev.luke;

public class RepeatedString {


    static long repeatedString(String s, long n) {

        int originalLength = s.length();
        long numberOfString = n / originalLength;
        int numberOfRemain = (int) (n % originalLength);
        long output = findaInString(s);
        output = output * numberOfString;

        String remainString = s.substring(0, numberOfRemain);
        output += findaInString(remainString);
        return output;
    }

    private static long findaInString(String s) {
        char[] chars = s.toCharArray();
        long output = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                output++;
            }
        }
        return output;
    }


}
