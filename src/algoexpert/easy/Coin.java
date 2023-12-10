package easy;

import java.util.Arrays;

public class Coin {
	//n=5,7,1,1,2,3,22
	public static int nonConstructibleChange(int[] coins){
		
		if(coins.length  < 1)
			return 1;
		
		int changes = 0;
		
		Arrays.sort(coins);

		for(int i = 0; i < coins.length; i++){
			if(coins[i] > changes + 1){
				break;
			}
			changes += coins[i];
		}	
	
		return changes++;

	}

}


