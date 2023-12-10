package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TournamentWinnerProgram {

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        Map<String, Integer> languages = new HashMap<>();


        for(int i = 0; i < competitions.size(); i++){
            int winnerPoint = results.get(i) == 1 ? 0 : 1;
            String winnerName = competitions.get(i).get(winnerPoint);

            if(!languages.containsKey(winnerName)) {
                languages.put(winnerName, 3);
            }else{
                int increase = languages.get(winnerName) + 3;
                languages.put(winnerName,increase);
            }

        }
        int max = 0;
        String winner ="";
        for(Map.Entry<String,Integer> entry : languages.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        winner.hashCode();
        return winner;
    }
}
