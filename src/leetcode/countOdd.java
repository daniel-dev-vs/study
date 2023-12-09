package leetcode;

public class countOdd {
    public static void main(String[] args) {

         System.out.println(countOdds(925006073,995588062));
    }

    static int countOdds(int low, int high){
        int countHigh = high % 2 != 0 ? 1 : 0;
        int insideLow = low / 2;
        int insideHigh = high / 2;
        int count = (insideHigh - insideLow) + countHigh;

        return count;
    }
}

