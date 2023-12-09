package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int d = 2;
        System.out.println(rotLeft(a,d).toString());
    }

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        if(d == 0)
            return a;

        int diff = a.size() - d;
        List<Integer> answer = new ArrayList<>(a);
        int i2 = 0;

        for (int i = d; i < a.size(); i++)
        {
            answer.set(i2, a.get(i));
            i2++;
        }

        for(int i = 0; i < d; i++){

            answer.set(diff,a.get(i));
            diff++;
        }

        return answer;
    }

}
