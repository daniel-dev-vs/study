package algoexpert;

import java.util.HashSet;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {

    }



    public boolean isSubsequence(String s, String t) {
        int sequenceIndex = 0;
       for(int i = 0; i< t.length(); i++){
           if(sequenceIndex  == s.length()){
               break;
           }
           char value = t.charAt(i);

           if(s.charAt(sequenceIndex) == value){
               sequenceIndex++;
           }
       }
        return sequenceIndex == s.length();

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for (Integer num : array) {
            if (seqIdx == sequence.size()) {
                break;
            }
            if (sequence.get(seqIdx).equals(num)) {
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }
}
