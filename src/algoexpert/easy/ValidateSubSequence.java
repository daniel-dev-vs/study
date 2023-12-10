package easy;

import java.util.List;

public class ValidateSubSequence {
   public static boolean isSubSequence(List<Integer> array, List<Integer> sequence){
        int lengthS = sequence.size(), count = 0;
       for(int i = 0; i < array.size(); i++){
           if(array.get(i) == sequence.get(count))
               count++;

           if(count == lengthS)
               return true;

       }
       return false;
   }
}
