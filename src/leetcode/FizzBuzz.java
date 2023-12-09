package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> answer = fizzBuzz(15);

        System.out.println(answer.toString());
    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int value = i+1;
            boolean isFizz = value % 3 == 0;
            boolean isBuzz = value % 5 == 0;

            if(isFizz && isBuzz ){
                answer.add("FizzBuzz");
            }else if (isFizz){
                answer.add("Fizz");
            } else if(isBuzz){
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(value));
            }
        }

        return answer;
    }
}
