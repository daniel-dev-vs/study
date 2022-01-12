package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.Hashtable;

public class LeetCode {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3};
        boolean isDuplicated = containsDuplicate(arr);
        System.out.println(isDuplicated);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();
        boolean itsDuplicated = false;


        for(int i = 0; i < nums.length; i++){

            boolean added = list.add(nums[i]);
            if(!added)
            {
                itsDuplicated = true;
                break;
            }

        }


        return itsDuplicated;
    }
}
