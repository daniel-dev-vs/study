package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingTheClouds {

    public static void main(String[] args) {
        List<Integer> clouds = new ArrayList<>(Arrays.asList(0,1,0,0,0,1,0));
        int result = jumpingOnClouds(clouds);
        System.out.println(result);
    }

    /*
            * Complete the 'jumpingOnClouds' function below.
            *
            * The function is expected to return an INTEGER.
            * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int stepLimit = 0, stepCount = 0;
        int size = c.size();
        for (int i = 0; i < c.size() -1; i++){

            if(i+2 < size){
                if(c.get(i+2) == 0){
                    stepCount++;
                    i = i + 2 -1;

                    continue;
                }else if(c.get(i) == 0){
                    stepCount++;
                    continue;
                }
            }

            if(c.get(i) == 0)
                stepCount++;

        }

        return stepCount;
    }

}
