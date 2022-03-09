package com.company;

public class RepeatedString {
    public static void main(String[] args) {
        String s = args[0];

        long n = Long.parseLong(args[1]);

        System.out.println(repeatedString(s,n));
    }

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        char a = 'a';

       if(s.indexOf(a) == -1)
            return 0;
       
        if(s.length() == 1)
            return n;


        int countA = 0;
        long result = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a)
                countA++;
        }

        long repition = n/s.length();
        result = repition * countA;

        long remainder = n % s.length();

        for(int i = 0; i < remainder; i++)
        {
            if(s.charAt(i) == a)
                result++;
        }
        return result;
    }


}
