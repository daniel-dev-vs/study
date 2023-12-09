package leetcode;

public class NumberOf1Bits {

    public static void main(String[] args) {

        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int a = Integer.bitCount(n);
        return a;
    }
}
