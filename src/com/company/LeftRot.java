package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRot {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        var answer = rotateLeft(4, arr);
        System.out.println(answer);
    }

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.*
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */
    //older
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> copy = new ArrayList<>(arr);



        for (int i = d; i < arr.size(); i++){
            arr.set(i-d, arr.get(i));
        }

        for(int i = 0; i < d; i++){
            arr.set(i + arr.size() - d, copy.get(i));
        }
        return arr;
    }

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */
    //older
    public static List<Integer> oldrotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int aux = 0;
        for (int i = 0; i < d; i++) {
            aux = arr.get(0);

            for (int j = arr.size() - 1; j > 0; j--) {
                int actualPosition = arr.size() - j - 1, nextPosition = arr.size() - j;
                int value = arr.get(nextPosition);
                arr.set(actualPosition, value);
            }

            arr.set(arr.size() - 1, aux);
        }


        return arr;
    }

}
