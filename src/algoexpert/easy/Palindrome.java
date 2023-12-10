package easy;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        int reversed = 0;
        int temp =x;

        while(temp != 0){
            int digit = (int)(temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
    public static boolean isPalindromeOne(int x) {
        String xString = String.valueOf(x);
        char[] chars = xString.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] != chars[chars.length -i -1])
                return false;
        }
       return true;

    }
}
