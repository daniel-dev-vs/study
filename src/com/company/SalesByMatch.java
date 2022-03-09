package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> pairs = new HashSet<>();
        Integer count = 0;
        for (Integer number: ar) {
            if(pairs.contains(number)){
                count++;
                pairs.remove(number);
            }else{
                pairs.add(number);
            }
        }

        return count;
    }
}
