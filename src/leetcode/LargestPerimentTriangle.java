package leetcode;

import java.util.Arrays;

public class LargestPerimentTriangle {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println( largestPerimeter(nums));
    }
    public static int largestPerimeter(int [] nums){
        int r  = 0;

            Arrays.sort(nums);
         for(int i = nums.length - 3; i >=  0; --i){

             int a = nums[i];
             int b = nums[i + 1];
             int c = nums[i + 2];

             if (a+b > c ) {return a+b+c;}

         }
            return 0;
    }
}
