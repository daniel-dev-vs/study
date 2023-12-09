package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewYearChaos {

    public static void main(String[] args) {

        /*List<Integer> q = Stream.of(args).map(Integer::parseInt).collect(Collectors.toList());
        minimumBribes(q);*/
        List<Integer> a = new ArrayList<>(Arrays.asList(1 ,2 ,5 ,3 ,7 ,8 ,6 ,4));
        minimumBribes(a);
    }

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
       int bribes = 0;
       boolean chaotic = false;
       for(int i = q.size() - 1; i>=0; i--)
       {
           if(q.get(i) - (i + 1) > 2){
               chaotic = true;
               break;
           }
           for (int j = Math.max(0, q.get(i) - 2); j < i; j++){
               if(q.get(j)> q.get(i)) bribes++;
           }

       }


       if (chaotic)
           System.out.println("Too chaotic");
       else
           System.out.println(bribes);

    }

    static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    static void printPairs2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }


}
