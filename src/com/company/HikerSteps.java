package com.company;

public class HikerSteps {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
       int level = 0, result = 0;
       boolean shouldCount = true;

        for (char step: path.toCharArray()) {
            if(step == 'U')
                level++;
            else
                level--;

            if(shouldCount == true && level < 0){
                shouldCount = false;
                result++;
            }else if( level > -1){
                shouldCount = true;
            }

        }

        return result;
    }

    public static void main(String args[]){
        String path = "UDDDUDUU";
        int result = countingValleys(8, path);
        System.out.println(result);
    }
}
